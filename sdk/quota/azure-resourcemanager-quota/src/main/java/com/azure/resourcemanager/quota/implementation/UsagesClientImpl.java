// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.quota.implementation;

import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.PagedResponseBase;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.quota.fluent.UsagesClient;
import com.azure.resourcemanager.quota.fluent.models.CurrentUsagesBaseInner;
import com.azure.resourcemanager.quota.models.UsagesGetResponse;
import com.azure.resourcemanager.quota.models.UsagesListNextResponse;
import com.azure.resourcemanager.quota.models.UsagesListResponse;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in UsagesClient. */
public final class UsagesClientImpl implements UsagesClient {
    private final ClientLogger logger = new ClientLogger(UsagesClientImpl.class);

    /** The proxy service used to perform REST calls. */
    private final UsagesService service;

    /** The service client containing this operation class. */
    private final AzureQuotaExtensionApiImpl client;

    /**
     * Initializes an instance of UsagesClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    UsagesClientImpl(AzureQuotaExtensionApiImpl client) {
        this.service = RestProxy.create(UsagesService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for AzureQuotaExtensionApiUsages to be used by the proxy service to
     * perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "AzureQuotaExtensionA")
    private interface UsagesService {
        @Headers({"Content-Type: application/json"})
        @Get("/{scope}/providers/Microsoft.Quota/usages/{resourceName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<UsagesGetResponse> get(
            @HostParam("$host") String endpoint,
            @PathParam("resourceName") String resourceName,
            @QueryParam("api-version") String apiVersion,
            @PathParam(value = "scope", encoded = true) String scope,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get("/{scope}/providers/Microsoft.Quota/usages")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<UsagesListResponse> list(
            @HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @PathParam(value = "scope", encoded = true) String scope,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<UsagesListNextResponse> listNext(
            @PathParam(value = "nextLink", encoded = true) String nextLink,
            @HostParam("$host") String endpoint,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Get the current usage of a resource.
     *
     * @param resourceName Resource name for a given resource provider. For example: - SKU name for Microsoft.Compute -
     *     SKU or TotalLowPriorityCores for Microsoft.MachineLearningServices For Microsoft.Network PublicIPAddresses.
     * @param scope The target Azure resource URI. For example,
     *     `/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/qms-test/providers/Microsoft.Batch/batchAccounts/testAccount/`.
     *     This is the target Azure resource URI for the List GET operation. If a `{resourceName}` is added after
     *     `/quotas`, then it's the target Azure resource URI in the GET operation for the specific resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the current usage of a resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<UsagesGetResponse> getWithResponseAsync(String resourceName, String scope) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter resourceName is required and cannot be null."));
        }
        if (scope == null) {
            return Mono.error(new IllegalArgumentException("Parameter scope is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .get(
                            this.client.getEndpoint(),
                            resourceName,
                            this.client.getApiVersion(),
                            scope,
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Get the current usage of a resource.
     *
     * @param resourceName Resource name for a given resource provider. For example: - SKU name for Microsoft.Compute -
     *     SKU or TotalLowPriorityCores for Microsoft.MachineLearningServices For Microsoft.Network PublicIPAddresses.
     * @param scope The target Azure resource URI. For example,
     *     `/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/qms-test/providers/Microsoft.Batch/batchAccounts/testAccount/`.
     *     This is the target Azure resource URI for the List GET operation. If a `{resourceName}` is added after
     *     `/quotas`, then it's the target Azure resource URI in the GET operation for the specific resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the current usage of a resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<UsagesGetResponse> getWithResponseAsync(String resourceName, String scope, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter resourceName is required and cannot be null."));
        }
        if (scope == null) {
            return Mono.error(new IllegalArgumentException("Parameter scope is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .get(this.client.getEndpoint(), resourceName, this.client.getApiVersion(), scope, accept, context);
    }

    /**
     * Get the current usage of a resource.
     *
     * @param resourceName Resource name for a given resource provider. For example: - SKU name for Microsoft.Compute -
     *     SKU or TotalLowPriorityCores for Microsoft.MachineLearningServices For Microsoft.Network PublicIPAddresses.
     * @param scope The target Azure resource URI. For example,
     *     `/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/qms-test/providers/Microsoft.Batch/batchAccounts/testAccount/`.
     *     This is the target Azure resource URI for the List GET operation. If a `{resourceName}` is added after
     *     `/quotas`, then it's the target Azure resource URI in the GET operation for the specific resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the current usage of a resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<CurrentUsagesBaseInner> getAsync(String resourceName, String scope) {
        return getWithResponseAsync(resourceName, scope)
            .flatMap(
                (UsagesGetResponse res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Get the current usage of a resource.
     *
     * @param resourceName Resource name for a given resource provider. For example: - SKU name for Microsoft.Compute -
     *     SKU or TotalLowPriorityCores for Microsoft.MachineLearningServices For Microsoft.Network PublicIPAddresses.
     * @param scope The target Azure resource URI. For example,
     *     `/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/qms-test/providers/Microsoft.Batch/batchAccounts/testAccount/`.
     *     This is the target Azure resource URI for the List GET operation. If a `{resourceName}` is added after
     *     `/quotas`, then it's the target Azure resource URI in the GET operation for the specific resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the current usage of a resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public CurrentUsagesBaseInner get(String resourceName, String scope) {
        return getAsync(resourceName, scope).block();
    }

    /**
     * Get the current usage of a resource.
     *
     * @param resourceName Resource name for a given resource provider. For example: - SKU name for Microsoft.Compute -
     *     SKU or TotalLowPriorityCores for Microsoft.MachineLearningServices For Microsoft.Network PublicIPAddresses.
     * @param scope The target Azure resource URI. For example,
     *     `/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/qms-test/providers/Microsoft.Batch/batchAccounts/testAccount/`.
     *     This is the target Azure resource URI for the List GET operation. If a `{resourceName}` is added after
     *     `/quotas`, then it's the target Azure resource URI in the GET operation for the specific resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the current usage of a resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public UsagesGetResponse getWithResponse(String resourceName, String scope, Context context) {
        return getWithResponseAsync(resourceName, scope, context).block();
    }

    /**
     * Get a list of current usage for all resources for the scope specified.
     *
     * @param scope The target Azure resource URI. For example,
     *     `/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/qms-test/providers/Microsoft.Batch/batchAccounts/testAccount/`.
     *     This is the target Azure resource URI for the List GET operation. If a `{resourceName}` is added after
     *     `/quotas`, then it's the target Azure resource URI in the GET operation for the specific resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of current usage for all resources for the scope specified.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<CurrentUsagesBaseInner>> listSinglePageAsync(String scope) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (scope == null) {
            return Mono.error(new IllegalArgumentException("Parameter scope is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context -> service.list(this.client.getEndpoint(), this.client.getApiVersion(), scope, accept, context))
            .<PagedResponse<CurrentUsagesBaseInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        res.getDeserializedHeaders()))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Get a list of current usage for all resources for the scope specified.
     *
     * @param scope The target Azure resource URI. For example,
     *     `/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/qms-test/providers/Microsoft.Batch/batchAccounts/testAccount/`.
     *     This is the target Azure resource URI for the List GET operation. If a `{resourceName}` is added after
     *     `/quotas`, then it's the target Azure resource URI in the GET operation for the specific resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of current usage for all resources for the scope specified.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<CurrentUsagesBaseInner>> listSinglePageAsync(String scope, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (scope == null) {
            return Mono.error(new IllegalArgumentException("Parameter scope is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .list(this.client.getEndpoint(), this.client.getApiVersion(), scope, accept, context)
            .map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        res.getDeserializedHeaders()));
    }

    /**
     * Get a list of current usage for all resources for the scope specified.
     *
     * @param scope The target Azure resource URI. For example,
     *     `/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/qms-test/providers/Microsoft.Batch/batchAccounts/testAccount/`.
     *     This is the target Azure resource URI for the List GET operation. If a `{resourceName}` is added after
     *     `/quotas`, then it's the target Azure resource URI in the GET operation for the specific resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of current usage for all resources for the scope specified.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<CurrentUsagesBaseInner> listAsync(String scope) {
        return new PagedFlux<>(() -> listSinglePageAsync(scope), nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * Get a list of current usage for all resources for the scope specified.
     *
     * @param scope The target Azure resource URI. For example,
     *     `/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/qms-test/providers/Microsoft.Batch/batchAccounts/testAccount/`.
     *     This is the target Azure resource URI for the List GET operation. If a `{resourceName}` is added after
     *     `/quotas`, then it's the target Azure resource URI in the GET operation for the specific resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of current usage for all resources for the scope specified.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<CurrentUsagesBaseInner> listAsync(String scope, Context context) {
        return new PagedFlux<>(
            () -> listSinglePageAsync(scope, context), nextLink -> listNextSinglePageAsync(nextLink, context));
    }

    /**
     * Get a list of current usage for all resources for the scope specified.
     *
     * @param scope The target Azure resource URI. For example,
     *     `/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/qms-test/providers/Microsoft.Batch/batchAccounts/testAccount/`.
     *     This is the target Azure resource URI for the List GET operation. If a `{resourceName}` is added after
     *     `/quotas`, then it's the target Azure resource URI in the GET operation for the specific resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of current usage for all resources for the scope specified.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<CurrentUsagesBaseInner> list(String scope) {
        return new PagedIterable<>(listAsync(scope));
    }

    /**
     * Get a list of current usage for all resources for the scope specified.
     *
     * @param scope The target Azure resource URI. For example,
     *     `/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/qms-test/providers/Microsoft.Batch/batchAccounts/testAccount/`.
     *     This is the target Azure resource URI for the List GET operation. If a `{resourceName}` is added after
     *     `/quotas`, then it's the target Azure resource URI in the GET operation for the specific resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of current usage for all resources for the scope specified.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<CurrentUsagesBaseInner> list(String scope, Context context) {
        return new PagedIterable<>(listAsync(scope, context));
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return quota limits.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<CurrentUsagesBaseInner>> listNextSinglePageAsync(String nextLink) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.listNext(nextLink, this.client.getEndpoint(), accept, context))
            .<PagedResponse<CurrentUsagesBaseInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        res.getDeserializedHeaders()))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return quota limits.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<CurrentUsagesBaseInner>> listNextSinglePageAsync(String nextLink, Context context) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .listNext(nextLink, this.client.getEndpoint(), accept, context)
            .map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        res.getDeserializedHeaders()));
    }
}