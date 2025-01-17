// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.MabJobExtendedInfo;
import com.azure.resourcemanager.recoveryservicesbackup.models.MabJobTaskDetails;
import java.time.Duration;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class MabJobExtendedInfoTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        MabJobExtendedInfo model =
            BinaryData
                .fromString(
                    "{\"tasksList\":[{\"taskId\":\"cjjvpilguooqja\",\"startTime\":\"2021-08-17T16:01:08Z\",\"endTime\":\"2021-09-13T20:58:52Z\",\"duration\":\"PT113H51M28S\",\"status\":\"iookjbsah\"}],\"propertyBag\":{\"slmot\":\"tpdelqa\"},\"dynamicErrorMessage\":\"bnfxofvc\"}")
                .toObject(MabJobExtendedInfo.class);
        Assertions.assertEquals("cjjvpilguooqja", model.tasksList().get(0).taskId());
        Assertions.assertEquals(OffsetDateTime.parse("2021-08-17T16:01:08Z"), model.tasksList().get(0).startTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-09-13T20:58:52Z"), model.tasksList().get(0).endTime());
        Assertions.assertEquals(Duration.parse("PT113H51M28S"), model.tasksList().get(0).duration());
        Assertions.assertEquals("iookjbsah", model.tasksList().get(0).status());
        Assertions.assertEquals("tpdelqa", model.propertyBag().get("slmot"));
        Assertions.assertEquals("bnfxofvc", model.dynamicErrorMessage());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        MabJobExtendedInfo model =
            new MabJobExtendedInfo()
                .withTasksList(
                    Arrays
                        .asList(
                            new MabJobTaskDetails()
                                .withTaskId("cjjvpilguooqja")
                                .withStartTime(OffsetDateTime.parse("2021-08-17T16:01:08Z"))
                                .withEndTime(OffsetDateTime.parse("2021-09-13T20:58:52Z"))
                                .withDuration(Duration.parse("PT113H51M28S"))
                                .withStatus("iookjbsah")))
                .withPropertyBag(mapOf("slmot", "tpdelqa"))
                .withDynamicErrorMessage("bnfxofvc");
        model = BinaryData.fromObject(model).toObject(MabJobExtendedInfo.class);
        Assertions.assertEquals("cjjvpilguooqja", model.tasksList().get(0).taskId());
        Assertions.assertEquals(OffsetDateTime.parse("2021-08-17T16:01:08Z"), model.tasksList().get(0).startTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-09-13T20:58:52Z"), model.tasksList().get(0).endTime());
        Assertions.assertEquals(Duration.parse("PT113H51M28S"), model.tasksList().get(0).duration());
        Assertions.assertEquals("iookjbsah", model.tasksList().get(0).status());
        Assertions.assertEquals("tpdelqa", model.propertyBag().get("slmot"));
        Assertions.assertEquals("bnfxofvc", model.dynamicErrorMessage());
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
