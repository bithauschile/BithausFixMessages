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
import cl.bithaus.fix.components.OrderQtyData;
import cl.bithaus.fix.components.CommissionData;
import cl.bithaus.fix.components.PegInstructions;
import cl.bithaus.fix.components.DiscretionInstructions;
import cl.bithaus.fix.components.IIFValorization;
import cl.bithaus.fix.components.IRFValorization;

/**
 * Fix Components Class
 * Generated for FIX 4.4
 * @author Bithaus Fix Message Generator
 */
public class MultilegOrderCancelReplaceRequest extends FixBaseMessage {

    private String orderID;           
    private String origClOrdID;           
    private String clOrdID;           
    private String secondaryClOrdID;           
    private String clOrdLinkID;           
    private Date origOrdModTime;           
    private String tradeOriginationDate;           
    private String tradeDate;           
    private String account;           
    private Integer acctIDSource;           
    private Integer accountType;           
    private String dayBookingInst;           
    private String bookingUnit;           
    private String preallocMethod;           
    private String allocID;           
    private String settlType;           
    private String settlDate;           
    private String cashMargin;           
    private String clearingFeeIndicator;           
    private String handlInst;           
    private String execInst;           
    private BigDecimal minQty;           
    private BigDecimal maxFloor;           
    private String exDestination;           
    private String processCode;           
    private String side;           
    private BigDecimal prevClosePx;           
    private Boolean locateReqd;           
    private Date transactTime;           
    private Integer qtyType;           
    private String ordType;           
    private Integer priceType;           
    private BigDecimal price;           
    private BigDecimal stopPx;           
    private String currency;           
    private String complianceID;           
    private Boolean solicitedFlag;           
    private String iOIid;           
    private String quoteID;           
    private String timeInForce;           
    private Date effectiveTime;           
    private String expireDate;           
    private Date expireTime;           
    private Integer gTBookingInst;           
    private String orderCapacity;           
    private String orderRestrictions;           
    private Integer custOrderCapacity;           
    private Boolean forexReq;           
    private String settlCurrency;           
    private Integer bookingType;           
    private String text;           
    private Integer encodedTextLen;           
    private String encodedText;           
    private String positionEffect;           
    private Integer coveredOrUncovered;           
    private BigDecimal maxShow;           
    private Integer targetStrategy;           
    private String targetStrategyParameters;           
    private BigDecimal participationRate;           
    private String cancellationRights;           
    private String moneyLaunderingStatus;           
    private String registID;           
    private String designation;           
    private Integer multiLegRptTypeReq;           
    private Parties parties;           
    private Instrument instrument;           
    private OrderQtyData orderQtyData;           
    private CommissionData commissionData;           
    private PegInstructions pegInstructions;           
    private DiscretionInstructions discretionInstructions;           
    private IIFValorization iIFValorization;           
    private IRFValorization iRFValorization;           
    private NoAllocs noAllocs;           
    private NoTradingSessions noTradingSessions;           
    private NoUnderlyings noUnderlyings;           
    private NoLegs noLegs;           

    public MultilegOrderCancelReplaceRequest() { 
        super("AC", MsgCategory.APP);
    }

