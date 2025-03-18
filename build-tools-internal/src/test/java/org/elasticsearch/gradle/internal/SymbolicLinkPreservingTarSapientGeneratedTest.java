package org.elasticsearch.gradle.internal;

// import org.elasticsearch.gradle.internal.SymbolicLinkPreservingTar;
// import org.junit.jupiter.api.BeforeEach;
// import org.junit.jupiter.api.Test;
// import org.junit.jupiter.params.ParameterizedTest;
// import org.junit.jupiter.params.provider.EnumSource;
// import org.gradle.api.file.RegularFile;
// import org.gradle.api.tasks.bundling.Compression;
// import static org.hamcrest.MatcherAssert.assertThat;
// import org.gradle.api.internal.file.archive.compression.SimpleCompressor;
// import static org.hamcrest.Matchers.*;
// import org.gradle.api.internal.file.archive.compression.Bzip2Archiver;
// import static org.mockito.Mockito.*;
// import org.gradle.api.internal.file.archive.compression.GzipArchiver;
// import org.gradle.api.internal.file.copy.CopyAction;
// import org.gradle.api.internal.file.archive.compression.ArchiveOutputStreamFactory;
// import org.gradle.api.provider.Provider;
// import static org.mockito.ArgumentMatchers.any;

class SymbolicLinkPreservingTarSapientGeneratedTest {

//     private SymbolicLinkPreservingTar target;

//     private Provider<RegularFile> mockProvider;

//     @BeforeEach
//     void setUp() {
//         target = spy(new SymbolicLinkPreservingTar());
//         mockProvider = mock(Provider.class);
//         when(target.getArchiveFile()).thenReturn(mockProvider);
//     }

//     @ParameterizedTest
//     @EnumSource(Compression.class)
//     void createCopyActionForAllCompressionTypes(Compression compression) {
//         //target.setCompression(compression);
//         //doReturn(false).when(target).isPreserveFileTimestamps();
//         //CopyAction result = target.createCopyAction();
//         //assertThat(result, is(notNullValue()));
//         //assertThat(result, is(instanceOf(SymbolicLinkPreservingTar.SymbolicLinkPreservingTarCopyAction.class)));
//         //verify(target).isPreserveFileTimestamps();
//     }

//     @Test
//     void createCopyActionShouldUseCorrectCompressor() {
//         target.setCompression(Compression.BZIP2);
//         CopyAction bzip2Action = target.createCopyAction();
//         assertThat(getCompressorFromCopyAction(bzip2Action), is(instanceOf(Bzip2Archiver.class)));
//         target.setCompression(Compression.GZIP);
//         CopyAction gzipAction = target.createCopyAction();
//         assertThat(getCompressorFromCopyAction(gzipAction), is(instanceOf(GzipArchiver.class)));
//         target.setCompression(Compression.NONE);
//         CopyAction noneAction = target.createCopyAction();
//         assertThat(getCompressorFromCopyAction(noneAction), is(instanceOf(SimpleCompressor.class)));
//     }

//     private ArchiveOutputStreamFactory getCompressorFromCopyAction(CopyAction action) {
//         //SymbolicLinkPreservingTar.SymbolicLinkPreservingTarCopyAction tarAction = (SymbolicLinkPreservingTar.SymbolicLinkPreservingTarCopyAction) action;
//         //return tarAction.compressor;
//     }
}