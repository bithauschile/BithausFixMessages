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
public class RequestForPositionsAck extends FixBaseMessage {

    private String posMaintRptID;           
    private String posReqID;           
    private Integer totalNumPosReports;           
    private Boolean unsolicitedIndicator;           
    private Integer posReqResult;           
    private Integer posReqStatus;           
    private String account;           
    private Integer acctIDSource;           
    private Integer accountType;           
    private String currency;           
    private Integer responseTransportType;           
    private String responseDestination;           
    private String text;           
    private Integer encodedTextLen;           
    private String encodedText;           
    private Parties parties;           
    private Instrument instrument;           
    private NoLegs noLegs;           
    private NoUnderlyings noUnderlyings;           

    public RequestForPositionsAck() { 
        super("AO", MsgCategory.APP);
    }

    public String getPosMaintRptID() {
        return this.posMaintRptID;
    }           

    public void setPosMaintRptID(String posMaintRptID) {
        this.posMaintRptID = posMaintRptID;
    }
    public String getPosReqID() {
        return this.posReqID;
    }           

    public void setPosReqID(String posReqID) {
        this.posReqID = posReqID;
    }
    public Integer getTotalNumPosReports() {
        return this.totalNumPosReports;
    }           

    public void setTotalNumPosReports(Integer totalNumPosReports) {
        this.totalNumPosReports = totalNumPosReports;
    }
    public Boolean getUnsolicitedIndicator() {
        return this.unsolicitedIndicator;
    }           

    public void setUnsolicitedIndicator(Boolean unsolicitedIndicator) {
        this.unsolicitedIndicator = unsolicitedIndicator;
    }
    public Integer getPosReqResult() {
        return this.posReqResult;
    }           

    public void setPosReqResult(Integer posReqResult) {
        this.posReqResult = posReqResult;
    }
    public Integer getPosReqStatus() {
        return this.posReqStatus;
    }           

    public void setPosReqStatus(Integer posReqStatus) {
        this.posReqStatus = posReqStatus;
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

    public RequestForPositionsAck.NoLegs getNoLegs() {
        return this.noLegs;
    }

    public void setNoLegs(RequestForPositionsAck.NoLegs noLegs) {
        this.noLegs = noLegs;
    }
    public RequestForPositionsAck.NoUnderlyings getNoUnderlyings() {
        return this.noUnderlyings;
    }

    public void setNoUnderlyings(RequestForPositionsAck.NoUnderlyings noUnderlyings) {
        this.noUnderlyings = noUnderlyings;
    }
        

    public static class NoLegs extends FixGroup<RequestForPositionsAck.NoLegs.NoLegsEntry> {

        @Override
        public int getField() {
            return 555;
        }

        public static class NoLegsEntry {



        }
        
    }


    public static class NoUnderlyings extends FixGroup<RequestForPositionsAck.NoUnderlyings.NoUnderlyingsEntry> {

        @Override
        public int getField() {
            return 711;
        }

        public static class NoUnderlyingsEntry {



        }
        
    }

}

