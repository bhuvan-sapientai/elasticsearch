package org.elasticsearch.gradle.util;

import org.elasticsearch.gradle.util.PermissionUtils;
import java.nio.file.attribute.PosixFilePermissions;
import java.nio.file.Files;
import org.junit.jupiter.api.BeforeEach;
import java.nio.file.Path;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import java.nio.file.attribute.PosixFilePermission;
import java.util.Set;
import java.nio.file.attribute.PosixFileAttributeView;
import org.junit.jupiter.api.io.TempDir;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import java.io.IOException;
import static org.mockito.ArgumentMatchers.any;
import org.junit.jupiter.api.Disabled;

class PermissionUtilsSapientGeneratedTest {

    @TempDir
    Path tempDir;

    private Path testFile;

    @BeforeEach
    void setUp() throws IOException {
        testFile = tempDir.resolve("testFile.txt");
        Files.createFile(testFile);
    }

    @Test
    void testChmodWithValidMode() throws IOException {
        PermissionUtils.chmod(testFile, 0755);
        Set<PosixFilePermission> permissions = Files.getPosixFilePermissions(testFile);
        assertTrue(permissions.contains(PosixFilePermission.OWNER_READ));
        assertTrue(permissions.contains(PosixFilePermission.OWNER_WRITE));
        assertTrue(permissions.contains(PosixFilePermission.OWNER_EXECUTE));
        assertTrue(permissions.contains(PosixFilePermission.GROUP_READ));
        assertTrue(permissions.contains(PosixFilePermission.GROUP_EXECUTE));
        assertTrue(permissions.contains(PosixFilePermission.OTHERS_READ));
        assertTrue(permissions.contains(PosixFilePermission.OTHERS_EXECUTE));
        assertFalse(permissions.contains(PosixFilePermission.GROUP_WRITE));
        assertFalse(permissions.contains(PosixFilePermission.OTHERS_WRITE));
    }

    @Test
    void testChmodWithZeroMode() throws IOException {
        Set<PosixFilePermission> originalPermissions = Files.getPosixFilePermissions(testFile);
        PermissionUtils.chmod(testFile, 0);
        Set<PosixFilePermission> newPermissions = Files.getPosixFilePermissions(testFile);
        assertEquals(originalPermissions, newPermissions);
    }

    @Disabled()
    @Test
    void testChmodWithNullPosixFileAttributeView() throws IOException {
        Path mockPath = mock(Path.class);
        PosixFileAttributeView mockView = null;
        when(mockPath.getFileSystem().provider().getFileAttributeView(any(Path.class), eq(PosixFileAttributeView.class))).thenReturn(mockView);
        PermissionUtils.chmod(mockPath, 0755);
        verify(mockPath, never()).getFileSystem();
    }

    @Disabled()
    @ParameterizedTest
    @CsvSource({ "0700, rwx------", "0755, rwxr-xr-x", "0644, rw-r--r--", "0777, rwxrwxrwx", "0000, ---------" })
    void testPermissionsFromInt(int mode, String expectedPermissions) throws IOException {
        PermissionUtils.chmod(testFile, mode);
        Set<PosixFilePermission> permissions = Files.getPosixFilePermissions(testFile);
        assertEquals(expectedPermissions, PosixFilePermissions.toString(permissions));
    }

    @Disabled()
    @Test
    void testChmodWithInvalidMode() {
        assertThrows(IllegalArgumentException.class, () -> PermissionUtils.chmod(testFile, 01000));
    }

    @Test
    void testPermissionsMethodWithValidInput() throws Exception {
        java.lang.reflect.Method permissionsMethod = PermissionUtils.class.getDeclaredMethod("permissions", int.class);
        permissionsMethod.setAccessible(true);
        assertEquals("rwx", permissionsMethod.invoke(null, 7));
        assertEquals("rw-", permissionsMethod.invoke(null, 6));
        assertEquals("r-x", permissionsMethod.invoke(null, 5));
        assertEquals("r--", permissionsMethod.invoke(null, 4));
        assertEquals("-wx", permissionsMethod.invoke(null, 3));
        assertEquals("-w-", permissionsMethod.invoke(null, 2));
        assertEquals("--x", permissionsMethod.invoke(null, 1));
        assertEquals("---", permissionsMethod.invoke(null, 0));
    }

    @Disabled()
    @ParameterizedTest
    @CsvSource({ "-1", "8" })
    void testPermissionsMethodWithInvalidInput(int invalidPermission) throws Exception {
        java.lang.reflect.Method permissionsMethod = PermissionUtils.class.getDeclaredMethod("permissions", int.class);
        permissionsMethod.setAccessible(true);
        assertThrows(IllegalArgumentException.class, () -> permissionsMethod.invoke(null, invalidPermission));
    }
}
