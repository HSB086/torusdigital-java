# MarketStatusApi

All URIs are relative to *//localhost:3011/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV1MarketStatusPost**](MarketStatusApi.md#apiV1MarketStatusPost) | **POST** /api/v1/market/status | MarketStatusDisplay market.

<a name="apiV1MarketStatusPost"></a>
# **apiV1MarketStatusPost**
> OpenapiOpenApiMarketStatusResponse apiV1MarketStatusPost(body)

MarketStatusDisplay market.

The Market Status API endpoint retrieves the current status of various market types and segments for specified exchanges, providing detailed information about their operational state. This ensures clients can track and respond to market conditions in real-time.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.MarketStatusApi;


MarketStatusApi apiInstance = new MarketStatusApi();
OpenapiOpenapiCommonReq body = new OpenapiOpenapiCommonReq(); // OpenapiOpenapiCommonReq | MarketStatusDisplay payload
try {
    OpenapiOpenApiMarketStatusResponse result = apiInstance.apiV1MarketStatusPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MarketStatusApi#apiV1MarketStatusPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OpenapiOpenapiCommonReq**](OpenapiOpenapiCommonReq.md)| MarketStatusDisplay payload |

### Return type

[**OpenapiOpenApiMarketStatusResponse**](OpenapiOpenApiMarketStatusResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

