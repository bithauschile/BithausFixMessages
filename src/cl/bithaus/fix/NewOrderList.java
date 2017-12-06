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

/**
 * Fix Components Class
 * Generated for FIX 4.4
 * @author Bithaus Fix Message Generator
 */
public class NewOrderList extends FixBaseMessage {

    private String listID;           
    private String bidID;           
    private String clientBidID;           
    private Integer progRptReqs;           
    private Integer bidType;           
    private Integer progPeriodInterval;           
    private String cancellationRights;           
    private String moneyLaunderingStatus;           
    private String registID;           
    private String listExecInstType;           
    private String listExecInst;           
    private Integer encodedListExecInstLen;           
    private String encodedListExecInst;           
    private BigDecimal allowableOneSidednessPct;           
    private BigDecimal allowableOneSidednessValue;           
    private String allowableOneSidednessCurr;           
    private Integer totNoOrders;           
    private Boolean lastFragment;           
    private String exDestination;           
    private NoOrders noOrders;           

    public NewOrderList() { 
        super("E", MsgCategory.APP);
    }

    public String getListID() {
        return this.listID;
    }           

    public void setListID(String listID) {
        this.listID = listID;
    }
    public String getBidID() {
        return this.bidID;
    }           

    public void setBidID(String bidID) {
        this.bidID = bidID;
    }
    public String getClientBidID() {
        return this.clientBidID;
    }           

    public void setClientBidID(String clientBidID) {
        this.clientBidID = clientBidID;
    }
    public Integer getProgRptReqs() {
        return this.progRptReqs;
    }           

    public void setProgRptReqs(Integer progRptReqs) {
        this.progRptReqs = progRptReqs;
    }
    public Integer getBidType() {
        return this.bidType;
    }           

    public void setBidType(Integer bidType) {
        this.bidType = bidType;
    }
    public Integer getProgPeriodInterval() {
        return this.progPeriodInterval;
    }           

    public void setProgPeriodInterval(Integer progPeriodInterval) {
        this.progPeriodInterval = progPeriodInterval;
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
    public String getListExecInstType() {
        return this.listExecInstType;
    }           

    public void setListExecInstType(String listExecInstType) {
        this.listExecInstType = listExecInstType;
    }
    public String getListExecInst() {
        return this.listExecInst;
    }           

    public void setListExecInst(String listExecInst) {
        this.listExecInst = listExecInst;
    }
    public Integer getEncodedListExecInstLen() {
        return this.encodedListExecInstLen;
    }           

    public void setEncodedListExecInstLen(Integer encodedListExecInstLen) {
        this.encodedListExecInstLen = encodedListExecInstLen;
    }
    public String getEncodedListExecInst() {
        return this.encodedListExecInst;
    }           

    public void setEncodedListExecInst(String encodedListExecInst) {
        this.encodedListExecInst = encodedListExecInst;
    }
    public BigDecimal getAllowableOneSidednessPct() {
        return this.allowableOneSidednessPct;
    }           

    public void setAllowableOneSidednessPct(BigDecimal allowableOneSidednessPct) {
        this.allowableOneSidednessPct = allowableOneSidednessPct;
    }
    public BigDecimal getAllowableOneSidednessValue() {
        return this.allowableOneSidednessValue;
    }           

    public void setAllowableOneSidednessValue(BigDecimal allowableOneSidednessValue) {
        this.allowableOneSidednessValue = allowableOneSidednessValue;
    }
    public String getAllowableOneSidednessCurr() {
        return this.allowableOneSidednessCurr;
    }           

    public void setAllowableOneSidednessCurr(String allowableOneSidednessCurr) {
        this.allowableOneSidednessCurr = allowableOneSidednessCurr;
    }
    public Integer getTotNoOrders() {
        return this.totNoOrders;
    }           

    public void setTotNoOrders(Integer totNoOrders) {
        this.totNoOrders = totNoOrders;
    }
    public Boolean getLastFragment() {
        return this.lastFragment;
    }           

    public void setLastFragment(Boolean lastFragment) {
        this.lastFragment = lastFragment;
    }
    public String getExDestination() {
        return this.exDestination;
    }           

    public void setExDestination(String exDestination) {
        this.exDestination = exDestination;
    }


    public NewOrderList.NoOrders getNoOrders() {
        return this.noOrders;
    }

    public void setNoOrders(NewOrderList.NoOrders noOrders) {
        this.noOrders = noOrders;
    }
        

    public static class NoOrders extends FixGroup<NewOrderList.NoOrders.NoOrdersEntry> {

        @Override
        public int getField() {
            return 73;
        }

        public static class NoOrdersEntry {

            private String clOrdID;
            private String secondaryClOrdID;
            private Integer listSeqNo;
            private String clOrdLinkID;
            private String settlInstMode;
            private String tradeOriginationDate;
            private String tradeDate;
            private String account;
            private Integer acctIDSource;
            private Integer accountType;
            private String dayBookingInst;
            private String bookingUnit;
            private String allocID;
            private String preallocMethod;
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
            private BigDecimal prevClosePx;
            private String side;
            private Integer sideValueInd;
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
            private String settlDate2;
            private BigDecimal orderQty2;
            private BigDecimal price2;
            private String positionEffect;
            private Integer coveredOrUncovered;
            private BigDecimal maxShow;
            private Integer targetStrategy;
            private String targetStrategyParameters;
            private BigDecimal participationRate;
            private String designation;

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
            public Integer getListSeqNo() {
                return this.listSeqNo;
            }           

            public void setListSeqNo(Integer listSeqNo) {
                this.listSeqNo = listSeqNo;
            }
            public String getClOrdLinkID() {
                return this.clOrdLinkID;
            }           

            public void setClOrdLinkID(String clOrdLinkID) {
                this.clOrdLinkID = clOrdLinkID;
            }
            public String getSettlInstMode() {
                return this.settlInstMode;
            }           

            public void setSettlInstMode(String settlInstMode) {
                this.settlInstMode = settlInstMode;
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
            public String getAllocID() {
                return this.allocID;
            }           

            public void setAllocID(String allocID) {
                this.allocID = allocID;
            }
            public String getPreallocMethod() {
                return this.preallocMethod;
            }           

            public void setPreallocMethod(String preallocMethod) {
                this.preallocMethod = preallocMethod;
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
            public BigDecimal getPrevClosePx() {
                return this.prevClosePx;
            }           

            public void setPrevClosePx(BigDecimal prevClosePx) {
                this.prevClosePx = prevClosePx;
            }
            public String getSide() {
                return this.side;
            }           

            public void setSide(String side) {
                this.side = side;
            }
            public Integer getSideValueInd() {
                return this.sideValueInd;
            }           

            public void setSideValueInd(Integer sideValueInd) {
                this.sideValueInd = sideValueInd;
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
            public BigDecimal getPrice2() {
                return this.price2;
            }           

            public void setPrice2(BigDecimal price2) {
                this.price2 = price2;
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
            public String getDesignation() {
                return this.designation;
            }           

            public void setDesignation(String designation) {
                this.designation = designation;
            }

        }
        
    }

}

