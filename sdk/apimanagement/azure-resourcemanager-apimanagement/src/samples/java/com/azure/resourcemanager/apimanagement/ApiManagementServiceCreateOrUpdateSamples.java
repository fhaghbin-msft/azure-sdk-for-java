// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement;

import com.azure.resourcemanager.apimanagement.models.AdditionalLocation;
import com.azure.resourcemanager.apimanagement.models.ApiManagementServiceIdentity;
import com.azure.resourcemanager.apimanagement.models.ApiManagementServiceSkuProperties;
import com.azure.resourcemanager.apimanagement.models.ApiVersionConstraint;
import com.azure.resourcemanager.apimanagement.models.ApimIdentityType;
import com.azure.resourcemanager.apimanagement.models.CertificateConfiguration;
import com.azure.resourcemanager.apimanagement.models.CertificateConfigurationStoreName;
import com.azure.resourcemanager.apimanagement.models.HostnameConfiguration;
import com.azure.resourcemanager.apimanagement.models.HostnameType;
import com.azure.resourcemanager.apimanagement.models.SkuType;
import com.azure.resourcemanager.apimanagement.models.UserIdentityProperties;
import com.azure.resourcemanager.apimanagement.models.VirtualNetworkType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/** Samples for ApiManagementService CreateOrUpdate. */
public final class ApiManagementServiceCreateOrUpdateSamples {
    /*
     * operationId: ApiManagementService_CreateOrUpdate
     * api-version: 2020-12-01
     * x-ms-examples: ApiManagementCreateServiceHavingMsi
     */
    /**
     * Sample code: ApiManagementCreateServiceHavingMsi.
     *
     * @param manager Entry point to ApiManagementManager.
     */
    public static void apiManagementCreateServiceHavingMsi(
        com.azure.resourcemanager.apimanagement.ApiManagementManager manager) {
        manager
            .apiManagementServices()
            .define("apimService1")
            .withRegion("West US")
            .withExistingResourceGroup("rg1")
            .withSku(new ApiManagementServiceSkuProperties().withName(SkuType.CONSUMPTION).withCapacity(0))
            .withPublisherEmail("apim@autorestsdk.com")
            .withPublisherName("autorestsdk")
            .withTags(mapOf("tag1", "value1", "tag2", "value2", "tag3", "value3"))
            .withIdentity(new ApiManagementServiceIdentity().withType(ApimIdentityType.SYSTEM_ASSIGNED))
            .create();
    }

    /*
     * operationId: ApiManagementService_CreateOrUpdate
     * api-version: 2020-12-01
     * x-ms-examples: ApiManagementCreateServiceWithSystemCertificates
     */
    /**
     * Sample code: ApiManagementCreateServiceWithSystemCertificates.
     *
     * @param manager Entry point to ApiManagementManager.
     */
    public static void apiManagementCreateServiceWithSystemCertificates(
        com.azure.resourcemanager.apimanagement.ApiManagementManager manager) {
        manager
            .apiManagementServices()
            .define("apimService1")
            .withRegion("Central US")
            .withExistingResourceGroup("rg1")
            .withSku(new ApiManagementServiceSkuProperties().withName(SkuType.BASIC).withCapacity(1))
            .withPublisherEmail("apim@autorestsdk.com")
            .withPublisherName("autorestsdk")
            .withTags(mapOf("tag1", "value1", "tag2", "value2", "tag3", "value3"))
            .withCertificates(
                Arrays
                    .asList(
                        new CertificateConfiguration()
                            .withEncodedCertificate("*******Base64 encoded Certificate******************")
                            .withCertificatePassword("Password")
                            .withStoreName(CertificateConfigurationStoreName.CERTIFICATE_AUTHORITY)))
            .create();
    }

