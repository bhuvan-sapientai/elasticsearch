package org.elasticsearch.gradle.internal.release;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import java.util.Map;
import org.gradle.api.Action;
import java.util.stream.Stream;
import org.gradle.process.ExecResult;
import org.gradle.process.ExecOperations;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5)
class GitWrapperSapientGeneratedTest {

    private final ExecOperations execOperationsMock = mock(ExecOperations.class, "execOperations");

    //Sapient generated method id: ${listRemotesTest}, hash: 6AE81AB20518E06A3CC5F2C00E1F7B80
    @Test()
    void listRemotesTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        GitWrapper target = spy(new GitWrapper(execOperationsMock));
        String[] stringArray = new String[] { "git", "remote", "-v" };
        doReturn("A").when(target).runCommand(stringArray);
        
        //Act Statement(s)
        Map<String, String> result = target.listRemotes();
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result.size(), equalTo(0));
            verify(target).runCommand(stringArray);
        });
    }

    //Sapient generated method id: ${runCommandTest}, hash: 0516694D54CE8C76D059B57E90F0809B
    @Test()
    void runCommandTest() {
        //Arrange Statement(s)
        ExecResult execResultMock = mock(ExecResult.class);
        doReturn(execResultMock).when(execOperationsMock).exec((Action) any());
        GitWrapper target = new GitWrapper(execOperationsMock);
        String[] stringArray = new String[] {};
        
        //Act Statement(s)
        String result = target.runCommand(stringArray);
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(""));
            verify(execOperationsMock).exec((Action) any());
        });
    }

    //Sapient generated method id: ${updateRemoteTest}, hash: 551CBF9CF19C12252DB4D907A2804557
    @Test()
    void updateRemoteTest() {
        //Arrange Statement(s)
        GitWrapper target = spy(new GitWrapper(execOperationsMock));
        String[] stringArray = new String[] { "git", "fetch", "remote1" };
        doReturn("return_of_runCommand1").when(target).runCommand(stringArray);
        
        //Act Statement(s)
        target.updateRemote("remote1");
        
        //Assert statement(s)
        assertAll("result", () -> verify(target).runCommand(stringArray));
    }

    //Sapient generated method id: ${updateTagsTest}, hash: F826A385AC14B807AC34F449D57852FF
    @Test()
    void updateTagsTest() {
        //Arrange Statement(s)
        GitWrapper target = spy(new GitWrapper(execOperationsMock));
        String[] stringArray = new String[] { "git", "fetch", "--tags", "remote1" };
        doReturn("return_of_runCommand1").when(target).runCommand(stringArray);
        
        //Act Statement(s)
        target.updateTags("remote1");
        
        //Assert statement(s)
        assertAll("result", () -> verify(target).runCommand(stringArray));
    }

    //Sapient generated method id: ${listVersionsTest}, hash: 60B227B7215E62CEDCD08CF0549A3C61
    @Test()
    void listVersionsTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        GitWrapper target = spy(new GitWrapper(execOperationsMock));
        String[] stringArray = new String[] { "git", "tag", "-l", "pattern1" };
        doReturn("A").when(target).runCommand(stringArray);
        
        //Act Statement(s)
        Stream<QualifiedVersion> result = target.listVersions("pattern1");
        
        //Assert statement(s)
        //TODO: Please implement equals method in Stream for verification of the entire object or you need to adjust respective assertion statements
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            verify(target).runCommand(stringArray);
        });
    }

    //Sapient generated method id: ${listFilesTest}, hash: 885EF59DCAA729A8B04E9ABAF4DE4734
    @Test()
    void listFilesTest() {
        //Arrange Statement(s)
        GitWrapper target = spy(new GitWrapper(execOperationsMock));
        String[] stringArray = new String[] { "git", "ls-tree", "--name-only", "-r", "ref1", "path1" };
        doReturn("A").when(target).runCommand(stringArray);
        
        //Act Statement(s)
        Stream<String> result = target.listFiles("ref1", "path1");
        
        //Assert statement(s)
        //TODO: Please implement equals method in Stream for verification of the entire object or you need to adjust respective assertion statements
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            verify(target).runCommand(stringArray);
        });
    }
}
