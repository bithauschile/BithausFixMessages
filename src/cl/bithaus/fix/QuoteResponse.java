/*
 * Copyright (c) BitHaus Software Factory & Boutique (Chile)
 * All rights reserved. www.bithaus.cl.
 * 
 * All rights to this product are owned by BitHaus Chile and may only by used 
 * under the terms of its associated license document. 
 * You may NOT copy, modify, sublicense or distribute this source file or 
 * portions of it unless previously authorized by writing by BitHaus Chile.
 * In any event, this notice must always be included verbatim with this file.
 * 
 */

package cl.bithaus.fix;

import cl.bithaus.fix.msg.base.FixGroup;
import java.util.Date;
import java.math.BigDecimal;
import cl.bithaus.fix.components.Parties;
import cl.bithaus.fix.components.Instrument;
import cl.bithaus.fix.components.FinancingDetails;
import cl.bithaus.fix.components.OrderQtyData;
import cl.bithaus.fix.components.Stipulations;
import cl.bithaus.fix.components.SpreadOrBenchmarkCurveData;
import cl.bithaus.fix.components.YieldData;

/**
 * Fix Components Class
 * Generated for FIX 4.4
 * @author Bithaus Fix Message Generator
 */
public class QuoteResponse extends FixBaseMessage {

    private String quoteRespID;           
    private String quoteID;           
    private Integer quoteRespType;           
    private String clOrdID;           
    private String orderCapacity;           
    private String iOIid;           
    private Integer quoteType;           
    private String tradingSessionID;           
    private String tradingSessionSubID;           
    private String side;           
    private String settlType;           
    private String settlDate;           
    private String settlDate2;           
    private BigDecimal orderQty2;           
    private String currency;           
    private String account;           
    private Integer acctIDSource;           
    private Integer accountType;           
    private BigDecimal bidPx;           
    private BigDecimal offerPx;           
    private BigDecimal mktBidPx;           
    private BigDecimal mktOfferPx;           
    private BigDecimal minBidSize;           
    private BigDecimal bidSize;           
    private BigDecimal minOfferSize;           
    private BigDecimal offerSize;           
    private Date validUntilTime;           
    private BigDecimal bidSpotRate;           
    private BigDecimal offerSpotRate;           
    private BigDecimal bidForwardPoints;           
    private BigDecimal offerForwardPoints;           
    private BigDecimal midPx;           
    private BigDecimal bidYield;           
    private BigDecimal midYield;           
    private BigDecimal offerYield;           
    private Date transactTime;           
    private String ordType;           
    private BigDecimal bidForwardPoints2;           
    private BigDecimal offerForwardPoints2;           
    private BigDecimal settlCurrBidFxRate;           
    private BigDecimal settlCurrOfferFxRate;           
    private String settlCurrFxRateCalc;           
    private BigDecimal commission;           
    private String commType;           
    private Integer custOrderCapacity;           
    private String exDestination;           
    private String text;           
    private Integer encodedTextLen;           
    private String encodedText;           
    private BigDecimal price;           
    private Integer priceType;           
    private Parties parties;           
    private Instrument instrument;           
    private FinancingDetails financingDetails;           
    private OrderQtyData orderQtyData;           
    private Stipulations stipulations;           
    private SpreadOrBenchmarkCurveData spreadOrBenchmarkCurveData;           
    private YieldData yieldData;           
    private NoQuoteQualifiers noQuoteQualifiers;           
    private NoUnderlyings noUnderlyings;           
    private NoLegs noLegs;           

    public QuoteResponse() { 
        super("AJ", MsgCategory.APP);
    }

    public String getQuoteRespID() {
        return this.quoteRespID;
    }           

    public void setQuoteRespID(String quoteRespID) {
        this.quoteRespID = quoteRespID;
    }
    public String getQuoteID() {
        return this.quoteID;
    }           

    public void setQuoteID(String quoteID) {
        this.quoteID = quoteID;
    }
    public Integer getQuoteRespType() {
        return this.quoteRespType;
    }           

    public void setQuoteRespType(Integer quoteRespType) {
        this.quoteRespType = quoteRespType;
    }
    public String getClOrdID() {
        return this.clOrdID;
    }           

    public void setClOrdID(String clOrdID) {
        this.clOrdID = clOrdID;
    }
    public String getOrderCapacity() {
        return this.orderCapacity;
    }           

