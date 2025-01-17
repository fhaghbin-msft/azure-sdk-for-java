// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestackhci.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.azurestackhci.fluent.ExtensionsClient;
import com.azure.resourcemanager.azurestackhci.fluent.models.ExtensionInner;
import com.azure.resourcemanager.azurestackhci.models.Extension;
import com.azure.resourcemanager.azurestackhci.models.Extensions;

public final class ExtensionsImpl implements Extensions {
    private static final ClientLogger LOGGER = new ClientLogger(ExtensionsImpl.class);

    private final ExtensionsClient innerClient;

    private final com.azure.resourcemanager.azurestackhci.AzureStackHciManager serviceManager;

    public ExtensionsImpl(
        ExtensionsClient innerClient, com.azure.resourcemanager.azurestackhci.AzureStackHciManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<Extension> listByArcSetting(
        String resourceGroupName, String clusterName, String arcSettingName) {
        PagedIterable<ExtensionInner> inner =
            this.serviceClient().listByArcSetting(resourceGroupName, clusterName, arcSettingName);
        return Utils.mapPage(inner, inner1 -> new ExtensionImpl(inner1, this.manager()));
    }

    public PagedIterable<Extension> listByArcSetting(
        String resourceGroupName, String clusterName, String arcSettingName, Context context) {
        PagedIterable<ExtensionInner> inner =
            this.serviceClient().listByArcSetting(resourceGroupName, clusterName, arcSettingName, context);
        return Utils.mapPage(inner, inner1 -> new ExtensionImpl(inner1, this.manager()));
    }

    public Extension get(String resourceGroupName, String clusterName, String arcSettingName, String extensionName) {
        ExtensionInner inner = this.serviceClient().get(resourceGroupName, clusterName, arcSettingName, extensionName);
        if (inner != null) {
            return new ExtensionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Extension> getWithResponse(
        String resourceGroupName, String clusterName, String arcSettingName, String extensionName, Context context) {
        Response<ExtensionInner> inner =
            this
                .serviceClient()
                .getWithResponse(resourceGroupName, clusterName, arcSettingName, extensionName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ExtensionImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String clusterName, String arcSettingName, String extensionName) {
        this.serviceClient().delete(resourceGroupName, clusterName, arcSettingName, extensionName);
    }

    public void delete(
        String resourceGroupName, String clusterName, String arcSettingName, String extensionName, Context context) {
        this.serviceClient().delete(resourceGroupName, clusterName, arcSettingName, extensionName, context);
    }

    public Extension getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String clusterName = Utils.getValueFromIdByName(id, "clusters");
        if (clusterName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'clusters'.", id)));
        }
        String arcSettingName = Utils.getValueFromIdByName(id, "arcSettings");
        if (arcSettingName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'arcSettings'.", id)));
        }
        String extensionName = Utils.getValueFromIdByName(id, "extensions");
        if (extensionName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'extensions'.", id)));
        }
        return this
            .getWithResponse(resourceGroupName, clusterName, arcSettingName, extensionName, Context.NONE)
            .getValue();
    }

    public Response<Extension> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String clusterName = Utils.getValueFromIdByName(id, "clusters");
        if (clusterName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'clusters'.", id)));
        }
        String arcSettingName = Utils.getValueFromIdByName(id, "arcSettings");
        if (arcSettingName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'arcSettings'.", id)));
        }
        String extensionName = Utils.getValueFromIdByName(id, "extensions");
        if (extensionName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'extensions'.", id)));
        }
        return this.getWithResponse(resourceGroupName, clusterName, arcSettingName, extensionName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String clusterName = Utils.getValueFromIdByName(id, "clusters");
        if (clusterName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'clusters'.", id)));
        }
        String arcSettingName = Utils.getValueFromIdByName(id, "arcSettings");
        if (arcSettingName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'arcSettings'.", id)));
        }
        String extensionName = Utils.getValueFromIdByName(id, "extensions");
        if (extensionName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'extensions'.", id)));
        }
        this.delete(resourceGroupName, clusterName, arcSettingName, extensionName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String clusterName = Utils.getValueFromIdByName(id, "clusters");
        if (clusterName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'clusters'.", id)));
        }
        String arcSettingName = Utils.getValueFromIdByName(id, "arcSettings");
        if (arcSettingName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'arcSettings'.", id)));
        }
        String extensionName = Utils.getValueFromIdByName(id, "extensions");
        if (extensionName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'extensions'.", id)));
        }
        this.delete(resourceGroupName, clusterName, arcSettingName, extensionName, context);
    }

    private ExtensionsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.azurestackhci.AzureStackHciManager manager() {
        return this.serviceManager;
    }

    public ExtensionImpl define(String name) {
        return new ExtensionImpl(name, this.manager());
    }
}
