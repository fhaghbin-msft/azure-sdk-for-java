// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.CreateMode;
import com.azure.resourcemanager.recoveryservicesbackup.models.MabFileFolderProtectedItem;
import com.azure.resourcemanager.recoveryservicesbackup.models.MabFileFolderProtectedItemExtendedInfo;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class MabFileFolderProtectedItemTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        MabFileFolderProtectedItem model =
            BinaryData
                .fromString(
                    "{\"protectedItemType\":\"MabFileFolderProtectedItem\",\"friendlyName\":\"chnmna\",\"computerName\":\"nxhkxjqi\",\"lastBackupStatus\":\"rweooxffifhx\",\"lastBackupTime\":\"2021-03-12T15:59:07Z\",\"protectionState\":\"ewmozqvbu\",\"deferredDeleteSyncTimeInUTC\":1513135428772373073,\"extendedInfo\":{\"lastRefreshedAt\":\"2021-09-20T15:27:31Z\",\"oldestRecoveryPoint\":\"2021-08-24T12:41:38Z\",\"recoveryPointCount\":1081864935},\"backupManagementType\":\"Invalid\",\"workloadType\":\"AzureFileShare\",\"containerName\":\"ttaboidvmfqh\",\"sourceResourceId\":\"ubowsepdfgkm\",\"policyId\":\"herngb\",\"lastRecoveryPoint\":\"2021-05-03T04:12:26Z\",\"backupSetName\":\"ahokqtobkauxofsh\",\"createMode\":\"Default\",\"deferredDeleteTimeInUTC\":\"2021-11-11T18:17:14Z\",\"isScheduledForDeferredDelete\":true,\"deferredDeleteTimeRemaining\":\"aiywzejywhsl\",\"isDeferredDeleteScheduleUpcoming\":true,\"isRehydrate\":false,\"resourceGuardOperationRequests\":[\"ndnpdwrpqafgfug\"],\"isArchiveEnabled\":false,\"policyName\":\"hyet\",\"softDeleteRetentionPeriod\":1426304970}")
                .toObject(MabFileFolderProtectedItem.class);
        Assertions.assertEquals("ttaboidvmfqh", model.containerName());
        Assertions.assertEquals("ubowsepdfgkm", model.sourceResourceId());
        Assertions.assertEquals("herngb", model.policyId());
        Assertions.assertEquals(OffsetDateTime.parse("2021-05-03T04:12:26Z"), model.lastRecoveryPoint());
        Assertions.assertEquals("ahokqtobkauxofsh", model.backupSetName());
        Assertions.assertEquals(CreateMode.DEFAULT, model.createMode());
        Assertions.assertEquals(OffsetDateTime.parse("2021-11-11T18:17:14Z"), model.deferredDeleteTimeInUtc());
        Assertions.assertEquals(true, model.isScheduledForDeferredDelete());
        Assertions.assertEquals("aiywzejywhsl", model.deferredDeleteTimeRemaining());
        Assertions.assertEquals(true, model.isDeferredDeleteScheduleUpcoming());
        Assertions.assertEquals(false, model.isRehydrate());
        Assertions.assertEquals("ndnpdwrpqafgfug", model.resourceGuardOperationRequests().get(0));
        Assertions.assertEquals(false, model.isArchiveEnabled());
        Assertions.assertEquals("hyet", model.policyName());
        Assertions.assertEquals(1426304970, model.softDeleteRetentionPeriod());
        Assertions.assertEquals("chnmna", model.friendlyName());
        Assertions.assertEquals("nxhkxjqi", model.computerName());
        Assertions.assertEquals("rweooxffifhx", model.lastBackupStatus());
        Assertions.assertEquals(OffsetDateTime.parse("2021-03-12T15:59:07Z"), model.lastBackupTime());
        Assertions.assertEquals("ewmozqvbu", model.protectionState());
        Assertions.assertEquals(1513135428772373073L, model.deferredDeleteSyncTimeInUtc());
        Assertions.assertEquals(OffsetDateTime.parse("2021-09-20T15:27:31Z"), model.extendedInfo().lastRefreshedAt());
        Assertions
            .assertEquals(OffsetDateTime.parse("2021-08-24T12:41:38Z"), model.extendedInfo().oldestRecoveryPoint());
        Assertions.assertEquals(1081864935, model.extendedInfo().recoveryPointCount());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        MabFileFolderProtectedItem model =
            new MabFileFolderProtectedItem()
                .withContainerName("ttaboidvmfqh")
                .withSourceResourceId("ubowsepdfgkm")
                .withPolicyId("herngb")
                .withLastRecoveryPoint(OffsetDateTime.parse("2021-05-03T04:12:26Z"))
                .withBackupSetName("ahokqtobkauxofsh")
                .withCreateMode(CreateMode.DEFAULT)
                .withDeferredDeleteTimeInUtc(OffsetDateTime.parse("2021-11-11T18:17:14Z"))
                .withIsScheduledForDeferredDelete(true)
                .withDeferredDeleteTimeRemaining("aiywzejywhsl")
                .withIsDeferredDeleteScheduleUpcoming(true)
                .withIsRehydrate(false)
                .withResourceGuardOperationRequests(Arrays.asList("ndnpdwrpqafgfug"))
                .withIsArchiveEnabled(false)
                .withPolicyName("hyet")
                .withSoftDeleteRetentionPeriod(1426304970)
                .withFriendlyName("chnmna")
                .withComputerName("nxhkxjqi")
                .withLastBackupStatus("rweooxffifhx")
                .withLastBackupTime(OffsetDateTime.parse("2021-03-12T15:59:07Z"))
                .withProtectionState("ewmozqvbu")
                .withDeferredDeleteSyncTimeInUtc(1513135428772373073L)
                .withExtendedInfo(
                    new MabFileFolderProtectedItemExtendedInfo()
                        .withLastRefreshedAt(OffsetDateTime.parse("2021-09-20T15:27:31Z"))
                        .withOldestRecoveryPoint(OffsetDateTime.parse("2021-08-24T12:41:38Z"))
                        .withRecoveryPointCount(1081864935));
        model = BinaryData.fromObject(model).toObject(MabFileFolderProtectedItem.class);
        Assertions.assertEquals("ttaboidvmfqh", model.containerName());
        Assertions.assertEquals("ubowsepdfgkm", model.sourceResourceId());
        Assertions.assertEquals("herngb", model.policyId());
        Assertions.assertEquals(OffsetDateTime.parse("2021-05-03T04:12:26Z"), model.lastRecoveryPoint());
        Assertions.assertEquals("ahokqtobkauxofsh", model.backupSetName());
        Assertions.assertEquals(CreateMode.DEFAULT, model.createMode());
        Assertions.assertEquals(OffsetDateTime.parse("2021-11-11T18:17:14Z"), model.deferredDeleteTimeInUtc());
        Assertions.assertEquals(true, model.isScheduledForDeferredDelete());
        Assertions.assertEquals("aiywzejywhsl", model.deferredDeleteTimeRemaining());
        Assertions.assertEquals(true, model.isDeferredDeleteScheduleUpcoming());
        Assertions.assertEquals(false, model.isRehydrate());
        Assertions.assertEquals("ndnpdwrpqafgfug", model.resourceGuardOperationRequests().get(0));
        Assertions.assertEquals(false, model.isArchiveEnabled());
        Assertions.assertEquals("hyet", model.policyName());
        Assertions.assertEquals(1426304970, model.softDeleteRetentionPeriod());
        Assertions.assertEquals("chnmna", model.friendlyName());
        Assertions.assertEquals("nxhkxjqi", model.computerName());
        Assertions.assertEquals("rweooxffifhx", model.lastBackupStatus());
        Assertions.assertEquals(OffsetDateTime.parse("2021-03-12T15:59:07Z"), model.lastBackupTime());
        Assertions.assertEquals("ewmozqvbu", model.protectionState());
        Assertions.assertEquals(1513135428772373073L, model.deferredDeleteSyncTimeInUtc());
        Assertions.assertEquals(OffsetDateTime.parse("2021-09-20T15:27:31Z"), model.extendedInfo().lastRefreshedAt());
        Assertions
            .assertEquals(OffsetDateTime.parse("2021-08-24T12:41:38Z"), model.extendedInfo().oldestRecoveryPoint());
        Assertions.assertEquals(1081864935, model.extendedInfo().recoveryPointCount());
    }
}
