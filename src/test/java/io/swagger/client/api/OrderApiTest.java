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

import io.swagger.client.model.OpenapiOpenAPIErrorResponse;
import io.swagger.client.model.OpenapiOpenApiOrderEntryPayload;
import io.swagger.client.model.OpenapiOpenApiOrderResponse;
import io.swagger.client.model.OpenapiOpenapiCalMarResponse;
import io.swagger.client.model.OpenapiOpenapiCallMarPayload;
import io.swagger.client.model.OpenapiOpenapiCommonReq;
import io.swagger.client.model.OpenapiOpenapiConvToDevPayload;
import io.swagger.client.model.OpenapiOpenapiOrderBookResponse;
import io.swagger.client.model.OpenapiOpenapiOrderDetailPayload;
import io.swagger.client.model.OpenapiOpenapiOrderDetailsResponse;
import io.swagger.client.model.OpenapiOpenapiOrderModifyPayload;
import io.swagger.client.model.OpenapiOpenapiResponse;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for OrderApi
 */
@Ignore
public class OrderApiTest {

    private final OrderApi api = new OrderApi();

    /**
     * OrderBook order.
     *
     * This API will retrieve the list of orders placed for the current day. Orders initiated by the user remain active for a day and are automatically cleared after the trading session.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void apiV1OrderBookPostTest() throws Exception {
        OpenapiOpenapiCommonReq body = null;
        OpenapiOpenapiOrderBookResponse response = api.apiV1OrderBookPost(body);

        // TODO: test validations
    }
    /**
     * OrderCancel order.
     *
     * This API cancels open or pending orders, including AMO and regular orders, and assists in exiting COs, offering traders a streamlined solution for order management.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void apiV1OrderCancelPostTest() throws Exception {
        OpenapiOpenapiOrderModifyPayload body = null;
        OpenapiOpenApiOrderResponse response = api.apiV1OrderCancelPost(body);

        // TODO: test validations
    }
    /**
     * ConvToDel order.
     *
     * This API converts an intraday (I) position to a delivery (C) position for a specific security on the exchange. The backend processes the request by validating the provided credentials and order details, updating the order&#x27;s status and type in the trading system, and then confirming the successful conversion.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void apiV1OrderConvertDeliveryPostTest() throws Exception {
        OpenapiOpenapiConvToDevPayload body = null;
        OpenapiOpenapiResponse response = api.apiV1OrderConvertDeliveryPost(body);

        // TODO: test validations
    }
    /**
     * OrderDetails order.
     *
     * Retrieve the latest status of a specific order through the API. Orders initiated by the user are accessible for one trading day and are automatically purged at the session&#x27;s closure
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void apiV1OrderDetailsPostTest() throws Exception {
        OpenapiOpenapiOrderDetailPayload body = null;
        OpenapiOpenapiOrderDetailsResponse response = api.apiV1OrderDetailsPost(body);

        // TODO: test validations
    }
    /**
     * OrderEntry order.
     *
     * Allows clients to place new orders in the trading system. Requires comprehensive details such as client identification, order specifications (product, quantity, price, type), exchange and market parameters, and validity period.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void apiV1OrderEntryPostTest() throws Exception {
        OpenapiOpenApiOrderEntryPayload body = null;
        OpenapiOpenApiOrderResponse response = api.apiV1OrderEntryPost(body);

        // TODO: test validations
    }
    /**
     * CalculateOrdermargin order.
     *
     * Margin Calculator API delivers the real time margin calculations for a basket of positions.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void apiV1OrderMarginCalculatePostTest() throws Exception {
        OpenapiOpenapiCallMarPayload body = null;
        OpenapiOpenapiCalMarResponse response = api.apiV1OrderMarginCalculatePost(body);

        // TODO: test validations
    }
    /**
     * OrderModify order.
     *
     * API for order modification allows users to alter an open or pending order by providing the orderId along with any optional parameters needing adjustment. If no opI to place an order to the exchange.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void apiV1OrderModifyPostTest() throws Exception {
        OpenapiOpenapiOrderModifyPayload body = null;
        OpenapiOpenApiOrderResponse response = api.apiV1OrderModifyPost(body);

        // TODO: test validations
    }
}