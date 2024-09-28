package org.elasticsearch.gradle.internal.util.ports;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.hamcrest.Matchers.is;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5)
class ReservedPortRangeSapientGeneratedTest {

    //Sapient generated method id: ${getOrAllocateTest}, hash: AF440301B6770AF0658129BAAF600270
    @Disabled()
    @Test()
    void getOrAllocateTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  Method java.util.Random::nextInt has a unrepeatable behavior
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ReservedPortRange target = new ReservedPortRange(1, 1);
        //Act Statement(s)
        Integer result = target.getOrAllocate("id1");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(0)));
    }

    //Sapient generated method id: ${getAllocated1Test}, hash: B5614FEB46F32AFAB2205372B11F5B98
    @Disabled()
    @Test()
    void getAllocated1Test() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  Method java.util.Random::nextInt has a unrepeatable behavior
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ReservedPortRange target = new ReservedPortRange(1, 1);
        //Act Statement(s)
        Integer result = target.getAllocated("id1");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${allocateWhenPortDetectorIsAvailableCandidate}, hash: 28B03FC77660847BC66833AB19752BF4
    @Disabled()
    @Test()
    void allocateWhenPortDetectorIsAvailableCandidate() {
        /* Branches:
         * (current > endPort) : true  #  inside getAvailablePort method
         * (allocated.contains(candidate) == false) : true  #  inside getAvailablePort method
         * (portDetector.isAvailable(candidate)) : true  #  inside getAvailablePort method
         *
         * TODO: Help needed! This method is not unit testable!
         *  Method java.util.Random::nextInt has a unrepeatable behavior
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ReservedPortRange target = new ReservedPortRange(0, 0);
        //Act Statement(s)
        int result = target.allocate();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(0)));
    }

    //Sapient generated method id: ${allocateWhenCurrentEqualsFirst}, hash: E6235B76F3AF5B83CE1AB66E0B43D90E
    @Disabled()
    @Test()
    void allocateWhenCurrentEqualsFirst() {
        /* Branches:
         * (current > endPort) : true  #  inside getAvailablePort method
         * (allocated.contains(candidate) == false) : true  #  inside getAvailablePort method
         * (portDetector.isAvailable(candidate)) : false  #  inside getAvailablePort method
         * (current == first) : true  #  inside getAvailablePort method
         *
         * TODO: Help needed! This method is not unit testable!
         *  Method java.util.Random::nextInt has a unrepeatable behavior
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ReservedPortRange target = new ReservedPortRange(0, 0);
        //Act Statement(s)
        int result = target.allocate();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(-1)));
    }

    //Sapient generated method id: ${allocateWhenCurrentNotEqualsFirst}, hash: F82B12B6BBB0A5491A10E54A182C7610
    @Disabled()
    @Test()
    void allocateWhenCurrentNotEqualsFirst() {
        /* Branches:
         * (current > endPort) : true  #  inside getAvailablePort method
         * (allocated.contains(candidate) == false) : true  #  inside getAvailablePort method
         * (portDetector.isAvailable(candidate)) : false  #  inside getAvailablePort method
         * (current == first) : false  #  inside getAvailablePort method
         *
         * TODO: Help needed! This method is not unit testable!
         *  Method java.util.Random::nextInt has a unrepeatable behavior
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ReservedPortRange target = new ReservedPortRange(0, 0);
        //Act Statement(s)
        int result = target.allocate();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${deallocateTest}, hash: 13713E19B39FF88F829993109EE4E115
    @Disabled()
    @Test()
    void deallocateTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  Method java.util.Random::nextInt has a unrepeatable behavior
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ReservedPortRange target = new ReservedPortRange(1, 1);
        //Act Statement(s)
        target.deallocate(1);
    }

    //Sapient generated method id: ${toStringTest}, hash: A098E2FC009C1C296E70A61DED5560E6
    @Disabled()
    @Test()
    void toStringTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  Method java.util.Random::nextInt has a unrepeatable behavior
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ReservedPortRange target = new ReservedPortRange(2, 2);
        //Act Statement(s)
        String result = target.toString();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("ReservedPortRange[2:2]")));
    }
}
