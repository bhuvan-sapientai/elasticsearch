package org.elasticsearch.gradle.internal.release;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import java.io.IOException;
import java.util.List;
import org.elasticsearch.gradle.Version;
import java.util.Map;
import java.util.HashMap;
import org.mockito.MockedStatic;
import org.gradle.initialization.layout.BuildLayout;
import java.util.ArrayList;
import java.util.Optional;
import static org.mockito.ArgumentMatchers.anyList;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.hamcrest.Matchers.is;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5)
class TagVersionsTaskSapientGeneratedTest {

    private final BuildLayout buildLayoutMock = mock(BuildLayout.class);

    private final Version versionMock = mock(Version.class);

    //Sapient generated method id: ${releaseTest}, hash: D86C720C4A0917DAD51719FD5EBDA012
    @Disabled()
    @Test()
    void releaseTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class org.gradle.internal.logging.slf4j.DefaultContextAwareTaskLogger
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Version> version = mockStatic(Version.class)) {
            version.when(() -> Version.fromString("version1")).thenReturn(versionMock);
            TagVersionsTask target = new TagVersionsTask(buildLayoutMock);
            //Act Statement(s)
            target.release("version1");
            //Assert statement(s)
            assertAll("result", () -> version.verify(() -> Version.fromString("version1"), atLeast(1)));
        }
    }

    //Sapient generated method id: ${tagVersionsTest}, hash: AD20864F77F367B912B88C205A9120C9
    @Disabled()
    @Test()
    void tagVersionsTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class org.gradle.internal.logging.slf4j.DefaultContextAwareTaskLogger
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<AbstractVersionsTask> abstractVersionsTask = mockStatic(AbstractVersionsTask.class)) {
            Map<String, Integer> stringIntegerMap = new HashMap<>();
            abstractVersionsTask.when(() -> AbstractVersionsTask.splitVersionIds(anyList())).thenReturn(stringIntegerMap);
            TagVersionsTask target = new TagVersionsTask(buildLayoutMock);
            List<String> stringList = new ArrayList<>();
            //Act Statement(s)
            target.tagVersions(stringList);
            //Assert statement(s)
            assertAll("result", () -> abstractVersionsTask.verify(() -> AbstractVersionsTask.splitVersionIds(anyList())));
        }
    }

    //Sapient generated method id: ${executeTaskWhenReleaseVersionIsNullThrowsIllegalArgumentException}, hash: 44B1FD9D8B8881A548F7FA4BCB9DE5B3
    @Disabled()
    @Test()
    void executeTaskWhenReleaseVersionIsNullThrowsIllegalArgumentException() throws IOException {
        /* Branches:
         * (releaseVersion == null) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class org.gradle.internal.logging.slf4j.DefaultContextAwareTaskLogger
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        TagVersionsTask target = new TagVersionsTask(buildLayoutMock);
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Release version not specified");
        //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            target.executeTask();
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalArgumentException.getMessage()));
        });
    }

    //Sapient generated method id: ${addVersionRecordWhenMMatchesEqualsFalseThrowsIllegalArgumentException}, hash: 9A7245B767F3E455A7DA7C65FCDB0C6E
    @Test()
    void addVersionRecordWhenMMatchesEqualsFalseThrowsIllegalArgumentException() {
        /* Branches:
         * (m.matches() == false) : true  #  inside lambda$addVersionRecord$0 method
         */
        //Arrange Statement(s)
        List<String> stringList = new ArrayList<>(List.of("A"));
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Incorrect format for line [A]");
        //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            TagVersionsTask.addVersionRecord(stringList, versionMock, 0);
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalArgumentException.getMessage()));
        });
    }

    //Sapient generated method id: ${addVersionRecordWhenExistingIsNull}, hash: FACD1BDEDB7C02CA7234274816ADA9CD
    @Disabled()
    @Test()
    void addVersionRecordWhenExistingIsNull() {
        /* Branches:
         * (m.matches() == false) : false  #  inside lambda$addVersionRecord$0 method
         * (existing != null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Version versionMock2 = mock(Version.class);
        try (MockedStatic<Version> version = mockStatic(Version.class)) {
            version.when(() -> Version.fromString("string2")).thenReturn(versionMock);
            List<String> stringList = new ArrayList<>();
            //Act Statement(s)
            Optional<List<String>> result = TagVersionsTask.addVersionRecord(stringList, versionMock2, 0);
            List list = new ArrayList<>();
            Optional<List<String>> listStringOptional = Optional.of(list);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(listStringOptional));
                version.verify(() -> Version.fromString("string2"), atLeast(1));
            });
        }
    }
}
