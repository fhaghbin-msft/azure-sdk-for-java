// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Recovery point properties. */
@Fluent
public final class RecoveryPointProperties {
    /*
     * The recovery point time.
     */
    @JsonProperty(value = "recoveryPointTime")
    private OffsetDateTime recoveryPointTime;

    /*
     * The recovery point type: ApplicationConsistent, CrashConsistent.
     */
    @JsonProperty(value = "recoveryPointType")
    private String recoveryPointType;

    /*
     * The provider specific details for the recovery point.
     */
    @JsonProperty(value = "providerSpecificDetails")
    private ProviderSpecificRecoveryPointDetails providerSpecificDetails;

    /** Creates an instance of RecoveryPointProperties class. */
    public RecoveryPointProperties() {
    }

    /**
     * Get the recoveryPointTime property: The recovery point time.
     *
     * @return the recoveryPointTime value.
     */
    public OffsetDateTime recoveryPointTime() {
        return this.recoveryPointTime;
    }

    /**
     * Set the recoveryPointTime property: The recovery point time.
     *
     * @param recoveryPointTime the recoveryPointTime value to set.
     * @return the RecoveryPointProperties object itself.
     */
    public RecoveryPointProperties withRecoveryPointTime(OffsetDateTime recoveryPointTime) {
        this.recoveryPointTime = recoveryPointTime;
        return this;
    }

    /**
     * Get the recoveryPointType property: The recovery point type: ApplicationConsistent, CrashConsistent.
     *
     * @return the recoveryPointType value.
     */
    public String recoveryPointType() {
        return this.recoveryPointType;
    }

    /**
     * Set the recoveryPointType property: The recovery point type: ApplicationConsistent, CrashConsistent.
     *
     * @param recoveryPointType the recoveryPointType value to set.
     * @return the RecoveryPointProperties object itself.
     */
    public RecoveryPointProperties withRecoveryPointType(String recoveryPointType) {
        this.recoveryPointType = recoveryPointType;
        return this;
    }

    /**
     * Get the providerSpecificDetails property: The provider specific details for the recovery point.
     *
     * @return the providerSpecificDetails value.
     */
    public ProviderSpecificRecoveryPointDetails providerSpecificDetails() {
        return this.providerSpecificDetails;
    }

    /**
     * Set the providerSpecificDetails property: The provider specific details for the recovery point.
     *
     * @param providerSpecificDetails the providerSpecificDetails value to set.
     * @return the RecoveryPointProperties object itself.
     */
    public RecoveryPointProperties withProviderSpecificDetails(
        ProviderSpecificRecoveryPointDetails providerSpecificDetails) {
        this.providerSpecificDetails = providerSpecificDetails;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (providerSpecificDetails() != null) {
            providerSpecificDetails().validate();
        }
    }
}
