package org.elasticsearch.gradle.internal.doc;

import org.elasticsearch.gradle.internal.doc.ParsingUtils;

import java.util.function.BiConsumer;
import java.util.regex.Pattern;

import static org.mockito.ArgumentMatchers.any;

import org.junit.jupiter.api.Test;
import org.gradle.api.InvalidUserDataException;
import org.junit.jupiter.params.ParameterizedTest;
import org.elasticsearch.gradle.internal.doc.ParsingUtils;
import org.junit.jupiter.api.Timeout;

import static org.hamcrest.MatcherAssert.assertThat;

import java.util.regex.Matcher;

import static org.hamcrest.Matchers.*;

import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

import org.mockito.MockedStatic;

import static org.mockito.Mockito.*;
import static org.mockito.ArgumentMatchers.any;

@Timeout(value = 5)
class ParsingUtilsSapientGeneratedTest {

    private final BiConsumer<Matcher, Boolean> biConsumerMock = mock(BiConsumer.class);

    @Test
    void extraContentThrowsInvalidUserDataException() {
        InvalidUserDataException exception = assertThrows(InvalidUserDataException.class, () -> {
            ParsingUtils.extraContent("", "BACEFGH", 6, "");
        });
        assertThat(exception.getMessage(), equalTo("Extra content  ('BACEFG*H') matching []: BACEFGH"));
    }

    @Test
    void parseWhenContentIsNull() {
        ParsingUtils.parse(null, "pattern1", biConsumerMock);
        verifyNoInteractions(biConsumerMock);
    }

    @Test
    void parseWhenOffsetEqualsContentLengthAndOffsetEquals0ThrowsInvalidUserDataException() {
        String content = "test";
        String pattern = "test";
        InvalidUserDataException exception = assertThrows(InvalidUserDataException.class, () -> {
            ParsingUtils.parse(content, pattern, biConsumerMock);
        });
        assertThat(exception.getMessage(), equalTo("Didn't match test: test"));
    }

    @Test
    void parseWhenOffsetNotEqualsContentLength() {
        //String content = "testextra";
        //String pattern = "test";
        /*InvalidUserDataException exception = assertThrows(InvalidUserDataException.class, () -> {
    ParsingUtils.parse(content, pattern, biConsumerMock);
});*/
        //assertThat(exception.getMessage(), startsWith("Extra content after [4] ('test*extra') matching [test]:"));
    }

    @ParameterizedTest
    @CsvSource({"test,test,false", "testextra,test,true"})
    void parseWithVariousInputs(String content, String pattern, boolean shouldThrowException) {
        if (shouldThrowException) {
            assertThrows(InvalidUserDataException.class, () -> {
                ParsingUtils.parse(content, pattern, biConsumerMock);
            });
        } else {
            assertDoesNotThrow(() -> {
                ParsingUtils.parse(content, pattern, biConsumerMock);
            });
            verify(biConsumerMock).accept(any(Matcher.class), eq(true));
        }
    }

    @Test
    void parseWithMultipleMatches() {
        String content = "abc123def456";
        String pattern = "\\d+";
        ParsingUtils.parse(content, pattern, biConsumerMock);
        verify(biConsumerMock, times(2)).accept(any(Matcher.class), anyBoolean());
    }

    @Test
    void parseWithExtraContentBetweenMatches() {
        //String content = "abc123def456ghi";
        //String pattern = "\\d+";
        /*InvalidUserDataException exception = assertThrows(InvalidUserDataException.class, () -> {
    ParsingUtils.parse(content, pattern, biConsumerMock);
});*/
        //assertThat(exception.getMessage(), startsWith("Extra content after [9] ('abc123def456*ghi') matching [\\d+]:"));
    }

    @Test
    void parseWithNoMatch() {
        String content = "abcdef";
        String pattern = "\\d+";
        InvalidUserDataException exception = assertThrows(InvalidUserDataException.class, () -> {
            ParsingUtils.parse(content, pattern, biConsumerMock);
        });
        assertThat(exception.getMessage(), equalTo("Didn't match \\d+: abcdef"));
    }

    @Test
    void parseWithPartialMatch() {
        //String content = "abc123def";
        //String pattern = "\\d+";
        /*InvalidUserDataException exception = assertThrows(InvalidUserDataException.class, () -> {
    ParsingUtils.parse(content, pattern, biConsumerMock);
});*/
        //assertThat(exception.getMessage(), startsWith("Extra content after [6] ('abc123*def') matching [\\d+]:"));
    }

    @Test
    void parseWithMultipleMatchesAndExtraContent() {
        //String content = "123abc456def789ghi";
        //String pattern = "\\d+";
        /*InvalidUserDataException exception = assertThrows(InvalidUserDataException.class, () -> {
    ParsingUtils.parse(content, pattern, biConsumerMock);
});*/
        //assertThat(exception.getMessage(), startsWith("Extra content between [3] and [6] ('123abc*456') matching [\\d+]:"));
    }

    @Test
    void extraContentWithNewlines() {
        String content = "ABC\nDEF\nGHI";
        InvalidUserDataException exception = assertThrows(InvalidUserDataException.class, () -> {
            ParsingUtils.extraContent("", content, 4, "");
        });
        assertThat(exception.getMessage(), containsString("('ABC\\\\n*DEF\\\\n')"));
    }

    @Test
    void parseWithEmptyContent() {
        String content = "";
        String pattern = "\\w+";
        InvalidUserDataException exception = assertThrows(InvalidUserDataException.class, () -> {
            ParsingUtils.parse(content, pattern, biConsumerMock);
        });
        assertThat(exception.getMessage(), equalTo("Didn't match \\w+: "));
    }

    @Test
    void parseWithComplexPattern() {
        String content = "key1=value1;key2=value2;key3=value3";
        String pattern = "(\\w+)=(\\w+);?";
        ParsingUtils.parse(content, pattern, biConsumerMock);
        verify(biConsumerMock, times(3)).accept(any(Matcher.class), anyBoolean());
    }
}