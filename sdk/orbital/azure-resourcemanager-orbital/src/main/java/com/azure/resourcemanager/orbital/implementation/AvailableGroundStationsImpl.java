// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.orbital.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.orbital.fluent.AvailableGroundStationsClient;
import com.azure.resourcemanager.orbital.fluent.models.AvailableGroundStationInner;
import com.azure.resourcemanager.orbital.models.AvailableGroundStation;
import com.azure.resourcemanager.orbital.models.AvailableGroundStations;
import com.azure.resourcemanager.orbital.models.CapabilityParameter;

public final class AvailableGroundStationsImpl implements AvailableGroundStations {
    private static final ClientLogger LOGGER = new ClientLogger(AvailableGroundStationsImpl.class);

    private final AvailableGroundStationsClient innerClient;

    private final com.azure.resourcemanager.orbital.OrbitalManager serviceManager;

    public AvailableGroundStationsImpl(
        AvailableGroundStationsClient innerClient, com.azure.resourcemanager.orbital.OrbitalManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<AvailableGroundStation> list(CapabilityParameter capability) {
        PagedIterable<AvailableGroundStationInner> inner = this.serviceClient().list(capability);
        return Utils.mapPage(inner, inner1 -> new AvailableGroundStationImpl(inner1, this.manager()));
    }

    public PagedIterable<AvailableGroundStation> list(CapabilityParameter capability, Context context) {
        PagedIterable<AvailableGroundStationInner> inner = this.serviceClient().list(capability, context);
        return Utils.mapPage(inner, inner1 -> new AvailableGroundStationImpl(inner1, this.manager()));
    }

    public AvailableGroundStation get(String groundStationName) {
        AvailableGroundStationInner inner = this.serviceClient().get(groundStationName);
        if (inner != null) {
            return new AvailableGroundStationImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<AvailableGroundStation> getWithResponse(String groundStationName, Context context) {
        Response<AvailableGroundStationInner> inner = this.serviceClient().getWithResponse(groundStationName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new AvailableGroundStationImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    private AvailableGroundStationsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.orbital.OrbitalManager manager() {
        return this.serviceManager;
    }
}
