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

/**
 * Fix Components Class
 * Generated for FIX 4.4
 * @author Bithaus Fix Message Generator
 */
public class TradeCaptureReportRequestAck extends FixBaseMessage {

    private String tradeRequestID;           
    private Integer tradeRequestType;           
    private String subscriptionRequestType;           
    private Integer totNumTradeReports;           
    private Integer tradeRequestResult;           
    private Integer tradeRequestStatus;           
    private String multiLegReportingType;           
    private Integer responseTransportType;           
    private String responseDestination;           
    private String text;           
    private Integer encodedTextLen;           
    private String encodedText;           
    private Instrument instrument;           
    private NoUnderlyings noUnderlyings;           
    private NoLegs noLegs;           

    public TradeCaptureReportRequestAck() { 
        super("AQ", MsgCategory.APP);
    }

    public String getTradeRequestID() {
        return this.tradeRequestID;
    }           

    public void setTradeRequestID(String tradeRequestID) {
        this.tradeRequestID = tradeRequestID;
    }
    public Integer getTradeRequestType() {
        return this.tradeRequestType;
    }           

    public void setTradeRequestType(Integer tradeRequestType) {
        this.tradeRequestType = tradeRequestType;
    }
    public String getSubscriptionRequestType() {
        return this.subscriptionRequestType;
    }           

    public void setSubscriptionRequestType(String subscriptionRequestType) {
        this.subscriptionRequestType = subscriptionRequestType;
    }
    public Integer getTotNumTradeReports() {
        return this.totNumTradeReports;
    }           

    public void setTotNumTradeReports(Integer totNumTradeReports) {
        this.totNumTradeReports = totNumTradeReports;
    }
    public Integer getTradeRequestResult() {
        return this.tradeRequestResult;
    }           

    public void setTradeRequestResult(Integer tradeRequestResult) {
        this.tradeRequestResult = tradeRequestResult;
    }
    public Integer getTradeRequestStatus() {
        return this.tradeRequestStatus;
    }           

    public void setTradeRequestStatus(Integer tradeRequestStatus) {
        this.tradeRequestStatus = tradeRequestStatus;
    }
    public String getMultiLegReportingType() {
        return this.multiLegReportingType;
    }           

    public void setMultiLegReportingType(String multiLegReportingType) {
        this.multiLegReportingType = multiLegReportingType;
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

    
    public Instrument getInstrument() {
        return this.instrument;
    }           

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }

    public TradeCaptureReportRequestAck.NoUnderlyings getNoUnderlyings() {
        return this.noUnderlyings;
    }

    public void setNoUnderlyings(TradeCaptureReportRequestAck.NoUnderlyings noUnderlyings) {
        this.noUnderlyings = noUnderlyings;
    }
    public TradeCaptureReportRequestAck.NoLegs getNoLegs() {
        return this.noLegs;
    }

    public void setNoLegs(TradeCaptureReportRequestAck.NoLegs noLegs) {
        this.noLegs = noLegs;
    }
        

    public static class NoUnderlyings extends FixGroup<TradeCaptureReportRequestAck.NoUnderlyings.NoUnderlyingsEntry> {

        @Override
        public int getField() {
            return 711;
        }

        public static class NoUnderlyingsEntry {



        }
        
    }


    public static class NoLegs extends FixGroup<TradeCaptureReportRequestAck.NoLegs.NoLegsEntry> {

        @Override
        public int getField() {
            return 555;
        }

        public static class NoLegsEntry {



        }
        
    }

}

