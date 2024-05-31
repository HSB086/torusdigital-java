# AuthenticationApi

All URIs are relative to *//localhost:3011/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV1UserAuthPassauthPost**](AuthenticationApi.md#apiV1UserAuthPassauthPost) | **POST** /api/v1/user/auth/passauth | AuthenticationPassAuth user.
[**apiV1UserAuthPost**](AuthenticationApi.md#apiV1UserAuthPost) | **POST** /api/v1/user/auth | Authenticate user.
[**apiV1UserAuthSessionPost**](AuthenticationApi.md#apiV1UserAuthSessionPost) | **POST** /api/v1/user/auth/session | AuthenticateSession user.

<a name="apiV1UserAuthPassauthPost"></a>
# **apiV1UserAuthPassauthPost**
> OpenapiOpenapiAuthPassResponse apiV1UserAuthPassauthPost(body)

AuthenticationPassAuth user.

Authenticates a user by verifying their provided credentials, such as a username and password.This API is likely used for secure user login and access control within the application or system.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AuthenticationApi;


AuthenticationApi apiInstance = new AuthenticationApi();
OpenapiOpenapiCommonReq body = new OpenapiOpenapiCommonReq(); // OpenapiOpenapiCommonReq | AuthenticationPassAuth payload
try {
    OpenapiOpenapiAuthPassResponse result = apiInstance.apiV1UserAuthPassauthPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthenticationApi#apiV1UserAuthPassauthPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OpenapiOpenapiCommonReq**](OpenapiOpenapiCommonReq.md)| AuthenticationPassAuth payload |

### Return type

[**OpenapiOpenapiAuthPassResponse**](OpenapiOpenapiAuthPassResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="apiV1UserAuthPost"></a>
# **apiV1UserAuthPost**
> OpenapiOpenAPIAuthenticateResponse apiV1UserAuthPost(body)

Authenticate user.

All authentication processes are managed through torusdigital.com. There are no public endpoints available for third-party applications to directly log users into TorusDigital. This approach ensures security and compliance, with all logins and logouts handled exclusively by torusdigital.com

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AuthenticationApi;


AuthenticationApi apiInstance = new AuthenticationApi();
OpenapiOpenApiAuthPayload body = new OpenapiOpenApiAuthPayload(); // OpenapiOpenApiAuthPayload | Authentication payload
try {
    OpenapiOpenAPIAuthenticateResponse result = apiInstance.apiV1UserAuthPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthenticationApi#apiV1UserAuthPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OpenapiOpenApiAuthPayload**](OpenapiOpenApiAuthPayload.md)| Authentication payload |

### Return type

[**OpenapiOpenAPIAuthenticateResponse**](OpenapiOpenAPIAuthenticateResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="apiV1UserAuthSessionPost"></a>
# **apiV1UserAuthSessionPost**
> OpenapiOpenapiResponse apiV1UserAuthSessionPost(body)

AuthenticateSession user.

This API is used to maintain secure authenticated sessions and verify user access across multiple requests or pages within the application.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AuthenticationApi;


AuthenticationApi apiInstance = new AuthenticationApi();
OpenapiOpenapiCommonReq body = new OpenapiOpenapiCommonReq(); // OpenapiOpenapiCommonReq | AuthenticateSession payload
try {
    OpenapiOpenapiResponse result = apiInstance.apiV1UserAuthSessionPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthenticationApi#apiV1UserAuthSessionPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OpenapiOpenapiCommonReq**](OpenapiOpenapiCommonReq.md)| AuthenticateSession payload |

### Return type

[**OpenapiOpenapiResponse**](OpenapiOpenapiResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

