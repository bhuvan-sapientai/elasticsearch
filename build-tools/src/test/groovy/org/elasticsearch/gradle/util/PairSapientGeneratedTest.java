package org.elasticsearch.gradle.util;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertAll;

@Timeout(value = 5)
class PairSapientGeneratedTest {

    //Sapient generated method id: ${ofTest}, hash: 1D39D9A786059E0E2280633ACFF1D463
    @Test()
    void ofTest() {
        //Arrange Statement(s)
        Object object = new Object();
        Object object2 = new Object();
        
        //Act Statement(s)
        Pair<Object, Object> result = Pair.of(object, object2);
        Pair<Object, Object> pair = new Pair<>(object, object2);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(pair)));
    }
}
