// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.purview.workflow;

import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import com.azure.core.util.Configuration;
import com.azure.identity.UsernamePasswordCredentialBuilder;

public final class ReadmeSamples {
    // BEGIN: readme-sample-createWorkflowClient
    PurviewWorkflowClient purviewWorkflowClient = new PurviewWorkflowClientBuilder()
        .endpoint(Configuration.getGlobalConfiguration().get("ENDPOINT", "endpoint"))
        .credential(new UsernamePasswordCredentialBuilder()
            .clientId(Configuration.getGlobalConfiguration().get("CLIENTID", "clientId"))
            .tenantId(Configuration.getGlobalConfiguration().get("TENANTID", "tenantId"))
            .username(Configuration.getGlobalConfiguration().get("USERNAME", "username"))
            .password(Configuration.getGlobalConfiguration().get("PASSWORD", "password"))
            .build())
        .buildClient();

    // END: readme-sample-createWorkflowClient
    public void createWorkflow() {
        // BEGIN: readme-sample-createWorkflow
        BinaryData workflowCreateOrUpdateCommand =
            BinaryData.fromString(
                "{\"name\":\"Create glossary term workflow\",\"description\":\"\",\"triggers\":[{\"type\":\"when_term_creation_is_requested\",\"underGlossaryHierarchy\":\"/glossaries/20031e20-b4df-4a66-a61d-1b0716f3fa48\"}],\"isEnabled\":true,\"actionDag\":{\"actions\":{\"Startandwaitforanapproval\":{\"type\":\"Approval\",\"inputs\":{\"parameters\":{\"approvalType\":\"PendingOnAll\",\"title\":\"ApprovalRequestforCreateGlossaryTerm\",\"assignedTo\":[\"eece94d9-0619-4669-bb8a-d6ecec5220bc\"]}},\"runAfter\":{}},\"Condition\":{\"type\":\"If\",\"expression\":{\"and\":[{\"equals\":[\"@outputs('Startandwaitforanapproval')['body/outcome']\",\"Approved\"]}]},\"actions\":{\"Createglossaryterm\":{\"type\":\"CreateTerm\",\"runAfter\":{}},\"Sendemailnotification\":{\"type\":\"EmailNotification\",\"inputs\":{\"parameters\":{\"emailSubject\":\"GlossaryTermCreate-APPROVED\",\"emailMessage\":\"YourrequestforGlossaryTerm@{triggerBody()['request']['term']['name']}isapproved.\",\"emailRecipients\":[\"@{triggerBody()['request']['requestor']}\"]}},\"runAfter\":{\"Createglossaryterm\":[\"Succeeded\"]}}},\"else\":{\"actions\":{\"Sendrejectemailnotification\":{\"type\":\"EmailNotification\",\"inputs\":{\"parameters\":{\"emailSubject\":\"GlossaryTermCreate-REJECTED\",\"emailMessage\":\"YourrequestforGlossaryTerm@{triggerBody()['request']['term']['name']}isrejected.\",\"emailRecipients\":[\"@{triggerBody()['request']['requestor']}\"]}},\"runAfter\":{}}}},\"runAfter\":{\"Startandwaitforanapproval\":[\"Succeeded\"]}}}}}");
        RequestOptions requestOptions = new RequestOptions();
        Response<BinaryData> response =
            purviewWorkflowClient.createOrReplaceWorkflowWithResponse(
                "4afb5752-e47f-43a1-8ba7-c696bf8d2745", workflowCreateOrUpdateCommand, requestOptions);
        // END: readme-sample-createWorkflow
    }

    public void submitUserRequests() {
        // BEGIN: readme-sample-submitUserRequests
        BinaryData userRequestsPayload =
            BinaryData.fromString(
                "{\"comment\":\"Thanks!\",\"operations\":[{\"type\":\"CreateTerm\",\"payload\":{\"glossaryTerm\":{\"name\":\"term\",\"anchor\":{\"glossaryGuid\":\"20031e20-b4df-4a66-a61d-1b0716f3fa48\"},\"nickName\":\"term\",\"status\":\"Approved\"}}}]}");
        RequestOptions requestOptions = new RequestOptions();
        Response<BinaryData> response =
            purviewWorkflowClient.submitUserRequestsWithResponse(userRequestsPayload, requestOptions);
        // END: readme-sample-submitUserRequests
    }

    public void approveWorkflowTask() {
        // BEGIN: readme-sample-approveWorkflowTask
        BinaryData approvalResponseComment = BinaryData.fromString("{\"comment\":\"Thanks for raising this!\"}");
        RequestOptions requestOptions = new RequestOptions();
        Response<Void> response =
            purviewWorkflowClient.approveApprovalTaskWithResponse(
                "69b57a00-f5de-4a17-a44a-6479adae373d", approvalResponseComment, requestOptions);
        // END: readme-sample-approveWorkflowTask
    }
}
