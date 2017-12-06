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
import cl.bithaus.fix.components.FinancingDetails;

/**
 * Fix Components Class
 * Generated for FIX 4.4
 * @author Bithaus Fix Message Generator
 */
public class SecurityListRequest extends FixBaseMessage {

    private String securityReqID;           
    private Integer securityListRequestType;           
    private String currency;           
    private String text;           
    private Integer encodedTextLen;           
    private String encodedText;           
    private String tradingSessionID;           
    private String tradingSessionSubID;           
    private String subscriptionRequestType;           
    private Instrument instrument;           
    private InstrumentExtension instrumentExtension;           
    private FinancingDetails financingDetails;           
    private NoUnderlyings noUnderlyings;           
    private NoLegs noLegs;           

    public SecurityListRequest() { 
        super("x", MsgCategory.APP);
    }

    public String getSecurityReqID() {
        return this.securityReqID;
    }           

    public void setSecurityReqID(String securityReqID) {
        this.securityReqID = securityReqID;
    }
    public Integer getSecurityListRequestType() {
        return this.securityListRequestType;
    }           

    public void setSecurityListRequestType(Integer securityListRequestType) {
        this.securityListRequestType = securityListRequestType;
    }
    public String getCurrency() {
        return this.currency;
    }           

    public void setCurrency(String currency) {
        this.currency = currency;
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
    public String getSubscriptionRequestType() {
        return this.subscriptionRequestType;
    }           

    public void setSubscriptionRequestType(String subscriptionRequestType) {
        this.subscriptionRequestType = subscriptionRequestType;
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
    
    public FinancingDetails getFinancingDetails() {
        return this.financingDetails;
    }           

    public void setFinancingDetails(FinancingDetails financingDetails) {
        this.financingDetails = financingDetails;
    }

    public SecurityListRequest.NoUnderlyings getNoUnderlyings() {
        return this.noUnderlyings;
    }

    public void setNoUnderlyings(SecurityListRequest.NoUnderlyings noUnderlyings) {
        this.noUnderlyings = noUnderlyings;
    }
    public SecurityListRequest.NoLegs getNoLegs() {
        return this.noLegs;
    }

    public void setNoLegs(SecurityListRequest.NoLegs noLegs) {
        this.noLegs = noLegs;
    }
        

    public static class NoUnderlyings extends FixGroup<SecurityListRequest.NoUnderlyings.NoUnderlyingsEntry> {

        @Override
        public int getField() {
            return 711;
        }

        public static class NoUnderlyingsEntry {



        }
        
    }


    public static class NoLegs extends FixGroup<SecurityListRequest.NoLegs.NoLegsEntry> {

        @Override
        public int getField() {
            return 555;
        }

        public static class NoLegsEntry {



        }
        
    }

}

