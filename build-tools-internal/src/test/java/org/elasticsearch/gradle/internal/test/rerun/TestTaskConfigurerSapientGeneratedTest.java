package org.elasticsearch.gradle.internal.test.rerun;

// import org.elasticsearch.gradle.internal.test.rerun.TestTaskConfigurer;
// import org.junit.jupiter.api.BeforeEach;
// import static org.mockito.ArgumentMatchers.any;
// import org.junit.jupiter.api.Test;
// import static org.mockito.ArgumentMatchers.eq;
// import org.gradle.api.internal.tasks.testing.TestExecuter;
// import org.gradle.api.internal.plugins.ExtensionContainerInternal;
// import org.mockito.Mock;
// import org.gradle.api.Action;
// import org.gradle.api.tasks.testing.Test;
// import org.mockito.MockitoAnnotations;
// import java.lang.reflect.InvocationTargetException;
// import org.elasticsearch.gradle.internal.test.rerun.executer.RerunTestExecuter;
// import java.lang.reflect.Method;
// import static org.junit.jupiter.api.Assertions.*;
// import org.gradle.api.internal.tasks.testing.JvmTestExecutionSpec;
// import static org.mockito.Mockito.*;
// import org.gradle.api.model.ObjectFactory;
// import org.gradle.api.Task;
// import static org.mockito.ArgumentMatchers.any;

