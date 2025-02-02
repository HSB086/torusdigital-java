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
import io.swagger.client.model.OpenapiOrderBookData;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * OpenapiOpenapiOrderBookResponse
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-05-30T23:12:44.291983900+05:30[Asia/Calcutta]")

public class OpenapiOpenapiOrderBookResponse {
  @SerializedName("data")
  private List<OpenapiOrderBookData> data = null;

  @SerializedName("message")
  private String message = null;

  @SerializedName("status")
  private String status = null;

  public OpenapiOpenapiOrderBookResponse data(List<OpenapiOrderBookData> data) {
    this.data = data;
    return this;
  }

  public OpenapiOpenapiOrderBookResponse addDataItem(OpenapiOrderBookData dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<OpenapiOrderBookData>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @Schema(description = "")
  public List<OpenapiOrderBookData> getData() {
    return data;
  }

  public void setData(List<OpenapiOrderBookData> data) {
    this.data = data;
  }

  public OpenapiOpenapiOrderBookResponse message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @Schema(description = "")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public OpenapiOpenapiOrderBookResponse status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(description = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenapiOpenapiOrderBookResponse openapiOpenapiOrderBookResponse = (OpenapiOpenapiOrderBookResponse) o;
    return Objects.equals(this.data, openapiOpenapiOrderBookResponse.data) &&
        Objects.equals(this.message, openapiOpenapiOrderBookResponse.message) &&
        Objects.equals(this.status, openapiOpenapiOrderBookResponse.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, message, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenapiOpenapiOrderBookResponse {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
