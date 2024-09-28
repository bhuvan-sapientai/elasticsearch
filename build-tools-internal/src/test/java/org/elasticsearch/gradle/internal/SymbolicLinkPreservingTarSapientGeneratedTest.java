package org.elasticsearch.gradle.internal;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.gradle.api.internal.file.copy.CopyAction;
import org.gradle.api.tasks.bundling.Compression;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5)
class SymbolicLinkPreservingTarSapientGeneratedTest {

    //Sapient generated method id: ${createCopyActionWhenSwitchGetCompressionCaseBZIP2}, hash: C043EBA5C0727A0DF7F5BC23ADB68174
    @Disabled()
    @Test()
    void createCopyActionWhenSwitchGetCompressionCaseBZIP2() {
        /* Branches:
         * (switch(getCompression()) = BZIP2) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class org.gradle.internal.logging.slf4j.DefaultContextAwareTaskLogger
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        SymbolicLinkPreservingTar target = spy(new SymbolicLinkPreservingTar());
        target.setCompression(Compression.BZIP2);
        doReturn(false).when(target).isPreserveFileTimestamps();
        //Act Statement(s)
        CopyAction result = target.createCopyAction();
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            verify(target).isPreserveFileTimestamps();
        });
    }

    //Sapient generated method id: ${createCopyActionWhenSwitchGetCompressionCaseGZIP}, hash: 2872F6C2D68ABBBD32B6C6D0F442725E
    @Disabled()
    @Test()
    void createCopyActionWhenSwitchGetCompressionCaseGZIP() {
        /* Branches:
         * (switch(getCompression()) = GZIP) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class org.gradle.internal.logging.slf4j.DefaultContextAwareTaskLogger
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        SymbolicLinkPreservingTar target = spy(new SymbolicLinkPreservingTar());
        target.setCompression(Compression.GZIP);
        doReturn(false).when(target).isPreserveFileTimestamps();
        //Act Statement(s)
        CopyAction result = target.createCopyAction();
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            verify(target).isPreserveFileTimestamps();
        });
    }

    //Sapient generated method id: ${createCopyActionWhenSwitchGetCompressionCaseDefault}, hash: 6DA26929FEA6C2BA946202343D37615F
    @Disabled()
    @Test()
    void createCopyActionWhenSwitchGetCompressionCaseDefault() {
        /* Branches:
         * (switch(getCompression()) = default) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class org.gradle.internal.logging.slf4j.DefaultContextAwareTaskLogger
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        SymbolicLinkPreservingTar target = spy(new SymbolicLinkPreservingTar());
        target.setCompression(Compression.BZIP2);
        doReturn(false).when(target).isPreserveFileTimestamps();
        //Act Statement(s)
        CopyAction result = target.createCopyAction();
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            verify(target).isPreserveFileTimestamps();
        });
    }
}
