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
import cl.bithaus.fix.components.Instrument;
import cl.bithaus.fix.components.FinancingDetails;
import cl.bithaus.fix.components.OrderQtyData;
import cl.bithaus.fix.components.YieldData;
import cl.bithaus.fix.components.SpreadOrBenchmarkCurveData;
import cl.bithaus.fix.components.PositionAmountData;
import cl.bithaus.fix.components.TrdRegTimestamps;

/**
 * Fix Components Class
 * Generated for FIX 4.4
 * @author Bithaus Fix Message Generator
 */
public class TradeCaptureReport extends FixBaseMessage {

    private String tradeReportID;           
    private Integer tradeReportTransType;           
    private Integer tradeReportType;           
    private String tradeRequestID;           
    private Integer trdType;           
    private Integer trdSubType;           
    private Integer secondaryTrdType;           
    private String transferReason;           
    private String execType;           
    private Integer totNumTradeReports;           
    private Boolean lastRptRequested;           
    private Boolean unsolicitedIndicator;           
    private String subscriptionRequestType;           
    private String tradeReportRefID;           
    private String secondaryTradeReportRefID;           
    private String secondaryTradeReportID;           
    private String tradeLinkID;           
    private String trdMatchID;           
    private String execID;           
    private String ordStatus;           
    private String secondaryExecID;           
    private Integer execRestatementReason;           
    private Boolean previouslyReported;           
    private Integer priceType;           
    private Integer qtyType;           
    private String underlyingTradingSessionID;           
    private String underlyingTradingSessionSubID;           
    private BigDecimal lastQty;           
    private BigDecimal lastPx;           
    private BigDecimal lastParPx;           
    private BigDecimal lastSpotRate;           
    private BigDecimal lastForwardPoints;           
    private String lastMkt;           
    private String tradeDate;           
    private String clearingBusinessDate;           
    private BigDecimal avgPx;           
    private Integer avgPxIndicator;           
    private String multiLegReportingType;           
    private String tradeLegRefID;           
    private Date transactTime;           
    private String settlType;           
    private String settlDate;           
    private String matchStatus;           
    private String matchType;           
    private Boolean copyMsgIndicator;           
    private Boolean publishTrdIndicator;           
    private Integer shortSaleReason;           
    private Instrument instrument;           
    private FinancingDetails financingDetails;           
    private OrderQtyData orderQtyData;           
    private YieldData yieldData;           
    private SpreadOrBenchmarkCurveData spreadOrBenchmarkCurveData;           
    private PositionAmountData positionAmountData;           
    private TrdRegTimestamps trdRegTimestamps;           
    private NoUnderlyings noUnderlyings;           
    private NoLegs noLegs;           
    private NoSides noSides;           

    public TradeCaptureReport() { 
        super("AE", MsgCategory.APP);
    }

    public String getTradeReportID() {
        return this.tradeReportID;
    }           

    public void setTradeReportID(String tradeReportID) {
        this.tradeReportID = tradeReportID;
    }
    public Integer getTradeReportTransType() {
        return this.tradeReportTransType;
    }           

    public void setTradeReportTransType(Integer tradeReportTransType) {
        this.tradeReportTransType = tradeReportTransType;
    }
    public Integer getTradeReportType() {
        return this.tradeReportType;
    }           

    public void setTradeReportType(Integer tradeReportType) {
        this.tradeReportType = tradeReportType;
    }
    public String getTradeRequestID() {
        return this.tradeRequestID;
    }           

    public void setTradeRequestID(String tradeRequestID) {
        this.tradeRequestID = tradeRequestID;
    }
    public Integer getTrdType() {
        return this.trdType;
    }           

    public void setTrdType(Integer trdType) {
        this.trdType = trdType;
    }
    public Integer getTrdSubType() {
        return this.trdSubType;
    }           

    public void setTrdSubType(Integer trdSubType) {
        this.trdSubType = trdSubType;
    }
    public Integer getSecondaryTrdType() {
        return this.secondaryTrdType;
    }           

    public void setSecondaryTrdType(Integer secondaryTrdType) {
        this.secondaryTrdType = secondaryTrdType;
    }
    public String getTransferReason() {
        return this.transferReason;
    }           

    public void setTransferReason(String transferReason) {
        this.transferReason = transferReason;
    }
    public String getExecType() {
        return this.execType;
    }           

