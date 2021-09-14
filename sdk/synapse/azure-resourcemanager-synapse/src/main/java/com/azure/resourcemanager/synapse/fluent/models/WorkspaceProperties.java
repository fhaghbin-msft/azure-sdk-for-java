// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.synapse.models.CspWorkspaceAdminProperties;
import com.azure.resourcemanager.synapse.models.DataLakeStorageAccountDetails;
import com.azure.resourcemanager.synapse.models.EncryptionDetails;
import com.azure.resourcemanager.synapse.models.ManagedVirtualNetworkSettings;
import com.azure.resourcemanager.synapse.models.PurviewConfiguration;
import com.azure.resourcemanager.synapse.models.VirtualNetworkProfile;
import com.azure.resourcemanager.synapse.models.WorkspacePublicNetworkAccess;
import com.azure.resourcemanager.synapse.models.WorkspaceRepositoryConfiguration;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/** Workspace properties. */
@Fluent
public final class WorkspaceProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(WorkspaceProperties.class);

    /*
     * Workspace default data lake storage account details
     */
    @JsonProperty(value = "defaultDataLakeStorage")
    private DataLakeStorageAccountDetails defaultDataLakeStorage;

    /*
     * SQL administrator login password
     */
    @JsonProperty(value = "sqlAdministratorLoginPassword")
    private String sqlAdministratorLoginPassword;

    /*
     * Workspace managed resource group. The resource group name uniquely
     * identifies the resource group within the user subscriptionId. The
     * resource group name must be no longer than 90 characters long, and must
     * be alphanumeric characters (Char.IsLetterOrDigit()) and '-', '_', '(',
     * ')' and'.'. Note that the name cannot end with '.'
     */
    @JsonProperty(value = "managedResourceGroupName")
    private String managedResourceGroupName;

    /*
     * Resource provisioning state
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /*
     * Login for workspace SQL active directory administrator
     */
    @JsonProperty(value = "sqlAdministratorLogin")
    private String sqlAdministratorLogin;

    /*
     * Virtual Network profile
     */
    @JsonProperty(value = "virtualNetworkProfile")
    private VirtualNetworkProfile virtualNetworkProfile;

    /*
     * Connectivity endpoints
     */
    @JsonProperty(value = "connectivityEndpoints")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> connectivityEndpoints;

    /*
     * Setting this to 'default' will ensure that all compute for this
     * workspace is in a virtual network managed on behalf of the user.
     */
    @JsonProperty(value = "managedVirtualNetwork")
    private String managedVirtualNetwork;

    /*
     * Private endpoint connections to the workspace
     */
    @JsonProperty(value = "privateEndpointConnections")
    private List<PrivateEndpointConnectionInner> privateEndpointConnections;

    /*
     * The encryption details of the workspace
     */
    @JsonProperty(value = "encryption")
    private EncryptionDetails encryption;

    /*
     * The workspace unique identifier
     */
    @JsonProperty(value = "workspaceUID", access = JsonProperty.Access.WRITE_ONLY)
    private UUID workspaceUid;

    /*
     * Workspace level configs and feature flags
     */
    @JsonProperty(value = "extraProperties", access = JsonProperty.Access.WRITE_ONLY)
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, Object> extraProperties;

    /*
     * Managed Virtual Network Settings
     */
    @JsonProperty(value = "managedVirtualNetworkSettings")
    private ManagedVirtualNetworkSettings managedVirtualNetworkSettings;

    /*
     * Git integration settings
     */
    @JsonProperty(value = "workspaceRepositoryConfiguration")
    private WorkspaceRepositoryConfiguration workspaceRepositoryConfiguration;

    /*
     * Purview Configuration
     */
    @JsonProperty(value = "purviewConfiguration")
    private PurviewConfiguration purviewConfiguration;

    /*
     * The ADLA resource ID.
     */
    @JsonProperty(value = "adlaResourceId", access = JsonProperty.Access.WRITE_ONLY)
    private String adlaResourceId;

    /*
     * Enable or Disable public network access to workspace
     */
    @JsonProperty(value = "publicNetworkAccess")
    private WorkspacePublicNetworkAccess publicNetworkAccess;

    /*
     * Initial workspace AAD admin properties for a CSP subscription
     */
    @JsonProperty(value = "cspWorkspaceAdminProperties")
    private CspWorkspaceAdminProperties cspWorkspaceAdminProperties;

    /*
     * Workspace settings
     */
    @JsonProperty(value = "settings", access = JsonProperty.Access.WRITE_ONLY)
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, Object> settings;

    /*
     * Enable or Disable AzureADOnlyAuthentication on All Workspace subresource
     */
    @JsonProperty(value = "azureADOnlyAuthentication")
    private Boolean azureADOnlyAuthentication;

    /**
     * Get the defaultDataLakeStorage property: Workspace default data lake storage account details.
     *
     * @return the defaultDataLakeStorage value.
     */
    public DataLakeStorageAccountDetails defaultDataLakeStorage() {
        return this.defaultDataLakeStorage;
    }

    /**
     * Set the defaultDataLakeStorage property: Workspace default data lake storage account details.
     *
     * @param defaultDataLakeStorage the defaultDataLakeStorage value to set.
     * @return the WorkspaceProperties object itself.
     */
    public WorkspaceProperties withDefaultDataLakeStorage(DataLakeStorageAccountDetails defaultDataLakeStorage) {
        this.defaultDataLakeStorage = defaultDataLakeStorage;
        return this;
    }

    /**
     * Get the sqlAdministratorLoginPassword property: SQL administrator login password.
     *
     * @return the sqlAdministratorLoginPassword value.
     */
    public String sqlAdministratorLoginPassword() {
        return this.sqlAdministratorLoginPassword;
    }

    /**
     * Set the sqlAdministratorLoginPassword property: SQL administrator login password.
     *
     * @param sqlAdministratorLoginPassword the sqlAdministratorLoginPassword value to set.
     * @return the WorkspaceProperties object itself.
     */
    public WorkspaceProperties withSqlAdministratorLoginPassword(String sqlAdministratorLoginPassword) {
        this.sqlAdministratorLoginPassword = sqlAdministratorLoginPassword;
        return this;
    }

    /**
     * Get the managedResourceGroupName property: Workspace managed resource group. The resource group name uniquely
     * identifies the resource group within the user subscriptionId. The resource group name must be no longer than 90
     * characters long, and must be alphanumeric characters (Char.IsLetterOrDigit()) and '-', '_', '(', ')' and'.'. Note
     * that the name cannot end with '.'.
     *
     * @return the managedResourceGroupName value.
     */
    public String managedResourceGroupName() {
        return this.managedResourceGroupName;
    }

    /**
     * Set the managedResourceGroupName property: Workspace managed resource group. The resource group name uniquely
     * identifies the resource group within the user subscriptionId. The resource group name must be no longer than 90
     * characters long, and must be alphanumeric characters (Char.IsLetterOrDigit()) and '-', '_', '(', ')' and'.'. Note
     * that the name cannot end with '.'.
     *
     * @param managedResourceGroupName the managedResourceGroupName value to set.
     * @return the WorkspaceProperties object itself.
     */
    public WorkspaceProperties withManagedResourceGroupName(String managedResourceGroupName) {
        this.managedResourceGroupName = managedResourceGroupName;
        return this;
    }

    /**
     * Get the provisioningState property: Resource provisioning state.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the sqlAdministratorLogin property: Login for workspace SQL active directory administrator.
     *
     * @return the sqlAdministratorLogin value.
     */
    public String sqlAdministratorLogin() {
        return this.sqlAdministratorLogin;
    }

    /**
     * Set the sqlAdministratorLogin property: Login for workspace SQL active directory administrator.
     *
     * @param sqlAdministratorLogin the sqlAdministratorLogin value to set.
     * @return the WorkspaceProperties object itself.
     */
    public WorkspaceProperties withSqlAdministratorLogin(String sqlAdministratorLogin) {
        this.sqlAdministratorLogin = sqlAdministratorLogin;
        return this;
    }

    /**
     * Get the virtualNetworkProfile property: Virtual Network profile.
     *
     * @return the virtualNetworkProfile value.
     */
    public VirtualNetworkProfile virtualNetworkProfile() {
        return this.virtualNetworkProfile;
    }

    /**
     * Set the virtualNetworkProfile property: Virtual Network profile.
     *
     * @param virtualNetworkProfile the virtualNetworkProfile value to set.
     * @return the WorkspaceProperties object itself.
     */
    public WorkspaceProperties withVirtualNetworkProfile(VirtualNetworkProfile virtualNetworkProfile) {
        this.virtualNetworkProfile = virtualNetworkProfile;
        return this;
    }

    /**
     * Get the connectivityEndpoints property: Connectivity endpoints.
     *
     * @return the connectivityEndpoints value.
     */
    public Map<String, String> connectivityEndpoints() {
        return this.connectivityEndpoints;
    }

    /**
     * Set the connectivityEndpoints property: Connectivity endpoints.
     *
     * @param connectivityEndpoints the connectivityEndpoints value to set.
     * @return the WorkspaceProperties object itself.
     */
    public WorkspaceProperties withConnectivityEndpoints(Map<String, String> connectivityEndpoints) {
        this.connectivityEndpoints = connectivityEndpoints;
        return this;
    }

    /**
     * Get the managedVirtualNetwork property: Setting this to 'default' will ensure that all compute for this workspace
     * is in a virtual network managed on behalf of the user.
     *
     * @return the managedVirtualNetwork value.
     */
    public String managedVirtualNetwork() {
        return this.managedVirtualNetwork;
    }

    /**
     * Set the managedVirtualNetwork property: Setting this to 'default' will ensure that all compute for this workspace
     * is in a virtual network managed on behalf of the user.
     *
     * @param managedVirtualNetwork the managedVirtualNetwork value to set.
     * @return the WorkspaceProperties object itself.
     */
    public WorkspaceProperties withManagedVirtualNetwork(String managedVirtualNetwork) {
        this.managedVirtualNetwork = managedVirtualNetwork;
        return this;
    }

    /**
     * Get the privateEndpointConnections property: Private endpoint connections to the workspace.
     *
     * @return the privateEndpointConnections value.
     */
    public List<PrivateEndpointConnectionInner> privateEndpointConnections() {
        return this.privateEndpointConnections;
    }

    /**
     * Set the privateEndpointConnections property: Private endpoint connections to the workspace.
     *
     * @param privateEndpointConnections the privateEndpointConnections value to set.
     * @return the WorkspaceProperties object itself.
     */
    public WorkspaceProperties withPrivateEndpointConnections(
        List<PrivateEndpointConnectionInner> privateEndpointConnections) {
        this.privateEndpointConnections = privateEndpointConnections;
        return this;
    }

    /**
     * Get the encryption property: The encryption details of the workspace.
     *
     * @return the encryption value.
     */
    public EncryptionDetails encryption() {
        return this.encryption;
    }

    /**
     * Set the encryption property: The encryption details of the workspace.
     *
     * @param encryption the encryption value to set.
     * @return the WorkspaceProperties object itself.
     */
    public WorkspaceProperties withEncryption(EncryptionDetails encryption) {
        this.encryption = encryption;
        return this;
    }

    /**
     * Get the workspaceUid property: The workspace unique identifier.
     *
     * @return the workspaceUid value.
     */
    public UUID workspaceUid() {
        return this.workspaceUid;
    }

    /**
     * Get the extraProperties property: Workspace level configs and feature flags.
     *
     * @return the extraProperties value.
     */
    public Map<String, Object> extraProperties() {
        return this.extraProperties;
    }

    /**
     * Get the managedVirtualNetworkSettings property: Managed Virtual Network Settings.
     *
     * @return the managedVirtualNetworkSettings value.
     */
    public ManagedVirtualNetworkSettings managedVirtualNetworkSettings() {
        return this.managedVirtualNetworkSettings;
    }

    /**
     * Set the managedVirtualNetworkSettings property: Managed Virtual Network Settings.
     *
     * @param managedVirtualNetworkSettings the managedVirtualNetworkSettings value to set.
     * @return the WorkspaceProperties object itself.
     */
    public WorkspaceProperties withManagedVirtualNetworkSettings(
        ManagedVirtualNetworkSettings managedVirtualNetworkSettings) {
        this.managedVirtualNetworkSettings = managedVirtualNetworkSettings;
        return this;
    }

    /**
     * Get the workspaceRepositoryConfiguration property: Git integration settings.
     *
     * @return the workspaceRepositoryConfiguration value.
     */
    public WorkspaceRepositoryConfiguration workspaceRepositoryConfiguration() {
        return this.workspaceRepositoryConfiguration;
    }

    /**
     * Set the workspaceRepositoryConfiguration property: Git integration settings.
     *
     * @param workspaceRepositoryConfiguration the workspaceRepositoryConfiguration value to set.
     * @return the WorkspaceProperties object itself.
     */
    public WorkspaceProperties withWorkspaceRepositoryConfiguration(
        WorkspaceRepositoryConfiguration workspaceRepositoryConfiguration) {
        this.workspaceRepositoryConfiguration = workspaceRepositoryConfiguration;
        return this;
    }

    /**
     * Get the purviewConfiguration property: Purview Configuration.
     *
     * @return the purviewConfiguration value.
     */
    public PurviewConfiguration purviewConfiguration() {
        return this.purviewConfiguration;
    }

    /**
     * Set the purviewConfiguration property: Purview Configuration.
     *
     * @param purviewConfiguration the purviewConfiguration value to set.
     * @return the WorkspaceProperties object itself.
     */
    public WorkspaceProperties withPurviewConfiguration(PurviewConfiguration purviewConfiguration) {
        this.purviewConfiguration = purviewConfiguration;
        return this;
    }

    /**
     * Get the adlaResourceId property: The ADLA resource ID.
     *
     * @return the adlaResourceId value.
     */
    public String adlaResourceId() {
        return this.adlaResourceId;
    }

    /**
     * Get the publicNetworkAccess property: Enable or Disable public network access to workspace.
     *
     * @return the publicNetworkAccess value.
     */
    public WorkspacePublicNetworkAccess publicNetworkAccess() {
        return this.publicNetworkAccess;
    }

    /**
     * Set the publicNetworkAccess property: Enable or Disable public network access to workspace.
     *
     * @param publicNetworkAccess the publicNetworkAccess value to set.
     * @return the WorkspaceProperties object itself.
     */
    public WorkspaceProperties withPublicNetworkAccess(WorkspacePublicNetworkAccess publicNetworkAccess) {
        this.publicNetworkAccess = publicNetworkAccess;
        return this;
    }

    /**
     * Get the cspWorkspaceAdminProperties property: Initial workspace AAD admin properties for a CSP subscription.
     *
     * @return the cspWorkspaceAdminProperties value.
     */
    public CspWorkspaceAdminProperties cspWorkspaceAdminProperties() {
        return this.cspWorkspaceAdminProperties;
    }

    /**
     * Set the cspWorkspaceAdminProperties property: Initial workspace AAD admin properties for a CSP subscription.
     *
     * @param cspWorkspaceAdminProperties the cspWorkspaceAdminProperties value to set.
     * @return the WorkspaceProperties object itself.
     */
    public WorkspaceProperties withCspWorkspaceAdminProperties(
        CspWorkspaceAdminProperties cspWorkspaceAdminProperties) {
        this.cspWorkspaceAdminProperties = cspWorkspaceAdminProperties;
        return this;
    }

    /**
     * Get the settings property: Workspace settings.
     *
     * @return the settings value.
     */
    public Map<String, Object> settings() {
        return this.settings;
    }

    /**
     * Get the azureADOnlyAuthentication property: Enable or Disable AzureADOnlyAuthentication on All Workspace
     * subresource.
     *
     * @return the azureADOnlyAuthentication value.
     */
    public Boolean azureADOnlyAuthentication() {
        return this.azureADOnlyAuthentication;
    }

    /**
     * Set the azureADOnlyAuthentication property: Enable or Disable AzureADOnlyAuthentication on All Workspace
     * subresource.
     *
     * @param azureADOnlyAuthentication the azureADOnlyAuthentication value to set.
     * @return the WorkspaceProperties object itself.
     */
    public WorkspaceProperties withAzureADOnlyAuthentication(Boolean azureADOnlyAuthentication) {
        this.azureADOnlyAuthentication = azureADOnlyAuthentication;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (defaultDataLakeStorage() != null) {
            defaultDataLakeStorage().validate();
        }
        if (virtualNetworkProfile() != null) {
            virtualNetworkProfile().validate();
        }
        if (privateEndpointConnections() != null) {
            privateEndpointConnections().forEach(e -> e.validate());
        }
        if (encryption() != null) {
            encryption().validate();
        }
        if (managedVirtualNetworkSettings() != null) {
            managedVirtualNetworkSettings().validate();
        }
        if (workspaceRepositoryConfiguration() != null) {
            workspaceRepositoryConfiguration().validate();
        }
        if (purviewConfiguration() != null) {
            purviewConfiguration().validate();
        }
        if (cspWorkspaceAdminProperties() != null) {
            cspWorkspaceAdminProperties().validate();
        }
    }
}