    /*
     * operationId: ApiManagementService_CreateOrUpdate
     * api-version: 2020-12-01
     * x-ms-examples: ApiManagementCreateMultiRegionServiceWithCustomHostname
     */
    /**
     * Sample code: ApiManagementCreateMultiRegionServiceWithCustomHostname.
     *
     * @param manager Entry point to ApiManagementManager.
     */
    public static void apiManagementCreateMultiRegionServiceWithCustomHostname(
        com.azure.resourcemanager.apimanagement.ApiManagementManager manager) {
        manager
            .apiManagementServices()
            .define("apimService1")
            .withRegion("West US")
            .withExistingResourceGroup("rg1")
            .withSku(new ApiManagementServiceSkuProperties().withName(SkuType.PREMIUM).withCapacity(1))
            .withPublisherEmail("apim@autorestsdk.com")
            .withPublisherName("autorestsdk")
            .withTags(mapOf("tag1", "value1", "tag2", "value2", "tag3", "value3"))
            .withHostnameConfigurations(
                Arrays
                    .asList(
                        new HostnameConfiguration()
                            .withType(HostnameType.PROXY)
                            .withHostname("gateway1.msitesting.net")
                            .withEncodedCertificate("****** Base 64 Encoded Certificate ************")
                            .withCertificatePassword("Password")
                            .withDefaultSslBinding(true),
                        new HostnameConfiguration()
                            .withType(HostnameType.MANAGEMENT)
                            .withHostname("mgmt.msitesting.net")
                            .withEncodedCertificate("****** Base 64 Encoded Certificate ************")
                            .withCertificatePassword("Password"),
                        new HostnameConfiguration()
                            .withType(HostnameType.PORTAL)
                            .withHostname("portal1.msitesting.net")
                            .withEncodedCertificate("****** Base 64 Encoded Certificate ************")
                            .withCertificatePassword("Password")))
            .withAdditionalLocations(
                Arrays
                    .asList(
                        new AdditionalLocation()
                            .withLocation("East US")
                            .withSku(new ApiManagementServiceSkuProperties().withName(SkuType.PREMIUM).withCapacity(1))
                            .withDisableGateway(true)))
            .withVirtualNetworkType(VirtualNetworkType.NONE)
            .withApiVersionConstraint(new ApiVersionConstraint().withMinApiVersion("2019-01-01"))
            .create();
    }

    /*
     * operationId: ApiManagementService_CreateOrUpdate
     * api-version: 2020-12-01
     * x-ms-examples: ApiManagementUndelete
     */
    /**
     * Sample code: ApiManagementUndelete.
     *
     * @param manager Entry point to ApiManagementManager.
     */
    public static void apiManagementUndelete(com.azure.resourcemanager.apimanagement.ApiManagementManager manager) {
        manager
            .apiManagementServices()
            .define("apimService1")
            .withRegion("South Central US")
            .withExistingResourceGroup("rg1")
            .withSku(new ApiManagementServiceSkuProperties().withName(SkuType.DEVELOPER).withCapacity(1))
            .withPublisherEmail("foo@contoso.com")
            .withPublisherName("foo")
            .withRestore(true)
            .create();
    }

    /*
     * operationId: ApiManagementService_CreateOrUpdate
     * api-version: 2020-12-01
     * x-ms-examples: ApiManagementCreateServiceWithUserAssignedIdentity
     */
    /**
     * Sample code: ApiManagementCreateServiceWithUserAssignedIdentity.
     *
     * @param manager Entry point to ApiManagementManager.
     */
    public static void apiManagementCreateServiceWithUserAssignedIdentity(
        com.azure.resourcemanager.apimanagement.ApiManagementManager manager) {
        manager
            .apiManagementServices()
            .define("apimService1")
            .withRegion("West US")
            .withExistingResourceGroup("rg1")
            .withSku(new ApiManagementServiceSkuProperties().withName(SkuType.CONSUMPTION).withCapacity(0))
            .withPublisherEmail("apim@autorestsdk.com")
            .withPublisherName("autorestsdk")
            .withTags(mapOf("tag1", "value1", "tag2", "value2", "tag3", "value3"))
            .withIdentity(
                new ApiManagementServiceIdentity()
                    .withType(ApimIdentityType.USER_ASSIGNED)
                    .withUserAssignedIdentities(
                        mapOf(
                            "/subscriptions/subid/resourcegroups/rg1/providers/Microsoft.ManagedIdentity/userAssignedIdentities/apimService1",
                            new UserIdentityProperties())))
            .create();
    }

