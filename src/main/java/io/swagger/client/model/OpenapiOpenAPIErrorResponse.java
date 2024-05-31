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
 * OpenapiOpenAPIErrorResponse
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-05-30T23:12:44.291983900+05:30[Asia/Calcutta]")

public class OpenapiOpenAPIErrorResponse {
  @SerializedName("details")
  private Object details = null;

  @SerializedName("error")
  private String error = null;

  public OpenapiOpenAPIErrorResponse details(Object details) {
    this.details = details;
    return this;
  }

   /**
   * Get details
   * @return details
  **/
  @Schema(description = "")
  public Object getDetails() {
    return details;
  }

  public void setDetails(Object details) {
    this.details = details;
  }

  public OpenapiOpenAPIErrorResponse error(String error) {
    this.error = error;
    return this;
  }

   /**
   * Get error
   * @return error
  **/
  @Schema(description = "")
  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenapiOpenAPIErrorResponse openapiOpenAPIErrorResponse = (OpenapiOpenAPIErrorResponse) o;
    return Objects.equals(this.details, openapiOpenAPIErrorResponse.details) &&
        Objects.equals(this.error, openapiOpenAPIErrorResponse.error);
  }

  @Override
  public int hashCode() {
    return Objects.hash(details, error);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenapiOpenAPIErrorResponse {\n");
    
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
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
