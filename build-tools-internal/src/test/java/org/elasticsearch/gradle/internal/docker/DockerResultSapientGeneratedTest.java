package org.elasticsearch.gradle.internal.docker;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertAll;

@Timeout(value = 5)
class DockerResultSapientGeneratedTest {

    //Sapient generated method id: ${isSuccessWhenExitCodeEquals0}, hash: 75701D31D7AB99DF982F93E78DE97821
    @Test()
    void isSuccessWhenExitCodeEquals0() {
        /* Branches:
         * (exitCode == 0) : true
         */
         //Arrange Statement(s)
        DockerResult target = new DockerResult(0, "stdout1", "stderr1");
        
        //Act Statement(s)
        boolean result = target.isSuccess();
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${isSuccessWhenExitCodeNotEquals0}, hash: AEA1363056BA7B26626F8299599C017B
    @Test()
    void isSuccessWhenExitCodeNotEquals0() {
        /* Branches:
         * (exitCode == 0) : false
         */
         //Arrange Statement(s)
        DockerResult target = new DockerResult(-1, "stdout1", "stderr1");
        
        //Act Statement(s)
        boolean result = target.isSuccess();
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }
}
