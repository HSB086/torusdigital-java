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

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * OpenapiOpenapiOrderModifyData
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-05-30T23:12:44.291983900+05:30[Asia/Calcutta]")

public class OpenapiOpenapiOrderModifyData {
  @SerializedName("app_id")
  private String appId = null;

  @SerializedName("disc_quantity")
  private String discQuantity = null;

  @SerializedName("exchange")
  private String exchange = null;

  @SerializedName("group_id")
  private String groupId = null;

  @SerializedName("ip")
  private String ip = null;

  @SerializedName("mkt_type")
  private String mktType = null;

  @SerializedName("off_mkt_flag")
  private String offMktFlag = null;

  @SerializedName("order_no")
  private String orderNo = null;

  @SerializedName("order_type")
  private String orderType = null;

  @SerializedName("price")
  private String price = null;

  @SerializedName("product")
  private String product = null;

  @SerializedName("quantity")
  private String quantity = null;

  @SerializedName("remarks")
  private String remarks = null;

  @SerializedName("security_id")
  private String securityId = null;

  @SerializedName("segment")
  private String segment = null;

  @SerializedName("serial_no")
  private String serialNo = null;

  @SerializedName("settlor")
  private String settlor = null;

  @SerializedName("trigger_price")
  private String triggerPrice = null;

  @SerializedName("txn_type")
  private String txnType = null;

  @SerializedName("uu_id")
  private String uuId = null;

  @SerializedName("validity")
  private String validity = null;

  public OpenapiOpenapiOrderModifyData appId(String appId) {
    this.appId = appId;
    return this;
  }

   /**
   * Get appId
   * @return appId
  **/
  @Schema(description = "")
  public String getAppId() {
    return appId;
  }

  public void setAppId(String appId) {
    this.appId = appId;
  }

  public OpenapiOpenapiOrderModifyData discQuantity(String discQuantity) {
    this.discQuantity = discQuantity;
    return this;
  }

   /**
   * Get discQuantity
   * @return discQuantity
  **/
  @Schema(description = "")
  public String getDiscQuantity() {
    return discQuantity;
  }

  public void setDiscQuantity(String discQuantity) {
    this.discQuantity = discQuantity;
  }

  public OpenapiOpenapiOrderModifyData exchange(String exchange) {
    this.exchange = exchange;
    return this;
  }

   /**
   * Get exchange
   * @return exchange
  **/
  @Schema(description = "")
  public String getExchange() {
    return exchange;
  }

  public void setExchange(String exchange) {
    this.exchange = exchange;
  }

  public OpenapiOpenapiOrderModifyData groupId(String groupId) {
    this.groupId = groupId;
    return this;
  }