    public void setOrderCapacity(String orderCapacity) {
        this.orderCapacity = orderCapacity;
    }
    public String getIOIid() {
        return this.iOIid;
    }           

    public void setIOIid(String iOIid) {
        this.iOIid = iOIid;
    }
    public Integer getQuoteType() {
        return this.quoteType;
    }           

    public void setQuoteType(Integer quoteType) {
        this.quoteType = quoteType;
    }
    public String getTradingSessionID() {
        return this.tradingSessionID;
    }           

    public void setTradingSessionID(String tradingSessionID) {
        this.tradingSessionID = tradingSessionID;
    }
    public String getTradingSessionSubID() {
        return this.tradingSessionSubID;
    }           

    public void setTradingSessionSubID(String tradingSessionSubID) {
        this.tradingSessionSubID = tradingSessionSubID;
    }
    public String getSide() {
        return this.side;
    }           

    public void setSide(String side) {
        this.side = side;
    }
    public String getSettlType() {
        return this.settlType;
    }           

    public void setSettlType(String settlType) {
        this.settlType = settlType;
    }
    public String getSettlDate() {
        return this.settlDate;
    }           

    public void setSettlDate(String settlDate) {
        this.settlDate = settlDate;
    }
    public String getSettlDate2() {
        return this.settlDate2;
    }           

    public void setSettlDate2(String settlDate2) {
        this.settlDate2 = settlDate2;
    }
    public BigDecimal getOrderQty2() {
        return this.orderQty2;
    }           

    public void setOrderQty2(BigDecimal orderQty2) {
        this.orderQty2 = orderQty2;
    }
    public String getCurrency() {
        return this.currency;
    }           

    public void setCurrency(String currency) {
        this.currency = currency;
    }
    public String getAccount() {
        return this.account;
    }           

    public void setAccount(String account) {
        this.account = account;
    }
    public Integer getAcctIDSource() {
        return this.acctIDSource;
    }           

    public void setAcctIDSource(Integer acctIDSource) {
        this.acctIDSource = acctIDSource;
    }
    public Integer getAccountType() {
        return this.accountType;
    }           

    public void setAccountType(Integer accountType) {
        this.accountType = accountType;
    }
    public BigDecimal getBidPx() {
        return this.bidPx;
    }           

    public void setBidPx(BigDecimal bidPx) {
        this.bidPx = bidPx;
    }
    public BigDecimal getOfferPx() {
        return this.offerPx;
    }           

    public void setOfferPx(BigDecimal offerPx) {
        this.offerPx = offerPx;
    }
    public BigDecimal getMktBidPx() {
        return this.mktBidPx;
    }           

    public void setMktBidPx(BigDecimal mktBidPx) {
        this.mktBidPx = mktBidPx;
    }
    public BigDecimal getMktOfferPx() {
        return this.mktOfferPx;
    }           

    public void setMktOfferPx(BigDecimal mktOfferPx) {
        this.mktOfferPx = mktOfferPx;
    }
    public BigDecimal getMinBidSize() {
        return this.minBidSize;
    }           

    public void setMinBidSize(BigDecimal minBidSize) {
        this.minBidSize = minBidSize;
    }
    public BigDecimal getBidSize() {
        return this.bidSize;
    }           

    public void setBidSize(BigDecimal bidSize) {
        this.bidSize = bidSize;
    }
    public BigDecimal getMinOfferSize() {
        return this.minOfferSize;
    }           

    public void setMinOfferSize(BigDecimal minOfferSize) {
        this.minOfferSize = minOfferSize;
    }
    public BigDecimal getOfferSize() {
        return this.offerSize;
    }           

    public void setOfferSize(BigDecimal offerSize) {
        this.offerSize = offerSize;
    }
    public Date getValidUntilTime() {
        return this.validUntilTime;
    }           

    public void setValidUntilTime(Date validUntilTime) {
        this.validUntilTime = validUntilTime;
    }
    public BigDecimal getBidSpotRate() {
        return this.bidSpotRate;
    }           

    public void setBidSpotRate(BigDecimal bidSpotRate) {
        this.bidSpotRate = bidSpotRate;
    }
    public BigDecimal getOfferSpotRate() {
        return this.offerSpotRate;
    }           

    public void setOfferSpotRate(BigDecimal offerSpotRate) {
        this.offerSpotRate = offerSpotRate;
    }
    public BigDecimal getBidForwardPoints() {
        return this.bidForwardPoints;
    }           

