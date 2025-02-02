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
import java.math.BigDecimal;
/**
 * OpenapiTradeBookData
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-05-30T23:12:44.291983900+05:30[Asia/Calcutta]")

public class OpenapiTradeBookData {
  @SerializedName("algo_id")
  private String algoId = null;

  @SerializedName("display_name")
  private String displayName = null;

  @SerializedName("encash_flag")
  private String encashFlag = null;

  @SerializedName("exch_order_no")
  private String exchOrderNo = null;

  @SerializedName("exch_order_time")
  private String exchOrderTime = null;

  @SerializedName("exch_trade_time")
  private String exchTradeTime = null;

  @SerializedName("exchange")
  private String exchange = null;

  @SerializedName("exchange_inst_name")
  private String exchangeInstName = null;

  @SerializedName("expiry_date")
  private String expiryDate = null;

  @SerializedName("instrument")
  private String instrument = null;

  @SerializedName("isin")
  private String isin = null;

  @SerializedName("last_updated_time")
  private String lastUpdatedTime = null;

  @SerializedName("lot_size")
  private Integer lotSize = null;

  @SerializedName("mkt_pro_flag")
  private String mktProFlag = null;

  @SerializedName("mkt_pro_value")
  private BigDecimal mktProValue = null;

  @SerializedName("mkt_type")
  private String mktType = null;

  @SerializedName("opt_type")
  private String optType = null;

  @SerializedName("order_date_time")
  private String orderDateTime = null;

  @SerializedName("order_no")
  private String orderNo = null;

  @SerializedName("order_type")
  private String orderType = null;

  @SerializedName("pan_no")
  private String panNo = null;

  @SerializedName("participant_type")
  private String participantType = null;

  @SerializedName("placed_by")
  private String placedBy = null;

  @SerializedName("product")
  private String product = null;

  @SerializedName("product_name")
  private String productName = null;

  @SerializedName("quantity")
  private BigDecimal quantity = null;

  @SerializedName("row_no")
  private Integer rowNo = null;

  @SerializedName("security_id")
  private String securityId = null;

  @SerializedName("segment")
  private String segment = null;

  @SerializedName("series")
  private String series = null;

  @SerializedName("settlor")
  private String settlor = null;

  @SerializedName("strike_price")
  private BigDecimal strikePrice = null;

  @SerializedName("symbol")
  private String symbol = null;

  @SerializedName("tick_size")
  private Integer tickSize = null;

  @SerializedName("trade_no")
  private String tradeNo = null;

  @SerializedName("trade_value")
  private BigDecimal tradeValue = null;

  @SerializedName("traded_price")
  private BigDecimal tradedPrice = null;

  @SerializedName("txn_type")
  private String txnType = null;

  public OpenapiTradeBookData algoId(String algoId) {
    this.algoId = algoId;
    return this;
  }

   /**
   * Get algoId
   * @return algoId
  **/
  @Schema(description = "")
  public String getAlgoId() {
    return algoId;
  }

  public void setAlgoId(String algoId) {
    this.algoId = algoId;
  }

  public OpenapiTradeBookData displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * Get displayName
   * @return displayName
  **/
  @Schema(description = "")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public OpenapiTradeBookData encashFlag(String encashFlag) {
    this.encashFlag = encashFlag;
    return this;
  }

   /**
   * Get encashFlag
   * @return encashFlag
  **/
  @Schema(description = "")
  public String getEncashFlag() {
    return encashFlag;
  }

  public void setEncashFlag(String encashFlag) {
    this.encashFlag = encashFlag;
  }

  public OpenapiTradeBookData exchOrderNo(String exchOrderNo) {
    this.exchOrderNo = exchOrderNo;
    return this;
  }

   /**
   * Get exchOrderNo
   * @return exchOrderNo
  **/
  @Schema(description = "")
  public String getExchOrderNo() {
    return exchOrderNo;
  }

  public void setExchOrderNo(String exchOrderNo) {
    this.exchOrderNo = exchOrderNo;
  }

  public OpenapiTradeBookData exchOrderTime(String exchOrderTime) {
    this.exchOrderTime = exchOrderTime;
    return this;
  }

   /**
   * Get exchOrderTime
   * @return exchOrderTime
  **/
  @Schema(description = "")
  public String getExchOrderTime() {
    return exchOrderTime;
  }

  public void setExchOrderTime(String exchOrderTime) {
    this.exchOrderTime = exchOrderTime;
  }

  public OpenapiTradeBookData exchTradeTime(String exchTradeTime) {
    this.exchTradeTime = exchTradeTime;
    return this;
  }

   /**
   * Get exchTradeTime
   * @return exchTradeTime
  **/
  @Schema(description = "")
  public String getExchTradeTime() {
    return exchTradeTime;
  }

  public void setExchTradeTime(String exchTradeTime) {
    this.exchTradeTime = exchTradeTime;
  }

  public OpenapiTradeBookData exchange(String exchange) {
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

  public OpenapiTradeBookData exchangeInstName(String exchangeInstName) {
    this.exchangeInstName = exchangeInstName;
    return this;
  }

   /**
   * Get exchangeInstName
   * @return exchangeInstName
  **/
  @Schema(description = "")
  public String getExchangeInstName() {
    return exchangeInstName;
  }

  public void setExchangeInstName(String exchangeInstName) {
    this.exchangeInstName = exchangeInstName;
  }

  public OpenapiTradeBookData expiryDate(String expiryDate) {
    this.expiryDate = expiryDate;
    return this;
  }

   /**
   * Get expiryDate
   * @return expiryDate
  **/
  @Schema(description = "")
  public String getExpiryDate() {
    return expiryDate;
  }

  public void setExpiryDate(String expiryDate) {
    this.expiryDate = expiryDate;
  }

  public OpenapiTradeBookData instrument(String instrument) {
    this.instrument = instrument;
    return this;
  }

   /**
   * Get instrument
   * @return instrument
  **/
  @Schema(description = "")
  public String getInstrument() {
    return instrument;
  }

  public void setInstrument(String instrument) {
    this.instrument = instrument;
  }

  public OpenapiTradeBookData isin(String isin) {
    this.isin = isin;
    return this;
  }

   /**
   * Get isin
   * @return isin
  **/
  @Schema(description = "")
  public String getIsin() {
    return isin;
  }

  public void setIsin(String isin) {
    this.isin = isin;
  }

  public OpenapiTradeBookData lastUpdatedTime(String lastUpdatedTime) {
    this.lastUpdatedTime = lastUpdatedTime;
    return this;
  }

   /**
   * Get lastUpdatedTime
   * @return lastUpdatedTime
  **/
  @Schema(description = "")
  public String getLastUpdatedTime() {
    return lastUpdatedTime;
  }

  public void setLastUpdatedTime(String lastUpdatedTime) {
    this.lastUpdatedTime = lastUpdatedTime;
  }

  public OpenapiTradeBookData lotSize(Integer lotSize) {
    this.lotSize = lotSize;
    return this;
  }

   /**
   * Get lotSize
   * @return lotSize
  **/
  @Schema(description = "")
  public Integer getLotSize() {
    return lotSize;
  }

  public void setLotSize(Integer lotSize) {
    this.lotSize = lotSize;
  }

  public OpenapiTradeBookData mktProFlag(String mktProFlag) {
    this.mktProFlag = mktProFlag;
    return this;
  }

   /**
   * Get mktProFlag
   * @return mktProFlag
  **/
  @Schema(description = "")
  public String getMktProFlag() {
    return mktProFlag;
  }

  public void setMktProFlag(String mktProFlag) {
    this.mktProFlag = mktProFlag;
  }

  public OpenapiTradeBookData mktProValue(BigDecimal mktProValue) {
    this.mktProValue = mktProValue;
    return this;
  }

   /**
   * Get mktProValue
   * @return mktProValue
  **/
  @Schema(description = "")
  public BigDecimal getMktProValue() {
    return mktProValue;
  }

  public void setMktProValue(BigDecimal mktProValue) {
    this.mktProValue = mktProValue;
  }

  public OpenapiTradeBookData mktType(String mktType) {
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

  public OpenapiTradeBookData optType(String optType) {
    this.optType = optType;
    return this;
  }

   /**
   * Get optType
   * @return optType
  **/
  @Schema(description = "")
  public String getOptType() {
    return optType;
  }

  public void setOptType(String optType) {
    this.optType = optType;
  }

  public OpenapiTradeBookData orderDateTime(String orderDateTime) {
    this.orderDateTime = orderDateTime;
    return this;
  }

   /**
   * Get orderDateTime
   * @return orderDateTime
  **/
  @Schema(description = "")
  public String getOrderDateTime() {
    return orderDateTime;
  }

  public void setOrderDateTime(String orderDateTime) {
    this.orderDateTime = orderDateTime;
  }

  public OpenapiTradeBookData orderNo(String orderNo) {
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

  public OpenapiTradeBookData orderType(String orderType) {
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

  public OpenapiTradeBookData panNo(String panNo) {
    this.panNo = panNo;
    return this;
  }

   /**
   * Get panNo
   * @return panNo
  **/
  @Schema(description = "")
  public String getPanNo() {
    return panNo;
  }

  public void setPanNo(String panNo) {
    this.panNo = panNo;
  }

  public OpenapiTradeBookData participantType(String participantType) {
    this.participantType = participantType;
    return this;
  }

   /**
   * Get participantType
   * @return participantType
  **/
  @Schema(description = "")
  public String getParticipantType() {
    return participantType;
  }

  public void setParticipantType(String participantType) {
    this.participantType = participantType;
  }

  public OpenapiTradeBookData placedBy(String placedBy) {
    this.placedBy = placedBy;
    return this;
  }

   /**
   * Get placedBy
   * @return placedBy
  **/
  @Schema(description = "")
  public String getPlacedBy() {
    return placedBy;
  }

  public void setPlacedBy(String placedBy) {
    this.placedBy = placedBy;
  }

  public OpenapiTradeBookData product(String product) {
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

  public OpenapiTradeBookData productName(String productName) {
    this.productName = productName;
    return this;
  }

   /**
   * Get productName
   * @return productName
  **/
  @Schema(description = "")
  public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }

  public OpenapiTradeBookData quantity(BigDecimal quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * Get quantity
   * @return quantity
  **/
  @Schema(description = "")
  public BigDecimal getQuantity() {
    return quantity;
  }

  public void setQuantity(BigDecimal quantity) {
    this.quantity = quantity;
  }

  public OpenapiTradeBookData rowNo(Integer rowNo) {
    this.rowNo = rowNo;
    return this;
  }

   /**
   * Get rowNo
   * @return rowNo
  **/
  @Schema(description = "")
  public Integer getRowNo() {
    return rowNo;
  }

  public void setRowNo(Integer rowNo) {
    this.rowNo = rowNo;
  }

  public OpenapiTradeBookData securityId(String securityId) {
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

  public OpenapiTradeBookData segment(String segment) {
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

  public OpenapiTradeBookData series(String series) {
    this.series = series;
    return this;
  }

   /**
   * Get series
   * @return series
  **/
  @Schema(description = "")
  public String getSeries() {
    return series;
  }

  public void setSeries(String series) {
    this.series = series;
  }

  public OpenapiTradeBookData settlor(String settlor) {
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

  public OpenapiTradeBookData strikePrice(BigDecimal strikePrice) {
    this.strikePrice = strikePrice;
    return this;
  }

   /**
   * Get strikePrice
   * @return strikePrice
  **/
  @Schema(description = "")
  public BigDecimal getStrikePrice() {
    return strikePrice;
  }

  public void setStrikePrice(BigDecimal strikePrice) {
    this.strikePrice = strikePrice;
  }

  public OpenapiTradeBookData symbol(String symbol) {
    this.symbol = symbol;
    return this;
  }

   /**
   * Get symbol
   * @return symbol
  **/
  @Schema(description = "")
  public String getSymbol() {
    return symbol;
  }

  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }

  public OpenapiTradeBookData tickSize(Integer tickSize) {
    this.tickSize = tickSize;
    return this;
  }

   /**
   * Get tickSize
   * @return tickSize
  **/
  @Schema(description = "")
  public Integer getTickSize() {
    return tickSize;
  }

  public void setTickSize(Integer tickSize) {
    this.tickSize = tickSize;
  }

  public OpenapiTradeBookData tradeNo(String tradeNo) {
    this.tradeNo = tradeNo;
    return this;
  }

   /**
   * Get tradeNo
   * @return tradeNo
  **/
  @Schema(description = "")
  public String getTradeNo() {
    return tradeNo;
  }

  public void setTradeNo(String tradeNo) {
    this.tradeNo = tradeNo;
  }

  public OpenapiTradeBookData tradeValue(BigDecimal tradeValue) {
    this.tradeValue = tradeValue;
    return this;
  }

   /**
   * Get tradeValue
   * @return tradeValue
  **/
  @Schema(description = "")
  public BigDecimal getTradeValue() {
    return tradeValue;
  }

  public void setTradeValue(BigDecimal tradeValue) {
    this.tradeValue = tradeValue;
  }

  public OpenapiTradeBookData tradedPrice(BigDecimal tradedPrice) {
    this.tradedPrice = tradedPrice;
    return this;
  }

   /**
   * Get tradedPrice
   * @return tradedPrice
  **/
  @Schema(description = "")
  public BigDecimal getTradedPrice() {
    return tradedPrice;
  }

  public void setTradedPrice(BigDecimal tradedPrice) {
    this.tradedPrice = tradedPrice;
  }

  public OpenapiTradeBookData txnType(String txnType) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenapiTradeBookData openapiTradeBookData = (OpenapiTradeBookData) o;
    return Objects.equals(this.algoId, openapiTradeBookData.algoId) &&
        Objects.equals(this.displayName, openapiTradeBookData.displayName) &&
        Objects.equals(this.encashFlag, openapiTradeBookData.encashFlag) &&
        Objects.equals(this.exchOrderNo, openapiTradeBookData.exchOrderNo) &&
        Objects.equals(this.exchOrderTime, openapiTradeBookData.exchOrderTime) &&
        Objects.equals(this.exchTradeTime, openapiTradeBookData.exchTradeTime) &&
        Objects.equals(this.exchange, openapiTradeBookData.exchange) &&
        Objects.equals(this.exchangeInstName, openapiTradeBookData.exchangeInstName) &&
        Objects.equals(this.expiryDate, openapiTradeBookData.expiryDate) &&
        Objects.equals(this.instrument, openapiTradeBookData.instrument) &&
        Objects.equals(this.isin, openapiTradeBookData.isin) &&
        Objects.equals(this.lastUpdatedTime, openapiTradeBookData.lastUpdatedTime) &&
        Objects.equals(this.lotSize, openapiTradeBookData.lotSize) &&
        Objects.equals(this.mktProFlag, openapiTradeBookData.mktProFlag) &&
        Objects.equals(this.mktProValue, openapiTradeBookData.mktProValue) &&
        Objects.equals(this.mktType, openapiTradeBookData.mktType) &&
        Objects.equals(this.optType, openapiTradeBookData.optType) &&
        Objects.equals(this.orderDateTime, openapiTradeBookData.orderDateTime) &&
        Objects.equals(this.orderNo, openapiTradeBookData.orderNo) &&
        Objects.equals(this.orderType, openapiTradeBookData.orderType) &&
        Objects.equals(this.panNo, openapiTradeBookData.panNo) &&
        Objects.equals(this.participantType, openapiTradeBookData.participantType) &&
        Objects.equals(this.placedBy, openapiTradeBookData.placedBy) &&
        Objects.equals(this.product, openapiTradeBookData.product) &&
        Objects.equals(this.productName, openapiTradeBookData.productName) &&
        Objects.equals(this.quantity, openapiTradeBookData.quantity) &&
        Objects.equals(this.rowNo, openapiTradeBookData.rowNo) &&
        Objects.equals(this.securityId, openapiTradeBookData.securityId) &&
        Objects.equals(this.segment, openapiTradeBookData.segment) &&
        Objects.equals(this.series, openapiTradeBookData.series) &&
        Objects.equals(this.settlor, openapiTradeBookData.settlor) &&
        Objects.equals(this.strikePrice, openapiTradeBookData.strikePrice) &&
        Objects.equals(this.symbol, openapiTradeBookData.symbol) &&
        Objects.equals(this.tickSize, openapiTradeBookData.tickSize) &&
        Objects.equals(this.tradeNo, openapiTradeBookData.tradeNo) &&
        Objects.equals(this.tradeValue, openapiTradeBookData.tradeValue) &&
        Objects.equals(this.tradedPrice, openapiTradeBookData.tradedPrice) &&
        Objects.equals(this.txnType, openapiTradeBookData.txnType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(algoId, displayName, encashFlag, exchOrderNo, exchOrderTime, exchTradeTime, exchange, exchangeInstName, expiryDate, instrument, isin, lastUpdatedTime, lotSize, mktProFlag, mktProValue, mktType, optType, orderDateTime, orderNo, orderType, panNo, participantType, placedBy, product, productName, quantity, rowNo, securityId, segment, series, settlor, strikePrice, symbol, tickSize, tradeNo, tradeValue, tradedPrice, txnType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenapiTradeBookData {\n");
    
    sb.append("    algoId: ").append(toIndentedString(algoId)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    encashFlag: ").append(toIndentedString(encashFlag)).append("\n");
    sb.append("    exchOrderNo: ").append(toIndentedString(exchOrderNo)).append("\n");
    sb.append("    exchOrderTime: ").append(toIndentedString(exchOrderTime)).append("\n");
    sb.append("    exchTradeTime: ").append(toIndentedString(exchTradeTime)).append("\n");
    sb.append("    exchange: ").append(toIndentedString(exchange)).append("\n");
    sb.append("    exchangeInstName: ").append(toIndentedString(exchangeInstName)).append("\n");
    sb.append("    expiryDate: ").append(toIndentedString(expiryDate)).append("\n");
    sb.append("    instrument: ").append(toIndentedString(instrument)).append("\n");
    sb.append("    isin: ").append(toIndentedString(isin)).append("\n");
    sb.append("    lastUpdatedTime: ").append(toIndentedString(lastUpdatedTime)).append("\n");
    sb.append("    lotSize: ").append(toIndentedString(lotSize)).append("\n");
    sb.append("    mktProFlag: ").append(toIndentedString(mktProFlag)).append("\n");
    sb.append("    mktProValue: ").append(toIndentedString(mktProValue)).append("\n");
    sb.append("    mktType: ").append(toIndentedString(mktType)).append("\n");
    sb.append("    optType: ").append(toIndentedString(optType)).append("\n");
    sb.append("    orderDateTime: ").append(toIndentedString(orderDateTime)).append("\n");
    sb.append("    orderNo: ").append(toIndentedString(orderNo)).append("\n");
    sb.append("    orderType: ").append(toIndentedString(orderType)).append("\n");
    sb.append("    panNo: ").append(toIndentedString(panNo)).append("\n");
    sb.append("    participantType: ").append(toIndentedString(participantType)).append("\n");
    sb.append("    placedBy: ").append(toIndentedString(placedBy)).append("\n");
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
    sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    rowNo: ").append(toIndentedString(rowNo)).append("\n");
    sb.append("    securityId: ").append(toIndentedString(securityId)).append("\n");
    sb.append("    segment: ").append(toIndentedString(segment)).append("\n");
    sb.append("    series: ").append(toIndentedString(series)).append("\n");
    sb.append("    settlor: ").append(toIndentedString(settlor)).append("\n");
    sb.append("    strikePrice: ").append(toIndentedString(strikePrice)).append("\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    tickSize: ").append(toIndentedString(tickSize)).append("\n");
    sb.append("    tradeNo: ").append(toIndentedString(tradeNo)).append("\n");
    sb.append("    tradeValue: ").append(toIndentedString(tradeValue)).append("\n");
    sb.append("    tradedPrice: ").append(toIndentedString(tradedPrice)).append("\n");
    sb.append("    txnType: ").append(toIndentedString(txnType)).append("\n");
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
