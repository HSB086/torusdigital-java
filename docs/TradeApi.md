# TradeApi

All URIs are relative to *//localhost:3011/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV1TradeBookPost**](TradeApi.md#apiV1TradeBookPost) | **POST** /api/v1/trade/book | TradeBook trade.
[**apiV1TradeDetailsPost**](TradeApi.md#apiV1TradeDetailsPost) | **POST** /api/v1/trade/details | TradeDetails trade.

<a name="apiV1TradeBookPost"></a>
# **apiV1TradeBookPost**
> OpenapiOpenApiTradeBookResponse apiV1TradeBookPost(body)

TradeBook trade.

This API endpoint Retrieves the complete trade book/ledger for a client&#x27;s trading account. Provides a comprehensive record of all trades executed, including order details, product information, prices, quantities, timestamps, and other relevant trade data for auditing and regulatory compliance purposes.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TradeApi;


TradeApi apiInstance = new TradeApi();
OpenapiOpenapiCommonReq body = new OpenapiOpenapiCommonReq(); // OpenapiOpenapiCommonReq | TradeBook payload
try {
    OpenapiOpenApiTradeBookResponse result = apiInstance.apiV1TradeBookPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TradeApi#apiV1TradeBookPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OpenapiOpenapiCommonReq**](OpenapiOpenapiCommonReq.md)| TradeBook payload |

### Return type

[**OpenapiOpenApiTradeBookResponse**](OpenapiOpenApiTradeBookResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="apiV1TradeDetailsPost"></a>
# **apiV1TradeDetailsPost**
> OpenapiOpenapiOrderDetailsResponse apiV1TradeDetailsPost(body)

TradeDetails trade.

This API endpoint Retrieves the trade details and transaction history for a client&#x27;s trading account. Provides access to information about executed trades, including order details, product information, trade prices, quantities, and timestamps for monitoring and record-keeping purposes

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TradeApi;


TradeApi apiInstance = new TradeApi();
OpenapiOpenapiOrderDetailPayload body = new OpenapiOpenapiOrderDetailPayload(); // OpenapiOpenapiOrderDetailPayload | TradeDetails payload
try {
    OpenapiOpenapiOrderDetailsResponse result = apiInstance.apiV1TradeDetailsPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TradeApi#apiV1TradeDetailsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OpenapiOpenapiOrderDetailPayload**](OpenapiOpenapiOrderDetailPayload.md)| TradeDetails payload |

### Return type

[**OpenapiOpenapiOrderDetailsResponse**](OpenapiOpenapiOrderDetailsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