    public void setBidForwardPoints(BigDecimal bidForwardPoints) {
        this.bidForwardPoints = bidForwardPoints;
    }
    public BigDecimal getOfferForwardPoints() {
        return this.offerForwardPoints;
    }           

    public void setOfferForwardPoints(BigDecimal offerForwardPoints) {
        this.offerForwardPoints = offerForwardPoints;
    }
    public BigDecimal getMidPx() {
        return this.midPx;
    }           

    public void setMidPx(BigDecimal midPx) {
        this.midPx = midPx;
    }
    public BigDecimal getBidYield() {
        return this.bidYield;
    }           

    public void setBidYield(BigDecimal bidYield) {
        this.bidYield = bidYield;
    }
    public BigDecimal getMidYield() {
        return this.midYield;
    }           

    public void setMidYield(BigDecimal midYield) {
        this.midYield = midYield;
    }
    public BigDecimal getOfferYield() {
        return this.offerYield;
    }           

    public void setOfferYield(BigDecimal offerYield) {
        this.offerYield = offerYield;
    }
    public Date getTransactTime() {
        return this.transactTime;
    }           

    public void setTransactTime(Date transactTime) {
        this.transactTime = transactTime;
    }
    public String getOrdType() {
        return this.ordType;
    }           

    public void setOrdType(String ordType) {
        this.ordType = ordType;
    }
    public BigDecimal getBidForwardPoints2() {
        return this.bidForwardPoints2;
    }           

    public void setBidForwardPoints2(BigDecimal bidForwardPoints2) {
        this.bidForwardPoints2 = bidForwardPoints2;
    }
    public BigDecimal getOfferForwardPoints2() {
        return this.offerForwardPoints2;
    }           

    public void setOfferForwardPoints2(BigDecimal offerForwardPoints2) {
        this.offerForwardPoints2 = offerForwardPoints2;
    }
    public BigDecimal getSettlCurrBidFxRate() {
        return this.settlCurrBidFxRate;
    }           

    public void setSettlCurrBidFxRate(BigDecimal settlCurrBidFxRate) {
        this.settlCurrBidFxRate = settlCurrBidFxRate;
    }
    public BigDecimal getSettlCurrOfferFxRate() {
        return this.settlCurrOfferFxRate;
    }           

    public void setSettlCurrOfferFxRate(BigDecimal settlCurrOfferFxRate) {
        this.settlCurrOfferFxRate = settlCurrOfferFxRate;
    }
    public String getSettlCurrFxRateCalc() {
        return this.settlCurrFxRateCalc;
    }           

    public void setSettlCurrFxRateCalc(String settlCurrFxRateCalc) {
        this.settlCurrFxRateCalc = settlCurrFxRateCalc;
    }
    public BigDecimal getCommission() {
        return this.commission;
    }           

    public void setCommission(BigDecimal commission) {
        this.commission = commission;
    }
    public String getCommType() {
        return this.commType;
    }           

    public void setCommType(String commType) {
        this.commType = commType;
    }
    public Integer getCustOrderCapacity() {
        return this.custOrderCapacity;
    }           

    public void setCustOrderCapacity(Integer custOrderCapacity) {
        this.custOrderCapacity = custOrderCapacity;
    }
    public String getExDestination() {
        return this.exDestination;
    }           

    public void setExDestination(String exDestination) {
        this.exDestination = exDestination;
    }
    public String getText() {
        return this.text;
    }           

    public void setText(String text) {
        this.text = text;
    }
    public Integer getEncodedTextLen() {
        return this.encodedTextLen;
    }           

    public void setEncodedTextLen(Integer encodedTextLen) {
        this.encodedTextLen = encodedTextLen;
    }
    public String getEncodedText() {
        return this.encodedText;
    }           

    public void setEncodedText(String encodedText) {
        this.encodedText = encodedText;
    }
    public BigDecimal getPrice() {
        return this.price;
    }           

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
    public Integer getPriceType() {
        return this.priceType;
    }           

    public void setPriceType(Integer priceType) {
        this.priceType = priceType;
    }

    
    public Parties getParties() {
        return this.parties;
    }           

    public void setParties(Parties parties) {
        this.parties = parties;
    }
    
