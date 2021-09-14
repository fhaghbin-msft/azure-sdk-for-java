// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.quota.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The resource quota limit value. */
@Fluent
public class LimitObject {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(LimitObject.class);

    /*
     * The quota/limit value
     */
    @JsonProperty(value = "value", required = true)
    private int value;

    /*
     * The limit object type.
     */
    @JsonProperty(value = "limitObjectType")
    private LimitType limitObjectType;

    /*
     * The quota or usages limit types.
     */
    @JsonProperty(value = "limitType")
    private QuotaLimitTypes limitType;

    /**
     * Get the value property: The quota/limit value.
     *
     * @return the value value.
     */
    public int value() {
        return this.value;
    }

    /**
     * Set the value property: The quota/limit value.
     *
     * @param value the value value to set.
     * @return the LimitObject object itself.
     */
    public LimitObject withValue(int value) {
        this.value = value;
        return this;
    }

    /**
     * Get the limitObjectType property: The limit object type.
     *
     * @return the limitObjectType value.
     */
    public LimitType limitObjectType() {
        return this.limitObjectType;
    }

    /**
     * Set the limitObjectType property: The limit object type.
     *
     * @param limitObjectType the limitObjectType value to set.
     * @return the LimitObject object itself.
     */
    public LimitObject withLimitObjectType(LimitType limitObjectType) {
        this.limitObjectType = limitObjectType;
        return this;
    }

    /**
     * Get the limitType property: The quota or usages limit types.
     *
     * @return the limitType value.
     */
    public QuotaLimitTypes limitType() {
        return this.limitType;
    }

    /**
     * Set the limitType property: The quota or usages limit types.
     *
     * @param limitType the limitType value to set.
     * @return the LimitObject object itself.
     */
    public LimitObject withLimitType(QuotaLimitTypes limitType) {
        this.limitType = limitType;
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