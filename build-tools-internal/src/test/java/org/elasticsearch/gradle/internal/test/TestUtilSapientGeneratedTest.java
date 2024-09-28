package org.elasticsearch.gradle.internal.test;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertAll;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5)
class TestUtilSapientGeneratedTest {

    //Sapient generated method id: ${getTestLibraryPathTest}, hash: 85F4AE7126502B4EDBB070A2AEDAC38D
    @Disabled()
    @Test()
    void getTestLibraryPathTest() {
        //Act Statement(s)
        String result = TestUtil.getTestLibraryPath("nativeLibsDir1");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("nativeLibsDir1/null-null")));
    }
}
