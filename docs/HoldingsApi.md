# HoldingsApi

All URIs are relative to *//localhost:3011/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV1HoldingsPost**](HoldingsApi.md#apiV1HoldingsPost) | **POST** /api/v1/holdings/ | Holdings holdings.
[**apiV1HoldingsUpdatePayoutPost**](HoldingsApi.md#apiV1HoldingsUpdatePayoutPost) | **POST** /api/v1/holdings/update-payout | UpdatePayOut holdings.

<a name="apiV1HoldingsPost"></a>
# **apiV1HoldingsPost**
> OpenapiOpenApiHoldingDetailsResponse apiV1HoldingsPost(body)

Holdings holdings.

The API retrieves the user&#x27;s long-term holdings, kept in the DEMAT account until sold, removed from the exchange, or changed by stock exchange rules, ensuring regulatory compliance.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.HoldingsApi;


HoldingsApi apiInstance = new HoldingsApi();
OpenapiOpenapiCommonReq body = new OpenapiOpenapiCommonReq(); // OpenapiOpenapiCommonReq | holdings payload
try {
    OpenapiOpenApiHoldingDetailsResponse result = apiInstance.apiV1HoldingsPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HoldingsApi#apiV1HoldingsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OpenapiOpenapiCommonReq**](OpenapiOpenapiCommonReq.md)| holdings payload |

### Return type

[**OpenapiOpenApiHoldingDetailsResponse**](OpenapiOpenApiHoldingDetailsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="apiV1HoldingsUpdatePayoutPost"></a>
# **apiV1HoldingsUpdatePayoutPost**
> OpenapiOpenapiResponse apiV1HoldingsUpdatePayoutPost(body)

UpdatePayOut holdings.

The Holding Update PayOut API endpoint processes a request to update payout details for a specified holding by ISIN ID, and it returns the updated holding quantities and status. This ensures accurate tracking of holding quantities post-update.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.HoldingsApi;


HoldingsApi apiInstance = new HoldingsApi();
OpenapiOpenapiUpdatePayOutPayload body = new OpenapiOpenapiUpdatePayOutPayload(); // OpenapiOpenapiUpdatePayOutPayload | UpdatePayOut payload
try {
    OpenapiOpenapiResponse result = apiInstance.apiV1HoldingsUpdatePayoutPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HoldingsApi#apiV1HoldingsUpdatePayoutPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OpenapiOpenapiUpdatePayOutPayload**](OpenapiOpenapiUpdatePayOutPayload.md)| UpdatePayOut payload |

### Return type

[**OpenapiOpenapiResponse**](OpenapiOpenapiResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