   /**
   * Get groupId
   * @return groupId
  **/
  @Schema(description = "")
  public String getGroupId() {
    return groupId;
  }

  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }

  public OpenapiOpenapiOrderModifyData ip(String ip) {
    this.ip = ip;
    return this;
  }

   /**
   * Get ip
   * @return ip
  **/
  @Schema(description = "")
  public String getIp() {
    return ip;
  }

  public void setIp(String ip) {
    this.ip = ip;
  }

  public OpenapiOpenapiOrderModifyData mktType(String mktType) {
    this.mktType = mktType;
    return this;
  }

   /**
   * Get mktType
   * @return mktType
  **/
  @Schema(description = "")
  public String getMktType() {
    return mktType;
  }

  public void setMktType(String mktType) {
    this.mktType = mktType;
  }

  public OpenapiOpenapiOrderModifyData offMktFlag(String offMktFlag) {
    this.offMktFlag = offMktFlag;
    return this;
  }

   /**
   * Get offMktFlag
   * @return offMktFlag
  **/
  @Schema(description = "")
  public String getOffMktFlag() {
    return offMktFlag;
  }

  public void setOffMktFlag(String offMktFlag) {
    this.offMktFlag = offMktFlag;
  }

  public OpenapiOpenapiOrderModifyData orderNo(String orderNo) {
    this.orderNo = orderNo;
    return this;
  }

   /**
   * Get orderNo
   * @return orderNo
  **/
  @Schema(description = "")
  public String getOrderNo() {
    return orderNo;
  }

  public void setOrderNo(String orderNo) {
    this.orderNo = orderNo;
  }

  public OpenapiOpenapiOrderModifyData orderType(String orderType) {
    this.orderType = orderType;
    return this;
  }

   /**
   * Get orderType
   * @return orderType
  **/
  @Schema(description = "")
  public String getOrderType() {
    return orderType;
  }

  public void setOrderType(String orderType) {
    this.orderType = orderType;
  }

  public OpenapiOpenapiOrderModifyData price(String price) {
    this.price = price;
    return this;
  }

   /**
   * Get price
   * @return price
  **/
  @Schema(description = "")
  public String getPrice() {
    return price;
  }

  public void setPrice(String price) {
    this.price = price;
  }

  public OpenapiOpenapiOrderModifyData product(String product) {
    this.product = product;
    return this;
  }

   /**
   * Get product
   * @return product
  **/
  @Schema(description = "")
  public String getProduct() {
    return product;
  }

  public void setProduct(String product) {
    this.product = product;
  }

  public OpenapiOpenapiOrderModifyData quantity(String quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * Get quantity
   * @return quantity
  **/
  @Schema(description = "")
  public String getQuantity() {
    return quantity;
  }

  public void setQuantity(String quantity) {
    this.quantity = quantity;
  }

  public OpenapiOpenapiOrderModifyData remarks(String remarks) {
    this.remarks = remarks;
    return this;
  }

   /**
   * Get remarks
   * @return remarks
  **/
  @Schema(description = "")
  public String getRemarks() {
    return remarks;
  }

  public void setRemarks(String remarks) {
    this.remarks = remarks;
  }

  public OpenapiOpenapiOrderModifyData securityId(String securityId) {
    this.securityId = securityId;
    return this;
  }

   /**
   * Get securityId
   * @return securityId
  **/
  @Schema(description = "")
  public String getSecurityId() {
    return securityId;
  }

  public void setSecurityId(String securityId) {
    this.securityId = securityId;
  }

  public OpenapiOpenapiOrderModifyData segment(String segment) {
    this.segment = segment;
    return this;
  }

   /**
   * Get segment
   * @return segment
  **/
  @Schema(description = "")
  public String getSegment() {
    return segment;
  }

  public void setSegment(String segment) {
    this.segment = segment;
  }

  public OpenapiOpenapiOrderModifyData serialNo(String serialNo) {
    this.serialNo = serialNo;
    return this;
  }

   /**
   * Get serialNo
   * @return serialNo
  **/
  @Schema(description = "")
  public String getSerialNo() {
    return serialNo;
  }

  public void setSerialNo(String serialNo) {
    this.serialNo = serialNo;
  }

  public OpenapiOpenapiOrderModifyData settlor(String settlor) {
    this.settlor = settlor;
    return this;
  }

   /**
   * Get settlor
   * @return settlor
  **/
  @Schema(description = "")
  public String getSettlor() {
    return settlor;
  }

  public void setSettlor(String settlor) {
    this.settlor = settlor;
  }

  public OpenapiOpenapiOrderModifyData triggerPrice(String triggerPrice) {
    this.triggerPrice = triggerPrice;
    return this;
  }

   /**
   * Get triggerPrice
   * @return triggerPrice
  **/
  @Schema(description = "")
  public String getTriggerPrice() {
    return triggerPrice;
  }

  public void setTriggerPrice(String triggerPrice) {
    this.triggerPrice = triggerPrice;
  }

  public OpenapiOpenapiOrderModifyData txnType(String txnType) {
    this.txnType = txnType;
    return this;
  }

   /**
   * Get txnType
   * @return txnType
  **/
  @Schema(description = "")
  public String getTxnType() {
    return txnType;
  }

  public void setTxnType(String txnType) {
    this.txnType = txnType;
  }

  public OpenapiOpenapiOrderModifyData uuId(String uuId) {
    this.uuId = uuId;
    return this;
  }

   /**
   * Get uuId
   * @return uuId
  **/
  @Schema(description = "")
  public String getUuId() {
    return uuId;
  }

  public void setUuId(String uuId) {
    this.uuId = uuId;
  }

  public OpenapiOpenapiOrderModifyData validity(String validity) {
    this.validity = validity;
    return this;
  }

   /**
   * Get validity
   * @return validity
  **/
  @Schema(description = "")
  public String getValidity() {
    return validity;
  }

  public void setValidity(String validity) {
    this.validity = validity;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenapiOpenapiOrderModifyData openapiOpenapiOrderModifyData = (OpenapiOpenapiOrderModifyData) o;
    return Objects.equals(this.appId, openapiOpenapiOrderModifyData.appId) &&
        Objects.equals(this.discQuantity, openapiOpenapiOrderModifyData.discQuantity) &&
        Objects.equals(this.exchange, openapiOpenapiOrderModifyData.exchange) &&
        Objects.equals(this.groupId, openapiOpenapiOrderModifyData.groupId) &&
        Objects.equals(this.ip, openapiOpenapiOrderModifyData.ip) &&
        Objects.equals(this.mktType, openapiOpenapiOrderModifyData.mktType) &&
        Objects.equals(this.offMktFlag, openapiOpenapiOrderModifyData.offMktFlag) &&
        Objects.equals(this.orderNo, openapiOpenapiOrderModifyData.orderNo) &&
        Objects.equals(this.orderType, openapiOpenapiOrderModifyData.orderType) &&
        Objects.equals(this.price, openapiOpenapiOrderModifyData.price) &&
        Objects.equals(this.product, openapiOpenapiOrderModifyData.product) &&
        Objects.equals(this.quantity, openapiOpenapiOrderModifyData.quantity) &&
        Objects.equals(this.remarks, openapiOpenapiOrderModifyData.remarks) &&
        Objects.equals(this.securityId, openapiOpenapiOrderModifyData.securityId) &&
        Objects.equals(this.segment, openapiOpenapiOrderModifyData.segment) &&
        Objects.equals(this.serialNo, openapiOpenapiOrderModifyData.serialNo) &&
        Objects.equals(this.settlor, openapiOpenapiOrderModifyData.settlor) &&
        Objects.equals(this.triggerPrice, openapiOpenapiOrderModifyData.triggerPrice) &&
        Objects.equals(this.txnType, openapiOpenapiOrderModifyData.txnType) &&
        Objects.equals(this.uuId, openapiOpenapiOrderModifyData.uuId) &&
        Objects.equals(this.validity, openapiOpenapiOrderModifyData.validity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appId, discQuantity, exchange, groupId, ip, mktType, offMktFlag, orderNo, orderType, price, product, quantity, remarks, securityId, segment, serialNo, settlor, triggerPrice, txnType, uuId, validity);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenapiOpenapiOrderModifyData {\n");
    
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    discQuantity: ").append(toIndentedString(discQuantity)).append("\n");
    sb.append("    exchange: ").append(toIndentedString(exchange)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
    sb.append("    mktType: ").append(toIndentedString(mktType)).append("\n");
    sb.append("    offMktFlag: ").append(toIndentedString(offMktFlag)).append("\n");
    sb.append("    orderNo: ").append(toIndentedString(orderNo)).append("\n");
    sb.append("    orderType: ").append(toIndentedString(orderType)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    remarks: ").append(toIndentedString(remarks)).append("\n");
    sb.append("    securityId: ").append(toIndentedString(securityId)).append("\n");
    sb.append("    segment: ").append(toIndentedString(segment)).append("\n");
    sb.append("    serialNo: ").append(toIndentedString(serialNo)).append("\n");
    sb.append("    settlor: ").append(toIndentedString(settlor)).append("\n");
    sb.append("    triggerPrice: ").append(toIndentedString(triggerPrice)).append("\n");
    sb.append("    txnType: ").append(toIndentedString(txnType)).append("\n");
    sb.append("    uuId: ").append(toIndentedString(uuId)).append("\n");
    sb.append("    validity: ").append(toIndentedString(validity)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
