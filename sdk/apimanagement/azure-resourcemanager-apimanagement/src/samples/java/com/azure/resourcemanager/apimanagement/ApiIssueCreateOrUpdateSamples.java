// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement;

import com.azure.resourcemanager.apimanagement.models.State;
import java.time.OffsetDateTime;

/** Samples for ApiIssue CreateOrUpdate. */
public final class ApiIssueCreateOrUpdateSamples {
    /*
     * operationId: ApiIssue_CreateOrUpdate
     * api-version: 2020-12-01
     * x-ms-examples: ApiManagementCreateApiIssue
     */
    /**
     * Sample code: ApiManagementCreateApiIssue.
     *
     * @param manager Entry point to ApiManagementManager.
     */
    public static void apiManagementCreateApiIssue(
        com.azure.resourcemanager.apimanagement.ApiManagementManager manager) {
        manager
            .apiIssues()
            .define("57d2ef278aa04f0ad01d6cdc")
            .withExistingApi("rg1", "apimService1", "57d1f7558aa04f15146d9d8a")
            .withTitle("New API issue")
            .withDescription("New API issue description")
            .withUserId(
                "/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.ApiManagement/service/apimService1/users/1")
            .withCreatedDate(OffsetDateTime.parse("2018-02-01T22:21:20.467Z"))
            .withState(State.OPEN)
            .create();
    }
}