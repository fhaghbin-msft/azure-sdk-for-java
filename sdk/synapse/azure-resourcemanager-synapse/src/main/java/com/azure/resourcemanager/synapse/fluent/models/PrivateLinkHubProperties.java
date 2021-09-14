// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.synapse.models.PrivateEndpointConnectionForPrivateLinkHubBasic;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** PrivateLinkHub properties. */
@Fluent
public final class PrivateLinkHubProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PrivateLinkHubProperties.class);

    /*
     * PrivateLinkHub provisioning state
     */
    @JsonProperty(value = "provisioningState")
    private String provisioningState;

    /*
     * List of private endpoint connections
     */
    @JsonProperty(value = "privateEndpointConnections", access = JsonProperty.Access.WRITE_ONLY)
    private List<PrivateEndpointConnectionForPrivateLinkHubBasic> privateEndpointConnections;

    /**
     * Get the provisioningState property: PrivateLinkHub provisioning state.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioningState property: PrivateLinkHub provisioning state.
     *
     * @param provisioningState the provisioningState value to set.
     * @return the PrivateLinkHubProperties object itself.
     */
    public PrivateLinkHubProperties withProvisioningState(String provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Get the privateEndpointConnections property: List of private endpoint connections.
     *
     * @return the privateEndpointConnections value.
     */
    public List<PrivateEndpointConnectionForPrivateLinkHubBasic> privateEndpointConnections() {
        return this.privateEndpointConnections;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (privateEndpointConnections() != null) {
            privateEndpointConnections().forEach(e -> e.validate());
        }
    }
}