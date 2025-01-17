// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.AzureWorkloadSapHanaPointInTimeRecoveryPoint;
import com.azure.resourcemanager.recoveryservicesbackup.models.PointInTimeRange;
import com.azure.resourcemanager.recoveryservicesbackup.models.RecoveryPointMoveReadinessInfo;
import com.azure.resourcemanager.recoveryservicesbackup.models.RecoveryPointProperties;
import com.azure.resourcemanager.recoveryservicesbackup.models.RecoveryPointTierInformationV2;
import com.azure.resourcemanager.recoveryservicesbackup.models.RecoveryPointTierStatus;
import com.azure.resourcemanager.recoveryservicesbackup.models.RecoveryPointTierType;
import com.azure.resourcemanager.recoveryservicesbackup.models.RestorePointType;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class AzureWorkloadSapHanaPointInTimeRecoveryPointTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AzureWorkloadSapHanaPointInTimeRecoveryPoint model =
            BinaryData
                .fromString(
                    "{\"objectType\":\"AzureWorkloadSAPHanaPointInTimeRecoveryPoint\",\"timeRanges\":[{\"startTime\":\"2021-10-17T17:05:58Z\",\"endTime\":\"2021-06-18T04:20:03Z\"}],\"recoveryPointTimeInUTC\":\"2021-09-04T15:37:05Z\",\"type\":\"Differential\",\"recoveryPointTierDetails\":[{\"type\":\"HardenedRP\",\"status\":\"Disabled\",\"extendedInfo\":{\"xkyxvxevblbj\":\"idjks\"}}],\"recoveryPointMoveReadinessInfo\":{\"aulx\":{\"isReadyForMove\":false,\"additionalInfo\":\"age\"},\"ynenlsvxeizz\":{\"isReadyForMove\":true,\"additionalInfo\":\"jbnkpp\"},\"ktp\":{\"isReadyForMove\":true,\"additionalInfo\":\"nsrmffeycx\"}},\"recoveryPointProperties\":{\"expiryTime\":\"erteeammxqiekk\",\"ruleName\":\"ddrtkgdojb\"}}")
                .toObject(AzureWorkloadSapHanaPointInTimeRecoveryPoint.class);
        Assertions.assertEquals(OffsetDateTime.parse("2021-09-04T15:37:05Z"), model.recoveryPointTimeInUtc());
        Assertions.assertEquals(RestorePointType.DIFFERENTIAL, model.type());
        Assertions.assertEquals(RecoveryPointTierType.HARDENED_RP, model.recoveryPointTierDetails().get(0).type());
        Assertions.assertEquals(RecoveryPointTierStatus.DISABLED, model.recoveryPointTierDetails().get(0).status());
        Assertions.assertEquals("idjks", model.recoveryPointTierDetails().get(0).extendedInfo().get("xkyxvxevblbj"));
        Assertions.assertEquals(false, model.recoveryPointMoveReadinessInfo().get("aulx").isReadyForMove());
        Assertions.assertEquals("age", model.recoveryPointMoveReadinessInfo().get("aulx").additionalInfo());
        Assertions.assertEquals("erteeammxqiekk", model.recoveryPointProperties().expiryTime());
        Assertions.assertEquals("ddrtkgdojb", model.recoveryPointProperties().ruleName());
        Assertions.assertEquals(OffsetDateTime.parse("2021-10-17T17:05:58Z"), model.timeRanges().get(0).startTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-06-18T04:20:03Z"), model.timeRanges().get(0).endTime());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AzureWorkloadSapHanaPointInTimeRecoveryPoint model =
            new AzureWorkloadSapHanaPointInTimeRecoveryPoint()
                .withRecoveryPointTimeInUtc(OffsetDateTime.parse("2021-09-04T15:37:05Z"))
                .withType(RestorePointType.DIFFERENTIAL)
                .withRecoveryPointTierDetails(
                    Arrays
                        .asList(
                            new RecoveryPointTierInformationV2()
                                .withType(RecoveryPointTierType.HARDENED_RP)
                                .withStatus(RecoveryPointTierStatus.DISABLED)
                                .withExtendedInfo(mapOf("xkyxvxevblbj", "idjks"))))
                .withRecoveryPointMoveReadinessInfo(
                    mapOf(
                        "aulx",
                        new RecoveryPointMoveReadinessInfo().withIsReadyForMove(false).withAdditionalInfo("age"),
                        "ynenlsvxeizz",
                        new RecoveryPointMoveReadinessInfo().withIsReadyForMove(true).withAdditionalInfo("jbnkpp"),
                        "ktp",
                        new RecoveryPointMoveReadinessInfo().withIsReadyForMove(true).withAdditionalInfo("nsrmffeycx")))
                .withRecoveryPointProperties(
                    new RecoveryPointProperties().withExpiryTime("erteeammxqiekk").withRuleName("ddrtkgdojb"))
                .withTimeRanges(
                    Arrays
                        .asList(
                            new PointInTimeRange()
                                .withStartTime(OffsetDateTime.parse("2021-10-17T17:05:58Z"))
                                .withEndTime(OffsetDateTime.parse("2021-06-18T04:20:03Z"))));
        model = BinaryData.fromObject(model).toObject(AzureWorkloadSapHanaPointInTimeRecoveryPoint.class);
        Assertions.assertEquals(OffsetDateTime.parse("2021-09-04T15:37:05Z"), model.recoveryPointTimeInUtc());
        Assertions.assertEquals(RestorePointType.DIFFERENTIAL, model.type());
        Assertions.assertEquals(RecoveryPointTierType.HARDENED_RP, model.recoveryPointTierDetails().get(0).type());
        Assertions.assertEquals(RecoveryPointTierStatus.DISABLED, model.recoveryPointTierDetails().get(0).status());
        Assertions.assertEquals("idjks", model.recoveryPointTierDetails().get(0).extendedInfo().get("xkyxvxevblbj"));
        Assertions.assertEquals(false, model.recoveryPointMoveReadinessInfo().get("aulx").isReadyForMove());
        Assertions.assertEquals("age", model.recoveryPointMoveReadinessInfo().get("aulx").additionalInfo());
        Assertions.assertEquals("erteeammxqiekk", model.recoveryPointProperties().expiryTime());
        Assertions.assertEquals("ddrtkgdojb", model.recoveryPointProperties().ruleName());
        Assertions.assertEquals(OffsetDateTime.parse("2021-10-17T17:05:58Z"), model.timeRanges().get(0).startTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-06-18T04:20:03Z"), model.timeRanges().get(0).endTime());
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
