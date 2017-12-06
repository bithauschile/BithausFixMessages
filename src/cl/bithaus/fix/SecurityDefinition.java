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
public class SecurityDefinition extends FixBaseMessage {

    private String securityReqID;           
    private String securityResponseID;           
    private Integer securityResponseType;           
    private String currency;           
    private String tradingSessionID;           
    private String tradingSessionSubID;           
    private String text;           
    private Integer encodedTextLen;           
    private String encodedText;           
    private Integer expirationCycle;           
    private BigDecimal roundLot;           
    private BigDecimal minTradeVol;           
    private Instrument instrument;           
    private InstrumentExtension instrumentExtension;           
    private NoUnderlyings noUnderlyings;           
    private NoLegs noLegs;           

    public SecurityDefinition() { 
        super("d", MsgCategory.APP);
    }

    public String getSecurityReqID() {
        return this.securityReqID;
    }           

    public void setSecurityReqID(String securityReqID) {
        this.securityReqID = securityReqID;
    }
    public String getSecurityResponseID() {
        return this.securityResponseID;
    }           

    public void setSecurityResponseID(String securityResponseID) {
        this.securityResponseID = securityResponseID;
    }
    public Integer getSecurityResponseType() {
        return this.securityResponseType;
    }           

    public void setSecurityResponseType(Integer securityResponseType) {
        this.securityResponseType = securityResponseType;
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
    public Integer getExpirationCycle() {
        return this.expirationCycle;
    }           

    public void setExpirationCycle(Integer expirationCycle) {
        this.expirationCycle = expirationCycle;
    }
    public BigDecimal getRoundLot() {
        return this.roundLot;
    }           

    public void setRoundLot(BigDecimal roundLot) {
        this.roundLot = roundLot;
    }
    public BigDecimal getMinTradeVol() {
        return this.minTradeVol;
    }           

    public void setMinTradeVol(BigDecimal minTradeVol) {
        this.minTradeVol = minTradeVol;
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

    public SecurityDefinition.NoUnderlyings getNoUnderlyings() {
        return this.noUnderlyings;
    }

    public void setNoUnderlyings(SecurityDefinition.NoUnderlyings noUnderlyings) {
        this.noUnderlyings = noUnderlyings;
    }
    public SecurityDefinition.NoLegs getNoLegs() {
        return this.noLegs;
    }

    public void setNoLegs(SecurityDefinition.NoLegs noLegs) {
        this.noLegs = noLegs;
    }
        

    public static class NoUnderlyings extends FixGroup<SecurityDefinition.NoUnderlyings.NoUnderlyingsEntry> {

        @Override
        public int getField() {
            return 711;
        }

        public static class NoUnderlyingsEntry {



        }
        
    }


    public static class NoLegs extends FixGroup<SecurityDefinition.NoLegs.NoLegsEntry> {

        @Override
        public int getField() {
            return 555;
        }

        public static class NoLegsEntry {



        }
        
    }

}

