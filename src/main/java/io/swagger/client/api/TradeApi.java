/*
 * Torus Open API
 * This is the API documentation for Torus Open API
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.api;

import io.swagger.client.ApiCallback;
import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.ApiResponse;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.ProgressRequestBody;
import io.swagger.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import io.swagger.client.model.OpenapiOpenAPIErrorResponse;
import io.swagger.client.model.OpenapiOpenApiTradeBookResponse;
import io.swagger.client.model.OpenapiOpenapiCommonReq;
import io.swagger.client.model.OpenapiOpenapiOrderDetailPayload;
import io.swagger.client.model.OpenapiOpenapiOrderDetailsResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TradeApi {
    private ApiClient apiClient;

    public TradeApi() {
        this(Configuration.getDefaultApiClient());
    }

    public TradeApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for apiV1TradeBookPost
     * @param body TradeBook payload (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call apiV1TradeBookPostCall(OpenapiOpenapiCommonReq body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/api/v1/trade/book";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call apiV1TradeBookPostValidateBeforeCall(OpenapiOpenapiCommonReq body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling apiV1TradeBookPost(Async)");
        }
        
        com.squareup.okhttp.Call call = apiV1TradeBookPostCall(body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * TradeBook trade.
     * This API endpoint Retrieves the complete trade book/ledger for a client&#x27;s trading account. Provides a comprehensive record of all trades executed, including order details, product information, prices, quantities, timestamps, and other relevant trade data for auditing and regulatory compliance purposes.
     * @param body TradeBook payload (required)
     * @return OpenapiOpenApiTradeBookResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public OpenapiOpenApiTradeBookResponse apiV1TradeBookPost(OpenapiOpenapiCommonReq body) throws ApiException {
        ApiResponse<OpenapiOpenApiTradeBookResponse> resp = apiV1TradeBookPostWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * TradeBook trade.
     * This API endpoint Retrieves the complete trade book/ledger for a client&#x27;s trading account. Provides a comprehensive record of all trades executed, including order details, product information, prices, quantities, timestamps, and other relevant trade data for auditing and regulatory compliance purposes.
     * @param body TradeBook payload (required)
     * @return ApiResponse&lt;OpenapiOpenApiTradeBookResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<OpenapiOpenApiTradeBookResponse> apiV1TradeBookPostWithHttpInfo(OpenapiOpenapiCommonReq body) throws ApiException {
        com.squareup.okhttp.Call call = apiV1TradeBookPostValidateBeforeCall(body, null, null);
        Type localVarReturnType = new TypeToken<OpenapiOpenApiTradeBookResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * TradeBook trade. (asynchronously)
     * This API endpoint Retrieves the complete trade book/ledger for a client&#x27;s trading account. Provides a comprehensive record of all trades executed, including order details, product information, prices, quantities, timestamps, and other relevant trade data for auditing and regulatory compliance purposes.
     * @param body TradeBook payload (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call apiV1TradeBookPostAsync(OpenapiOpenapiCommonReq body, final ApiCallback<OpenapiOpenApiTradeBookResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = apiV1TradeBookPostValidateBeforeCall(body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<OpenapiOpenApiTradeBookResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for apiV1TradeDetailsPost
     * @param body TradeDetails payload (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call apiV1TradeDetailsPostCall(OpenapiOpenapiOrderDetailPayload body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/api/v1/trade/details";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call apiV1TradeDetailsPostValidateBeforeCall(OpenapiOpenapiOrderDetailPayload body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling apiV1TradeDetailsPost(Async)");
        }
        
        com.squareup.okhttp.Call call = apiV1TradeDetailsPostCall(body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * TradeDetails trade.
     * This API endpoint Retrieves the trade details and transaction history for a client&#x27;s trading account. Provides access to information about executed trades, including order details, product information, trade prices, quantities, and timestamps for monitoring and record-keeping purposes
     * @param body TradeDetails payload (required)
     * @return OpenapiOpenapiOrderDetailsResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public OpenapiOpenapiOrderDetailsResponse apiV1TradeDetailsPost(OpenapiOpenapiOrderDetailPayload body) throws ApiException {
        ApiResponse<OpenapiOpenapiOrderDetailsResponse> resp = apiV1TradeDetailsPostWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * TradeDetails trade.
     * This API endpoint Retrieves the trade details and transaction history for a client&#x27;s trading account. Provides access to information about executed trades, including order details, product information, trade prices, quantities, and timestamps for monitoring and record-keeping purposes
     * @param body TradeDetails payload (required)
     * @return ApiResponse&lt;OpenapiOpenapiOrderDetailsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<OpenapiOpenapiOrderDetailsResponse> apiV1TradeDetailsPostWithHttpInfo(OpenapiOpenapiOrderDetailPayload body) throws ApiException {
        com.squareup.okhttp.Call call = apiV1TradeDetailsPostValidateBeforeCall(body, null, null);
        Type localVarReturnType = new TypeToken<OpenapiOpenapiOrderDetailsResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * TradeDetails trade. (asynchronously)
     * This API endpoint Retrieves the trade details and transaction history for a client&#x27;s trading account. Provides access to information about executed trades, including order details, product information, trade prices, quantities, and timestamps for monitoring and record-keeping purposes
     * @param body TradeDetails payload (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call apiV1TradeDetailsPostAsync(OpenapiOpenapiOrderDetailPayload body, final ApiCallback<OpenapiOpenapiOrderDetailsResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = apiV1TradeDetailsPostValidateBeforeCall(body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<OpenapiOpenapiOrderDetailsResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
