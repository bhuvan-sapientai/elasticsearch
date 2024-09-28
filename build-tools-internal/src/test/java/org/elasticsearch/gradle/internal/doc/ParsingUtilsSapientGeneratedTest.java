package org.elasticsearch.gradle.internal.doc;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.mockito.stubbing.Answer;
import org.mockito.MockedStatic;
import java.util.function.BiConsumer;
import org.gradle.api.InvalidUserDataException;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.hamcrest.Matchers.is;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5)
class ParsingUtilsSapientGeneratedTest {

    private final BiConsumer biConsumerMock = mock(BiConsumer.class);

    //Sapient generated method id: ${extraContentThrowsInvalidUserDataException}, hash: 8A1B68C0062AA6098B0ADBA222409407
    @Test()
    void extraContentThrowsInvalidUserDataException() {
        //Arrange Statement(s)
        InvalidUserDataException invalidUserDataException = new InvalidUserDataException("Extra content  ('BACEFG*H') matching []: BACEFGH");
        //Act Statement(s)
        final InvalidUserDataException result = assertThrows(InvalidUserDataException.class, () -> {
            ParsingUtils.extraContent("", "BACEFGH", 6, "");
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(invalidUserDataException.getMessage()));
        });
    }

    //Sapient generated method id: ${parseWhenContentIsNull}, hash: 107F9EDE9CC1240DB9025FF5F15B95AA
    @Test()
    void parseWhenContentIsNull() {
        /* Branches:
         * (content == null) : true
         */
        //Act Statement(s)
        ParsingUtils.parse((String) null, "pattern1", biConsumerMock);
    }

    //Sapient generated method id: ${parseWhenOffsetEqualsContentLengthAndOffsetEquals0ThrowsInvalidUserDataException}, hash: 5FD2F4C98241D9C1F96CC3C5F108896A
    @Disabled()
    @Test()
    void parseWhenOffsetEqualsContentLengthAndOffsetEquals0ThrowsInvalidUserDataException() {
        /* Branches:
         * (content == null) : false
         * (m.find()) : true
         * (m.start() != offset) : true
         * (offset == content.length()) : true
         * (offset == 0) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ParsingUtils> parsingUtils = mockStatic(ParsingUtils.class, CALLS_REAL_METHODS)) {
            parsingUtils.when(() -> ParsingUtils.extraContent("between [$offset] and [${m.start()}]", "content1", 0, "pattern1")).thenAnswer((Answer<Void>) invocation -> null);
            //Act Statement(s)
            final InvalidUserDataException result = assertThrows(InvalidUserDataException.class, () -> {
                ParsingUtils.parse("content1", "pattern1", biConsumerMock);
            });
            InvalidUserDataException invalidUserDataException = new InvalidUserDataException("message1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                assertThat(result.getMessage(), equalTo(invalidUserDataException.getMessage()));
                parsingUtils.verify(() -> ParsingUtils.extraContent("between [$offset] and [${m.start()}]", "content1", 0, "pattern1"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${parseWhenOffsetNotEqualsContentLength}, hash: 97B98558C5A7C2AF994E75AC1BF4CEA3
    @Disabled()
    @Test()
    void parseWhenOffsetNotEqualsContentLength() {
        /* Branches:
         * (content == null) : false
         * (m.find()) : true
         * (m.start() != offset) : true
         * (offset == content.length()) : false
         * (offset == 0) : false
         * (offset != content.length()) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ParsingUtils> parsingUtils = mockStatic(ParsingUtils.class, CALLS_REAL_METHODS)) {
            parsingUtils.when(() -> ParsingUtils.extraContent("between [$offset] and [${m.start()}]", "content1", 0, "pattern1")).thenAnswer((Answer<Void>) invocation -> null);
            parsingUtils.when(() -> ParsingUtils.extraContent("string1", "content1", 0, "pattern1")).thenAnswer((Answer<Void>) invocation -> null);
            //Act Statement(s)
            ParsingUtils.parse("content1", "pattern1", biConsumerMock);
            //Assert statement(s)
            assertAll("result", () -> {
                parsingUtils.verify(() -> ParsingUtils.extraContent("between [$offset] and [${m.start()}]", "content1", 0, "pattern1"), atLeast(1));
                parsingUtils.verify(() -> ParsingUtils.extraContent("string1", "content1", 0, "pattern1"), atLeast(1));
            });
        }
    }
}
