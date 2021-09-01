// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement;

import com.azure.core.util.Context;

/** Samples for ApiIssue GetEntityTag. */
public final class ApiIssueGetEntityTagSamples {
    /*
     * operationId: ApiIssue_GetEntityTag
     * api-version: 2020-12-01
     * x-ms-examples: ApiManagementHeadApiIssue
     */
    /**
     * Sample code: ApiManagementHeadApiIssue.
     *
     * @param manager Entry point to ApiManagementManager.
     */
    public static void apiManagementHeadApiIssue(com.azure.resourcemanager.apimanagement.ApiManagementManager manager) {
        manager
            .apiIssues()
            .getEntityTagWithResponse(
                "rg1", "apimService1", "57d2ef278aa04f0888cba3f3", "57d2ef278aa04f0ad01d6cdc", Context.NONE);
    }
}