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
 * OpenapiOpenapiCallMarData
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-05-30T23:12:44.291983900+05:30[Asia/Calcutta]")

public class OpenapiOpenapiCallMarData {
  @SerializedName("buysell")
  private String buysell = null;

  @SerializedName("exch_id")
  private String exchId = null;

  @SerializedName("price")
  private String price = null;

  @SerializedName("product")
  private String product = null;

  @SerializedName("security_id")
  private String securityId = null;

  @SerializedName("segment")
  private String segment = null;

  @SerializedName("totalremqty")
  private String totalremqty = null;

  @SerializedName("trigger_price")
  private String triggerPrice = null;

  public OpenapiOpenapiCallMarData buysell(String buysell) {
    this.buysell = buysell;
    return this;
  }

   /**
   * Get buysell
   * @return buysell
  **/
  @Schema(description = "")
  public String getBuysell() {
    return buysell;
  }

  public void setBuysell(String buysell) {
    this.buysell = buysell;
  }

  public OpenapiOpenapiCallMarData exchId(String exchId) {
    this.exchId = exchId;
    return this;
  }

   /**
   * Get exchId
   * @return exchId
  **/
  @Schema(description = "")
  public String getExchId() {
    return exchId;
  }

  public void setExchId(String exchId) {
    this.exchId = exchId;
  }

  public OpenapiOpenapiCallMarData price(String price) {
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

  public OpenapiOpenapiCallMarData product(String product) {
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

  public OpenapiOpenapiCallMarData securityId(String securityId) {
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

  public OpenapiOpenapiCallMarData segment(String segment) {
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

  public OpenapiOpenapiCallMarData totalremqty(String totalremqty) {
    this.totalremqty = totalremqty;
    return this;
  }

   /**
   * Get totalremqty
   * @return totalremqty
  **/
  @Schema(description = "")
  public String getTotalremqty() {
    return totalremqty;
  }

  public void setTotalremqty(String totalremqty) {
    this.totalremqty = totalremqty;
  }

  public OpenapiOpenapiCallMarData triggerPrice(String triggerPrice) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenapiOpenapiCallMarData openapiOpenapiCallMarData = (OpenapiOpenapiCallMarData) o;
    return Objects.equals(this.buysell, openapiOpenapiCallMarData.buysell) &&
        Objects.equals(this.exchId, openapiOpenapiCallMarData.exchId) &&
        Objects.equals(this.price, openapiOpenapiCallMarData.price) &&
        Objects.equals(this.product, openapiOpenapiCallMarData.product) &&
        Objects.equals(this.securityId, openapiOpenapiCallMarData.securityId) &&
        Objects.equals(this.segment, openapiOpenapiCallMarData.segment) &&
        Objects.equals(this.totalremqty, openapiOpenapiCallMarData.totalremqty) &&
        Objects.equals(this.triggerPrice, openapiOpenapiCallMarData.triggerPrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(buysell, exchId, price, product, securityId, segment, totalremqty, triggerPrice);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenapiOpenapiCallMarData {\n");
    
    sb.append("    buysell: ").append(toIndentedString(buysell)).append("\n");
    sb.append("    exchId: ").append(toIndentedString(exchId)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
    sb.append("    securityId: ").append(toIndentedString(securityId)).append("\n");
    sb.append("    segment: ").append(toIndentedString(segment)).append("\n");
    sb.append("    totalremqty: ").append(toIndentedString(totalremqty)).append("\n");
    sb.append("    triggerPrice: ").append(toIndentedString(triggerPrice)).append("\n");
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