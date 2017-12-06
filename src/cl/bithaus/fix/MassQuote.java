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
public class MassQuote extends FixBaseMessage {

    private String quoteReqID;           
    private String quoteID;           
    private Integer quoteType;           
    private Integer quoteResponseLevel;           
    private String account;           
    private Integer acctIDSource;           
    private Integer accountType;           
    private BigDecimal defBidSize;           
    private BigDecimal defOfferSize;           
    private Parties parties;           
    private NoQuoteSets noQuoteSets;           

    public MassQuote() { 
        super("i", MsgCategory.APP);
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
    public Integer getQuoteType() {
        return this.quoteType;
    }           

    public void setQuoteType(Integer quoteType) {
        this.quoteType = quoteType;
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
    public BigDecimal getDefBidSize() {
        return this.defBidSize;
    }           

    public void setDefBidSize(BigDecimal defBidSize) {
        this.defBidSize = defBidSize;
    }
    public BigDecimal getDefOfferSize() {
        return this.defOfferSize;
    }           

    public void setDefOfferSize(BigDecimal defOfferSize) {
        this.defOfferSize = defOfferSize;
    }

    
    public Parties getParties() {
        return this.parties;
    }           

    public void setParties(Parties parties) {
        this.parties = parties;
    }

    public MassQuote.NoQuoteSets getNoQuoteSets() {
        return this.noQuoteSets;
    }

    public void setNoQuoteSets(MassQuote.NoQuoteSets noQuoteSets) {
        this.noQuoteSets = noQuoteSets;
    }
        

    public static class NoQuoteSets extends FixGroup<MassQuote.NoQuoteSets.NoQuoteSetsEntry> {

        @Override
        public int getField() {
            return 296;
        }

        public static class NoQuoteSetsEntry {

            private String quoteSetID;
            private Date quoteSetValidUntilTime;
            private Integer totNoQuoteEntries;
            private Boolean lastFragment;

            public String getQuoteSetID() {
                return this.quoteSetID;
            }           

            public void setQuoteSetID(String quoteSetID) {
                this.quoteSetID = quoteSetID;
            }
            public Date getQuoteSetValidUntilTime() {
                return this.quoteSetValidUntilTime;
            }           

            public void setQuoteSetValidUntilTime(Date quoteSetValidUntilTime) {
                this.quoteSetValidUntilTime = quoteSetValidUntilTime;
            }
            public Integer getTotNoQuoteEntries() {
                return this.totNoQuoteEntries;
            }           

            public void setTotNoQuoteEntries(Integer totNoQuoteEntries) {
                this.totNoQuoteEntries = totNoQuoteEntries;
            }
            public Boolean getLastFragment() {
                return this.lastFragment;
            }           

            public void setLastFragment(Boolean lastFragment) {
                this.lastFragment = lastFragment;
            }

        }
        
    }

}

