# OrderApi

All URIs are relative to *//localhost:3011/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV1OrderBookPost**](OrderApi.md#apiV1OrderBookPost) | **POST** /api/v1/order/book | OrderBook order.
[**apiV1OrderCancelPost**](OrderApi.md#apiV1OrderCancelPost) | **POST** /api/v1/order/cancel | OrderCancel order.
[**apiV1OrderConvertDeliveryPost**](OrderApi.md#apiV1OrderConvertDeliveryPost) | **POST** /api/v1/order/convert/delivery | ConvToDel order.
[**apiV1OrderDetailsPost**](OrderApi.md#apiV1OrderDetailsPost) | **POST** /api/v1/order/details | OrderDetails order.
[**apiV1OrderEntryPost**](OrderApi.md#apiV1OrderEntryPost) | **POST** /api/v1/order/entry | OrderEntry order.
[**apiV1OrderMarginCalculatePost**](OrderApi.md#apiV1OrderMarginCalculatePost) | **POST** /api/v1/order/margin/calculate | CalculateOrdermargin order.
[**apiV1OrderModifyPost**](OrderApi.md#apiV1OrderModifyPost) | **POST** /api/v1/order/modify | OrderModify order.

<a name="apiV1OrderBookPost"></a>
# **apiV1OrderBookPost**
> OpenapiOpenapiOrderBookResponse apiV1OrderBookPost(body)

OrderBook order.

This API will retrieve the list of orders placed for the current day. Orders initiated by the user remain active for a day and are automatically cleared after the trading session.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.OrderApi;


OrderApi apiInstance = new OrderApi();
OpenapiOpenapiCommonReq body = new OpenapiOpenapiCommonReq(); // OpenapiOpenapiCommonReq | OrderBook payload
try {
    OpenapiOpenapiOrderBookResponse result = apiInstance.apiV1OrderBookPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#apiV1OrderBookPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OpenapiOpenapiCommonReq**](OpenapiOpenapiCommonReq.md)| OrderBook payload |

### Return type

[**OpenapiOpenapiOrderBookResponse**](OpenapiOpenapiOrderBookResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="apiV1OrderCancelPost"></a>
# **apiV1OrderCancelPost**
> OpenapiOpenApiOrderResponse apiV1OrderCancelPost(body)

OrderCancel order.

This API cancels open or pending orders, including AMO and regular orders, and assists in exiting COs, offering traders a streamlined solution for order management.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.OrderApi;


OrderApi apiInstance = new OrderApi();
OpenapiOpenapiOrderModifyPayload body = new OpenapiOpenapiOrderModifyPayload(); // OpenapiOpenapiOrderModifyPayload | OrderCancel payload
try {
    OpenapiOpenApiOrderResponse result = apiInstance.apiV1OrderCancelPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#apiV1OrderCancelPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OpenapiOpenapiOrderModifyPayload**](OpenapiOpenapiOrderModifyPayload.md)| OrderCancel payload |

### Return type

[**OpenapiOpenApiOrderResponse**](OpenapiOpenApiOrderResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="apiV1OrderConvertDeliveryPost"></a>
# **apiV1OrderConvertDeliveryPost**
> OpenapiOpenapiResponse apiV1OrderConvertDeliveryPost(body)

ConvToDel order.

This API converts an intraday (I) position to a delivery (C) position for a specific security on the exchange. The backend processes the request by validating the provided credentials and order details, updating the order&#x27;s status and type in the trading system, and then confirming the successful conversion.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.OrderApi;


OrderApi apiInstance = new OrderApi();
OpenapiOpenapiConvToDevPayload body = new OpenapiOpenapiConvToDevPayload(); // OpenapiOpenapiConvToDevPayload | ConvToDel payload
try {
    OpenapiOpenapiResponse result = apiInstance.apiV1OrderConvertDeliveryPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#apiV1OrderConvertDeliveryPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OpenapiOpenapiConvToDevPayload**](OpenapiOpenapiConvToDevPayload.md)| ConvToDel payload |

### Return type

[**OpenapiOpenapiResponse**](OpenapiOpenapiResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="apiV1OrderDetailsPost"></a>
# **apiV1OrderDetailsPost**
> OpenapiOpenapiOrderDetailsResponse apiV1OrderDetailsPost(body)

OrderDetails order.

Retrieve the latest status of a specific order through the API. Orders initiated by the user are accessible for one trading day and are automatically purged at the session&#x27;s closure

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.OrderApi;


OrderApi apiInstance = new OrderApi();
OpenapiOpenapiOrderDetailPayload body = new OpenapiOpenapiOrderDetailPayload(); // OpenapiOpenapiOrderDetailPayload | OrderDetails payload
try {
    OpenapiOpenapiOrderDetailsResponse result = apiInstance.apiV1OrderDetailsPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#apiV1OrderDetailsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OpenapiOpenapiOrderDetailPayload**](OpenapiOpenapiOrderDetailPayload.md)| OrderDetails payload |

### Return type

[**OpenapiOpenapiOrderDetailsResponse**](OpenapiOpenapiOrderDetailsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="apiV1OrderEntryPost"></a>
# **apiV1OrderEntryPost**
> OpenapiOpenApiOrderResponse apiV1OrderEntryPost(body)

OrderEntry order.

Allows clients to place new orders in the trading system. Requires comprehensive details such as client identification, order specifications (product, quantity, price, type), exchange and market parameters, and validity period.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.OrderApi;


OrderApi apiInstance = new OrderApi();
OpenapiOpenApiOrderEntryPayload body = new OpenapiOpenApiOrderEntryPayload(); // OpenapiOpenApiOrderEntryPayload | OrderEntry payload
try {
    OpenapiOpenApiOrderResponse result = apiInstance.apiV1OrderEntryPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#apiV1OrderEntryPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OpenapiOpenApiOrderEntryPayload**](OpenapiOpenApiOrderEntryPayload.md)| OrderEntry payload |

### Return type

[**OpenapiOpenApiOrderResponse**](OpenapiOpenApiOrderResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="apiV1OrderMarginCalculatePost"></a>
# **apiV1OrderMarginCalculatePost**
> OpenapiOpenapiCalMarResponse apiV1OrderMarginCalculatePost(body)

CalculateOrdermargin order.

Margin Calculator API delivers the real time margin calculations for a basket of positions.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.OrderApi;


OrderApi apiInstance = new OrderApi();
OpenapiOpenapiCallMarPayload body = new OpenapiOpenapiCallMarPayload(); // OpenapiOpenapiCallMarPayload | CalculateOrdermargin payload
try {
    OpenapiOpenapiCalMarResponse result = apiInstance.apiV1OrderMarginCalculatePost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#apiV1OrderMarginCalculatePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OpenapiOpenapiCallMarPayload**](OpenapiOpenapiCallMarPayload.md)| CalculateOrdermargin payload |

### Return type

[**OpenapiOpenapiCalMarResponse**](OpenapiOpenapiCalMarResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="apiV1OrderModifyPost"></a>
# **apiV1OrderModifyPost**
> OpenapiOpenApiOrderResponse apiV1OrderModifyPost(body)

OrderModify order.

API for order modification allows users to alter an open or pending order by providing the orderId along with any optional parameters needing adjustment. If no opI to place an order to the exchange.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.OrderApi;


OrderApi apiInstance = new OrderApi();
OpenapiOpenapiOrderModifyPayload body = new OpenapiOpenapiOrderModifyPayload(); // OpenapiOpenapiOrderModifyPayload | OrderModify payload
try {
    OpenapiOpenApiOrderResponse result = apiInstance.apiV1OrderModifyPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#apiV1OrderModifyPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OpenapiOpenapiOrderModifyPayload**](OpenapiOpenapiOrderModifyPayload.md)| OrderModify payload |

### Return type

[**OpenapiOpenApiOrderResponse**](OpenapiOpenApiOrderResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