    public Instrument getInstrument() {
        return this.instrument;
    }           

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }
    
    public FinancingDetails getFinancingDetails() {
        return this.financingDetails;
    }           

    public void setFinancingDetails(FinancingDetails financingDetails) {
        this.financingDetails = financingDetails;
    }
    
    public OrderQtyData getOrderQtyData() {
        return this.orderQtyData;
    }           

    public void setOrderQtyData(OrderQtyData orderQtyData) {
        this.orderQtyData = orderQtyData;
    }
    
    public Stipulations getStipulations() {
        return this.stipulations;
    }           

    public void setStipulations(Stipulations stipulations) {
        this.stipulations = stipulations;
    }
    
    public SpreadOrBenchmarkCurveData getSpreadOrBenchmarkCurveData() {
        return this.spreadOrBenchmarkCurveData;
    }           

    public void setSpreadOrBenchmarkCurveData(SpreadOrBenchmarkCurveData spreadOrBenchmarkCurveData) {
        this.spreadOrBenchmarkCurveData = spreadOrBenchmarkCurveData;
    }
    
    public YieldData getYieldData() {
        return this.yieldData;
    }           

    public void setYieldData(YieldData yieldData) {
        this.yieldData = yieldData;
    }

    public QuoteResponse.NoQuoteQualifiers getNoQuoteQualifiers() {
        return this.noQuoteQualifiers;
    }

    public void setNoQuoteQualifiers(QuoteResponse.NoQuoteQualifiers noQuoteQualifiers) {
        this.noQuoteQualifiers = noQuoteQualifiers;
    }
    public QuoteResponse.NoUnderlyings getNoUnderlyings() {
        return this.noUnderlyings;
    }

    public void setNoUnderlyings(QuoteResponse.NoUnderlyings noUnderlyings) {
        this.noUnderlyings = noUnderlyings;
    }
    public QuoteResponse.NoLegs getNoLegs() {
        return this.noLegs;
    }

    public void setNoLegs(QuoteResponse.NoLegs noLegs) {
        this.noLegs = noLegs;
    }
        

    public static class NoQuoteQualifiers extends FixGroup<QuoteResponse.NoQuoteQualifiers.NoQuoteQualifiersEntry> {

        @Override
        public int getField() {
            return 735;
        }

        public static class NoQuoteQualifiersEntry {

            private String quoteQualifier;

            public String getQuoteQualifier() {
                return this.quoteQualifier;
            }           

            public void setQuoteQualifier(String quoteQualifier) {
                this.quoteQualifier = quoteQualifier;
            }

        }
        
    }


    public static class NoUnderlyings extends FixGroup<QuoteResponse.NoUnderlyings.NoUnderlyingsEntry> {

        @Override
        public int getField() {
            return 711;
        }

        public static class NoUnderlyingsEntry {



        }
        
    }


    public static class NoLegs extends FixGroup<QuoteResponse.NoLegs.NoLegsEntry> {

        @Override
        public int getField() {
            return 555;
        }

        public static class NoLegsEntry {

            private BigDecimal legQty;
            private Integer legSwapType;
            private String legSettlType;
            private String legSettlDate;
            private Integer legPriceType;
            private BigDecimal legBidPx;
            private BigDecimal legOfferPx;

            public BigDecimal getLegQty() {
                return this.legQty;
            }           

            public void setLegQty(BigDecimal legQty) {
                this.legQty = legQty;
            }
            public Integer getLegSwapType() {
                return this.legSwapType;
            }           

            public void setLegSwapType(Integer legSwapType) {
                this.legSwapType = legSwapType;
            }
            public String getLegSettlType() {
                return this.legSettlType;
            }           

            public void setLegSettlType(String legSettlType) {
                this.legSettlType = legSettlType;
            }
            public String getLegSettlDate() {
                return this.legSettlDate;
            }           

            public void setLegSettlDate(String legSettlDate) {
                this.legSettlDate = legSettlDate;
            }
            public Integer getLegPriceType() {
                return this.legPriceType;
            }           

            public void setLegPriceType(Integer legPriceType) {
                this.legPriceType = legPriceType;
            }
            public BigDecimal getLegBidPx() {
                return this.legBidPx;
            }           

            public void setLegBidPx(BigDecimal legBidPx) {
                this.legBidPx = legBidPx;
            }
            public BigDecimal getLegOfferPx() {
                return this.legOfferPx;
            }           

            public void setLegOfferPx(BigDecimal legOfferPx) {
                this.legOfferPx = legOfferPx;
            }

        }
        
    }

}

