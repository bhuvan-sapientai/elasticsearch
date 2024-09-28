package org.elasticsearch.gradle.internal.release;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import java.util.List;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.io.UncheckedIOException;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.mock;
import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.hamcrest.Matchers.is;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5)
class ChangelogEntrySapientGeneratedTest {

    //Sapient generated method id: ${parseTest}, hash: 731F0B1D59C5949B266C683E7CF4EFEE
    @Disabled()
    @Test()
    void parseTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: yamlMapper - Method: readValue
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        File file = new File("pathname1");
        //Act Statement(s)
        ChangelogEntry result = ChangelogEntry.parse(file);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${parseWhenCaughtIOExceptionThrowsUncheckedIOException}, hash: 189ACE111C464039D41FBCEBBC36A8BA
    @Test()
    void parseWhenCaughtIOExceptionThrowsUncheckedIOException() {
        /* Branches:
         * (catch-exception (IOException)) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: yamlMapper - Method: readValue
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        File file = new File("pathname1");
        IOException iOException = new IOException();
        //Act Statement(s)
        final UncheckedIOException result = assertThrows(UncheckedIOException.class, () -> {
            ChangelogEntry.parse(file);
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getCause(), is(instanceOf(iOException.getClass())));
        });
    }

    //Sapient generated method id: ${setHighlightWhenThisHighlightIsNotNull}, hash: 882435CB1E6942B8732D17728F937B3D
    @Test()
    void setHighlightWhenThisHighlightIsNotNull() {
        /* Branches:
         * (this.highlight != null) : true
         */
        //Arrange Statement(s)
        ChangelogEntry target = new ChangelogEntry();
        target.setPr(0);
        ChangelogEntry.Highlight changelogEntryHighlightMock = mock(ChangelogEntry.Highlight.class);
        //Act Statement(s)
        target.setHighlight(changelogEntryHighlightMock);
        //Assert statement(s)
        assertAll("result", () -> assertThat(target.getHighlight(), is(notNullValue())));
    }

    //Sapient generated method id: ${toStringTest}, hash: B2124FB20DE55FF550B00D1EE06D3C4C
    @Disabled()
    @Test()
    void toStringTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ChangelogEntry target = new ChangelogEntry();
        target.setArea("area1");
        target.setSummary("summary1");
        target.setPr(0);
        target.setType("type1");
        List<Integer> integerList = new ArrayList<>();
        target.setIssues(integerList);
        //Act Statement(s)
        String result = target.toString();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("result1")));
    }
}