    public void setExecType(String execType) {
        this.execType = execType;
    }
    public Integer getTotNumTradeReports() {
        return this.totNumTradeReports;
    }           

    public void setTotNumTradeReports(Integer totNumTradeReports) {
        this.totNumTradeReports = totNumTradeReports;
    }
    public Boolean getLastRptRequested() {
        return this.lastRptRequested;
    }           

    public void setLastRptRequested(Boolean lastRptRequested) {
        this.lastRptRequested = lastRptRequested;
    }
    public Boolean getUnsolicitedIndicator() {
        return this.unsolicitedIndicator;
    }           

    public void setUnsolicitedIndicator(Boolean unsolicitedIndicator) {
        this.unsolicitedIndicator = unsolicitedIndicator;
    }
    public String getSubscriptionRequestType() {
        return this.subscriptionRequestType;
    }           

    public void setSubscriptionRequestType(String subscriptionRequestType) {
        this.subscriptionRequestType = subscriptionRequestType;
    }
    public String getTradeReportRefID() {
        return this.tradeReportRefID;
    }           

    public void setTradeReportRefID(String tradeReportRefID) {
        this.tradeReportRefID = tradeReportRefID;
    }
    public String getSecondaryTradeReportRefID() {
        return this.secondaryTradeReportRefID;
    }           

    public void setSecondaryTradeReportRefID(String secondaryTradeReportRefID) {
        this.secondaryTradeReportRefID = secondaryTradeReportRefID;
    }
    public String getSecondaryTradeReportID() {
        return this.secondaryTradeReportID;
    }           

    public void setSecondaryTradeReportID(String secondaryTradeReportID) {
        this.secondaryTradeReportID = secondaryTradeReportID;
    }
    public String getTradeLinkID() {
        return this.tradeLinkID;
    }           

    public void setTradeLinkID(String tradeLinkID) {
        this.tradeLinkID = tradeLinkID;
    }
    public String getTrdMatchID() {
        return this.trdMatchID;
    }           

    public void setTrdMatchID(String trdMatchID) {
        this.trdMatchID = trdMatchID;
    }
    public String getExecID() {
        return this.execID;
    }           

    public void setExecID(String execID) {
        this.execID = execID;
    }
    public String getOrdStatus() {
        return this.ordStatus;
    }           

    public void setOrdStatus(String ordStatus) {
        this.ordStatus = ordStatus;
    }
    public String getSecondaryExecID() {
        return this.secondaryExecID;
    }           

    public void setSecondaryExecID(String secondaryExecID) {
        this.secondaryExecID = secondaryExecID;
    }
    public Integer getExecRestatementReason() {
        return this.execRestatementReason;
    }           

    public void setExecRestatementReason(Integer execRestatementReason) {
        this.execRestatementReason = execRestatementReason;
    }
    public Boolean getPreviouslyReported() {
        return this.previouslyReported;
    }           

    public void setPreviouslyReported(Boolean previouslyReported) {
        this.previouslyReported = previouslyReported;
    }
    public Integer getPriceType() {
        return this.priceType;
    }           

    public void setPriceType(Integer priceType) {
        this.priceType = priceType;
    }
    public Integer getQtyType() {
        return this.qtyType;
    }           

    public void setQtyType(Integer qtyType) {
        this.qtyType = qtyType;
    }
    public String getUnderlyingTradingSessionID() {
        return this.underlyingTradingSessionID;
    }           

    public void setUnderlyingTradingSessionID(String underlyingTradingSessionID) {
        this.underlyingTradingSessionID = underlyingTradingSessionID;
    }
    public String getUnderlyingTradingSessionSubID() {
        return this.underlyingTradingSessionSubID;
    }           

    public void setUnderlyingTradingSessionSubID(String underlyingTradingSessionSubID) {
        this.underlyingTradingSessionSubID = underlyingTradingSessionSubID;
    }
    public BigDecimal getLastQty() {
        return this.lastQty;
    }           

    public void setLastQty(BigDecimal lastQty) {
        this.lastQty = lastQty;
    }
    public BigDecimal getLastPx() {
        return this.lastPx;
    }           

    public void setLastPx(BigDecimal lastPx) {
        this.lastPx = lastPx;
    }
    public BigDecimal getLastParPx() {
        return this.lastParPx;
    }           

