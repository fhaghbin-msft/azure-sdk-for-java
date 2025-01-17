// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagecache.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import java.util.List;

/** Resource collection API of Caches. */
public interface Caches {
    /**
     * Returns all Caches the user has access to under a subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list Caches as paginated response with {@link PagedIterable}.
     */
    PagedIterable<Cache> list();

    /**
     * Returns all Caches the user has access to under a subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list Caches as paginated response with {@link PagedIterable}.
     */
    PagedIterable<Cache> list(Context context);

    /**
     * Returns all Caches the user has access to under a resource group.
     *
     * @param resourceGroupName Target resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list Caches as paginated response with {@link PagedIterable}.
     */
    PagedIterable<Cache> listByResourceGroup(String resourceGroupName);

    /**
     * Returns all Caches the user has access to under a resource group.
     *
     * @param resourceGroupName Target resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list Caches as paginated response with {@link PagedIterable}.
     */
    PagedIterable<Cache> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Schedules a Cache for deletion.
     *
     * @param resourceGroupName Target resource group.
     * @param cacheName Name of Cache. Length of name must not be greater than 80 and chars must be from the
     *     [-0-9a-zA-Z_] char class.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByResourceGroup(String resourceGroupName, String cacheName);

    /**
     * Schedules a Cache for deletion.
     *
     * @param resourceGroupName Target resource group.
     * @param cacheName Name of Cache. Length of name must not be greater than 80 and chars must be from the
     *     [-0-9a-zA-Z_] char class.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String cacheName, Context context);

    /**
     * Returns a Cache.
     *
     * @param resourceGroupName Target resource group.
     * @param cacheName Name of Cache. Length of name must not be greater than 80 and chars must be from the
     *     [-0-9a-zA-Z_] char class.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Cache instance along with {@link Response}.
     */
    Response<Cache> getByResourceGroupWithResponse(String resourceGroupName, String cacheName, Context context);

    /**
     * Returns a Cache.
     *
     * @param resourceGroupName Target resource group.
     * @param cacheName Name of Cache. Length of name must not be greater than 80 and chars must be from the
     *     [-0-9a-zA-Z_] char class.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Cache instance.
     */
    Cache getByResourceGroup(String resourceGroupName, String cacheName);

