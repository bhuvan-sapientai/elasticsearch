package org.elasticsearch.gradle.internal.release;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import java.util.Comparator;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5)
class MinorVersionSapientGeneratedTest {

    private final Comparator<MinorVersion> COMPARATORMock = mock(Comparator.class, "COMPARATOR");

    private final MinorVersion minorVersionMock = mock(MinorVersion.class);

    //Sapient generated method id: ${ofTest}, hash: F98B64B608A9B43F2B49349A2422C53A
    @Test()
    void ofTest() {
        //Arrange Statement(s)
        QualifiedVersion vMock = mock(QualifiedVersion.class);
        doReturn(0).when(vMock).major();
        doReturn(0).when(vMock).minor();
        //Act Statement(s)
        MinorVersion result = MinorVersion.of(vMock);
        MinorVersion minorVersion = new MinorVersion(0, 0);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(minorVersion));
            verify(vMock).major();
            verify(vMock).minor();
        });
    }

    //Sapient generated method id: ${toStringTest}, hash: 0A108A7DDEF5F54990A56A400FC27C07
    @Test()
    void toStringTest() {
        //Arrange Statement(s)
        MinorVersion target = new MinorVersion(2, 2);
        //Act Statement(s)
        String result = target.toString();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("2.2")));
    }

    //Sapient generated method id: ${underscoreTest}, hash: 48A5041A3F88F2B166655FC5B529D7AA
    @Test()
    void underscoreTest() {
        //Arrange Statement(s)
        MinorVersion target = new MinorVersion(2, 2);
        //Act Statement(s)
        String result = target.underscore();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("2_2")));
    }

    //Sapient generated method id: ${compareToTest}, hash: 4AC7AB384F5289C33D66E8285EB4CEDC
    @Disabled()
    @Test()
    void compareToTest() {
        //Arrange Statement(s)
        MinorVersion target = new MinorVersion(0, 0);
        doReturn(0).when(COMPARATORMock).compare(target, minorVersionMock);
        //Act Statement(s)
        int result = target.compareTo(minorVersionMock);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(0));
            verify(COMPARATORMock).compare(target, minorVersionMock);
        });
    }

    //Sapient generated method id: ${isBeforeWhenThisCompareToOtherLessThan0}, hash: 8B6E0645DA649DE6AF113E0745752F1D
    @Disabled()
    @Test()
    void isBeforeWhenThisCompareToOtherLessThan0() {
        /* Branches:
         * (this.compareTo(other) < 0) : true
         */
        //Arrange Statement(s)
        MinorVersion target = new MinorVersion(0, 0);
        doReturn(-2147483648).when(COMPARATORMock).compare(target, minorVersionMock);
        //Act Statement(s)
        boolean result = target.isBefore(minorVersionMock);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(Boolean.TRUE));
            verify(COMPARATORMock).compare(target, minorVersionMock);
        });
    }

    //Sapient generated method id: ${isBeforeWhenThisCompareToOtherNotLessThan0}, hash: 67E44833A60EF35A85B5D97017163FF3
    @Disabled()
    @Test()
    void isBeforeWhenThisCompareToOtherNotLessThan0() {
        /* Branches:
         * (this.compareTo(other) < 0) : false
         */
        //Arrange Statement(s)
        MinorVersion target = new MinorVersion(0, 0);
        doReturn(1).when(COMPARATORMock).compare(target, minorVersionMock);
        //Act Statement(s)
        boolean result = target.isBefore(minorVersionMock);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(Boolean.FALSE));
            verify(COMPARATORMock).compare(target, minorVersionMock);
        });
    }
}