class TestTaskConfigurerSapientGeneratedTest {

//     @Mock
//     private Test testTask;

//     @Mock
//     private ObjectFactory objectFactory;

//     @Mock
//     private TestRerunTaskExtension extension;

//     @Mock
//     private ExtensionContainerInternal extensionContainer;

//     @BeforeEach
//     void setUp() {
//         MockitoAnnotations.openMocks(this);
//         when(testTask.getExtensions()).thenReturn(extensionContainer);
//     }

//     @Test
//     void testConfigureTestTask() {
//         TestTaskConfigurer.configureTestTask(testTask, objectFactory);
//         verify(extensionContainer).create(eq(TestRerunTaskExtension.NAME), eq(TestRerunTaskExtension.class), eq(objectFactory));
//         verify(testTask).doFirst(any(Action.class));
//     }

//     @Test
//     void testCreateRetryTestExecuter() throws Exception {
//         Method createRetryTestExecuterMethod = TestTaskConfigurer.class.getDeclaredMethod("createRetryTestExecuter", Task.class, TestRerunTaskExtension.class);
//         createRetryTestExecuterMethod.setAccessible(true);
//         TestExecuter<JvmTestExecutionSpec> mockDelegate = mock(TestExecuter.class);
//         Method createTestExecuterMethod = Test.class.getDeclaredMethod("createTestExecuter");
//         createTestExecuterMethod.setAccessible(true);
//         when(createTestExecuterMethod.invoke(testTask)).thenReturn(mockDelegate);
//         RerunTestExecuter result = (RerunTestExecuter) createRetryTestExecuterMethod.invoke(null, testTask, extension);
//         assertNotNull(result);
//         assertTrue(result instanceof RerunTestExecuter);
//     }

//     @Test
//     void testGetTestExecuter() throws Exception {
//         Method getTestExecuterMethod = TestTaskConfigurer.class.getDeclaredMethod("getTestExecuter", Task.class);
//         getTestExecuterMethod.setAccessible(true);
//         TestExecuter<JvmTestExecutionSpec> mockExecuter = mock(TestExecuter.class);
//         Method createTestExecuterMethod = Test.class.getDeclaredMethod("createTestExecuter");
//         createTestExecuterMethod.setAccessible(true);
//         when(createTestExecuterMethod.invoke(testTask)).thenReturn(mockExecuter);
//         TestExecuter<JvmTestExecutionSpec> result = (TestExecuter<JvmTestExecutionSpec>) getTestExecuterMethod.invoke(null, testTask);
//         assertNotNull(result);
//         assertEquals(mockExecuter, result);
//     }

//     @Test
//     void testSetTestExecuter() throws Exception {
//         Method setTestExecuterMethod = TestTaskConfigurer.class.getDeclaredMethod("setTestExecuter", Task.class, RerunTestExecuter.class);
//         setTestExecuterMethod.setAccessible(true);
//         RerunTestExecuter mockRerunTestExecuter = mock(RerunTestExecuter.class);
//         Method testSetTestExecuterMethod = Test.class.getDeclaredMethod("setTestExecuter", TestExecuter.class);
//         testSetTestExecuterMethod.setAccessible(true);
//         setTestExecuterMethod.invoke(null, testTask, mockRerunTestExecuter);
//         verify(testTask).setTestExecuter(mockRerunTestExecuter);
//     }

//     @Test
//     void testDeclaredMethod() throws Exception {
//         Method declaredMethodMethod = TestTaskConfigurer.class.getDeclaredMethod("declaredMethod", Class.class, String.class, Class[].class);
//         declaredMethodMethod.setAccessible(true);
//         Method result = (Method) declaredMethodMethod.invoke(null, Test.class, "setTestExecuter", TestExecuter.class);
//         assertNotNull(result);
//         assertEquals("setTestExecuter", result.getName());
//         assertTrue(result.isAccessible());
//     }

//     @Test
//     void testMakeAccessible() throws Exception {
//         Method makeAccessibleMethod = TestTaskConfigurer.class.getDeclaredMethod("makeAccessible", Method.class);
//         makeAccessibleMethod.setAccessible(true);
//         Method mockMethod = mock(Method.class);
//         Method result = (Method) makeAccessibleMethod.invoke(null, mockMethod);
//         verify(mockMethod).setAccessible(true);
//         assertEquals(mockMethod, result);
//     }

//     @Test
//     void testInvoke() throws Exception {
//         Method invokeMethod = TestTaskConfigurer.class.getDeclaredMethod("invoke", Method.class, Object.class, Object[].class);
//         invokeMethod.setAccessible(true);
//         Method mockMethod = mock(Method.class);
//         Object mockInstance = new Object();
//         Object mockArg = new Object();
//         Object expectedResult = new Object();
//         when(mockMethod.invoke(mockInstance, mockArg)).thenReturn(expectedResult);
//         Object result = invokeMethod.invoke(null, mockMethod, mockInstance, mockArg);
//         assertEquals(expectedResult, result);
//     }

//     @Test
//     void testInvokeWithIllegalAccessException() throws Exception {
//         Method invokeMethod = TestTaskConfigurer.class.getDeclaredMethod("invoke", Method.class, Object.class, Object[].class);
//         invokeMethod.setAccessible(true);
//         Method mockMethod = mock(Method.class);
//         Object mockInstance = new Object();
//         Object mockArg = new Object();
//         when(mockMethod.invoke(mockInstance, mockArg)).thenThrow(new IllegalAccessException());
//         assertThrows(RuntimeException.class, () -> invokeMethod.invoke(null, mockMethod, mockInstance, mockArg));
//     }

//     @Test
//     void testInvokeWithInvocationTargetException() throws Exception {
//         Method invokeMethod = TestTaskConfigurer.class.getDeclaredMethod("invoke", Method.class, Object.class, Object[].class);
//         invokeMethod.setAccessible(true);
//         Method mockMethod = mock(Method.class);
//         Object mockInstance = new Object();
//         Object mockArg = new Object();
//         when(mockMethod.invoke(mockInstance, mockArg)).thenThrow(new InvocationTargetException(new RuntimeException()));
//         assertThrows(RuntimeException.class, () -> invokeMethod.invoke(null, mockMethod, mockInstance, mockArg));
//     }

//     @Test
//     void testInitTaskActionExecute() throws Exception {
//         TestTaskConfigurer.InitTaskAction initTaskAction = new TestTaskConfigurer.InitTaskAction(extension);
//         Method executeMethod = TestTaskConfigurer.InitTaskAction.class.getDeclaredMethod("execute", Task.class);
//         executeMethod.setAccessible(true);
//         Method createRetryTestExecuterMethod = TestTaskConfigurer.class.getDeclaredMethod("createRetryTestExecuter", Task.class, TestRerunTaskExtension.class);
//         createRetryTestExecuterMethod.setAccessible(true);
//         RerunTestExecuter mockRerunTestExecuter = mock(RerunTestExecuter.class);
//         when(createRetryTestExecuterMethod.invoke(null, testTask, extension)).thenReturn(mockRerunTestExecuter);
//         Method setTestExecuterMethod = TestTaskConfigurer.class.getDeclaredMethod("setTestExecuter", Task.class, RerunTestExecuter.class);
//         setTestExecuterMethod.setAccessible(true);
//         executeMethod.invoke(initTaskAction, testTask);
//         verify(testTask).setTestExecuter(mockRerunTestExecuter);
//     }
}