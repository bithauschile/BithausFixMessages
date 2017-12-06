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

/**
 * Fix Components Class
 * Generated for FIX 4.4
 * @author Bithaus Fix Message Generator
 */
public class QuoteCancel extends FixBaseMessage {

    private String quoteReqID;           
    private String quoteID;           
    private Integer quoteCancelType;           
    private Integer quoteResponseLevel;           
    private String account;           
    private Integer acctIDSource;           
    private Integer accountType;           
    private String tradingSessionID;           
    private String tradingSessionSubID;           
    private Parties parties;           
    private NoQuoteEntries noQuoteEntries;           

    public QuoteCancel() { 
        super("Z", MsgCategory.APP);
    }

    public String getQuoteReqID() {
        return this.quoteReqID;
    }           

    public void setQuoteReqID(String quoteReqID) {
        this.quoteReqID = quoteReqID;
    }
    public String getQuoteID() {
        return this.quoteID;
    }           

    public void setQuoteID(String quoteID) {
        this.quoteID = quoteID;
    }
    public Integer getQuoteCancelType() {
        return this.quoteCancelType;
    }           

    public void setQuoteCancelType(Integer quoteCancelType) {
        this.quoteCancelType = quoteCancelType;
    }
    public Integer getQuoteResponseLevel() {
        return this.quoteResponseLevel;
    }           

    public void setQuoteResponseLevel(Integer quoteResponseLevel) {
        this.quoteResponseLevel = quoteResponseLevel;
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

    
    public Parties getParties() {
        return this.parties;
    }           

    public void setParties(Parties parties) {
        this.parties = parties;
    }

    public QuoteCancel.NoQuoteEntries getNoQuoteEntries() {
        return this.noQuoteEntries;
    }

    public void setNoQuoteEntries(QuoteCancel.NoQuoteEntries noQuoteEntries) {
        this.noQuoteEntries = noQuoteEntries;
    }
        

    public static class NoQuoteEntries extends FixGroup<QuoteCancel.NoQuoteEntries.NoQuoteEntriesEntry> {

        @Override
        public int getField() {
            return 295;
        }

        public static class NoQuoteEntriesEntry {



        }
        
    }

}