    public String getOrderID() {
        return this.orderID;
    }           

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }
    public String getOrigClOrdID() {
        return this.origClOrdID;
    }           

    public void setOrigClOrdID(String origClOrdID) {
        this.origClOrdID = origClOrdID;
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
    public String getClOrdLinkID() {
        return this.clOrdLinkID;
    }           

    public void setClOrdLinkID(String clOrdLinkID) {
        this.clOrdLinkID = clOrdLinkID;
    }
    public Date getOrigOrdModTime() {
        return this.origOrdModTime;
    }           

    public void setOrigOrdModTime(Date origOrdModTime) {
        this.origOrdModTime = origOrdModTime;
    }
    public String getTradeOriginationDate() {
        return this.tradeOriginationDate;
    }           

    public void setTradeOriginationDate(String tradeOriginationDate) {
        this.tradeOriginationDate = tradeOriginationDate;
    }
    public String getTradeDate() {
        return this.tradeDate;
    }           

    public void setTradeDate(String tradeDate) {
        this.tradeDate = tradeDate;
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
    public String getDayBookingInst() {
        return this.dayBookingInst;
    }           

    public void setDayBookingInst(String dayBookingInst) {
        this.dayBookingInst = dayBookingInst;
    }
    public String getBookingUnit() {
        return this.bookingUnit;
    }           

    public void setBookingUnit(String bookingUnit) {
        this.bookingUnit = bookingUnit;
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
    public String getHandlInst() {
        return this.handlInst;
    }           

    public void setHandlInst(String handlInst) {
        this.handlInst = handlInst;
    }
    public String getExecInst() {
        return this.execInst;
    }           

    public void setExecInst(String execInst) {
        this.execInst = execInst;
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
    public String getExDestination() {
        return this.exDestination;
    }           

    public void setExDestination(String exDestination) {
        this.exDestination = exDestination;
    }
    public String getProcessCode() {
        return this.processCode;
    }           

    public void setProcessCode(String processCode) {
        this.processCode = processCode;
    }
    public String getSide() {
        return this.side;
    }           

    public void setSide(String side) {
        this.side = side;
    }
    public BigDecimal getPrevClosePx() {
        return this.prevClosePx;
    }           

    public void setPrevClosePx(BigDecimal prevClosePx) {
        this.prevClosePx = prevClosePx;
    }
    public Boolean getLocateReqd() {
        return this.locateReqd;
    }           

    public void setLocateReqd(Boolean locateReqd) {
        this.locateReqd = locateReqd;
    }
    public Date getTransactTime() {
        return this.transactTime;
    }           

    public void setTransactTime(Date transactTime) {
        this.transactTime = transactTime;
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
    public String getIOIid() {
        return this.iOIid;
    }           

    public void setIOIid(String iOIid) {
        this.iOIid = iOIid;
    }
    public String getQuoteID() {
        return this.quoteID;
    }           

    public void setQuoteID(String quoteID) {
        this.quoteID = quoteID;
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
    public Integer getGTBookingInst() {
        return this.gTBookingInst;
    }           

    public void setGTBookingInst(Integer gTBookingInst) {
        this.gTBookingInst = gTBookingInst;
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
    public Boolean getForexReq() {
        return this.forexReq;
    }           

    public void setForexReq(Boolean forexReq) {
        this.forexReq = forexReq;
    }
    public String getSettlCurrency() {
        return this.settlCurrency;
    }           

    public void setSettlCurrency(String settlCurrency) {
        this.settlCurrency = settlCurrency;
    }
    public Integer getBookingType() {
        return this.bookingType;
    }           

    public void setBookingType(Integer bookingType) {
        this.bookingType = bookingType;
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
    public String getPositionEffect() {
        return this.positionEffect;
    }           

    public void setPositionEffect(String positionEffect) {
        this.positionEffect = positionEffect;
    }
    public Integer getCoveredOrUncovered() {
        return this.coveredOrUncovered;
    }           

    public void setCoveredOrUncovered(Integer coveredOrUncovered) {
        this.coveredOrUncovered = coveredOrUncovered;
    }
    public BigDecimal getMaxShow() {
        return this.maxShow;
    }           

    public void setMaxShow(BigDecimal maxShow) {
        this.maxShow = maxShow;
    }
    public Integer getTargetStrategy() {
        return this.targetStrategy;
    }           

    public void setTargetStrategy(Integer targetStrategy) {
        this.targetStrategy = targetStrategy;
    }
    public String getTargetStrategyParameters() {
        return this.targetStrategyParameters;
    }           

    public void setTargetStrategyParameters(String targetStrategyParameters) {
        this.targetStrategyParameters = targetStrategyParameters;
    }
    public BigDecimal getParticipationRate() {
        return this.participationRate;
    }           

    public void setParticipationRate(BigDecimal participationRate) {
        this.participationRate = participationRate;
    }
    public String getCancellationRights() {
        return this.cancellationRights;
    }           

    public void setCancellationRights(String cancellationRights) {
        this.cancellationRights = cancellationRights;
    }
    public String getMoneyLaunderingStatus() {
        return this.moneyLaunderingStatus;
    }           

    public void setMoneyLaunderingStatus(String moneyLaunderingStatus) {
        this.moneyLaunderingStatus = moneyLaunderingStatus;
    }
    public String getRegistID() {
        return this.registID;
    }           

    public void setRegistID(String registID) {
        this.registID = registID;
    }
    public String getDesignation() {
        return this.designation;
    }           

    public void setDesignation(String designation) {
        this.designation = designation;
    }
    public Integer getMultiLegRptTypeReq() {
        return this.multiLegRptTypeReq;
    }           

    public void setMultiLegRptTypeReq(Integer multiLegRptTypeReq) {
        this.multiLegRptTypeReq = multiLegRptTypeReq;
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
    
    public OrderQtyData getOrderQtyData() {
        return this.orderQtyData;
    }           

    public void setOrderQtyData(OrderQtyData orderQtyData) {
        this.orderQtyData = orderQtyData;
    }
    
    public CommissionData getCommissionData() {
        return this.commissionData;
    }           

    public void setCommissionData(CommissionData commissionData) {
        this.commissionData = commissionData;
    }
    
    public PegInstructions getPegInstructions() {
        return this.pegInstructions;
    }           

    public void setPegInstructions(PegInstructions pegInstructions) {
        this.pegInstructions = pegInstructions;
    }
    
    public DiscretionInstructions getDiscretionInstructions() {
        return this.discretionInstructions;
    }           

    public void setDiscretionInstructions(DiscretionInstructions discretionInstructions) {
        this.discretionInstructions = discretionInstructions;
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

    public MultilegOrderCancelReplaceRequest.NoAllocs getNoAllocs() {
        return this.noAllocs;
    }

    public void setNoAllocs(MultilegOrderCancelReplaceRequest.NoAllocs noAllocs) {
        this.noAllocs = noAllocs;
    }
    public MultilegOrderCancelReplaceRequest.NoTradingSessions getNoTradingSessions() {
        return this.noTradingSessions;
    }

    public void setNoTradingSessions(MultilegOrderCancelReplaceRequest.NoTradingSessions noTradingSessions) {
        this.noTradingSessions = noTradingSessions;
    }
    public MultilegOrderCancelReplaceRequest.NoUnderlyings getNoUnderlyings() {
        return this.noUnderlyings;
    }

    public void setNoUnderlyings(MultilegOrderCancelReplaceRequest.NoUnderlyings noUnderlyings) {
        this.noUnderlyings = noUnderlyings;
    }
    public MultilegOrderCancelReplaceRequest.NoLegs getNoLegs() {
        return this.noLegs;
    }

    public void setNoLegs(MultilegOrderCancelReplaceRequest.NoLegs noLegs) {
        this.noLegs = noLegs;
    }
        

    public static class NoAllocs extends FixGroup<MultilegOrderCancelReplaceRequest.NoAllocs.NoAllocsEntry> {

        @Override
        public int getField() {
            return 78;
        }

        public static class NoAllocsEntry {

            private String allocAccount;
            private Integer allocAcctIDSource;
            private String allocSettlCurrency;
            private String individualAllocID;
            private BigDecimal allocQty;

            public String getAllocAccount() {
                return this.allocAccount;
            }           

            public void setAllocAccount(String allocAccount) {
                this.allocAccount = allocAccount;
            }
            public Integer getAllocAcctIDSource() {
                return this.allocAcctIDSource;
            }           

            public void setAllocAcctIDSource(Integer allocAcctIDSource) {
                this.allocAcctIDSource = allocAcctIDSource;
            }
            public String getAllocSettlCurrency() {
                return this.allocSettlCurrency;
            }           

            public void setAllocSettlCurrency(String allocSettlCurrency) {
                this.allocSettlCurrency = allocSettlCurrency;
            }
            public String getIndividualAllocID() {
                return this.individualAllocID;
            }           

            public void setIndividualAllocID(String individualAllocID) {
                this.individualAllocID = individualAllocID;
            }
            public BigDecimal getAllocQty() {
                return this.allocQty;
            }           

            public void setAllocQty(BigDecimal allocQty) {
                this.allocQty = allocQty;
            }

        }
        
    }


    public static class NoTradingSessions extends FixGroup<MultilegOrderCancelReplaceRequest.NoTradingSessions.NoTradingSessionsEntry> {

        @Override
        public int getField() {
            return 386;
        }

        public static class NoTradingSessionsEntry {

            private String tradingSessionID;
            private String tradingSessionSubID;

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

        }
        
    }


    public static class NoUnderlyings extends FixGroup<MultilegOrderCancelReplaceRequest.NoUnderlyings.NoUnderlyingsEntry> {

        @Override
        public int getField() {
            return 711;
        }

        public static class NoUnderlyingsEntry {



        }
        
    }


    public static class NoLegs extends FixGroup<MultilegOrderCancelReplaceRequest.NoLegs.NoLegsEntry> {

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
            public String getTargetLegRefId() {
                return this.targetLegRefId;
            }           

            public void setTargetLegRefId(String targetLegRefId) {
                this.targetLegRefId = targetLegRefId;
            }

        }
        
    }

}

