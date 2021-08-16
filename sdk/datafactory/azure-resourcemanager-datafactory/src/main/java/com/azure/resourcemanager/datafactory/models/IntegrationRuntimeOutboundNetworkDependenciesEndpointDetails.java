// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The details of Azure-SSIS integration runtime outbound network dependency endpoint. */
@Fluent
public final class IntegrationRuntimeOutboundNetworkDependenciesEndpointDetails {
    @JsonIgnore
    private final ClientLogger logger =
        new ClientLogger(IntegrationRuntimeOutboundNetworkDependenciesEndpointDetails.class);

    /*
     * The port of endpoint.
     */
    @JsonProperty(value = "port")
    private Integer port;

    /**
     * Get the port property: The port of endpoint.
     *
     * @return the port value.
     */
    public Integer port() {
        return this.port;
    }

    /**
     * Set the port property: The port of endpoint.
     *
     * @param port the port value to set.
     * @return the IntegrationRuntimeOutboundNetworkDependenciesEndpointDetails object itself.
     */
    public IntegrationRuntimeOutboundNetworkDependenciesEndpointDetails withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}