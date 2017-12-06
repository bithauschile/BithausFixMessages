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
import cl.bithaus.fix.components.PegInstructions;
import cl.bithaus.fix.components.SpecialOrderData;
import cl.bithaus.fix.components.IIFValorization;
import cl.bithaus.fix.components.IRFValorization;
import cl.bithaus.fix.components.OIBBestPriceData;

/**
 * Fix Components Class
 * Generated for FIX 4.4
 * @author Bithaus Fix Message Generator
 */
public class ExecutionReport extends FixBaseMessage {

    private String orderID;           
    private String secondaryOrderID;           
    private String secondaryClOrdID;           
    private String secondaryExecID;           
    private String clOrdID;           
    private String origClOrdID;           
    private String clOrdLinkID;           
    private String quoteRespID;           
    private String ordStatusReqID;           
    private String massStatusReqID;           
    private Integer totNumReports;           
    private Boolean lastRptRequested;           
    private String tradeOriginationDate;           
    private String listID;           
    private String crossID;           
    private String origCrossID;           
    private Integer crossType;           
    private String execID;           
    private String execRefID;           
    private String execType;           
    private String ordStatus;           
    private Integer ordRejReason;           
    private Integer execRestatementReason;           
    private String settlType;           
    private String settlDate;           
    private String cashMargin;           
    private String clearingFeeIndicator;           
    private String side;           
    private Integer qtyType;           
    private String ordType;           
    private Integer priceType;           
    private BigDecimal price;           
    private BigDecimal stopPx;           
    private String currency;           
    private String settlCurrency;           
    private String timeInForce;           
    private Date effectiveTime;           
    private String expireDate;           
    private Date expireTime;           
    private String execInst;           
    private BigDecimal lastQty;           
    private BigDecimal lastPx;           
    private String tradingSessionID;           
    private BigDecimal leavesQty;           
    private BigDecimal cumQty;           
    private BigDecimal avgPx;           
    private BigDecimal dayOrderQty;           
    private BigDecimal dayCumQty;           
    private BigDecimal dayAvgPx;           
    private String tradeDate;           
    private Date transactTime;           
    private Boolean reportToExch;           
    private BigDecimal grossTradeAmt;           
    private BigDecimal origAmount;           
    private String handlInst;           
    private BigDecimal minQty;           
    private BigDecimal maxFloor;           
    private String text;           
    private BigDecimal orderQty2;           
    private String multiLegReportingType;           
    private String registID;           
    private Boolean copyMsgIndicator;           
    private String moveToOIB;           
    private String tradeID;           
    private BigDecimal oldQty;           
    private BigDecimal oldPrice;           
    private String stopPxCondition;           
    private BigDecimal price2;           
    private String roundLotBook;           
    private String prePayment;           
    private BigDecimal maxRate;           
    private BigDecimal ownRate;           
    private BigDecimal publicRate;           
    private String bestStance;           
    private String refOrderID;           
    private String refOrderIDSource;           
    private Integer auctionId;           
    private String lastMkt;           
    private String dcvTitle;           
    private String expressed;           
    private String refOrderSubID;           
    private String refFractionID;           
    private Integer noOffers;           
    private Parties parties;           
    private Instrument instrument;           
    private FinancingDetails financingDetails;           
    private OrderQtyData orderQtyData;           
    private PegInstructions pegInstructions;           
    private SpecialOrderData specialOrderData;           
    private IIFValorization iIFValorization;           
    private IRFValorization iRFValorization;           
    private OIBBestPriceData oIBBestPriceData;           
    private NoContraBrokers noContraBrokers;           
    private NoLegs noLegs;           

