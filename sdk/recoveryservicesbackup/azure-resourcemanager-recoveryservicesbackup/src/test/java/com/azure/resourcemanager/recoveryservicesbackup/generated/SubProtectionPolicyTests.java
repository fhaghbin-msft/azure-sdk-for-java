// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.PolicyType;
import com.azure.resourcemanager.recoveryservicesbackup.models.RetentionDurationType;
import com.azure.resourcemanager.recoveryservicesbackup.models.RetentionPolicy;
import com.azure.resourcemanager.recoveryservicesbackup.models.SchedulePolicy;
import com.azure.resourcemanager.recoveryservicesbackup.models.SubProtectionPolicy;
import com.azure.resourcemanager.recoveryservicesbackup.models.TieringMode;
import com.azure.resourcemanager.recoveryservicesbackup.models.TieringPolicy;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class SubProtectionPolicyTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SubProtectionPolicy model =
            BinaryData
                .fromString(
                    "{\"policyType\":\"CopyOnlyFull\",\"schedulePolicy\":{\"schedulePolicyType\":\"SchedulePolicy\"},\"retentionPolicy\":{\"retentionPolicyType\":\"RetentionPolicy\"},\"tieringPolicy\":{\"oookkqfq\":{\"tieringMode\":\"Invalid\",\"duration\":547871572,\"durationType\":\"Invalid\"}}}")
                .toObject(SubProtectionPolicy.class);
        Assertions.assertEquals(PolicyType.COPY_ONLY_FULL, model.policyType());
        Assertions.assertEquals(TieringMode.INVALID, model.tieringPolicy().get("oookkqfq").tieringMode());
        Assertions.assertEquals(547871572, model.tieringPolicy().get("oookkqfq").duration());
        Assertions.assertEquals(RetentionDurationType.INVALID, model.tieringPolicy().get("oookkqfq").durationType());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SubProtectionPolicy model =
            new SubProtectionPolicy()
                .withPolicyType(PolicyType.COPY_ONLY_FULL)
                .withSchedulePolicy(new SchedulePolicy())
                .withRetentionPolicy(new RetentionPolicy())
                .withTieringPolicy(
                    mapOf(
                        "oookkqfq",
                        new TieringPolicy()
                            .withTieringMode(TieringMode.INVALID)
                            .withDuration(547871572)
                            .withDurationType(RetentionDurationType.INVALID)));
        model = BinaryData.fromObject(model).toObject(SubProtectionPolicy.class);
        Assertions.assertEquals(PolicyType.COPY_ONLY_FULL, model.policyType());
        Assertions.assertEquals(TieringMode.INVALID, model.tieringPolicy().get("oookkqfq").tieringMode());
        Assertions.assertEquals(547871572, model.tieringPolicy().get("oookkqfq").duration());
        Assertions.assertEquals(RetentionDurationType.INVALID, model.tieringPolicy().get("oookkqfq").durationType());
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
