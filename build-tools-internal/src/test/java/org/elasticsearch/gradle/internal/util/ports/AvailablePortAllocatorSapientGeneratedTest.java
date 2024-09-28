package org.elasticsearch.gradle.internal.util.ports;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
import org.gradle.internal.Pair;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5)
class AvailablePortAllocatorSapientGeneratedTest {

    //Sapient generated method id: ${getNextPortRangeWhenEndPortGreaterThanMAX_PRIVATE_PORTThrowsIllegalStateException}, hash: B422E447568C3ACD7764F7764624F255
    @Test()
    void getNextPortRangeWhenEndPortGreaterThanMAX_PRIVATE_PORTThrowsIllegalStateException() {
        /* Branches:
         * (endPort > MAX_PRIVATE_PORT) : true
         */
        //Arrange Statement(s)
        AvailablePortAllocator target = new AvailablePortAllocator();
        IllegalStateException illegalStateException = new IllegalStateException("Available port ranges have exceeded Range from 10300 to 13300");
        //Act Statement(s)
        final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
            target.getNextPortRange(300);
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
        });
    }

    //Sapient generated method id: ${getNextPortRangeWhenEndPortNotGreaterThanMAX_PRIVATE_PORT}, hash: 18B97F3A5021AD4693206A3DD43A2D76
    @Test()
    void getNextPortRangeWhenEndPortNotGreaterThanMAX_PRIVATE_PORT() {
        /* Branches:
         * (endPort > MAX_PRIVATE_PORT) : false
         */
        //Arrange Statement(s)
        Pair<Integer, Integer> pairMock = mock(Pair.class);
        try (MockedStatic<Pair> pair = mockStatic(Pair.class)) {
            pair.when(() -> Pair.of(10300, 10309)).thenReturn(pairMock);
            AvailablePortAllocator target = new AvailablePortAllocator();
            //Act Statement(s)
            Pair<Integer, Integer> result = target.getNextPortRange(0);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(pairMock));
                pair.verify(() -> Pair.of(10300, 10309), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${reservePortRangeTest}, hash: 2BA0EA9F9B6F9BBA03F467AF628CEC41
    @Disabled()
    @Test()
    void reservePortRangeTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        AvailablePortAllocator target = spy(new AvailablePortAllocator());
        Pair pair = Pair.of(1, 1);
        doReturn(pair).when(target).getNextPortRange(0);
        //Act Statement(s)
        ReservedPortRange result = target.reservePortRange();
        //Assert statement(s)
        //TODO: Please implement equals method in ReservedPortRange for verification of the entire object or you need to adjust respective assertion statements
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            verify(target).getNextPortRange(0);
        });
    }
}
