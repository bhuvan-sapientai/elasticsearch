package org.elasticsearch.gradle.internal.util.ports;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.hamcrest.Matchers.is;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5)
class DefaultReservedPortRangeFactorySapientGeneratedTest {

    //Sapient generated method id: ${getReservedPortRangeTest}, hash: 5380169E14D554B5B7911527DA7C5DFD
    @Disabled()
    @Test()
    void getReservedPortRangeTest() {
        //Arrange Statement(s)
        DefaultReservedPortRangeFactory target = new DefaultReservedPortRangeFactory();
        //Act Statement(s)
        ReservedPortRange result = target.getReservedPortRange(0, 0);
        //Assert statement(s)
        //TODO: Please implement equals method in ReservedPortRange for verification of the entire object or you need to adjust respective assertion statements
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }
}
