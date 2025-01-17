// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.DiskInformation;
import com.azure.resourcemanager.recoveryservicesbackup.models.RecoveryPointDiskConfiguration;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class RecoveryPointDiskConfigurationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        RecoveryPointDiskConfiguration model =
            BinaryData
                .fromString(
                    "{\"numberOfDisksIncludedInBackup\":2051682707,\"numberOfDisksAttachedToVm\":487171106,\"includedDiskList\":[{\"lun\":1546979917,\"name\":\"eyujtvczkcnyxrx\"},{\"lun\":991975365,\"name\":\"d\"},{\"lun\":859827610,\"name\":\"nkvxlxpaglqi\"},{\"lun\":734282826,\"name\":\"cvkhpzvuqdfl\"}],\"excludedDiskList\":[{\"lun\":427469553,\"name\":\"fpubcpzgpxti\"},{\"lun\":112991490,\"name\":\"nidibgqjxg\"},{\"lun\":150891546,\"name\":\"govfgpikqmhhaow\"}]}")
                .toObject(RecoveryPointDiskConfiguration.class);
        Assertions.assertEquals(2051682707, model.numberOfDisksIncludedInBackup());
        Assertions.assertEquals(487171106, model.numberOfDisksAttachedToVm());
        Assertions.assertEquals(1546979917, model.includedDiskList().get(0).lun());
        Assertions.assertEquals("eyujtvczkcnyxrx", model.includedDiskList().get(0).name());
        Assertions.assertEquals(427469553, model.excludedDiskList().get(0).lun());
        Assertions.assertEquals("fpubcpzgpxti", model.excludedDiskList().get(0).name());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        RecoveryPointDiskConfiguration model =
            new RecoveryPointDiskConfiguration()
                .withNumberOfDisksIncludedInBackup(2051682707)
                .withNumberOfDisksAttachedToVm(487171106)
                .withIncludedDiskList(
                    Arrays
                        .asList(
                            new DiskInformation().withLun(1546979917).withName("eyujtvczkcnyxrx"),
                            new DiskInformation().withLun(991975365).withName("d"),
                            new DiskInformation().withLun(859827610).withName("nkvxlxpaglqi"),
                            new DiskInformation().withLun(734282826).withName("cvkhpzvuqdfl")))
                .withExcludedDiskList(
                    Arrays
                        .asList(
                            new DiskInformation().withLun(427469553).withName("fpubcpzgpxti"),
                            new DiskInformation().withLun(112991490).withName("nidibgqjxg"),
                            new DiskInformation().withLun(150891546).withName("govfgpikqmhhaow")));
        model = BinaryData.fromObject(model).toObject(RecoveryPointDiskConfiguration.class);
        Assertions.assertEquals(2051682707, model.numberOfDisksIncludedInBackup());
        Assertions.assertEquals(487171106, model.numberOfDisksAttachedToVm());
        Assertions.assertEquals(1546979917, model.includedDiskList().get(0).lun());
        Assertions.assertEquals("eyujtvczkcnyxrx", model.includedDiskList().get(0).name());
        Assertions.assertEquals(427469553, model.excludedDiskList().get(0).lun());
        Assertions.assertEquals("fpubcpzgpxti", model.excludedDiskList().get(0).name());
    }
}
