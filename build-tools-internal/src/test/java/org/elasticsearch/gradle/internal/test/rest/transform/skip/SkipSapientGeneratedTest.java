package org.elasticsearch.gradle.internal.test.rest.transform.skip;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.hamcrest.Matchers.is;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5)
class SkipSapientGeneratedTest {

    //Sapient generated method id: ${transformSetupWhenFoundEqualsFalse}, hash: 9967704F698C9CC389D53A1FA989B8C1
    @Test()
    void transformSetupWhenFoundEqualsFalse() {
        /* Branches:
         * (testName.isBlank()) : true
         * (setupNodeParent == null) : false
         * (skipParentIt.hasNext()) : false  #  inside addSkip method
         * (found == false) : true  #  inside addSkip method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Skip target = new Skip("testName1", "skipReason1");
        JsonNodeFactory jsonNodeFactory = new JsonNodeFactory(false);
        ObjectNode objectNode = new ObjectNode(jsonNodeFactory);
        //Act Statement(s)
        ObjectNode result = target.transformSetup(objectNode);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(objectNode)));
    }

    //Sapient generated method id: ${transformSetupWhenFoundNotEqualsFalse}, hash: 11BBE476C55480F30095750ED5A4154D
    @Disabled()
    @Test()
    void transformSetupWhenFoundNotEqualsFalse() {
        /* Branches:
         * (testName.isBlank()) : true
         * (setupNodeParent == null) : true
         * (skipParentIt.hasNext()) : true  #  inside addSkip method
         * (arrayEntry.isObject()) : true  #  inside addSkip method
         * (skipCandidate.get("skip") != null) : true  #  inside addSkip method
         * (found == false) : false  #  inside addSkip method
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: skipParentIt - Method: hasNext
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Skip target = new Skip("testName1", "skipReason1");
        ObjectNode objectNode = null;
        //Act Statement(s)
        ObjectNode result = target.transformSetup(objectNode);
        JsonNodeFactory jsonNodeFactory = JsonNodeFactory.withExactBigDecimals(false);
        ObjectNode objectNode2 = new ObjectNode(jsonNodeFactory);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(objectNode2)));
    }

    //Sapient generated method id: ${transformTestWhenDefaultBranchThrowsAssertionError}, hash: C33727396701257C4F4414E424E22E85
    @Test()
    void transformTestWhenDefaultBranchThrowsAssertionError() {
        /* Branches:
         * (testName.isBlank() == false) : true
         * (branch expression (line 90)) : false
         */
        //Arrange Statement(s)
        Skip target = new Skip("A", "skipReason1");
        JsonNodeFactory jsonNodeFactory = new JsonNodeFactory(false);
        ObjectNode objectNode = new ObjectNode(jsonNodeFactory);
        //Act Statement(s)
        final AssertionError result = assertThrows(AssertionError.class, () -> {
            target.transformTest(objectNode);
        });
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${transformTestWhenFoundNotEqualsFalse}, hash: C95F8A9E1FCEEDEAED4D7056F4C35A74
    @Disabled()
    @Test()
    void transformTestWhenFoundNotEqualsFalse() {
        /* Branches:
         * (testName.isBlank() == false) : true
         * (branch expression (line 90)) : false
         * (skipParentIt.hasNext()) : true  #  inside addSkip method
         * (arrayEntry.isObject()) : true  #  inside addSkip method
         * (skipCandidate.get("skip") != null) : true  #  inside addSkip method
         * (found == false) : false  #  inside addSkip method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Skip target = new Skip("A", "B");
        JsonNodeFactory jsonNodeFactory = new JsonNodeFactory(false);
        ObjectNode objectNode = new ObjectNode(jsonNodeFactory);
        //Act Statement(s)
        target.transformTest(objectNode);
    }
}