    /**
     * Tells a Cache to write generate debug info for support to process.
     *
     * @param resourceGroupName Target resource group.
     * @param cacheName Name of Cache. Length of name must not be greater than 80 and chars must be from the
     *     [-0-9a-zA-Z_] char class.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void debugInfo(String resourceGroupName, String cacheName);

    /**
     * Tells a Cache to write generate debug info for support to process.
     *
     * @param resourceGroupName Target resource group.
     * @param cacheName Name of Cache. Length of name must not be greater than 80 and chars must be from the
     *     [-0-9a-zA-Z_] char class.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void debugInfo(String resourceGroupName, String cacheName, Context context);

    /**
     * Tells a Cache to write all dirty data to the Storage Target(s). During the flush, clients will see errors
     * returned until the flush is complete.
     *
     * @param resourceGroupName Target resource group.
     * @param cacheName Name of Cache. Length of name must not be greater than 80 and chars must be from the
     *     [-0-9a-zA-Z_] char class.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void flush(String resourceGroupName, String cacheName);

    /**
     * Tells a Cache to write all dirty data to the Storage Target(s). During the flush, clients will see errors
     * returned until the flush is complete.
     *
     * @param resourceGroupName Target resource group.
     * @param cacheName Name of Cache. Length of name must not be greater than 80 and chars must be from the
     *     [-0-9a-zA-Z_] char class.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void flush(String resourceGroupName, String cacheName, Context context);

    /**
     * Tells a Stopped state Cache to transition to Active state.
     *
     * @param resourceGroupName Target resource group.
     * @param cacheName Name of Cache. Length of name must not be greater than 80 and chars must be from the
     *     [-0-9a-zA-Z_] char class.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void start(String resourceGroupName, String cacheName);

    /**
     * Tells a Stopped state Cache to transition to Active state.
     *
     * @param resourceGroupName Target resource group.
     * @param cacheName Name of Cache. Length of name must not be greater than 80 and chars must be from the
     *     [-0-9a-zA-Z_] char class.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void start(String resourceGroupName, String cacheName, Context context);

    /**
     * Tells an Active Cache to transition to Stopped state.
     *
     * @param resourceGroupName Target resource group.
     * @param cacheName Name of Cache. Length of name must not be greater than 80 and chars must be from the
     *     [-0-9a-zA-Z_] char class.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void stop(String resourceGroupName, String cacheName);

    /**
     * Tells an Active Cache to transition to Stopped state.
     *
     * @param resourceGroupName Target resource group.
     * @param cacheName Name of Cache. Length of name must not be greater than 80 and chars must be from the
     *     [-0-9a-zA-Z_] char class.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void stop(String resourceGroupName, String cacheName, Context context);

    /**
     * Create a priming job. This operation is only allowed when the cache is healthy.
     *
     * @param resourceGroupName Target resource group.
     * @param cacheName Name of Cache. Length of name must not be greater than 80 and chars must be from the
     *     [-0-9a-zA-Z_] char class.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void startPrimingJob(String resourceGroupName, String cacheName);

    /**
     * Create a priming job. This operation is only allowed when the cache is healthy.
     *
     * @param resourceGroupName Target resource group.
     * @param cacheName Name of Cache. Length of name must not be greater than 80 and chars must be from the
     *     [-0-9a-zA-Z_] char class.
     * @param primingjob Object containing the definition of a priming job.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void startPrimingJob(String resourceGroupName, String cacheName, PrimingJob primingjob, Context context);

    /**
     * Schedule a priming job for deletion.
     *
     * @param resourceGroupName Target resource group.
     * @param cacheName Name of Cache. Length of name must not be greater than 80 and chars must be from the
     *     [-0-9a-zA-Z_] char class.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void stopPrimingJob(String resourceGroupName, String cacheName);

    /**
     * Schedule a priming job for deletion.
     *
     * @param resourceGroupName Target resource group.
     * @param cacheName Name of Cache. Length of name must not be greater than 80 and chars must be from the
     *     [-0-9a-zA-Z_] char class.
     * @param primingJobId Object containing the priming job ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void stopPrimingJob(
        String resourceGroupName, String cacheName, PrimingJobIdParameter primingJobId, Context context);

    /**
     * Schedule a priming job to be paused.
     *
     * @param resourceGroupName Target resource group.
     * @param cacheName Name of Cache. Length of name must not be greater than 80 and chars must be from the
     *     [-0-9a-zA-Z_] char class.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void pausePrimingJob(String resourceGroupName, String cacheName);

    /**
     * Schedule a priming job to be paused.
     *
     * @param resourceGroupName Target resource group.
     * @param cacheName Name of Cache. Length of name must not be greater than 80 and chars must be from the
     *     [-0-9a-zA-Z_] char class.
     * @param primingJobId Object containing the priming job ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void pausePrimingJob(
        String resourceGroupName, String cacheName, PrimingJobIdParameter primingJobId, Context context);

    /**
     * Resumes a paused priming job.
     *
     * @param resourceGroupName Target resource group.
     * @param cacheName Name of Cache. Length of name must not be greater than 80 and chars must be from the
     *     [-0-9a-zA-Z_] char class.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void resumePrimingJob(String resourceGroupName, String cacheName);

    /**
     * Resumes a paused priming job.
     *
     * @param resourceGroupName Target resource group.
     * @param cacheName Name of Cache. Length of name must not be greater than 80 and chars must be from the
     *     [-0-9a-zA-Z_] char class.
     * @param primingJobId Object containing the priming job ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void resumePrimingJob(
        String resourceGroupName, String cacheName, PrimingJobIdParameter primingJobId, Context context);

    /**
     * Upgrade a Cache's firmware if a new version is available. Otherwise, this operation has no effect.
     *
     * @param resourceGroupName Target resource group.
     * @param cacheName Name of Cache. Length of name must not be greater than 80 and chars must be from the
     *     [-0-9a-zA-Z_] char class.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void upgradeFirmware(String resourceGroupName, String cacheName);

    /**
     * Upgrade a Cache's firmware if a new version is available. Otherwise, this operation has no effect.
     *
     * @param resourceGroupName Target resource group.
     * @param cacheName Name of Cache. Length of name must not be greater than 80 and chars must be from the
     *     [-0-9a-zA-Z_] char class.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void upgradeFirmware(String resourceGroupName, String cacheName, Context context);

    /**
     * Update cache space allocation.
     *
     * @param resourceGroupName Target resource group.
     * @param cacheName Name of Cache. Length of name must not be greater than 80 and chars must be from the
     *     [-0-9a-zA-Z_] char class.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void spaceAllocation(String resourceGroupName, String cacheName);

    /**
     * Update cache space allocation.
     *
     * @param resourceGroupName Target resource group.
     * @param cacheName Name of Cache. Length of name must not be greater than 80 and chars must be from the
     *     [-0-9a-zA-Z_] char class.
     * @param spaceAllocation List containing storage target cache space percentage allocations.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void spaceAllocation(
        String resourceGroupName,
        String cacheName,
        List<StorageTargetSpaceAllocation> spaceAllocation,
        Context context);

    /**
     * Returns a Cache.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Cache instance along with {@link Response}.
     */
    Cache getById(String id);

    /**
     * Returns a Cache.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Cache instance along with {@link Response}.
     */
    Response<Cache> getByIdWithResponse(String id, Context context);

    /**
     * Schedules a Cache for deletion.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Schedules a Cache for deletion.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new Cache resource.
     *
     * @param name resource name.
     * @return the first stage of the new Cache definition.
     */
    Cache.DefinitionStages.Blank define(String name);
}
