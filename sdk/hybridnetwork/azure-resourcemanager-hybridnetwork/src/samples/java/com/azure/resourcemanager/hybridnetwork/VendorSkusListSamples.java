// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridnetwork;

import com.azure.core.util.Context;

/** Samples for VendorSkus List. */
public final class VendorSkusListSamples {
    /**
     * Sample code: List all the vendor skus of vendor resource.
     *
     * @param manager Entry point to HybridNetworkManager.
     */
    public static void listAllTheVendorSkusOfVendorResource(
        com.azure.resourcemanager.hybridnetwork.HybridNetworkManager manager) {
        manager.vendorSkus().list("TestVendor", Context.NONE);
    }
}