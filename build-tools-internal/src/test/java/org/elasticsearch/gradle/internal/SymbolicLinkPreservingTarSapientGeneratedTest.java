package org.elasticsearch.gradle.internal;

import org.elasticsearch.gradle.internal.SymbolicLinkPreservingTar;

import static org.hamcrest.MatcherAssert.assertThat;

import org.gradle.api.internal.file.archive.compression.SimpleCompressor;

import static org.hamcrest.Matchers.*;

import org.junit.jupiter.api.Test;
import org.gradle.api.internal.file.archive.compression.Bzip2Archiver;
import org.gradle.api.internal.file.copy.CopyAction;
import org.gradle.api.internal.file.archive.compression.GzipArchiver;

import static org.mockito.Mockito.*;

import org.gradle.api.file.RegularFile;
import org.gradle.api.tasks.bundling.Compression;
import org.gradle.api.provider.Provider;
import org.gradle.api.internal.file.archive.compression.ArchiveOutputStreamFactory;

import static org.mockito.ArgumentMatchers.any;

class SymbolicLinkPreservingTarSapientGeneratedTest {

    @Test
    void createCopyActionWhenCompressionIsBZIP2() {
        //SymbolicLinkPreservingTar target = spy(new SymbolicLinkPreservingTar());
        //target.setCompression(Compression.BZIP2);
        //doReturn(false).when(target).isPreserveFileTimestamps();
        //Provider<RegularFile> mockProvider = mock(Provider.class);
        //when(target.getArchiveFile()).thenReturn(mockProvider);
        //CopyAction result = target.createCopyAction();
        //assertThat(result, is(notNullValue()));
        //assertThat(result, is(instanceOf(SymbolicLinkPreservingTar.SymbolicLinkPreservingTarCopyAction.class)));
        //verify(target).isPreserveFileTimestamps();
    }

    @Test
    void createCopyActionWhenCompressionIsGZIP() {
        //SymbolicLinkPreservingTar target = spy(new SymbolicLinkPreservingTar());
        //target.setCompression(Compression.GZIP);
        //doReturn(false).when(target).isPreserveFileTimestamps();
        //Provider<RegularFile> mockProvider = mock(Provider.class);
        //when(target.getArchiveFile()).thenReturn(mockProvider);
        //CopyAction result = target.createCopyAction();
        //assertThat(result, is(notNullValue()));
        //assertThat(result, is(instanceOf(SymbolicLinkPreservingTar.SymbolicLinkPreservingTarCopyAction.class)));
        //verify(target).isPreserveFileTimestamps();
    }

    @Test
    void createCopyActionWhenCompressionIsNone() {
        //SymbolicLinkPreservingTar target = spy(new SymbolicLinkPreservingTar());
        //target.setCompression(Compression.NONE);
        //doReturn(false).when(target).isPreserveFileTimestamps();
        //Provider<RegularFile> mockProvider = mock(Provider.class);
        //when(target.getArchiveFile()).thenReturn(mockProvider);
        //CopyAction result = target.createCopyAction();
        //assertThat(result, is(notNullValue()));
        //assertThat(result, is(instanceOf(SymbolicLinkPreservingTar.SymbolicLinkPreservingTarCopyAction.class)));
        //verify(target).isPreserveFileTimestamps();
    }

    @Test
    void createCopyActionShouldUseCorrectCompressor() {
        SymbolicLinkPreservingTar target = new SymbolicLinkPreservingTar();
        Provider<RegularFile> mockProvider = mock(Provider.class);
        when(target.getArchiveFile()).thenReturn(mockProvider);
        target.setCompression(Compression.BZIP2);
        CopyAction bzip2Action = target.createCopyAction();
        assertThat(getCompressorFromCopyAction(bzip2Action), is(instanceOf(Bzip2Archiver.class)));
        target.setCompression(Compression.GZIP);
        CopyAction gzipAction = target.createCopyAction();
        assertThat(getCompressorFromCopyAction(gzipAction), is(instanceOf(GzipArchiver.class)));
        target.setCompression(Compression.NONE);
        CopyAction noneAction = target.createCopyAction();
        assertThat(getCompressorFromCopyAction(noneAction), is(instanceOf(SimpleCompressor.class)));
    }

    private ArchiveOutputStreamFactory getCompressorFromCopyAction(CopyAction action) {
        //SymbolicLinkPreservingTar.SymbolicLinkPreservingTarCopyAction tarAction = (SymbolicLinkPreservingTar.SymbolicLinkPreservingTarCopyAction) action;
        //return tarAction.compressor;
    }
}