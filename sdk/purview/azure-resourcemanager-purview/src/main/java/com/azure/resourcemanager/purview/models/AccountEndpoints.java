// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.purview.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The account endpoints. */
@Immutable
public class AccountEndpoints {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AccountEndpoints.class);

    /*
     * Gets the catalog endpoint.
     */
    @JsonProperty(value = "catalog", access = JsonProperty.Access.WRITE_ONLY)
    private String catalog;

    /*
     * Gets the guardian endpoint.
     */
    @JsonProperty(value = "guardian", access = JsonProperty.Access.WRITE_ONLY)
    private String guardian;

    /*
     * Gets the scan endpoint.
     */
    @JsonProperty(value = "scan", access = JsonProperty.Access.WRITE_ONLY)
    private String scan;

    /**
     * Get the catalog property: Gets the catalog endpoint.
     *
     * @return the catalog value.
     */
    public String catalog() {
        return this.catalog;
    }

    /**
     * Get the guardian property: Gets the guardian endpoint.
     *
     * @return the guardian value.
     */
    public String guardian() {
        return this.guardian;
    }

    /**
     * Get the scan property: Gets the scan endpoint.
     *
     * @return the scan value.
     */
    public String scan() {
        return this.scan;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}