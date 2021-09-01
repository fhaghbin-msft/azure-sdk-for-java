// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.models.ExpressRouteCircuitReference;
import com.azure.resourcemanager.network.models.ProvisioningState;
import com.azure.resourcemanager.network.models.ServiceProviderProvisioningState;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Properties of ExpressRouteCrossConnection. */
@Fluent
public final class ExpressRouteCrossConnectionProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ExpressRouteCrossConnectionProperties.class);

    /*
     * The name of the primary port.
     */
    @JsonProperty(value = "primaryAzurePort", access = JsonProperty.Access.WRITE_ONLY)
    private String primaryAzurePort;

    /*
     * The name of the secondary port.
     */
    @JsonProperty(value = "secondaryAzurePort", access = JsonProperty.Access.WRITE_ONLY)
    private String secondaryAzurePort;

    /*
     * The identifier of the circuit traffic.
     */
    @JsonProperty(value = "sTag", access = JsonProperty.Access.WRITE_ONLY)
    private Integer stag;

    /*
     * The peering location of the ExpressRoute circuit.
     */
    @JsonProperty(value = "peeringLocation", access = JsonProperty.Access.WRITE_ONLY)
    private String peeringLocation;

    /*
     * The circuit bandwidth In Mbps.
     */
    @JsonProperty(value = "bandwidthInMbps", access = JsonProperty.Access.WRITE_ONLY)
    private Integer bandwidthInMbps;

    /*
     * The ExpressRouteCircuit.
     */
    @JsonProperty(value = "expressRouteCircuit")
    private ExpressRouteCircuitReference expressRouteCircuit;

    /*
     * The provisioning state of the circuit in the connectivity provider
     * system.
     */
    @JsonProperty(value = "serviceProviderProvisioningState")
    private ServiceProviderProvisioningState serviceProviderProvisioningState;

    /*
     * Additional read only notes set by the connectivity provider.
     */
    @JsonProperty(value = "serviceProviderNotes")
    private String serviceProviderNotes;

    /*
     * The provisioning state of the express route cross connection resource.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * The list of peerings.
     */
    @JsonProperty(value = "peerings")
    private List<ExpressRouteCrossConnectionPeeringInner> peerings;

    /**
     * Get the primaryAzurePort property: The name of the primary port.
     *
     * @return the primaryAzurePort value.
     */
    public String primaryAzurePort() {
        return this.primaryAzurePort;
    }

    /**
     * Get the secondaryAzurePort property: The name of the secondary port.
     *
     * @return the secondaryAzurePort value.
     */
    public String secondaryAzurePort() {
        return this.secondaryAzurePort;
    }

    /**
     * Get the stag property: The identifier of the circuit traffic.
     *
     * @return the stag value.
     */
    public Integer stag() {
        return this.stag;
    }

    /**
     * Get the peeringLocation property: The peering location of the ExpressRoute circuit.
     *
     * @return the peeringLocation value.
     */
    public String peeringLocation() {
        return this.peeringLocation;
    }

    /**
     * Get the bandwidthInMbps property: The circuit bandwidth In Mbps.
     *
     * @return the bandwidthInMbps value.
     */
    public Integer bandwidthInMbps() {
        return this.bandwidthInMbps;
    }

    /**
     * Get the expressRouteCircuit property: The ExpressRouteCircuit.
     *
     * @return the expressRouteCircuit value.
     */
    public ExpressRouteCircuitReference expressRouteCircuit() {
        return this.expressRouteCircuit;
    }

    /**
     * Set the expressRouteCircuit property: The ExpressRouteCircuit.
     *
     * @param expressRouteCircuit the expressRouteCircuit value to set.
     * @return the ExpressRouteCrossConnectionProperties object itself.
     */
    public ExpressRouteCrossConnectionProperties withExpressRouteCircuit(
        ExpressRouteCircuitReference expressRouteCircuit) {
        this.expressRouteCircuit = expressRouteCircuit;
        return this;
    }

    /**
     * Get the serviceProviderProvisioningState property: The provisioning state of the circuit in the connectivity
     * provider system.
     *
     * @return the serviceProviderProvisioningState value.
     */
    public ServiceProviderProvisioningState serviceProviderProvisioningState() {
        return this.serviceProviderProvisioningState;
    }

    /**
     * Set the serviceProviderProvisioningState property: The provisioning state of the circuit in the connectivity
     * provider system.
     *
     * @param serviceProviderProvisioningState the serviceProviderProvisioningState value to set.
     * @return the ExpressRouteCrossConnectionProperties object itself.
     */
    public ExpressRouteCrossConnectionProperties withServiceProviderProvisioningState(
        ServiceProviderProvisioningState serviceProviderProvisioningState) {
        this.serviceProviderProvisioningState = serviceProviderProvisioningState;
        return this;
    }

    /**
     * Get the serviceProviderNotes property: Additional read only notes set by the connectivity provider.
     *
     * @return the serviceProviderNotes value.
     */
    public String serviceProviderNotes() {
        return this.serviceProviderNotes;
    }

    /**
     * Set the serviceProviderNotes property: Additional read only notes set by the connectivity provider.
     *
     * @param serviceProviderNotes the serviceProviderNotes value to set.
     * @return the ExpressRouteCrossConnectionProperties object itself.
     */
    public ExpressRouteCrossConnectionProperties withServiceProviderNotes(String serviceProviderNotes) {
        this.serviceProviderNotes = serviceProviderNotes;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the express route cross connection resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the peerings property: The list of peerings.
     *
     * @return the peerings value.
     */
    public List<ExpressRouteCrossConnectionPeeringInner> peerings() {
        return this.peerings;
    }

    /**
     * Set the peerings property: The list of peerings.
     *
     * @param peerings the peerings value to set.
     * @return the ExpressRouteCrossConnectionProperties object itself.
     */
    public ExpressRouteCrossConnectionProperties withPeerings(List<ExpressRouteCrossConnectionPeeringInner> peerings) {
        this.peerings = peerings;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (expressRouteCircuit() != null) {
            expressRouteCircuit().validate();
        }
        if (peerings() != null) {
            peerings().forEach(e -> e.validate());
        }
    }
}