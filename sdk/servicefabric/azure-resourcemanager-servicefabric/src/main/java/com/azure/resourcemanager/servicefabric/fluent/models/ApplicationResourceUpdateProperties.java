// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicefabric.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.servicefabric.models.ApplicationMetricDescription;
import com.azure.resourcemanager.servicefabric.models.ApplicationUpgradePolicy;
import com.azure.resourcemanager.servicefabric.models.ApplicationUserAssignedIdentity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** The application resource properties for patch operations. */
@Fluent
public class ApplicationResourceUpdateProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ApplicationResourceUpdateProperties.class);

    /*
     * The version of the application type as defined in the application
     * manifest.
     */
    @JsonProperty(value = "typeVersion")
    private String typeVersion;

    /*
     * List of application parameters with overridden values from their default
     * values specified in the application manifest.
     */
    @JsonProperty(value = "parameters")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> parameters;

    /*
     * Describes the policy for a monitored application upgrade.
     */
    @JsonProperty(value = "upgradePolicy")
    private ApplicationUpgradePolicy upgradePolicy;

    /*
     * The minimum number of nodes where Service Fabric will reserve capacity
     * for this application. Note that this does not mean that the services of
     * this application will be placed on all of those nodes. If this property
     * is set to zero, no capacity will be reserved. The value of this property
     * cannot be more than the value of the MaximumNodes property.
     */
    @JsonProperty(value = "minimumNodes")
    private Long minimumNodes;

    /*
     * The maximum number of nodes where Service Fabric will reserve capacity
     * for this application. Note that this does not mean that the services of
     * this application will be placed on all of those nodes. By default, the
     * value of this property is zero and it means that the services can be
     * placed on any node.
     */
    @JsonProperty(value = "maximumNodes")
    private Long maximumNodes;

    /*
     * Remove the current application capacity settings.
     */
    @JsonProperty(value = "removeApplicationCapacity")
    private Boolean removeApplicationCapacity;

    /*
     * List of application capacity metric description.
     */
    @JsonProperty(value = "metrics")
    private List<ApplicationMetricDescription> metrics;

    /*
     * List of user assigned identities for the application, each mapped to a
     * friendly name.
     */
    @JsonProperty(value = "managedIdentities")
    private List<ApplicationUserAssignedIdentity> managedIdentities;

    /**
     * Get the typeVersion property: The version of the application type as defined in the application manifest.
     *
     * @return the typeVersion value.
     */
    public String typeVersion() {
        return this.typeVersion;
    }

    /**
     * Set the typeVersion property: The version of the application type as defined in the application manifest.
     *
     * @param typeVersion the typeVersion value to set.
     * @return the ApplicationResourceUpdateProperties object itself.
     */
    public ApplicationResourceUpdateProperties withTypeVersion(String typeVersion) {
        this.typeVersion = typeVersion;
        return this;
    }

    /**
     * Get the parameters property: List of application parameters with overridden values from their default values
     * specified in the application manifest.
     *
     * @return the parameters value.
     */
    public Map<String, String> parameters() {
        return this.parameters;
    }

    /**
     * Set the parameters property: List of application parameters with overridden values from their default values
     * specified in the application manifest.
     *
     * @param parameters the parameters value to set.
     * @return the ApplicationResourceUpdateProperties object itself.
     */
    public ApplicationResourceUpdateProperties withParameters(Map<String, String> parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * Get the upgradePolicy property: Describes the policy for a monitored application upgrade.
     *
     * @return the upgradePolicy value.
     */
    public ApplicationUpgradePolicy upgradePolicy() {
        return this.upgradePolicy;
    }

    /**
     * Set the upgradePolicy property: Describes the policy for a monitored application upgrade.
     *
     * @param upgradePolicy the upgradePolicy value to set.
     * @return the ApplicationResourceUpdateProperties object itself.
     */
    public ApplicationResourceUpdateProperties withUpgradePolicy(ApplicationUpgradePolicy upgradePolicy) {
        this.upgradePolicy = upgradePolicy;
        return this;
    }

    /**
     * Get the minimumNodes property: The minimum number of nodes where Service Fabric will reserve capacity for this
     * application. Note that this does not mean that the services of this application will be placed on all of those
     * nodes. If this property is set to zero, no capacity will be reserved. The value of this property cannot be more
     * than the value of the MaximumNodes property.
     *
     * @return the minimumNodes value.
     */
    public Long minimumNodes() {
        return this.minimumNodes;
    }

    /**
     * Set the minimumNodes property: The minimum number of nodes where Service Fabric will reserve capacity for this
     * application. Note that this does not mean that the services of this application will be placed on all of those
     * nodes. If this property is set to zero, no capacity will be reserved. The value of this property cannot be more
     * than the value of the MaximumNodes property.
     *
     * @param minimumNodes the minimumNodes value to set.
     * @return the ApplicationResourceUpdateProperties object itself.
     */
    public ApplicationResourceUpdateProperties withMinimumNodes(Long minimumNodes) {
        this.minimumNodes = minimumNodes;
        return this;
    }

    /**
     * Get the maximumNodes property: The maximum number of nodes where Service Fabric will reserve capacity for this
     * application. Note that this does not mean that the services of this application will be placed on all of those
     * nodes. By default, the value of this property is zero and it means that the services can be placed on any node.
     *
     * @return the maximumNodes value.
     */
    public Long maximumNodes() {
        return this.maximumNodes;
    }

    /**
     * Set the maximumNodes property: The maximum number of nodes where Service Fabric will reserve capacity for this
     * application. Note that this does not mean that the services of this application will be placed on all of those
     * nodes. By default, the value of this property is zero and it means that the services can be placed on any node.
     *
     * @param maximumNodes the maximumNodes value to set.
     * @return the ApplicationResourceUpdateProperties object itself.
     */
    public ApplicationResourceUpdateProperties withMaximumNodes(Long maximumNodes) {
        this.maximumNodes = maximumNodes;
        return this;
    }

    /**
     * Get the removeApplicationCapacity property: Remove the current application capacity settings.
     *
     * @return the removeApplicationCapacity value.
     */
    public Boolean removeApplicationCapacity() {
        return this.removeApplicationCapacity;
    }

    /**
     * Set the removeApplicationCapacity property: Remove the current application capacity settings.
     *
     * @param removeApplicationCapacity the removeApplicationCapacity value to set.
     * @return the ApplicationResourceUpdateProperties object itself.
     */
    public ApplicationResourceUpdateProperties withRemoveApplicationCapacity(Boolean removeApplicationCapacity) {
        this.removeApplicationCapacity = removeApplicationCapacity;
        return this;
    }

    /**
     * Get the metrics property: List of application capacity metric description.
     *
     * @return the metrics value.
     */
    public List<ApplicationMetricDescription> metrics() {
        return this.metrics;
    }

    /**
     * Set the metrics property: List of application capacity metric description.
     *
     * @param metrics the metrics value to set.
     * @return the ApplicationResourceUpdateProperties object itself.
     */
    public ApplicationResourceUpdateProperties withMetrics(List<ApplicationMetricDescription> metrics) {
        this.metrics = metrics;
        return this;
    }

    /**
     * Get the managedIdentities property: List of user assigned identities for the application, each mapped to a
     * friendly name.
     *
     * @return the managedIdentities value.
     */
    public List<ApplicationUserAssignedIdentity> managedIdentities() {
        return this.managedIdentities;
    }

    /**
     * Set the managedIdentities property: List of user assigned identities for the application, each mapped to a
     * friendly name.
     *
     * @param managedIdentities the managedIdentities value to set.
     * @return the ApplicationResourceUpdateProperties object itself.
     */
    public ApplicationResourceUpdateProperties withManagedIdentities(
        List<ApplicationUserAssignedIdentity> managedIdentities) {
        this.managedIdentities = managedIdentities;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (upgradePolicy() != null) {
            upgradePolicy().validate();
        }
        if (metrics() != null) {
            metrics().forEach(e -> e.validate());
        }
        if (managedIdentities() != null) {
            managedIdentities().forEach(e -> e.validate());
        }
    }
}