// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.AzureIaaSvmProtectionPolicy;
import com.azure.resourcemanager.recoveryservicesbackup.models.IaasvmPolicyType;
import com.azure.resourcemanager.recoveryservicesbackup.models.InstantRPAdditionalDetails;
import com.azure.resourcemanager.recoveryservicesbackup.models.RetentionDurationType;
import com.azure.resourcemanager.recoveryservicesbackup.models.RetentionPolicy;
import com.azure.resourcemanager.recoveryservicesbackup.models.SchedulePolicy;
import com.azure.resourcemanager.recoveryservicesbackup.models.TieringMode;
import com.azure.resourcemanager.recoveryservicesbackup.models.TieringPolicy;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class AzureIaaSvmProtectionPolicyTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AzureIaaSvmProtectionPolicy model =
            BinaryData
                .fromString(
                    "{\"backupManagementType\":\"AzureIaasVM\",\"instantRPDetails\":{\"azureBackupRGNamePrefix\":\"hbq\",\"azureBackupRGNameSuffix\":\"tx\"},\"schedulePolicy\":{\"schedulePolicyType\":\"SchedulePolicy\"},\"retentionPolicy\":{\"retentionPolicyType\":\"RetentionPolicy\"},\"tieringPolicy\":{\"tg\":{\"tieringMode\":\"TierAfter\",\"duration\":798254198,\"durationType\":\"Invalid\"},\"xrxc\":{\"tieringMode\":\"Invalid\",\"duration\":1748959674,\"durationType\":\"Years\"},\"okqdzfvaz\":{\"tieringMode\":\"TierRecommended\",\"duration\":58328549,\"durationType\":\"Invalid\"},\"ttbaj\":{\"tieringMode\":\"TierRecommended\",\"duration\":1398349003,\"durationType\":\"Days\"}},\"instantRpRetentionRangeInDays\":337338297,\"timeZone\":\"nwxyiop\",\"policyType\":\"V2\",\"protectedItemsCount\":1150651693,\"resourceGuardOperationRequests\":[\"uvscxkdmligov\",\"brxk\",\"mloazuru\"]}")
                .toObject(AzureIaaSvmProtectionPolicy.class);
        Assertions.assertEquals(1150651693, model.protectedItemsCount());
        Assertions.assertEquals("uvscxkdmligov", model.resourceGuardOperationRequests().get(0));
        Assertions.assertEquals("hbq", model.instantRPDetails().azureBackupRGNamePrefix());
        Assertions.assertEquals("tx", model.instantRPDetails().azureBackupRGNameSuffix());
        Assertions.assertEquals(TieringMode.TIER_AFTER, model.tieringPolicy().get("tg").tieringMode());
        Assertions.assertEquals(798254198, model.tieringPolicy().get("tg").duration());
        Assertions.assertEquals(RetentionDurationType.INVALID, model.tieringPolicy().get("tg").durationType());
        Assertions.assertEquals(337338297, model.instantRpRetentionRangeInDays());
        Assertions.assertEquals("nwxyiop", model.timeZone());
        Assertions.assertEquals(IaasvmPolicyType.V2, model.policyType());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AzureIaaSvmProtectionPolicy model =
            new AzureIaaSvmProtectionPolicy()
                .withProtectedItemsCount(1150651693)
                .withResourceGuardOperationRequests(Arrays.asList("uvscxkdmligov", "brxk", "mloazuru"))
                .withInstantRPDetails(
                    new InstantRPAdditionalDetails()
                        .withAzureBackupRGNamePrefix("hbq")
                        .withAzureBackupRGNameSuffix("tx"))
                .withSchedulePolicy(new SchedulePolicy())
                .withRetentionPolicy(new RetentionPolicy())
                .withTieringPolicy(
                    mapOf(
                        "tg",
                        new TieringPolicy()
                            .withTieringMode(TieringMode.TIER_AFTER)
                            .withDuration(798254198)
                            .withDurationType(RetentionDurationType.INVALID),
                        "xrxc",
                        new TieringPolicy()
                            .withTieringMode(TieringMode.INVALID)
                            .withDuration(1748959674)
                            .withDurationType(RetentionDurationType.YEARS),
                        "okqdzfvaz",
                        new TieringPolicy()
                            .withTieringMode(TieringMode.TIER_RECOMMENDED)
                            .withDuration(58328549)
                            .withDurationType(RetentionDurationType.INVALID),
                        "ttbaj",
                        new TieringPolicy()
                            .withTieringMode(TieringMode.TIER_RECOMMENDED)
                            .withDuration(1398349003)
                            .withDurationType(RetentionDurationType.DAYS)))
                .withInstantRpRetentionRangeInDays(337338297)
                .withTimeZone("nwxyiop")
                .withPolicyType(IaasvmPolicyType.V2);
        model = BinaryData.fromObject(model).toObject(AzureIaaSvmProtectionPolicy.class);
        Assertions.assertEquals(1150651693, model.protectedItemsCount());
        Assertions.assertEquals("uvscxkdmligov", model.resourceGuardOperationRequests().get(0));
        Assertions.assertEquals("hbq", model.instantRPDetails().azureBackupRGNamePrefix());
        Assertions.assertEquals("tx", model.instantRPDetails().azureBackupRGNameSuffix());
        Assertions.assertEquals(TieringMode.TIER_AFTER, model.tieringPolicy().get("tg").tieringMode());
        Assertions.assertEquals(798254198, model.tieringPolicy().get("tg").duration());
        Assertions.assertEquals(RetentionDurationType.INVALID, model.tieringPolicy().get("tg").durationType());
        Assertions.assertEquals(337338297, model.instantRpRetentionRangeInDays());
        Assertions.assertEquals("nwxyiop", model.timeZone());
        Assertions.assertEquals(IaasvmPolicyType.V2, model.policyType());
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
