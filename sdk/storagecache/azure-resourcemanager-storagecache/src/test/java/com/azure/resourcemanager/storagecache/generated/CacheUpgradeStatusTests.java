// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagecache.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.storagecache.models.CacheUpgradeStatus;

public final class CacheUpgradeStatusTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CacheUpgradeStatus model =
            BinaryData
                .fromString(
                    "{\"currentFirmwareVersion\":\"yxzk\",\"firmwareUpdateStatus\":\"unavailable\",\"firmwareUpdateDeadline\":\"2021-05-16T08:19Z\",\"lastFirmwareUpdate\":\"2021-03-20T11:43:44Z\",\"pendingFirmwareVersion\":\"lyaxuc\"}")
                .toObject(CacheUpgradeStatus.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CacheUpgradeStatus model = new CacheUpgradeStatus();
        model = BinaryData.fromObject(model).toObject(CacheUpgradeStatus.class);
    }
}
