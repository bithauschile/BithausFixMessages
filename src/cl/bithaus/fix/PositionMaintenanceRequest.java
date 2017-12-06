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

/**
 * Fix Components Class
 * Generated for FIX 4.4
 * @author Bithaus Fix Message Generator
 */
public class PositionMaintenanceRequest extends FixBaseMessage {

    private String posReqID;           
    private Integer posTransType;           
    private Integer posMaintAction;           
    private String origPosReqRefID;           
    private String posMaintRptRefID;           
    private String clearingBusinessDate;           
    private String settlSessID;           
    private String settlSessSubID;           
    private String account;           
    private Integer acctIDSource;           
    private Integer accountType;           
    private String currency;           
    private Date transactTime;           
    private Integer adjustmentType;           
    private Boolean contraryInstructionIndicator;           
    private Boolean priorSpreadIndicator;           
    private BigDecimal thresholdAmount;           
    private String text;           
    private Integer encodedTextLen;           
    private String encodedText;           
    private Parties parties;           
    private Instrument instrument;           
    private PositionQty positionQty;           
    private NoLegs noLegs;           
    private NoUnderlyings noUnderlyings;           
    private NoTradingSessions noTradingSessions;           

    public PositionMaintenanceRequest() { 
        super("AL", MsgCategory.APP);
    }

    public String getPosReqID() {
        return this.posReqID;
    }           

    public void setPosReqID(String posReqID) {
        this.posReqID = posReqID;
    }
    public Integer getPosTransType() {
        return this.posTransType;
    }           

    public void setPosTransType(Integer posTransType) {
        this.posTransType = posTransType;
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
    public String getPosMaintRptRefID() {
        return this.posMaintRptRefID;
    }           

    public void setPosMaintRptRefID(String posMaintRptRefID) {
        this.posMaintRptRefID = posMaintRptRefID;
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
    public Boolean getContraryInstructionIndicator() {
        return this.contraryInstructionIndicator;
    }           

    public void setContraryInstructionIndicator(Boolean contraryInstructionIndicator) {
        this.contraryInstructionIndicator = contraryInstructionIndicator;
    }
    public Boolean getPriorSpreadIndicator() {
        return this.priorSpreadIndicator;
    }           

    public void setPriorSpreadIndicator(Boolean priorSpreadIndicator) {
        this.priorSpreadIndicator = priorSpreadIndicator;
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

    public PositionMaintenanceRequest.NoLegs getNoLegs() {
        return this.noLegs;
    }

    public void setNoLegs(PositionMaintenanceRequest.NoLegs noLegs) {
        this.noLegs = noLegs;
    }
    public PositionMaintenanceRequest.NoUnderlyings getNoUnderlyings() {
        return this.noUnderlyings;
    }

    public void setNoUnderlyings(PositionMaintenanceRequest.NoUnderlyings noUnderlyings) {
        this.noUnderlyings = noUnderlyings;
    }
    public PositionMaintenanceRequest.NoTradingSessions getNoTradingSessions() {
        return this.noTradingSessions;
    }

    public void setNoTradingSessions(PositionMaintenanceRequest.NoTradingSessions noTradingSessions) {
        this.noTradingSessions = noTradingSessions;
    }
        

    public static class NoLegs extends FixGroup<PositionMaintenanceRequest.NoLegs.NoLegsEntry> {

        @Override
        public int getField() {
            return 555;
        }

        public static class NoLegsEntry {



        }
        
    }


    public static class NoUnderlyings extends FixGroup<PositionMaintenanceRequest.NoUnderlyings.NoUnderlyingsEntry> {

        @Override
        public int getField() {
            return 711;
        }

        public static class NoUnderlyingsEntry {



        }
        
    }


    public static class NoTradingSessions extends FixGroup<PositionMaintenanceRequest.NoTradingSessions.NoTradingSessionsEntry> {

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

