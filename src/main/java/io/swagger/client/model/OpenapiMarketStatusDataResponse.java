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
 * OpenapiMarketStatusDataResponse
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-05-30T23:12:44.291983900+05:30[Asia/Calcutta]")

public class OpenapiMarketStatusDataResponse {
  @SerializedName("EMM_EXCH_SEG")
  private String EMM_EXCH_SEG = null;

  @SerializedName("EMM_EXM_EXCH_ID")
  private String EMM_EXM_EXCH_ID = null;

  @SerializedName("EMM_MKT_DESCRIPTION")
  private String EMM_MKT_DESCRIPTION = null;

  @SerializedName("EMM_MKT_TYPE_NO")
  private String EMM_MKT_TYPE_NO = null;

  @SerializedName("EMM_STATUS")
  private String EMM_STATUS = null;

  @SerializedName("MARKET_TYPE")
  private String MARKET_TYPE = null;

  public OpenapiMarketStatusDataResponse EMM_EXCH_SEG(String EMM_EXCH_SEG) {
    this.EMM_EXCH_SEG = EMM_EXCH_SEG;
    return this;
  }

   /**
   * Get EMM_EXCH_SEG
   * @return EMM_EXCH_SEG
  **/
  @Schema(description = "")
  public String getEMMEXCHSEG() {
    return EMM_EXCH_SEG;
  }

  public void setEMMEXCHSEG(String EMM_EXCH_SEG) {
    this.EMM_EXCH_SEG = EMM_EXCH_SEG;
  }

  public OpenapiMarketStatusDataResponse EMM_EXM_EXCH_ID(String EMM_EXM_EXCH_ID) {
    this.EMM_EXM_EXCH_ID = EMM_EXM_EXCH_ID;
    return this;
  }

   /**
   * Get EMM_EXM_EXCH_ID
   * @return EMM_EXM_EXCH_ID
  **/
  @Schema(description = "")
  public String getEMMEXMEXCHID() {
    return EMM_EXM_EXCH_ID;
  }

  public void setEMMEXMEXCHID(String EMM_EXM_EXCH_ID) {
    this.EMM_EXM_EXCH_ID = EMM_EXM_EXCH_ID;
  }

  public OpenapiMarketStatusDataResponse EMM_MKT_DESCRIPTION(String EMM_MKT_DESCRIPTION) {
    this.EMM_MKT_DESCRIPTION = EMM_MKT_DESCRIPTION;
    return this;
  }

   /**
   * Get EMM_MKT_DESCRIPTION
   * @return EMM_MKT_DESCRIPTION
  **/
  @Schema(description = "")
  public String getEMMMKTDESCRIPTION() {
    return EMM_MKT_DESCRIPTION;
  }

  public void setEMMMKTDESCRIPTION(String EMM_MKT_DESCRIPTION) {
    this.EMM_MKT_DESCRIPTION = EMM_MKT_DESCRIPTION;
  }

  public OpenapiMarketStatusDataResponse EMM_MKT_TYPE_NO(String EMM_MKT_TYPE_NO) {
    this.EMM_MKT_TYPE_NO = EMM_MKT_TYPE_NO;
    return this;
  }

   /**
   * Get EMM_MKT_TYPE_NO
   * @return EMM_MKT_TYPE_NO
  **/
  @Schema(description = "")
  public String getEMMMKTTYPENO() {
    return EMM_MKT_TYPE_NO;
  }

  public void setEMMMKTTYPENO(String EMM_MKT_TYPE_NO) {
    this.EMM_MKT_TYPE_NO = EMM_MKT_TYPE_NO;
  }

  public OpenapiMarketStatusDataResponse EMM_STATUS(String EMM_STATUS) {
    this.EMM_STATUS = EMM_STATUS;
    return this;
  }

   /**
   * Get EMM_STATUS
   * @return EMM_STATUS
  **/
  @Schema(description = "")
  public String getEMMSTATUS() {
    return EMM_STATUS;
  }

  public void setEMMSTATUS(String EMM_STATUS) {
    this.EMM_STATUS = EMM_STATUS;
  }

  public OpenapiMarketStatusDataResponse MARKET_TYPE(String MARKET_TYPE) {
    this.MARKET_TYPE = MARKET_TYPE;
    return this;
  }

   /**
   * Get MARKET_TYPE
   * @return MARKET_TYPE
  **/
  @Schema(description = "")
  public String getMARKETTYPE() {
    return MARKET_TYPE;
  }

  public void setMARKETTYPE(String MARKET_TYPE) {
    this.MARKET_TYPE = MARKET_TYPE;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenapiMarketStatusDataResponse openapiMarketStatusDataResponse = (OpenapiMarketStatusDataResponse) o;
    return Objects.equals(this.EMM_EXCH_SEG, openapiMarketStatusDataResponse.EMM_EXCH_SEG) &&
        Objects.equals(this.EMM_EXM_EXCH_ID, openapiMarketStatusDataResponse.EMM_EXM_EXCH_ID) &&
        Objects.equals(this.EMM_MKT_DESCRIPTION, openapiMarketStatusDataResponse.EMM_MKT_DESCRIPTION) &&
        Objects.equals(this.EMM_MKT_TYPE_NO, openapiMarketStatusDataResponse.EMM_MKT_TYPE_NO) &&
        Objects.equals(this.EMM_STATUS, openapiMarketStatusDataResponse.EMM_STATUS) &&
        Objects.equals(this.MARKET_TYPE, openapiMarketStatusDataResponse.MARKET_TYPE);
  }

  @Override
  public int hashCode() {
    return Objects.hash(EMM_EXCH_SEG, EMM_EXM_EXCH_ID, EMM_MKT_DESCRIPTION, EMM_MKT_TYPE_NO, EMM_STATUS, MARKET_TYPE);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenapiMarketStatusDataResponse {\n");
    
    sb.append("    EMM_EXCH_SEG: ").append(toIndentedString(EMM_EXCH_SEG)).append("\n");
    sb.append("    EMM_EXM_EXCH_ID: ").append(toIndentedString(EMM_EXM_EXCH_ID)).append("\n");
    sb.append("    EMM_MKT_DESCRIPTION: ").append(toIndentedString(EMM_MKT_DESCRIPTION)).append("\n");
    sb.append("    EMM_MKT_TYPE_NO: ").append(toIndentedString(EMM_MKT_TYPE_NO)).append("\n");
    sb.append("    EMM_STATUS: ").append(toIndentedString(EMM_STATUS)).append("\n");
    sb.append("    MARKET_TYPE: ").append(toIndentedString(MARKET_TYPE)).append("\n");
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
