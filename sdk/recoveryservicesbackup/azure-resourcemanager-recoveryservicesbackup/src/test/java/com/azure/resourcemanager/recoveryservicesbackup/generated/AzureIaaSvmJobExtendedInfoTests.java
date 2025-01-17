// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.AzureIaaSvmJobExtendedInfo;
import com.azure.resourcemanager.recoveryservicesbackup.models.AzureIaaSvmJobTaskDetails;
import java.time.Duration;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class AzureIaaSvmJobExtendedInfoTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AzureIaaSvmJobExtendedInfo model =
            BinaryData
                .fromString(
                    "{\"tasksList\":[{\"taskId\":\"lvxwmyg\",\"startTime\":\"2021-08-06T16:36:03Z\",\"endTime\":\"2021-10-24T06:34:28Z\",\"instanceId\":\"chisze\",\"duration\":\"PT237H1M23S\",\"status\":\"jcrxgibbdaxcon\",\"progressPercentage\":47.677298821316015,\"taskExecutionDetails\":\"orsukokwbqp\"},{\"taskId\":\"lvnuuepzlrph\",\"startTime\":\"2021-08-08T02:31:45Z\",\"endTime\":\"2021-09-19T04:44:04Z\",\"instanceId\":\"wey\",\"duration\":\"PT67H4M34S\",\"status\":\"nvmnnrwrbiorkta\",\"progressPercentage\":81.93884888082881,\"taskExecutionDetails\":\"hgdnhxmsivfo\"}],\"propertyBag\":{\"gdufiqnd\":\"ox\",\"chvcyyysfgdo\":\"euzaof\",\"qonmacj\":\"cubiipuipw\"},\"internalPropertyBag\":{\"vcimpev\":\"izsh\",\"bywdxsmicc\":\"gmblrri\",\"zdvoqytibyowbb\":\"rwfscjfnynszquj\"},\"progressPercentage\":86.46204195401377,\"estimatedRemainingDuration\":\"utp\",\"dynamicErrorMessage\":\"joxoism\"}")
                .toObject(AzureIaaSvmJobExtendedInfo.class);
        Assertions.assertEquals("lvxwmyg", model.tasksList().get(0).taskId());
        Assertions.assertEquals(OffsetDateTime.parse("2021-08-06T16:36:03Z"), model.tasksList().get(0).startTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-10-24T06:34:28Z"), model.tasksList().get(0).endTime());
        Assertions.assertEquals("chisze", model.tasksList().get(0).instanceId());
        Assertions.assertEquals(Duration.parse("PT237H1M23S"), model.tasksList().get(0).duration());
        Assertions.assertEquals("jcrxgibbdaxcon", model.tasksList().get(0).status());
        Assertions.assertEquals(47.677298821316015D, model.tasksList().get(0).progressPercentage());
        Assertions.assertEquals("orsukokwbqp", model.tasksList().get(0).taskExecutionDetails());
        Assertions.assertEquals("ox", model.propertyBag().get("gdufiqnd"));
        Assertions.assertEquals("izsh", model.internalPropertyBag().get("vcimpev"));
        Assertions.assertEquals(86.46204195401377D, model.progressPercentage());
        Assertions.assertEquals("utp", model.estimatedRemainingDuration());
        Assertions.assertEquals("joxoism", model.dynamicErrorMessage());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AzureIaaSvmJobExtendedInfo model =
            new AzureIaaSvmJobExtendedInfo()
                .withTasksList(
                    Arrays
                        .asList(
                            new AzureIaaSvmJobTaskDetails()
                                .withTaskId("lvxwmyg")
                                .withStartTime(OffsetDateTime.parse("2021-08-06T16:36:03Z"))
                                .withEndTime(OffsetDateTime.parse("2021-10-24T06:34:28Z"))
                                .withInstanceId("chisze")
                                .withDuration(Duration.parse("PT237H1M23S"))
                                .withStatus("jcrxgibbdaxcon")
                                .withProgressPercentage(47.677298821316015D)
                                .withTaskExecutionDetails("orsukokwbqp"),
                            new AzureIaaSvmJobTaskDetails()
                                .withTaskId("lvnuuepzlrph")
                                .withStartTime(OffsetDateTime.parse("2021-08-08T02:31:45Z"))
                                .withEndTime(OffsetDateTime.parse("2021-09-19T04:44:04Z"))
                                .withInstanceId("wey")
                                .withDuration(Duration.parse("PT67H4M34S"))
                                .withStatus("nvmnnrwrbiorkta")
                                .withProgressPercentage(81.93884888082881D)
                                .withTaskExecutionDetails("hgdnhxmsivfo")))
                .withPropertyBag(mapOf("gdufiqnd", "ox", "chvcyyysfgdo", "euzaof", "qonmacj", "cubiipuipw"))
                .withInternalPropertyBag(
                    mapOf("vcimpev", "izsh", "bywdxsmicc", "gmblrri", "zdvoqytibyowbb", "rwfscjfnynszquj"))
                .withProgressPercentage(86.46204195401377D)
                .withEstimatedRemainingDuration("utp")
                .withDynamicErrorMessage("joxoism");
        model = BinaryData.fromObject(model).toObject(AzureIaaSvmJobExtendedInfo.class);
        Assertions.assertEquals("lvxwmyg", model.tasksList().get(0).taskId());
        Assertions.assertEquals(OffsetDateTime.parse("2021-08-06T16:36:03Z"), model.tasksList().get(0).startTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-10-24T06:34:28Z"), model.tasksList().get(0).endTime());
        Assertions.assertEquals("chisze", model.tasksList().get(0).instanceId());
        Assertions.assertEquals(Duration.parse("PT237H1M23S"), model.tasksList().get(0).duration());
        Assertions.assertEquals("jcrxgibbdaxcon", model.tasksList().get(0).status());
        Assertions.assertEquals(47.677298821316015D, model.tasksList().get(0).progressPercentage());
        Assertions.assertEquals("orsukokwbqp", model.tasksList().get(0).taskExecutionDetails());
        Assertions.assertEquals("ox", model.propertyBag().get("gdufiqnd"));
        Assertions.assertEquals("izsh", model.internalPropertyBag().get("vcimpev"));
        Assertions.assertEquals(86.46204195401377D, model.progressPercentage());
        Assertions.assertEquals("utp", model.estimatedRemainingDuration());
        Assertions.assertEquals("joxoism", model.dynamicErrorMessage());
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
