package org.elasticsearch.gradle.internal.precommit;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import java.io.File;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.hamcrest.Matchers.is;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5)
class LicenseAnalyzerSapientGeneratedTest {

    //Sapient generated method id: ${licenseTypeWhenMatches}, hash: 6112489A85EC8B257CEB019962140407
    @Disabled()
    @Test()
    void licenseTypeWhenMatches() {
        /* Branches:
         * (for-each(matchers)) : true
         * (matches) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: matcher - Method: matches
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        File file = new File("pathname1");
        //Act Statement(s)
        LicenseAnalyzer.LicenseInfo result = LicenseAnalyzer.licenseType(file);
        LicenseAnalyzer.LicenseInfo licenseAnalyzerLicenseInfo = new LicenseAnalyzer.LicenseInfo("identifier1", false, false);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(licenseAnalyzerLicenseInfo)));
    }

    //Sapient generated method id: ${licenseTypeWhenNotMatchesThrowsIllegalStateException}, hash: A2AD1FE3C248E2C1FB24348BE1CA6C76
    @Disabled()
    @Test()
    void licenseTypeWhenNotMatchesThrowsIllegalStateException() {
        /* Branches:
         * (for-each(matchers)) : true
         * (matches) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: matcher - Method: matches
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        File file = new File("pathname1");
        IllegalStateException illegalStateException = new IllegalStateException("Unknown license for license file: licenseFile");
        //Act Statement(s)
        final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
            LicenseAnalyzer.licenseType(file);
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
        });
    }
}