    public ExecutionReport() { 
        super("8", MsgCategory.APP);
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
    public String getSecondaryClOrdID() {
        return this.secondaryClOrdID;
    }           

    public void setSecondaryClOrdID(String secondaryClOrdID) {
        this.secondaryClOrdID = secondaryClOrdID;
    }
    public String getSecondaryExecID() {
        return this.secondaryExecID;
    }           

    public void setSecondaryExecID(String secondaryExecID) {
        this.secondaryExecID = secondaryExecID;
    }
    public String getClOrdID() {
        return this.clOrdID;
    }           

    public void setClOrdID(String clOrdID) {
        this.clOrdID = clOrdID;
    }
    public String getOrigClOrdID() {
        return this.origClOrdID;
    }           

    public void setOrigClOrdID(String origClOrdID) {
        this.origClOrdID = origClOrdID;
    }
    public String getClOrdLinkID() {
        return this.clOrdLinkID;
    }           

    public void setClOrdLinkID(String clOrdLinkID) {
        this.clOrdLinkID = clOrdLinkID;
    }
    public String getQuoteRespID() {
        return this.quoteRespID;
    }           

    public void setQuoteRespID(String quoteRespID) {
        this.quoteRespID = quoteRespID;
    }
    public String getOrdStatusReqID() {
        return this.ordStatusReqID;
    }           

    public void setOrdStatusReqID(String ordStatusReqID) {
        this.ordStatusReqID = ordStatusReqID;
    }
    public String getMassStatusReqID() {
        return this.massStatusReqID;
    }           

    public void setMassStatusReqID(String massStatusReqID) {
        this.massStatusReqID = massStatusReqID;
    }
    public Integer getTotNumReports() {
        return this.totNumReports;
    }           

    public void setTotNumReports(Integer totNumReports) {
        this.totNumReports = totNumReports;
    }
    public Boolean getLastRptRequested() {
        return this.lastRptRequested;
    }           

    public void setLastRptRequested(Boolean lastRptRequested) {
        this.lastRptRequested = lastRptRequested;
    }
    public String getTradeOriginationDate() {
        return this.tradeOriginationDate;
    }           

    public void setTradeOriginationDate(String tradeOriginationDate) {
        this.tradeOriginationDate = tradeOriginationDate;
    }
    public String getListID() {
        return this.listID;
    }           

    public void setListID(String listID) {
        this.listID = listID;
    }
    public String getCrossID() {
        return this.crossID;
    }           

    public void setCrossID(String crossID) {
        this.crossID = crossID;
    }
    public String getOrigCrossID() {
        return this.origCrossID;
    }           

    public void setOrigCrossID(String origCrossID) {
        this.origCrossID = origCrossID;
    }
    public Integer getCrossType() {
        return this.crossType;
    }           

    public void setCrossType(Integer crossType) {
        this.crossType = crossType;
    }
    public String getExecID() {
        return this.execID;
    }           

    public void setExecID(String execID) {
        this.execID = execID;
    }
    public String getExecRefID() {
        return this.execRefID;
    }           

    public void setExecRefID(String execRefID) {
        this.execRefID = execRefID;
    }
    public String getExecType() {
        return this.execType;
    }           

    public void setExecType(String execType) {
        this.execType = execType;
    }
    public String getOrdStatus() {
        return this.ordStatus;
    }           

    public void setOrdStatus(String ordStatus) {
        this.ordStatus = ordStatus;
    }
    public Integer getOrdRejReason() {
        return this.ordRejReason;
    }           

    public void setOrdRejReason(Integer ordRejReason) {
        this.ordRejReason = ordRejReason;
    }
    public Integer getExecRestatementReason() {
        return this.execRestatementReason;
    }           

    public void setExecRestatementReason(Integer execRestatementReason) {
        this.execRestatementReason = execRestatementReason;
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
    public String getCashMargin() {
        return this.cashMargin;
    }           

    public void setCashMargin(String cashMargin) {
        this.cashMargin = cashMargin;
    }
    public String getClearingFeeIndicator() {
        return this.clearingFeeIndicator;
    }           

    public void setClearingFeeIndicator(String clearingFeeIndicator) {
        this.clearingFeeIndicator = clearingFeeIndicator;
    }
    public String getSide() {
        return this.side;
    }           

    public void setSide(String side) {
        this.side = side;
    }
    public Integer getQtyType() {
        return this.qtyType;
    }           

    public void setQtyType(Integer qtyType) {
        this.qtyType = qtyType;
    }
    public String getOrdType() {
        return this.ordType;
    }           

    public void setOrdType(String ordType) {
        this.ordType = ordType;
    }
    public Integer getPriceType() {
        return this.priceType;
    }           

    public void setPriceType(Integer priceType) {
        this.priceType = priceType;
    }
    public BigDecimal getPrice() {
        return this.price;
    }           

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
    public BigDecimal getStopPx() {
        return this.stopPx;
    }           

    public void setStopPx(BigDecimal stopPx) {
        this.stopPx = stopPx;
    }
    public String getCurrency() {
        return this.currency;
    }           

    public void setCurrency(String currency) {
        this.currency = currency;
    }
    public String getSettlCurrency() {
        return this.settlCurrency;
    }           

    public void setSettlCurrency(String settlCurrency) {
        this.settlCurrency = settlCurrency;
    }
    public String getTimeInForce() {
        return this.timeInForce;
    }           

    public void setTimeInForce(String timeInForce) {
        this.timeInForce = timeInForce;
    }
    public Date getEffectiveTime() {
        return this.effectiveTime;
    }           

    public void setEffectiveTime(Date effectiveTime) {
        this.effectiveTime = effectiveTime;
    }
    public String getExpireDate() {
        return this.expireDate;
    }           

    public void setExpireDate(String expireDate) {
        this.expireDate = expireDate;
    }
    public Date getExpireTime() {
        return this.expireTime;
    }           

    public void setExpireTime(Date expireTime) {
        this.expireTime = expireTime;
    }
    public String getExecInst() {
        return this.execInst;
    }           

    public void setExecInst(String execInst) {
        this.execInst = execInst;
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
    public String getTradingSessionID() {
        return this.tradingSessionID;
    }           

    public void setTradingSessionID(String tradingSessionID) {
        this.tradingSessionID = tradingSessionID;
    }
    public BigDecimal getLeavesQty() {
        return this.leavesQty;
    }           

    public void setLeavesQty(BigDecimal leavesQty) {
        this.leavesQty = leavesQty;
    }
    public BigDecimal getCumQty() {
        return this.cumQty;
    }           

    public void setCumQty(BigDecimal cumQty) {
        this.cumQty = cumQty;
    }
    public BigDecimal getAvgPx() {
        return this.avgPx;
    }           

    public void setAvgPx(BigDecimal avgPx) {
        this.avgPx = avgPx;
    }
    public BigDecimal getDayOrderQty() {
        return this.dayOrderQty;
    }           

    public void setDayOrderQty(BigDecimal dayOrderQty) {
        this.dayOrderQty = dayOrderQty;
    }
    public BigDecimal getDayCumQty() {
        return this.dayCumQty;
    }           

    public void setDayCumQty(BigDecimal dayCumQty) {
        this.dayCumQty = dayCumQty;
    }
    public BigDecimal getDayAvgPx() {
        return this.dayAvgPx;
    }           

    public void setDayAvgPx(BigDecimal dayAvgPx) {
        this.dayAvgPx = dayAvgPx;
    }
    public String getTradeDate() {
        return this.tradeDate;
    }           

    public void setTradeDate(String tradeDate) {
        this.tradeDate = tradeDate;
    }
    public Date getTransactTime() {
        return this.transactTime;
    }           

    public void setTransactTime(Date transactTime) {
        this.transactTime = transactTime;
    }
    public Boolean getReportToExch() {
        return this.reportToExch;
    }           

    public void setReportToExch(Boolean reportToExch) {
        this.reportToExch = reportToExch;
    }
    public BigDecimal getGrossTradeAmt() {
        return this.grossTradeAmt;
    }           

    public void setGrossTradeAmt(BigDecimal grossTradeAmt) {
        this.grossTradeAmt = grossTradeAmt;
    }
    public BigDecimal getOrigAmount() {
        return this.origAmount;
    }           

    public void setOrigAmount(BigDecimal origAmount) {
        this.origAmount = origAmount;
    }
    public String getHandlInst() {
        return this.handlInst;
    }           

    public void setHandlInst(String handlInst) {
        this.handlInst = handlInst;
    }
    public BigDecimal getMinQty() {
        return this.minQty;
    }           

    public void setMinQty(BigDecimal minQty) {
        this.minQty = minQty;
    }
    public BigDecimal getMaxFloor() {
        return this.maxFloor;
    }           

    public void setMaxFloor(BigDecimal maxFloor) {
        this.maxFloor = maxFloor;
    }
    public String getText() {
        return this.text;
    }           

    public void setText(String text) {
        this.text = text;
    }
    public BigDecimal getOrderQty2() {
        return this.orderQty2;
    }           

    public void setOrderQty2(BigDecimal orderQty2) {
        this.orderQty2 = orderQty2;
    }
    public String getMultiLegReportingType() {
        return this.multiLegReportingType;
    }           

    public void setMultiLegReportingType(String multiLegReportingType) {
        this.multiLegReportingType = multiLegReportingType;
    }
    public String getRegistID() {
        return this.registID;
    }           

    public void setRegistID(String registID) {
        this.registID = registID;
    }
    public Boolean getCopyMsgIndicator() {
        return this.copyMsgIndicator;
    }           

    public void setCopyMsgIndicator(Boolean copyMsgIndicator) {
        this.copyMsgIndicator = copyMsgIndicator;
    }
    public String getMoveToOIB() {
        return this.moveToOIB;
    }           

    public void setMoveToOIB(String moveToOIB) {
        this.moveToOIB = moveToOIB;
    }
    public String getTradeID() {
        return this.tradeID;
    }           

    public void setTradeID(String tradeID) {
        this.tradeID = tradeID;
    }
    public BigDecimal getOldQty() {
        return this.oldQty;
    }           

    public void setOldQty(BigDecimal oldQty) {
        this.oldQty = oldQty;
    }
    public BigDecimal getOldPrice() {
        return this.oldPrice;
    }           

    public void setOldPrice(BigDecimal oldPrice) {
        this.oldPrice = oldPrice;
    }
    public String getStopPxCondition() {
        return this.stopPxCondition;
    }           

    public void setStopPxCondition(String stopPxCondition) {
        this.stopPxCondition = stopPxCondition;
    }
    public BigDecimal getPrice2() {
        return this.price2;
    }           

    public void setPrice2(BigDecimal price2) {
        this.price2 = price2;
    }
    public String getRoundLotBook() {
        return this.roundLotBook;
    }           

    public void setRoundLotBook(String roundLotBook) {
        this.roundLotBook = roundLotBook;
    }
    public String getPrePayment() {
        return this.prePayment;
    }           

    public void setPrePayment(String prePayment) {
        this.prePayment = prePayment;
    }
    public BigDecimal getMaxRate() {
        return this.maxRate;
    }           

    public void setMaxRate(BigDecimal maxRate) {
        this.maxRate = maxRate;
    }
    public BigDecimal getOwnRate() {
        return this.ownRate;
    }           

    public void setOwnRate(BigDecimal ownRate) {
        this.ownRate = ownRate;
    }
    public BigDecimal getPublicRate() {
        return this.publicRate;
    }           

    public void setPublicRate(BigDecimal publicRate) {
        this.publicRate = publicRate;
    }
    public String getBestStance() {
        return this.bestStance;
    }           

    public void setBestStance(String bestStance) {
        this.bestStance = bestStance;
    }
    public String getRefOrderID() {
        return this.refOrderID;
    }           

    public void setRefOrderID(String refOrderID) {
        this.refOrderID = refOrderID;
    }
    public String getRefOrderIDSource() {
        return this.refOrderIDSource;
    }           

    public void setRefOrderIDSource(String refOrderIDSource) {
        this.refOrderIDSource = refOrderIDSource;
    }
    public Integer getAuctionId() {
        return this.auctionId;
    }           

    public void setAuctionId(Integer auctionId) {
        this.auctionId = auctionId;
    }
    public String getLastMkt() {
        return this.lastMkt;
    }           

    public void setLastMkt(String lastMkt) {
        this.lastMkt = lastMkt;
    }
    public String getDcvTitle() {
        return this.dcvTitle;
    }           

    public void setDcvTitle(String dcvTitle) {
        this.dcvTitle = dcvTitle;
    }
    public String getExpressed() {
        return this.expressed;
    }           

    public void setExpressed(String expressed) {
        this.expressed = expressed;
    }
    public String getRefOrderSubID() {
        return this.refOrderSubID;
    }           

    public void setRefOrderSubID(String refOrderSubID) {
        this.refOrderSubID = refOrderSubID;
    }
    public String getRefFractionID() {
        return this.refFractionID;
    }           

    public void setRefFractionID(String refFractionID) {
        this.refFractionID = refFractionID;
    }
    public Integer getNoOffers() {
        return this.noOffers;
    }           

    public void setNoOffers(Integer noOffers) {
        this.noOffers = noOffers;
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
    
    public PegInstructions getPegInstructions() {
        return this.pegInstructions;
    }           

    public void setPegInstructions(PegInstructions pegInstructions) {
        this.pegInstructions = pegInstructions;
    }
    
    public SpecialOrderData getSpecialOrderData() {
        return this.specialOrderData;
    }           

    public void setSpecialOrderData(SpecialOrderData specialOrderData) {
        this.specialOrderData = specialOrderData;
    }
    
    public IIFValorization getIIFValorization() {
        return this.iIFValorization;
    }           

    public void setIIFValorization(IIFValorization iIFValorization) {
        this.iIFValorization = iIFValorization;
    }
    
    public IRFValorization getIRFValorization() {
        return this.iRFValorization;
    }           

    public void setIRFValorization(IRFValorization iRFValorization) {
        this.iRFValorization = iRFValorization;
    }
    
    public OIBBestPriceData getOIBBestPriceData() {
        return this.oIBBestPriceData;
    }           

    public void setOIBBestPriceData(OIBBestPriceData oIBBestPriceData) {
        this.oIBBestPriceData = oIBBestPriceData;
    }

    public ExecutionReport.NoContraBrokers getNoContraBrokers() {
        return this.noContraBrokers;
    }

    public void setNoContraBrokers(ExecutionReport.NoContraBrokers noContraBrokers) {
        this.noContraBrokers = noContraBrokers;
    }
    public ExecutionReport.NoLegs getNoLegs() {
        return this.noLegs;
    }

    public void setNoLegs(ExecutionReport.NoLegs noLegs) {
        this.noLegs = noLegs;
    }
        

    public static class NoContraBrokers extends FixGroup<ExecutionReport.NoContraBrokers.NoContraBrokersEntry> {

        @Override
        public int getField() {
            return 382;
        }

        public static class NoContraBrokersEntry {

            private String contraBroker;
            private String contraTrader;

            public String getContraBroker() {
                return this.contraBroker;
            }           

            public void setContraBroker(String contraBroker) {
                this.contraBroker = contraBroker;
            }
            public String getContraTrader() {
                return this.contraTrader;
            }           

            public void setContraTrader(String contraTrader) {
                this.contraTrader = contraTrader;
            }

        }
        
    }


    public static class NoLegs extends FixGroup<ExecutionReport.NoLegs.NoLegsEntry> {

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

}

