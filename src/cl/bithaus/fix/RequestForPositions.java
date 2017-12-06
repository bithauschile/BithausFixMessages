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

/**
 * Fix Components Class
 * Generated for FIX 4.4
 * @author Bithaus Fix Message Generator
 */
public class RequestForPositions extends FixBaseMessage {

    private String posReqID;           
    private Integer posReqType;           
    private String matchStatus;           
    private String subscriptionRequestType;           
    private String account;           
    private Integer acctIDSource;           
    private Integer accountType;           
    private String currency;           
    private String clearingBusinessDate;           
    private String settlSessID;           
    private String settlSessSubID;           
    private Date transactTime;           
    private Integer responseTransportType;           
    private String responseDestination;           
    private String text;           
    private Integer encodedTextLen;           
    private String encodedText;           
    private Parties parties;           
    private Instrument instrument;           
    private NoLegs noLegs;           
    private NoUnderlyings noUnderlyings;           
    private NoTradingSessions noTradingSessions;           

    public RequestForPositions() { 
        super("AN", MsgCategory.APP);
    }

    public String getPosReqID() {
        return this.posReqID;
    }           

    public void setPosReqID(String posReqID) {
        this.posReqID = posReqID;
    }
    public Integer getPosReqType() {
        return this.posReqType;
    }           

    public void setPosReqType(Integer posReqType) {
        this.posReqType = posReqType;
    }
    public String getMatchStatus() {
        return this.matchStatus;
    }           

    public void setMatchStatus(String matchStatus) {
        this.matchStatus = matchStatus;
    }
    public String getSubscriptionRequestType() {
        return this.subscriptionRequestType;
    }           

    public void setSubscriptionRequestType(String subscriptionRequestType) {
        this.subscriptionRequestType = subscriptionRequestType;
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

    public RequestForPositions.NoLegs getNoLegs() {
        return this.noLegs;
    }

    public void setNoLegs(RequestForPositions.NoLegs noLegs) {
        this.noLegs = noLegs;
    }
    public RequestForPositions.NoUnderlyings getNoUnderlyings() {
        return this.noUnderlyings;
    }

    public void setNoUnderlyings(RequestForPositions.NoUnderlyings noUnderlyings) {
        this.noUnderlyings = noUnderlyings;
    }
    public RequestForPositions.NoTradingSessions getNoTradingSessions() {
        return this.noTradingSessions;
    }

    public void setNoTradingSessions(RequestForPositions.NoTradingSessions noTradingSessions) {
        this.noTradingSessions = noTradingSessions;
    }
        

    public static class NoLegs extends FixGroup<RequestForPositions.NoLegs.NoLegsEntry> {

        @Override
        public int getField() {
            return 555;
        }

        public static class NoLegsEntry {



        }
        
    }


    public static class NoUnderlyings extends FixGroup<RequestForPositions.NoUnderlyings.NoUnderlyingsEntry> {

        @Override
        public int getField() {
            return 711;
        }

        public static class NoUnderlyingsEntry {



        }
        
    }


    public static class NoTradingSessions extends FixGroup<RequestForPositions.NoTradingSessions.NoTradingSessionsEntry> {

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

