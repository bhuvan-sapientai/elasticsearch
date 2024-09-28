package org.elasticsearch.gradle;

import org.junit.jupiter.api.Timeout;
import org.mockito.InjectMocks;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import java.io.IOException;
import java.io.File;
import org.mockito.MockitoAnnotations;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5)
class LazyFileOutputStreamSapientGeneratedTest {

    private AutoCloseable autoCloseableMocks;

    @InjectMocks()
    private LazyFileOutputStream target;

    @AfterEach()
    public void afterTest() throws Exception {
        if (autoCloseableMocks != null)
            autoCloseableMocks.close();
    }

    //Sapient generated method id: ${writeTest}, hash: 4297C9200AB898123EBD6C9CFAEDC816
    @Disabled()
    @Test()
    void writeTest() throws IOException {
        //Arrange Statement(s)
        File file = new File("pathname1");
        target = new LazyFileOutputStream(file);
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        target.write(0);
    }

    //Sapient generated method id: ${write1Test}, hash: F086F80733CB1C1511ABF2546A3CED2A
    @Disabled()
    @Test()
    void write1Test() throws IOException {
        //Arrange Statement(s)
        File file = new File("pathname1");
        target = new LazyFileOutputStream(file);
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        byte[] byteArray = new byte[] {};
        //Act Statement(s)
        target.write(byteArray, 0, 0);
    }

    //Sapient generated method id: ${closeTest}, hash: DA87030B99265EA4342E4AE7AD7A2818
    @Test()
    void closeTest() throws IOException {
        //Arrange Statement(s)
        File file = new File("pathname1");
        target = new LazyFileOutputStream(file);
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        target.close();
    }
}
