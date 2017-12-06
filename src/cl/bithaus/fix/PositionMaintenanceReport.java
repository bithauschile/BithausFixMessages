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
import cl.bithaus.fix.components.PositionQty;
import cl.bithaus.fix.components.PositionAmountData;

/**
 * Fix Components Class
 * Generated for FIX 4.4
 * @author Bithaus Fix Message Generator
 */
public class PositionMaintenanceReport extends FixBaseMessage {

    private String posMaintRptID;           
    private Integer posTransType;           
    private String posReqID;           
    private Integer posMaintAction;           
    private String origPosReqRefID;           
    private Integer posMaintStatus;           
    private Integer posMaintResult;           
    private String clearingBusinessDate;           
    private String settlSessID;           
    private String settlSessSubID;           
    private String account;           
    private Integer acctIDSource;           
    private Integer accountType;           
    private String currency;           
    private Date transactTime;           
    private Integer adjustmentType;           
    private BigDecimal thresholdAmount;           
    private String text;           
    private Integer encodedTextLen;           
    private String encodedText;           
    private Parties parties;           
    private Instrument instrument;           
    private PositionQty positionQty;           
    private PositionAmountData positionAmountData;           
    private NoLegs noLegs;           
    private NoUnderlyings noUnderlyings;           
    private NoTradingSessions noTradingSessions;           

    public PositionMaintenanceReport() { 
        super("AM", MsgCategory.APP);
    }

    public String getPosMaintRptID() {
        return this.posMaintRptID;
    }           

    public void setPosMaintRptID(String posMaintRptID) {
        this.posMaintRptID = posMaintRptID;
    }
    public Integer getPosTransType() {
        return this.posTransType;
    }           

    public void setPosTransType(Integer posTransType) {
        this.posTransType = posTransType;
    }
    public String getPosReqID() {
        return this.posReqID;
    }           

    public void setPosReqID(String posReqID) {
        this.posReqID = posReqID;
    }
    public Integer getPosMaintAction() {
        return this.posMaintAction;
    }           

    public void setPosMaintAction(Integer posMaintAction) {
        this.posMaintAction = posMaintAction;
    }
    public String getOrigPosReqRefID() {
        return this.origPosReqRefID;
    }           

    public void setOrigPosReqRefID(String origPosReqRefID) {
        this.origPosReqRefID = origPosReqRefID;
    }
    public Integer getPosMaintStatus() {
        return this.posMaintStatus;
    }           

    public void setPosMaintStatus(Integer posMaintStatus) {
        this.posMaintStatus = posMaintStatus;
    }
    public Integer getPosMaintResult() {
        return this.posMaintResult;
    }           

    public void setPosMaintResult(Integer posMaintResult) {
        this.posMaintResult = posMaintResult;
    }
    public String getClearingBusinessDate() {
        return this.clearingBusinessDate;
    }           

    public void setClearingBusinessDate(String clearingBusinessDate) {
        this.clearingBusinessDate = clearingBusinessDate;
    }
    public String getSettlSessID() {
        return this.settlSessID;
    }           

    public void setSettlSessID(String settlSessID) {
        this.settlSessID = settlSessID;
    }
    public String getSettlSessSubID() {
        return this.settlSessSubID;
    }           

    public void setSettlSessSubID(String settlSessSubID) {
        this.settlSessSubID = settlSessSubID;
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
    public String getCurrency() {
        return this.currency;
    }           

    public void setCurrency(String currency) {
        this.currency = currency;
    }
    public Date getTransactTime() {
        return this.transactTime;
    }           

    public void setTransactTime(Date transactTime) {
        this.transactTime = transactTime;
    }
    public Integer getAdjustmentType() {
        return this.adjustmentType;
    }           

    public void setAdjustmentType(Integer adjustmentType) {
        this.adjustmentType = adjustmentType;
    }
    public BigDecimal getThresholdAmount() {
        return this.thresholdAmount;
    }           

    public void setThresholdAmount(BigDecimal thresholdAmount) {
        this.thresholdAmount = thresholdAmount;
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
    
    public PositionQty getPositionQty() {
        return this.positionQty;
    }           

    public void setPositionQty(PositionQty positionQty) {
        this.positionQty = positionQty;
    }
    
    public PositionAmountData getPositionAmountData() {
        return this.positionAmountData;
    }           

    public void setPositionAmountData(PositionAmountData positionAmountData) {
        this.positionAmountData = positionAmountData;
    }

    public PositionMaintenanceReport.NoLegs getNoLegs() {
        return this.noLegs;
    }

    public void setNoLegs(PositionMaintenanceReport.NoLegs noLegs) {
        this.noLegs = noLegs;
    }
    public PositionMaintenanceReport.NoUnderlyings getNoUnderlyings() {
        return this.noUnderlyings;
    }

    public void setNoUnderlyings(PositionMaintenanceReport.NoUnderlyings noUnderlyings) {
        this.noUnderlyings = noUnderlyings;
    }
    public PositionMaintenanceReport.NoTradingSessions getNoTradingSessions() {
        return this.noTradingSessions;
    }

    public void setNoTradingSessions(PositionMaintenanceReport.NoTradingSessions noTradingSessions) {
        this.noTradingSessions = noTradingSessions;
    }
        

    public static class NoLegs extends FixGroup<PositionMaintenanceReport.NoLegs.NoLegsEntry> {

        @Override
        public int getField() {
            return 555;
        }

        public static class NoLegsEntry {



        }
        
    }


    public static class NoUnderlyings extends FixGroup<PositionMaintenanceReport.NoUnderlyings.NoUnderlyingsEntry> {

        @Override
        public int getField() {
            return 711;
        }

        public static class NoUnderlyingsEntry {



        }
        
    }


    public static class NoTradingSessions extends FixGroup<PositionMaintenanceReport.NoTradingSessions.NoTradingSessionsEntry> {

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

}

