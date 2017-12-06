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
import cl.bithaus.fix.components.InstrumentExtension;
import cl.bithaus.fix.components.FinancingDetails;

/**
 * Fix Components Class
 * Generated for FIX 4.4
 * @author Bithaus Fix Message Generator
 */
public class TradeCaptureReportRequest extends FixBaseMessage {

    private String tradeRequestID;           
    private Integer tradeRequestType;           
    private String subscriptionRequestType;           
    private String tradeReportID;           
    private String secondaryTradeReportID;           
    private String execID;           
    private String execType;           
    private String orderID;           
    private String clOrdID;           
    private String matchStatus;           
    private Integer trdType;           
    private Integer trdSubType;           
    private String transferReason;           
    private Integer secondaryTrdType;           
    private String tradeLinkID;           
    private String trdMatchID;           
    private String clearingBusinessDate;           
    private String tradingSessionID;           
    private String tradingSessionSubID;           
    private String timeBracket;           
    private String side;           
    private String multiLegReportingType;           
    private String tradeInputSource;           
    private String tradeInputDevice;           
    private Integer responseTransportType;           
    private String responseDestination;           
    private String text;           
    private Integer encodedTextLen;           
    private String encodedText;           
    private Parties parties;           
    private Instrument instrument;           
    private InstrumentExtension instrumentExtension;           
    private FinancingDetails financingDetails;           
    private NoUnderlyings noUnderlyings;           
    private NoLegs noLegs;           
    private NoDates noDates;           

    public TradeCaptureReportRequest() { 
        super("AD", MsgCategory.APP);
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
    public String getTradeReportID() {
        return this.tradeReportID;
    }           

    public void setTradeReportID(String tradeReportID) {
        this.tradeReportID = tradeReportID;
    }
    public String getSecondaryTradeReportID() {
        return this.secondaryTradeReportID;
    }           

    public void setSecondaryTradeReportID(String secondaryTradeReportID) {
        this.secondaryTradeReportID = secondaryTradeReportID;
    }
    public String getExecID() {
        return this.execID;
    }           

    public void setExecID(String execID) {
        this.execID = execID;
    }
    public String getExecType() {
        return this.execType;
    }           

    public void setExecType(String execType) {
        this.execType = execType;
    }
    public String getOrderID() {
        return this.orderID;
    }           

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }
    public String getClOrdID() {
        return this.clOrdID;
    }           

    public void setClOrdID(String clOrdID) {
        this.clOrdID = clOrdID;
    }
    public String getMatchStatus() {
        return this.matchStatus;
    }           

    public void setMatchStatus(String matchStatus) {
        this.matchStatus = matchStatus;
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
    public String getTransferReason() {
        return this.transferReason;
    }           

    public void setTransferReason(String transferReason) {
        this.transferReason = transferReason;
    }
    public Integer getSecondaryTrdType() {
        return this.secondaryTrdType;
    }           

    public void setSecondaryTrdType(Integer secondaryTrdType) {
        this.secondaryTrdType = secondaryTrdType;
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
    public String getClearingBusinessDate() {
        return this.clearingBusinessDate;
    }           

    public void setClearingBusinessDate(String clearingBusinessDate) {
        this.clearingBusinessDate = clearingBusinessDate;
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
    public String getTimeBracket() {
        return this.timeBracket;
    }           

    public void setTimeBracket(String timeBracket) {
        this.timeBracket = timeBracket;
    }
    public String getSide() {
        return this.side;
    }           

    public void setSide(String side) {
        this.side = side;
    }
    public String getMultiLegReportingType() {
        return this.multiLegReportingType;
    }           

    public void setMultiLegReportingType(String multiLegReportingType) {
        this.multiLegReportingType = multiLegReportingType;
    }
    public String getTradeInputSource() {
        return this.tradeInputSource;
    }           

    public void setTradeInputSource(String tradeInputSource) {
        this.tradeInputSource = tradeInputSource;
    }
    public String getTradeInputDevice() {
        return this.tradeInputDevice;
    }           

    public void setTradeInputDevice(String tradeInputDevice) {
        this.tradeInputDevice = tradeInputDevice;
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

    public TradeCaptureReportRequest.NoUnderlyings getNoUnderlyings() {
        return this.noUnderlyings;
    }

    public void setNoUnderlyings(TradeCaptureReportRequest.NoUnderlyings noUnderlyings) {
        this.noUnderlyings = noUnderlyings;
    }
    public TradeCaptureReportRequest.NoLegs getNoLegs() {
        return this.noLegs;
    }

    public void setNoLegs(TradeCaptureReportRequest.NoLegs noLegs) {
        this.noLegs = noLegs;
    }
    public TradeCaptureReportRequest.NoDates getNoDates() {
        return this.noDates;
    }

    public void setNoDates(TradeCaptureReportRequest.NoDates noDates) {
        this.noDates = noDates;
    }
        

    public static class NoUnderlyings extends FixGroup<TradeCaptureReportRequest.NoUnderlyings.NoUnderlyingsEntry> {

        @Override
        public int getField() {
            return 711;
        }

        public static class NoUnderlyingsEntry {



        }
        
    }


    public static class NoLegs extends FixGroup<TradeCaptureReportRequest.NoLegs.NoLegsEntry> {

        @Override
        public int getField() {
            return 555;
        }

        public static class NoLegsEntry {



        }
        
    }


    public static class NoDates extends FixGroup<TradeCaptureReportRequest.NoDates.NoDatesEntry> {

        @Override
        public int getField() {
            return 580;
        }

        public static class NoDatesEntry {

            private String tradeDate;
            private Date transactTime;

            public String getTradeDate() {
                return this.tradeDate;
            }           

            public void setTradeDate(String tradeDate) {
                this.tradeDate = tradeDate;
            }
            public Date getTransactTime() {
                return this.transactTime;
            }           

            public void setTransactTime(Date transactTime) {
                this.transactTime = transactTime;
            }

        }
        
    }

}

