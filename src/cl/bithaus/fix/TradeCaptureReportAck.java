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
import cl.bithaus.fix.components.TrdRegTimestamps;

/**
 * Fix Components Class
 * Generated for FIX 4.4
 * @author Bithaus Fix Message Generator
 */
public class TradeCaptureReportAck extends FixBaseMessage {

    private String tradeReportID;           
    private Integer tradeReportTransType;           
    private Integer tradeReportType;           
    private Integer trdType;           
    private Integer trdSubType;           
    private Integer secondaryTrdType;           
    private String transferReason;           
    private String execType;           
    private String tradeReportRefID;           
    private String secondaryTradeReportRefID;           
    private Integer trdRptStatus;           
    private Integer tradeReportRejectReason;           
    private String secondaryTradeReportID;           
    private String subscriptionRequestType;           
    private String tradeLinkID;           
    private String trdMatchID;           
    private String execID;           
    private String secondaryExecID;           
    private Date transactTime;           
    private Integer responseTransportType;           
    private String responseDestination;           
    private String text;           
    private Integer encodedTextLen;           
    private String encodedText;           
    private String clearingFeeIndicator;           
    private String orderCapacity;           
    private String orderRestrictions;           
    private Integer custOrderCapacity;           
    private String account;           
    private Integer acctIDSource;           
    private Integer accountType;           
    private String positionEffect;           
    private String preallocMethod;           
    private Instrument instrument;           
    private TrdRegTimestamps trdRegTimestamps;           
    private NoLegs noLegs;           
    private NoAllocs noAllocs;           

    public TradeCaptureReportAck() { 
        super("AR", MsgCategory.APP);
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
    public Integer getTrdRptStatus() {
        return this.trdRptStatus;
    }           

    public void setTrdRptStatus(Integer trdRptStatus) {
        this.trdRptStatus = trdRptStatus;
    }
    public Integer getTradeReportRejectReason() {
        return this.tradeReportRejectReason;
    }           

    public void setTradeReportRejectReason(Integer tradeReportRejectReason) {
        this.tradeReportRejectReason = tradeReportRejectReason;
    }
    public String getSecondaryTradeReportID() {
        return this.secondaryTradeReportID;
    }           

    public void setSecondaryTradeReportID(String secondaryTradeReportID) {
        this.secondaryTradeReportID = secondaryTradeReportID;
    }
    public String getSubscriptionRequestType() {
        return this.subscriptionRequestType;
    }           

    public void setSubscriptionRequestType(String subscriptionRequestType) {
        this.subscriptionRequestType = subscriptionRequestType;
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
    public String getSecondaryExecID() {
        return this.secondaryExecID;
    }           

    public void setSecondaryExecID(String secondaryExecID) {
        this.secondaryExecID = secondaryExecID;
    }
    public Date getTransactTime() {
        return this.transactTime;
    }           

    public void setTransactTime(Date transactTime) {
        this.transactTime = transactTime;
    }
    public Integer getResponseTransportType() {
        return this.responseTransportType;
    }           

    public void setResponseTransportType(Integer responseTransportType) {
        this.responseTransportType = responseTransportType;
    }
    public String getResponseDestination() {
        return this.responseDestination;
    }           

    public void setResponseDestination(String responseDestination) {
        this.responseDestination = responseDestination;
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
    public String getClearingFeeIndicator() {
        return this.clearingFeeIndicator;
    }           

    public void setClearingFeeIndicator(String clearingFeeIndicator) {
        this.clearingFeeIndicator = clearingFeeIndicator;
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
    public String getPositionEffect() {
        return this.positionEffect;
    }           

    public void setPositionEffect(String positionEffect) {
        this.positionEffect = positionEffect;
    }
    public String getPreallocMethod() {
        return this.preallocMethod;
    }           

    public void setPreallocMethod(String preallocMethod) {
        this.preallocMethod = preallocMethod;
    }

    
    public Instrument getInstrument() {
        return this.instrument;
    }           

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }
    
    public TrdRegTimestamps getTrdRegTimestamps() {
        return this.trdRegTimestamps;
    }           

    public void setTrdRegTimestamps(TrdRegTimestamps trdRegTimestamps) {
        this.trdRegTimestamps = trdRegTimestamps;
    }

    public TradeCaptureReportAck.NoLegs getNoLegs() {
        return this.noLegs;
    }

    public void setNoLegs(TradeCaptureReportAck.NoLegs noLegs) {
        this.noLegs = noLegs;
    }
    public TradeCaptureReportAck.NoAllocs getNoAllocs() {
        return this.noAllocs;
    }

    public void setNoAllocs(TradeCaptureReportAck.NoAllocs noAllocs) {
        this.noAllocs = noAllocs;
    }
        

    public static class NoLegs extends FixGroup<TradeCaptureReportAck.NoLegs.NoLegsEntry> {

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


    public static class NoAllocs extends FixGroup<TradeCaptureReportAck.NoAllocs.NoAllocsEntry> {

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

}