    /*
     * operationId: ApiManagementService_CreateOrUpdate
     * api-version: 2020-12-01
     * x-ms-examples: ApiManagementCreateServiceInZones
     */
    /**
     * Sample code: ApiManagementCreateServiceInZones.
     *
     * @param manager Entry point to ApiManagementManager.
     */
    public static void apiManagementCreateServiceInZones(
        com.azure.resourcemanager.apimanagement.ApiManagementManager manager) {
        manager
            .apiManagementServices()
            .define("apimService1")
            .withRegion("North europe")
            .withExistingResourceGroup("rg1")
            .withSku(new ApiManagementServiceSkuProperties().withName(SkuType.PREMIUM).withCapacity(1))
            .withPublisherEmail("apim@autorestsdk.com")
            .withPublisherName("autorestsdk")
            .withTags(mapOf("tag1", "value1", "tag2", "value2", "tag3", "value3"))
            .withZones(Arrays.asList("1", "2"))
            .create();
    }

    /*
     * operationId: ApiManagementService_CreateOrUpdate
     * api-version: 2020-12-01
     * x-ms-examples: ApiManagementCreateServiceWithCustomHostnameKeyVault
     */
    /**
     * Sample code: ApiManagementCreateServiceWithCustomHostnameKeyVault.
     *
     * @param manager Entry point to ApiManagementManager.
     */
    public static void apiManagementCreateServiceWithCustomHostnameKeyVault(
        com.azure.resourcemanager.apimanagement.ApiManagementManager manager) {
        manager
            .apiManagementServices()
            .define("apimService1")
            .withRegion("North Europe")
            .withExistingResourceGroup("rg1")
            .withSku(new ApiManagementServiceSkuProperties().withName(SkuType.PREMIUM).withCapacity(1))
            .withPublisherEmail("apim@autorestsdk.com")
            .withPublisherName("autorestsdk")
            .withTags(mapOf("tag1", "value1", "tag2", "value2", "tag3", "value3"))
            .withIdentity(
                new ApiManagementServiceIdentity()
                    .withType(ApimIdentityType.USER_ASSIGNED)
                    .withUserAssignedIdentities(
                        mapOf(
                            "/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.ManagedIdentity/userAssignedIdentities/id1",
                            new UserIdentityProperties())))
            .withHostnameConfigurations(
                Arrays
                    .asList(
                        new HostnameConfiguration()
                            .withType(HostnameType.PROXY)
                            .withHostname("gateway1.msitesting.net")
                            .withKeyVaultId("https://rpbvtkeyvaultintegration.vault.azure.net/secrets/msitestingCert")
                            .withIdentityClientId("329419bc-adec-4dce-9568-25a6d486e468")
                            .withDefaultSslBinding(true),
                        new HostnameConfiguration()
                            .withType(HostnameType.MANAGEMENT)
                            .withHostname("mgmt.msitesting.net")
                            .withKeyVaultId("https://rpbvtkeyvaultintegration.vault.azure.net/secrets/msitestingCert")
                            .withIdentityClientId("329419bc-adec-4dce-9568-25a6d486e468"),
                        new HostnameConfiguration()
                            .withType(HostnameType.PORTAL)
                            .withHostname("portal1.msitesting.net")
                            .withKeyVaultId("https://rpbvtkeyvaultintegration.vault.azure.net/secrets/msitestingCert")
                            .withIdentityClientId("329419bc-adec-4dce-9568-25a6d486e468")))
            .withVirtualNetworkType(VirtualNetworkType.NONE)
            .withApiVersionConstraint(new ApiVersionConstraint().withMinApiVersion("2019-01-01"))
            .create();
    }

    /*
     * operationId: ApiManagementService_CreateOrUpdate
     * api-version: 2020-12-01
     * x-ms-examples: ApiManagementCreateService
     */
    /**
     * Sample code: ApiManagementCreateService.
     *
     * @param manager Entry point to ApiManagementManager.
     */
    public static void apiManagementCreateService(
        com.azure.resourcemanager.apimanagement.ApiManagementManager manager) {
        manager
            .apiManagementServices()
            .define("apimService1")
            .withRegion("South Central US")
            .withExistingResourceGroup("rg1")
            .withSku(new ApiManagementServiceSkuProperties().withName(SkuType.DEVELOPER).withCapacity(1))
            .withPublisherEmail("foo@contoso.com")
            .withPublisherName("foo")
            .withTags(mapOf("Name", "Contoso", "Test", "User"))
            .create();
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}