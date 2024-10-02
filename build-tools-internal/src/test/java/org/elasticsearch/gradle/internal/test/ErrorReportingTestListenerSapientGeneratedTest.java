package org.elasticsearch.gradle.internal.test;

// import org.elasticsearch.gradle.internal.test.ErrorReportingTestListener;
// import org.gradle.api.tasks.testing.logging.TestLoggingContainer;
// import java.util.List;
// import org.junit.jupiter.api.BeforeEach;
// import org.junit.jupiter.api.Test;
// import org.gradle.api.tasks.testing.TestOutputEvent;
// import org.junit.jupiter.params.ParameterizedTest;
// import org.gradle.api.logging.Logger;
// import org.gradle.api.tasks.testing.TestDescriptor;
// import org.gradle.api.tasks.testing.Test;
// import java.io.*;
// import java.util.ArrayList;
// import org.junit.jupiter.params.provider.CsvSource;
// import static org.junit.jupiter.api.Assertions.*;
// import org.gradle.api.internal.tasks.testing.logging.FullExceptionFormatter;
// import org.gradle.api.tasks.testing.TestResult;
// import static org.mockito.Mockito.*;
// import static org.mockito.ArgumentMatchers.any;

class ErrorReportingTestListenerSapientGeneratedTest {

//     private ErrorReportingTestListener listener;

//     private Test testTaskMock;

//     private Logger loggerMock;

//     private File outputDirectoryMock;

//     private TestLoggingContainer testLoggingMock;

//     @BeforeEach
//     void setUp() {
//         testTaskMock = mock(Test.class);
//         loggerMock = mock(Logger.class);
//         outputDirectoryMock = mock(File.class);
//         testLoggingMock = mock(TestLoggingContainer.class);
//         when(testTaskMock.getTestLogging()).thenReturn(testLoggingMock);
//         when(testTaskMock.getLogger()).thenReturn(loggerMock);
//         listener = new ErrorReportingTestListener(testTaskMock, outputDirectoryMock);
//     }

//     @Test
//     void testSetDumpOutputOnFailure() {
//         listener.setDumpOutputOnFailure(false);
//         assertFalse(listener.dumpOutputOnFailure);
//         listener.setDumpOutputOnFailure(true);
//         assertTrue(listener.dumpOutputOnFailure);
//     }

//     @ParameterizedTest
//     @CsvSource({ "REPRODUCE WITH, true", "Something else, false" })
//     void testOnOutput(String message, boolean shouldAddToReproductionLines) {
//         TestDescriptor testDescriptorMock = mock(TestDescriptor.class);
//         TestOutputEvent outputEventMock = mock(TestOutputEvent.class);
//         TestDescriptor parentMock = mock(TestDescriptor.class);
//         when(testDescriptorMock.getParent()).thenReturn(parentMock);
//         when(outputEventMock.getMessage()).thenReturn(message);
//         listener.onOutput(testDescriptorMock, outputEventMock);
//         if (shouldAddToReproductionLines) {
//             assertFalse(listener.reproductionLines.isEmpty());
//         } else {
//             assertTrue(listener.reproductionLines.isEmpty());
//         }
//     }

//     @Test
//     void testBeforeSuite() {
//         TestDescriptor suiteDescriptorMock = mock(TestDescriptor.class);
//         listener.beforeSuite(suiteDescriptorMock);
//         // No assertions needed as the method is empty
//     }

//     @Test
//     void testAfterSuite() throws IOException {
//         TestDescriptor suiteDescriptorMock = mock(TestDescriptor.class);
//         TestResult resultMock = mock(TestResult.class);
//         when(resultMock.getResultType()).thenReturn(TestResult.ResultType.SUCCESS);
//         when(suiteDescriptorMock.getParent()).thenReturn(null);
//         listener.afterSuite(suiteDescriptorMock, resultMock);
//         verify(loggerMock, never()).lifecycle(anyString());
//     }

//     @Test
//     void testBeforeTest() {
//         TestDescriptor testDescriptorMock = mock(TestDescriptor.class);
//         listener.beforeTest(testDescriptorMock);
//         // No assertions needed as the method is empty
//     }

//     @Test
//     void testAfterTestSuccess() {
//         TestDescriptor testDescriptorMock = mock(TestDescriptor.class);
//         TestResult resultMock = mock(TestResult.class);
//         when(resultMock.getResultType()).thenReturn(TestResult.ResultType.SUCCESS);
//         listener.afterTest(testDescriptorMock, resultMock);
//         assertTrue(listener.getFailedTests().isEmpty());
//     }

//     @Test
//     void testAfterTestFailure() {
//         TestDescriptor testDescriptorMock = mock(TestDescriptor.class);
//         TestResult resultMock = mock(TestResult.class);
//         TestDescriptor parentMock = mock(TestDescriptor.class);
//         when(resultMock.getResultType()).thenReturn(TestResult.ResultType.FAILURE);
//         when(testDescriptorMock.getParent()).thenReturn(parentMock);
//         when(resultMock.getExceptions()).thenReturn(new ArrayList<>());
//         listener.afterTest(testDescriptorMock, resultMock);
//         assertFalse(listener.getFailedTests().isEmpty());
//     }

//     @Test
//     void testGetFailedTests() {
//         assertTrue(listener.getFailedTests().isEmpty());
//         TestDescriptor testDescriptorMock = mock(TestDescriptor.class);
//         ErrorReportingTestListener.Descriptor descriptor = ErrorReportingTestListener.Descriptor.of(testDescriptorMock);
//         listener.failedTests.add(descriptor);
//         assertEquals(1, listener.getFailedTests().size());
//         assertTrue(listener.getFailedTests().contains(descriptor));
//     }

//     @Test
//     void testDescriptor() {
//         TestDescriptor testDescriptorMock = mock(TestDescriptor.class);
//         when(testDescriptorMock.getName()).thenReturn("testName");
//         when(testDescriptorMock.getClassName()).thenReturn("TestClass");
//         ErrorReportingTestListener.Descriptor descriptor = ErrorReportingTestListener.Descriptor.of(testDescriptorMock);
//         assertEquals("testName", descriptor.name());
//         assertEquals("TestClass", descriptor.className());
//         assertNull(descriptor.parent());
//         assertEquals("TestClass.testName", descriptor.getFullName());
//     }

//     @Test
//     void testEventWriter() throws IOException {
//         ErrorReportingTestListener.Descriptor descriptorMock = mock(ErrorReportingTestListener.Descriptor.class);
//         when(descriptorMock.className()).thenReturn("TestClass");
//         File tempFile = File.createTempFile("test", ".out");
//         tempFile.deleteOnExit();
//         when(outputDirectoryMock.getPath()).thenReturn(tempFile.getParent());
//         ErrorReportingTestListener.EventWriter eventWriter = listener.new EventWriter(descriptorMock);
//         TestOutputEvent outputEventMock = mock(TestOutputEvent.class);
//         when(outputEventMock.getDestination()).thenReturn(TestOutputEvent.Destination.StdOut);
//         when(outputEventMock.getMessage()).thenReturn("Test message");
//         eventWriter.write(outputEventMock);
//         eventWriter.flush();
//         try (BufferedReader reader = eventWriter.reader()) {
//             assertEquals("  1> Test message", reader.readLine());
//         }
//         eventWriter.close();
//         assertFalse(tempFile.exists());
//     }
}