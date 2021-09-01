// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement;

import com.azure.core.util.Context;

/** Samples for ContentItem Get. */
public final class ContentItemGetSamples {
    /*
     * operationId: ContentItem_Get
     * api-version: 2020-12-01
     * x-ms-examples: ApiManagementGetContentTypeContentItem
     */
    /**
     * Sample code: ApiManagementGetContentTypeContentItem.
     *
     * @param manager Entry point to ApiManagementManager.
     */
    public static void apiManagementGetContentTypeContentItem(
        com.azure.resourcemanager.apimanagement.ApiManagementManager manager) {
        manager
            .contentItems()
            .getWithResponse("rg1", "apimService1", "page", "4e3cf6a5-574a-ba08-1f23-2e7a38faa6d8", Context.NONE);
    }
}