    public void setLastParPx(BigDecimal lastParPx) {
        this.lastParPx = lastParPx;
    }
    public BigDecimal getLastSpotRate() {
        return this.lastSpotRate;
    }           

    public void setLastSpotRate(BigDecimal lastSpotRate) {
        this.lastSpotRate = lastSpotRate;
    }
    public BigDecimal getLastForwardPoints() {
        return this.lastForwardPoints;
    }           

    public void setLastForwardPoints(BigDecimal lastForwardPoints) {
        this.lastForwardPoints = lastForwardPoints;
    }
    public String getLastMkt() {
        return this.lastMkt;
    }           

    public void setLastMkt(String lastMkt) {
        this.lastMkt = lastMkt;
    }
    public String getTradeDate() {
        return this.tradeDate;
    }           

    public void setTradeDate(String tradeDate) {
        this.tradeDate = tradeDate;
    }
    public String getClearingBusinessDate() {
        return this.clearingBusinessDate;
    }           

    public void setClearingBusinessDate(String clearingBusinessDate) {
        this.clearingBusinessDate = clearingBusinessDate;
    }
    public BigDecimal getAvgPx() {
        return this.avgPx;
    }           

    public void setAvgPx(BigDecimal avgPx) {
        this.avgPx = avgPx;
    }
    public Integer getAvgPxIndicator() {
        return this.avgPxIndicator;
    }           

    public void setAvgPxIndicator(Integer avgPxIndicator) {
        this.avgPxIndicator = avgPxIndicator;
    }
    public String getMultiLegReportingType() {
        return this.multiLegReportingType;
    }           

    public void setMultiLegReportingType(String multiLegReportingType) {
        this.multiLegReportingType = multiLegReportingType;
    }
    public String getTradeLegRefID() {
        return this.tradeLegRefID;
    }           

    public void setTradeLegRefID(String tradeLegRefID) {
        this.tradeLegRefID = tradeLegRefID;
    }
    public Date getTransactTime() {
        return this.transactTime;
    }           

