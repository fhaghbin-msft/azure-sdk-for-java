// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.AzureWorkloadSqlRecoveryPointExtendedInfo;
import com.azure.resourcemanager.recoveryservicesbackup.models.SqlDataDirectory;
import com.azure.resourcemanager.recoveryservicesbackup.models.SqlDataDirectoryType;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class AzureWorkloadSqlRecoveryPointExtendedInfoTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AzureWorkloadSqlRecoveryPointExtendedInfo model =
            BinaryData
                .fromString(
                    "{\"dataDirectoryTimeInUTC\":\"2021-04-15T03:27:32Z\",\"dataDirectoryPaths\":[{\"type\":\"Invalid\",\"path\":\"fczbgom\",\"logicalName\":\"beglqg\"}]}")
                .toObject(AzureWorkloadSqlRecoveryPointExtendedInfo.class);
        Assertions.assertEquals(OffsetDateTime.parse("2021-04-15T03:27:32Z"), model.dataDirectoryTimeInUtc());
        Assertions.assertEquals(SqlDataDirectoryType.INVALID, model.dataDirectoryPaths().get(0).type());
        Assertions.assertEquals("fczbgom", model.dataDirectoryPaths().get(0).path());
        Assertions.assertEquals("beglqg", model.dataDirectoryPaths().get(0).logicalName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AzureWorkloadSqlRecoveryPointExtendedInfo model =
            new AzureWorkloadSqlRecoveryPointExtendedInfo()
                .withDataDirectoryTimeInUtc(OffsetDateTime.parse("2021-04-15T03:27:32Z"))
                .withDataDirectoryPaths(
                    Arrays
                        .asList(
                            new SqlDataDirectory()
                                .withType(SqlDataDirectoryType.INVALID)
                                .withPath("fczbgom")
                                .withLogicalName("beglqg")));
        model = BinaryData.fromObject(model).toObject(AzureWorkloadSqlRecoveryPointExtendedInfo.class);
        Assertions.assertEquals(OffsetDateTime.parse("2021-04-15T03:27:32Z"), model.dataDirectoryTimeInUtc());
        Assertions.assertEquals(SqlDataDirectoryType.INVALID, model.dataDirectoryPaths().get(0).type());
        Assertions.assertEquals("fczbgom", model.dataDirectoryPaths().get(0).path());
        Assertions.assertEquals("beglqg", model.dataDirectoryPaths().get(0).logicalName());
    }
}
