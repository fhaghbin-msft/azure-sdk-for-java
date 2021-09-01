// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement;

import com.azure.core.util.Context;
import com.azure.resourcemanager.apimanagement.models.NotificationName;

/** Samples for NotificationRecipientEmail Delete. */
public final class NotificationRecipientEmailDeleteSamples {
    /*
     * operationId: NotificationRecipientEmail_Delete
     * api-version: 2020-12-01
     * x-ms-examples: ApiManagementDeleteNotificationRecipientEmail
     */
    /**
     * Sample code: ApiManagementDeleteNotificationRecipientEmail.
     *
     * @param manager Entry point to ApiManagementManager.
     */
    public static void apiManagementDeleteNotificationRecipientEmail(
        com.azure.resourcemanager.apimanagement.ApiManagementManager manager) {
        manager
            .notificationRecipientEmails()
            .deleteWithResponse(
                "rg1",
                "apimService1",
                NotificationName.REQUEST_PUBLISHER_NOTIFICATION_MESSAGE,
                "contoso@live.com",
                Context.NONE);
    }
}