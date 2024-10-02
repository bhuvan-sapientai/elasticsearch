package org.elasticsearch.gradle.internal.precommit;

import org.elasticsearch.gradle.internal.precommit.LicenseAnalyzer;

import org.junit.jupiter.api.Timeout;

import java.util.regex.Pattern;
import java.nio.file.Files;

import static org.hamcrest.MatcherAssert.assertThat;

import java.io.UncheckedIOException;

import static org.hamcrest.Matchers.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.ParameterizedTest;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.IOException;

import static org.mockito.ArgumentMatchers.any;

@Timeout(value = 5)
class LicenseAnalyzerSapientGeneratedTest {

    @ParameterizedTest
    @CsvSource({"Apache-2.0, true, false, 'Apache License Version 2.0'", "BSD-2-Clause, true, false, 'Redistribution and use in source and binary forms, with or without modification, are permitted provided that the following conditions are met: 1. Redistributions of source code must retain the above copyright notice, this list of conditions and the following disclaimer. 2. Redistributions in binary form must reproduce the above copyright notice, this list of conditions and the following disclaimer in the documentation and/or other materials provided with the distribution. THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS \"AS IS\" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED.'", "BSD-3-Clause, true, false, 'Redistribution and use in source and binary forms, with or without modification, are permitted provided that the following conditions are met: 1. Redistributions of source code must retain the above copyright notice, this list of conditions and the following disclaimer. 2. Redistributions in binary form must reproduce the above copyright notice, this list of conditions and the following disclaimer in the documentation and/or other materials provided with the distribution. 3. Neither the name of the copyright holder nor the names of its contributors may be used to endorse or promote products derived from this software without specific prior written permission.'", "CDDL-1.0, true, false, 'COMMON DEVELOPMENT AND DISTRIBUTION LICENSE Version 1.0'", "CDDL-1.1, true, false, 'COMMON DEVELOPMENT AND DISTRIBUTION LICENSE Version 1.1'", "ICU, true, false, 'ICU License - ICU 1.8.1 and later'", "MIT, true, false, 'Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the \"Software\"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions: The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software. THE SOFTWARE IS PROVIDED \"AS IS\", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT.'", "MIT-0, true, false, 'MIT No Attribution Copyright 2023 Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the \"Software\"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so. THE SOFTWARE IS PROVIDED \"AS IS\", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT.'", "MPL-1.1, true, false, 'Mozilla Public License Version 1.1'", "MPL-2.0, true, false, 'Mozilla Public License Version 2.0'", "XZ, false, false, 'Licensing of XZ for Java'", "EPL-2.0, true, false, 'Eclipse Public License - v 2.0'", "EDL-1.0, true, false, 'Eclipse Distribution License - v 1.0'", "LGPL-2.1, true, true, 'GNU LESSER GENERAL PUBLIC LICENSE Version 2.1'", "LGPL-3.0, true, true, 'GNU LESSER GENERAL PUBLIC LICENSE Version 3'", "GeoLite, false, false, 'The Elastic GeoIP Database Service uses the GeoLite2 Data created and licensed by MaxMind, which is governed by MaxMind's GeoLite2 End User License Agreement, available at https://www.maxmind.com/en/geolite2/eula.'", "GeoIp-Database-Service, false, false, 'By using the GeoIP Database Service, you agree to the Elastic GeoIP Database Service Agreement, available at www.elastic.co/elastic-geoip-database-service-terms.'"})
    void licenseTypeWhenMatches(String identifier, boolean spdxLicense, boolean sourceRedistributionRequired, String licenseContent) throws IOException {
        File tempFile = Files.createTempFile("license", ".txt").toFile();
        Files.writeString(tempFile.toPath(), licenseContent);
        LicenseAnalyzer.LicenseInfo result = LicenseAnalyzer.licenseType(tempFile);
        assertAll("result", () -> assertThat(result.identifier(), equalTo(identifier)), () -> assertThat(result.spdxLicense(), equalTo(spdxLicense)), () -> assertThat(result.sourceRedistributionRequired(), equalTo(sourceRedistributionRequired)));
        tempFile.delete();
    }

    @Test
    void licenseTypeWhenNotMatchesThrowsIllegalStateException() throws IOException {
        File tempFile = Files.createTempFile("unknown_license", ".txt").toFile();
        Files.writeString(tempFile.toPath(), "This is not a recognized license text.");
        IllegalStateException exception = assertThrows(IllegalStateException.class, () -> LicenseAnalyzer.licenseType(tempFile));
        assertThat(exception.getMessage(), containsString("Unknown license for license file:"));
        tempFile.delete();
    }

    @Test
    void licenseTypeWithNonExistentFileThrowsUncheckedIOException() {
        File nonExistentFile = new File("non_existent_file.txt");
        assertThrows(UncheckedIOException.class, () -> LicenseAnalyzer.licenseType(nonExistentFile));
    }
}
