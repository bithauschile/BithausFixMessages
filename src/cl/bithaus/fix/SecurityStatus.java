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
import cl.bithaus.fix.components.InstrumentExtension;

/**
 * Fix Components Class
 * Generated for FIX 4.4
 * @author Bithaus Fix Message Generator
 */
public class SecurityStatus extends FixBaseMessage {

    private String securityStatusReqID;           
    private String currency;           
    private String tradingSessionID;           
    private String tradingSessionSubID;           
    private Boolean unsolicitedIndicator;           
    private Integer securityTradingStatus;           
    private String financialStatus;           
    private String corporateAction;           
    private String haltReason;           
    private Boolean inViewOfCommon;           
    private Boolean dueToRelated;           
    private BigDecimal buyVolume;           
    private BigDecimal sellVolume;           
    private BigDecimal highPx;           
    private BigDecimal lowPx;           
    private BigDecimal lastPx;           
    private Date transactTime;           
    private Integer adjustment;           
    private String text;           
    private Integer encodedTextLen;           
    private String encodedText;           
    private Instrument instrument;           
    private InstrumentExtension instrumentExtension;           
    private NoUnderlyings noUnderlyings;           
    private NoLegs noLegs;           

    public SecurityStatus() { 
        super("f", MsgCategory.APP);
    }

    public String getSecurityStatusReqID() {
        return this.securityStatusReqID;
    }           

    public void setSecurityStatusReqID(String securityStatusReqID) {
        this.securityStatusReqID = securityStatusReqID;
    }
    public String getCurrency() {
        return this.currency;
    }           

    public void setCurrency(String currency) {
        this.currency = currency;
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
    public Boolean getUnsolicitedIndicator() {
        return this.unsolicitedIndicator;
    }           

    public void setUnsolicitedIndicator(Boolean unsolicitedIndicator) {
        this.unsolicitedIndicator = unsolicitedIndicator;
    }
    public Integer getSecurityTradingStatus() {
        return this.securityTradingStatus;
    }           

    public void setSecurityTradingStatus(Integer securityTradingStatus) {
        this.securityTradingStatus = securityTradingStatus;
    }
    public String getFinancialStatus() {
        return this.financialStatus;
    }           

    public void setFinancialStatus(String financialStatus) {
        this.financialStatus = financialStatus;
    }
    public String getCorporateAction() {
        return this.corporateAction;
    }           

    public void setCorporateAction(String corporateAction) {
        this.corporateAction = corporateAction;
    }
    public String getHaltReason() {
        return this.haltReason;
    }           

    public void setHaltReason(String haltReason) {
        this.haltReason = haltReason;
    }
    public Boolean getInViewOfCommon() {
        return this.inViewOfCommon;
    }           

    public void setInViewOfCommon(Boolean inViewOfCommon) {
        this.inViewOfCommon = inViewOfCommon;
    }
    public Boolean getDueToRelated() {
        return this.dueToRelated;
    }           

    public void setDueToRelated(Boolean dueToRelated) {
        this.dueToRelated = dueToRelated;
    }
    public BigDecimal getBuyVolume() {
        return this.buyVolume;
    }           

    public void setBuyVolume(BigDecimal buyVolume) {
        this.buyVolume = buyVolume;
    }
    public BigDecimal getSellVolume() {
        return this.sellVolume;
    }           

    public void setSellVolume(BigDecimal sellVolume) {
        this.sellVolume = sellVolume;
    }
    public BigDecimal getHighPx() {
        return this.highPx;
    }           

    public void setHighPx(BigDecimal highPx) {
        this.highPx = highPx;
    }
    public BigDecimal getLowPx() {
        return this.lowPx;
    }           

    public void setLowPx(BigDecimal lowPx) {
        this.lowPx = lowPx;
    }
    public BigDecimal getLastPx() {
        return this.lastPx;
    }           

    public void setLastPx(BigDecimal lastPx) {
        this.lastPx = lastPx;
    }
    public Date getTransactTime() {
        return this.transactTime;
    }           

    public void setTransactTime(Date transactTime) {
        this.transactTime = transactTime;
    }
    public Integer getAdjustment() {
        return this.adjustment;
    }           

    public void setAdjustment(Integer adjustment) {
        this.adjustment = adjustment;
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

    
    public Instrument getInstrument() {
        return this.instrument;
    }           

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }
    
    public InstrumentExtension getInstrumentExtension() {
        return this.instrumentExtension;
    }           

    public void setInstrumentExtension(InstrumentExtension instrumentExtension) {
        this.instrumentExtension = instrumentExtension;
    }

    public SecurityStatus.NoUnderlyings getNoUnderlyings() {
        return this.noUnderlyings;
    }

    public void setNoUnderlyings(SecurityStatus.NoUnderlyings noUnderlyings) {
        this.noUnderlyings = noUnderlyings;
    }
    public SecurityStatus.NoLegs getNoLegs() {
        return this.noLegs;
    }

    public void setNoLegs(SecurityStatus.NoLegs noLegs) {
        this.noLegs = noLegs;
    }
        

    public static class NoUnderlyings extends FixGroup<SecurityStatus.NoUnderlyings.NoUnderlyingsEntry> {

        @Override
        public int getField() {
            return 711;
        }

        public static class NoUnderlyingsEntry {



        }
        
    }


    public static class NoLegs extends FixGroup<SecurityStatus.NoLegs.NoLegsEntry> {

        @Override
        public int getField() {
            return 555;
        }

        public static class NoLegsEntry {



        }
        
    }

}