    public void setTransactTime(Date transactTime) {
        this.transactTime = transactTime;
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
    public String getMatchStatus() {
        return this.matchStatus;
    }           

    public void setMatchStatus(String matchStatus) {
        this.matchStatus = matchStatus;
    }
    public String getMatchType() {
        return this.matchType;
    }           

    public void setMatchType(String matchType) {
        this.matchType = matchType;
    }
    public Boolean getCopyMsgIndicator() {
        return this.copyMsgIndicator;
    }           

    public void setCopyMsgIndicator(Boolean copyMsgIndicator) {
        this.copyMsgIndicator = copyMsgIndicator;
    }
    public Boolean getPublishTrdIndicator() {
        return this.publishTrdIndicator;
    }           

    public void setPublishTrdIndicator(Boolean publishTrdIndicator) {
        this.publishTrdIndicator = publishTrdIndicator;
    }
    public Integer getShortSaleReason() {
        return this.shortSaleReason;
    }           

    public void setShortSaleReason(Integer shortSaleReason) {
        this.shortSaleReason = shortSaleReason;
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
    
    public YieldData getYieldData() {
        return this.yieldData;
    }           

    public void setYieldData(YieldData yieldData) {
        this.yieldData = yieldData;
    }
    
    public SpreadOrBenchmarkCurveData getSpreadOrBenchmarkCurveData() {
        return this.spreadOrBenchmarkCurveData;
    }           

    public void setSpreadOrBenchmarkCurveData(SpreadOrBenchmarkCurveData spreadOrBenchmarkCurveData) {
        this.spreadOrBenchmarkCurveData = spreadOrBenchmarkCurveData;
    }
    
    public PositionAmountData getPositionAmountData() {
        return this.positionAmountData;
    }           

    public void setPositionAmountData(PositionAmountData positionAmountData) {
        this.positionAmountData = positionAmountData;
    }
    
    public TrdRegTimestamps getTrdRegTimestamps() {
        return this.trdRegTimestamps;
    }           

    public void setTrdRegTimestamps(TrdRegTimestamps trdRegTimestamps) {
        this.trdRegTimestamps = trdRegTimestamps;
    }

    public TradeCaptureReport.NoUnderlyings getNoUnderlyings() {
        return this.noUnderlyings;
    }

    public void setNoUnderlyings(TradeCaptureReport.NoUnderlyings noUnderlyings) {
        this.noUnderlyings = noUnderlyings;
    }
    public TradeCaptureReport.NoLegs getNoLegs() {
        return this.noLegs;
    }

    public void setNoLegs(TradeCaptureReport.NoLegs noLegs) {
        this.noLegs = noLegs;
    }
    public TradeCaptureReport.NoSides getNoSides() {
        return this.noSides;
    }

    public void setNoSides(TradeCaptureReport.NoSides noSides) {
        this.noSides = noSides;
    }
        

    public static class NoUnderlyings extends FixGroup<TradeCaptureReport.NoUnderlyings.NoUnderlyingsEntry> {

        @Override
        public int getField() {
            return 711;
        }

        public static class NoUnderlyingsEntry {



        }
        
    }


    public static class NoLegs extends FixGroup<TradeCaptureReport.NoLegs.NoLegsEntry> {

        @Override
        public int getField() {
            return 555;
        }

        public static class NoLegsEntry {

            private BigDecimal legQty;
            private Integer legSwapType;
            private String legPositionEffect;
            private Integer legCoveredOrUncovered;
            private String legRefID;
            private BigDecimal legPrice;
            private String legSettlType;
            private String legSettlDate;
            private BigDecimal legLastPx;
            private String targetLegRefId;

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
            public String getLegPositionEffect() {
                return this.legPositionEffect;
            }           

            public void setLegPositionEffect(String legPositionEffect) {
                this.legPositionEffect = legPositionEffect;
            }
            public Integer getLegCoveredOrUncovered() {
                return this.legCoveredOrUncovered;
            }           

            public void setLegCoveredOrUncovered(Integer legCoveredOrUncovered) {
                this.legCoveredOrUncovered = legCoveredOrUncovered;
            }
            public String getLegRefID() {
                return this.legRefID;
            }           

            public void setLegRefID(String legRefID) {
                this.legRefID = legRefID;
            }
            public BigDecimal getLegPrice() {
                return this.legPrice;
            }           

            public void setLegPrice(BigDecimal legPrice) {
                this.legPrice = legPrice;
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
            public BigDecimal getLegLastPx() {
                return this.legLastPx;
            }           

            public void setLegLastPx(BigDecimal legLastPx) {
                this.legLastPx = legLastPx;
            }
            public String getTargetLegRefId() {
                return this.targetLegRefId;
            }           

            public void setTargetLegRefId(String targetLegRefId) {
                this.targetLegRefId = targetLegRefId;
            }

        }
        
    }


    public static class NoSides extends FixGroup<TradeCaptureReport.NoSides.NoSidesEntry> {

        @Override
        public int getField() {
            return 552;
        }

        public static class NoSidesEntry {

            private String side;
            private String orderID;
            private String secondaryOrderID;
            private String clOrdID;
            private String secondaryClOrdID;
            private String listID;
            private String account;
            private Integer acctIDSource;
            private Integer accountType;
            private String processCode;
            private Boolean oddLot;
            private String clearingFeeIndicator;
            private String tradeInputSource;
            private String tradeInputDevice;
            private String orderInputDevice;
            private String currency;
            private String complianceID;
            private Boolean solicitedFlag;
            private String orderCapacity;
            private String orderRestrictions;
            private Integer custOrderCapacity;
            private String ordType;
            private String execInst;
            private Date transBkdTime;
            private String tradingSessionID;
            private String tradingSessionSubID;
            private String timeBracket;
            private BigDecimal grossTradeAmt;
            private Integer numDaysInterest;
            private String exDate;
            private BigDecimal accruedInterestRate;
            private BigDecimal accruedInterestAmt;
            private BigDecimal interestAtMaturity;
            private BigDecimal endAccruedInterestAmt;
            private BigDecimal startCash;
            private BigDecimal endCash;
            private BigDecimal concession;
            private BigDecimal totalTakedown;
            private BigDecimal netMoney;
            private BigDecimal settlCurrAmt;
            private String settlCurrency;
            private BigDecimal settlCurrFxRate;
            private String settlCurrFxRateCalc;
            private String positionEffect;
            private String text;
            private Integer encodedTextLen;
            private String encodedText;
            private Integer sideMultiLegReportingType;
            private String exchangeRule;
            private Integer tradeAllocIndicator;
            private String preallocMethod;
            private String allocID;

            public String getSide() {
                return this.side;
            }           

            public void setSide(String side) {
                this.side = side;
            }
            public String getOrderID() {
                return this.orderID;
            }           

            public void setOrderID(String orderID) {
                this.orderID = orderID;
            }
            public String getSecondaryOrderID() {
                return this.secondaryOrderID;
            }           

            public void setSecondaryOrderID(String secondaryOrderID) {
                this.secondaryOrderID = secondaryOrderID;
            }
            public String getClOrdID() {
                return this.clOrdID;
            }           

            public void setClOrdID(String clOrdID) {
                this.clOrdID = clOrdID;
            }
            public String getSecondaryClOrdID() {
                return this.secondaryClOrdID;
            }           

            public void setSecondaryClOrdID(String secondaryClOrdID) {
                this.secondaryClOrdID = secondaryClOrdID;
            }
            public String getListID() {
                return this.listID;
            }           

            public void setListID(String listID) {
                this.listID = listID;
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
            public String getProcessCode() {
                return this.processCode;
            }           

            public void setProcessCode(String processCode) {
                this.processCode = processCode;
            }
            public Boolean getOddLot() {
                return this.oddLot;
            }           

            public void setOddLot(Boolean oddLot) {
                this.oddLot = oddLot;
            }
            public String getClearingFeeIndicator() {
                return this.clearingFeeIndicator;
            }           

            public void setClearingFeeIndicator(String clearingFeeIndicator) {
                this.clearingFeeIndicator = clearingFeeIndicator;
            }
            public String getTradeInputSource() {
                return this.tradeInputSource;
            }           

            public void setTradeInputSource(String tradeInputSource) {
                this.tradeInputSource = tradeInputSource;
            }
            public String getTradeInputDevice() {
                return this.tradeInputDevice;
            }           

            public void setTradeInputDevice(String tradeInputDevice) {
                this.tradeInputDevice = tradeInputDevice;
            }
            public String getOrderInputDevice() {
                return this.orderInputDevice;
            }           

            public void setOrderInputDevice(String orderInputDevice) {
                this.orderInputDevice = orderInputDevice;
            }
            public String getCurrency() {
                return this.currency;
            }           

            public void setCurrency(String currency) {
                this.currency = currency;
            }
            public String getComplianceID() {
                return this.complianceID;
            }           

            public void setComplianceID(String complianceID) {
                this.complianceID = complianceID;
            }
            public Boolean getSolicitedFlag() {
                return this.solicitedFlag;
            }           

            public void setSolicitedFlag(Boolean solicitedFlag) {
                this.solicitedFlag = solicitedFlag;
            }
            public String getOrderCapacity() {
                return this.orderCapacity;
            }           

            public void setOrderCapacity(String orderCapacity) {
                this.orderCapacity = orderCapacity;
            }
            public String getOrderRestrictions() {
                return this.orderRestrictions;
            }           

            public void setOrderRestrictions(String orderRestrictions) {
                this.orderRestrictions = orderRestrictions;
            }
            public Integer getCustOrderCapacity() {
                return this.custOrderCapacity;
            }           

            public void setCustOrderCapacity(Integer custOrderCapacity) {
                this.custOrderCapacity = custOrderCapacity;
            }
            public String getOrdType() {
                return this.ordType;
            }           

            public void setOrdType(String ordType) {
                this.ordType = ordType;
            }
            public String getExecInst() {
                return this.execInst;
            }           

            public void setExecInst(String execInst) {
                this.execInst = execInst;
            }
            public Date getTransBkdTime() {
                return this.transBkdTime;
            }           

            public void setTransBkdTime(Date transBkdTime) {
                this.transBkdTime = transBkdTime;
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
            public String getTimeBracket() {
                return this.timeBracket;
            }           

            public void setTimeBracket(String timeBracket) {
                this.timeBracket = timeBracket;
            }
            public BigDecimal getGrossTradeAmt() {
                return this.grossTradeAmt;
            }           

            public void setGrossTradeAmt(BigDecimal grossTradeAmt) {
                this.grossTradeAmt = grossTradeAmt;
            }
            public Integer getNumDaysInterest() {
                return this.numDaysInterest;
            }           

            public void setNumDaysInterest(Integer numDaysInterest) {
                this.numDaysInterest = numDaysInterest;
            }
            public String getExDate() {
                return this.exDate;
            }           

            public void setExDate(String exDate) {
                this.exDate = exDate;
            }
            public BigDecimal getAccruedInterestRate() {
                return this.accruedInterestRate;
            }           

            public void setAccruedInterestRate(BigDecimal accruedInterestRate) {
                this.accruedInterestRate = accruedInterestRate;
            }
            public BigDecimal getAccruedInterestAmt() {
                return this.accruedInterestAmt;
            }           

            public void setAccruedInterestAmt(BigDecimal accruedInterestAmt) {
                this.accruedInterestAmt = accruedInterestAmt;
            }
            public BigDecimal getInterestAtMaturity() {
                return this.interestAtMaturity;
            }           

            public void setInterestAtMaturity(BigDecimal interestAtMaturity) {
                this.interestAtMaturity = interestAtMaturity;
            }
            public BigDecimal getEndAccruedInterestAmt() {
                return this.endAccruedInterestAmt;
            }           

            public void setEndAccruedInterestAmt(BigDecimal endAccruedInterestAmt) {
                this.endAccruedInterestAmt = endAccruedInterestAmt;
            }
            public BigDecimal getStartCash() {
                return this.startCash;
            }           

            public void setStartCash(BigDecimal startCash) {
                this.startCash = startCash;
            }
            public BigDecimal getEndCash() {
                return this.endCash;
            }           

            public void setEndCash(BigDecimal endCash) {
                this.endCash = endCash;
            }
            public BigDecimal getConcession() {
                return this.concession;
            }           

            public void setConcession(BigDecimal concession) {
                this.concession = concession;
            }
            public BigDecimal getTotalTakedown() {
                return this.totalTakedown;
            }           

            public void setTotalTakedown(BigDecimal totalTakedown) {
                this.totalTakedown = totalTakedown;
            }
            public BigDecimal getNetMoney() {
                return this.netMoney;
            }           

            public void setNetMoney(BigDecimal netMoney) {
                this.netMoney = netMoney;
            }
            public BigDecimal getSettlCurrAmt() {
                return this.settlCurrAmt;
            }           

            public void setSettlCurrAmt(BigDecimal settlCurrAmt) {
                this.settlCurrAmt = settlCurrAmt;
            }
            public String getSettlCurrency() {
                return this.settlCurrency;
            }           

            public void setSettlCurrency(String settlCurrency) {
                this.settlCurrency = settlCurrency;
            }
            public BigDecimal getSettlCurrFxRate() {
                return this.settlCurrFxRate;
            }           

            public void setSettlCurrFxRate(BigDecimal settlCurrFxRate) {
                this.settlCurrFxRate = settlCurrFxRate;
            }
            public String getSettlCurrFxRateCalc() {
                return this.settlCurrFxRateCalc;
            }           

            public void setSettlCurrFxRateCalc(String settlCurrFxRateCalc) {
                this.settlCurrFxRateCalc = settlCurrFxRateCalc;
            }
            public String getPositionEffect() {
                return this.positionEffect;
            }           

            public void setPositionEffect(String positionEffect) {
                this.positionEffect = positionEffect;
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
            public Integer getSideMultiLegReportingType() {
                return this.sideMultiLegReportingType;
            }           

            public void setSideMultiLegReportingType(Integer sideMultiLegReportingType) {
                this.sideMultiLegReportingType = sideMultiLegReportingType;
            }
            public String getExchangeRule() {
                return this.exchangeRule;
            }           

            public void setExchangeRule(String exchangeRule) {
                this.exchangeRule = exchangeRule;
            }
            public Integer getTradeAllocIndicator() {
                return this.tradeAllocIndicator;
            }           

            public void setTradeAllocIndicator(Integer tradeAllocIndicator) {
                this.tradeAllocIndicator = tradeAllocIndicator;
            }
            public String getPreallocMethod() {
                return this.preallocMethod;
            }           

            public void setPreallocMethod(String preallocMethod) {
                this.preallocMethod = preallocMethod;
            }
            public String getAllocID() {
                return this.allocID;
            }           

            public void setAllocID(String allocID) {
                this.allocID = allocID;
            }

        }
        
    }

}

