package org.elasticsearch.gradle.internal.release;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import java.util.Comparator;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5)
class QualifiedVersionSapientGeneratedTest {

    private final Comparator<QualifiedVersion> COMPARATORMock = mock(Comparator.class, "COMPARATOR");

    private final QualifiedVersion qualifiedVersionMock = mock(QualifiedVersion.class);

    //Sapient generated method id: ${ofWhenMatcherMatchesEqualsFalseThrowsIllegalArgumentException}, hash: 700CCC056183DEFA45A999982C3D4EE5
    @Test()
    void ofWhenMatcherMatchesEqualsFalseThrowsIllegalArgumentException() {
        /* Branches:
         * (matcher.matches() == false) : true
         */
         //Arrange Statement(s)
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Invalid version format: 'B'. Should be ^v? (\\d+) \\. (\\d+) \\. (\\d+) (?: - (alpha\\d+ | beta\\d+ | rc\\d+ | SNAPSHOT ) )? $");
        //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            QualifiedVersion.of("B");
        });
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalArgumentException.getMessage()));
        });
    }

    //Sapient generated method id: ${ofWhenMatcherGroup4IsNull}, hash: 7F79DE5BB4B89BB642C5CEF184561BAF
    @Test()
    void ofWhenMatcherGroup4IsNull() {
        /* Branches:
         * (matcher.matches() == false) : false
         * (matcher.group(4) == null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        //QualifiedVersion result = QualifiedVersion.of("s1");
        //QualifiedVersion qualifiedVersion = new QualifiedVersion(0, 0, 0, (QualifiedVersion.Qualifier) null);
        //Assert statement(s)
        //assertAll("result", () -> assertThat(result, equalTo(qualifiedVersion)));
    }

    //Sapient generated method id: ${ofWhenMatcherGroup4IsNotNull}, hash: 4A0E8BF11473D789759513D54F9D8969
    @Disabled()
    @Test()
    void ofWhenMatcherGroup4IsNotNull() {
        /* Branches:
         * (matcher.matches() == false) : false
         * (matcher.group(4) == null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         
        //Act Statement(s)
        //QualifiedVersion result = QualifiedVersion.of("s1");
        //TODO: Please change the modifier of the below class from private to public to isolate the test case scenario.
        //QualifiedVersion.Qualifier qualifiedVersionQualifierMock = mock(QualifiedVersion.Qualifier.class);
        //QualifiedVersion qualifiedVersion = new QualifiedVersion(0, 0, 0, qualifiedVersionQualifierMock);
        
        //Assert statement(s)
        //assertAll("result", () -> assertThat(result, equalTo(qualifiedVersion)));
    }

    //Sapient generated method id: ${toStringWhenQualifierIsNull}, hash: 3776DF001FFC9483379216DE866889B2
    @Test()
    void toStringWhenQualifierIsNull() {
        /* Branches:
         * (qualifier == null) : true
         */
        //Arrange Statement(s)
        //QualifiedVersion target = new QualifiedVersion(1, 1, 1, (QualifiedVersion.Qualifier) null);
        //Act Statement(s)
        //String result = target.toString();
        //Assert statement(s)
        //assertAll("result", () -> assertThat(result, equalTo("null.null.nullnull")));
    }

    //Sapient generated method id: ${toStringWhenQualifierIsNotNull}, hash: C3834CAA6D4AC5435A3D834697707C10
    @Disabled()
    @Test()
    void toStringWhenQualifierIsNotNull() {
        /* Branches:
         * (qualifier == null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        //TODO: Please change the modifier of the below class from private to public to isolate the test case scenario.
        //QualifiedVersion.Qualifier qualifiedVersionQualifierMock = mock(QualifiedVersion.Qualifier.class, "qualifier");
        //QualifiedVersion target = new QualifiedVersion(1, 1, 1, qualifiedVersionQualifierMock);
        
        //Act Statement(s)
        //String result = target.toString();
        
        //Assert statement(s)
        //assertAll("result", () -> assertThat(result, equalTo("result1")));
    }

    //Sapient generated method id: ${hasQualifierWhenQualifierIsNotNull}, hash: 409B924EEF86D49636A2CC778C8AD0E7
    @Disabled()
    @Test()
    void hasQualifierWhenQualifierIsNotNull() {
        /* Branches:
         * (qualifier != null) : true
         */
         //Arrange Statement(s)
        //TODO: Please change the modifier of the below class from private to public to isolate the test case scenario.
        //QualifiedVersion.Qualifier qualifiedVersionQualifierMock = mock(QualifiedVersion.Qualifier.class);
        //QualifiedVersion target = new QualifiedVersion(0, 0, 0, qualifiedVersionQualifierMock);
        
        //Act Statement(s)
        //boolean result = target.hasQualifier();
        
        //Assert statement(s)
        //assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${hasQualifierWhenQualifierIsNull}, hash: ECB5022264F88A58FA6C4BA42985559E
    @Test()
    void hasQualifierWhenQualifierIsNull() {
        /* Branches:
         * (qualifier != null) : false
         */
        //Arrange Statement(s)
        //QualifiedVersion target = new QualifiedVersion(0, 0, 0, (QualifiedVersion.Qualifier) null);
        //Act Statement(s)
        //boolean result = target.hasQualifier();
        //Assert statement(s)
        //assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${isSnapshotWhenThisQualifierLevelNotEqualsQualifierLevelSNAPSHOT}, hash: A5E9CF655C00599C749A18675816996F
    @Disabled()
    @Test()
    void isSnapshotWhenThisQualifierLevelNotEqualsQualifierLevelSNAPSHOT() {
        /* Branches:
         * (this.qualifier != null) : true
         * (this.qualifier.level == QualifierLevel.SNAPSHOT) : false
         */
         //Arrange Statement(s)
        //TODO: Please change the modifier of the below class from private to public to isolate the test case scenario.
        //QualifiedVersion.Qualifier qualifiedVersionQualifierMock = mock(QualifiedVersion.Qualifier.class);
        //QualifiedVersion target = new QualifiedVersion(0, 0, 0, qualifiedVersionQualifierMock);
        
        //Act Statement(s)
        //boolean result = target.isSnapshot();
        
        //Assert statement(s)
        //assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${withoutQualifierTest}, hash: 482AE4C8388A5124231B4F6E707265C4
    @Disabled()
    @Test()
    void withoutQualifierTest() {
        //Arrange Statement(s)
        //TODO: Please change the modifier of the below class from private to public to isolate the test case scenario.
        //QualifiedVersion.Qualifier qualifiedVersionQualifierMock = mock(QualifiedVersion.Qualifier.class);
        //QualifiedVersion target = new QualifiedVersion(0, 0, 0, qualifiedVersionQualifierMock);
        
        //Act Statement(s)
        //QualifiedVersion result = target.withoutQualifier();
        //QualifiedVersion qualifiedVersion = new QualifiedVersion(0, 0, 0, (QualifiedVersion.Qualifier) null);
        
        //Assert statement(s)
        //assertAll("result", () -> assertThat(result, equalTo(qualifiedVersion)));
    }

    //Sapient generated method id: ${compareToTest}, hash: 6A5B2D844FCBE62914B870E243F96F03
    @Disabled()
    @Test()
    void compareToTest() {
        //Arrange Statement(s)
        //TODO: Please change the modifier of the below class from private to public to isolate the test case scenario.
        //QualifiedVersion.Qualifier qualifiedVersionQualifierMock = mock(QualifiedVersion.Qualifier.class);
        //QualifiedVersion target = new QualifiedVersion(0, 0, 0, qualifiedVersionQualifierMock);
        //doReturn(0).when(COMPARATORMock).compare(target, qualifiedVersionMock);
        
        //Act Statement(s)
        //int result = target.compareTo(qualifiedVersionMock);
        
        //Assert statement(s)
        //assertAll("result", () -> {    assertThat(result, equalTo(0));    verify(COMPARATORMock).compare(target, qualifiedVersionMock);});
    }

    //Sapient generated method id: ${isBeforeWhenThisCompareToOtherLessThan0}, hash: C2CBBE46F7660A3BE46E16591BE72EC6
    @Disabled()
    @Test()
    void isBeforeWhenThisCompareToOtherLessThan0() {
        /* Branches:
         * (this.compareTo(other) < 0) : true
         */
         //Arrange Statement(s)
        //TODO: Please change the modifier of the below class from private to public to isolate the test case scenario.
        //QualifiedVersion.Qualifier qualifiedVersionQualifierMock = mock(QualifiedVersion.Qualifier.class);
        //QualifiedVersion target = new QualifiedVersion(0, 0, 0, qualifiedVersionQualifierMock);
        //doReturn(-2147483648).when(COMPARATORMock).compare(target, qualifiedVersionMock);
        
        //Act Statement(s)
        //boolean result = target.isBefore(qualifiedVersionMock);
        
        //Assert statement(s)
        //assertAll("result", () -> {    assertThat(result, equalTo(Boolean.TRUE));    verify(COMPARATORMock).compare(target, qualifiedVersionMock);});
    }

    //Sapient generated method id: ${isBeforeWhenThisCompareToOtherNotLessThan0}, hash: B0AF05ABF26F7AF1DDCEFDFBD2476DB6
    @Disabled()
    @Test()
    void isBeforeWhenThisCompareToOtherNotLessThan0() {
        /* Branches:
         * (this.compareTo(other) < 0) : false
         */
         //Arrange Statement(s)
        //TODO: Please change the modifier of the below class from private to public to isolate the test case scenario.
        //QualifiedVersion.Qualifier qualifiedVersionQualifierMock = mock(QualifiedVersion.Qualifier.class);
        //QualifiedVersion target = new QualifiedVersion(0, 0, 0, qualifiedVersionQualifierMock);
        //doReturn(1).when(COMPARATORMock).compare(target, qualifiedVersionMock);
        
        //Act Statement(s)
        //boolean result = target.isBefore(qualifiedVersionMock);
        
        //Assert statement(s)
        //assertAll("result", () -> {    assertThat(result, equalTo(Boolean.FALSE));    verify(COMPARATORMock).compare(target, qualifiedVersionMock);});
    }
}