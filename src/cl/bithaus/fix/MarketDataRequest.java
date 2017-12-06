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
public class MarketDataRequest extends FixBaseMessage {

    private String mDReqID;           
    private String subscriptionRequestType;           
    private Integer marketDepth;           
    private Integer mDUpdateType;           
    private Boolean aggregatedBook;           
    private String openCloseSettlFlag;           
    private String scope;           
    private Boolean mDImplicitDelete;           
    private Integer applQueueAction;           
    private Integer applQueueMax;           
    private String refOrderID;           
    private String refOrderIDSource;           
    private String refOrderSubID;           
    private Parties parties;           
    private NoMDEntryTypes noMDEntryTypes;           
    private NoRelatedSym noRelatedSym;           

    public MarketDataRequest() { 
        super("V", MsgCategory.APP);
    }

    public String getMDReqID() {
        return this.mDReqID;
    }           

    public void setMDReqID(String mDReqID) {
        this.mDReqID = mDReqID;
    }
    public String getSubscriptionRequestType() {
        return this.subscriptionRequestType;
    }           

    public void setSubscriptionRequestType(String subscriptionRequestType) {
        this.subscriptionRequestType = subscriptionRequestType;
    }
    public Integer getMarketDepth() {
        return this.marketDepth;
    }           

    public void setMarketDepth(Integer marketDepth) {
        this.marketDepth = marketDepth;
    }
    public Integer getMDUpdateType() {
        return this.mDUpdateType;
    }           

    public void setMDUpdateType(Integer mDUpdateType) {
        this.mDUpdateType = mDUpdateType;
    }
    public Boolean getAggregatedBook() {
        return this.aggregatedBook;
    }           

    public void setAggregatedBook(Boolean aggregatedBook) {
        this.aggregatedBook = aggregatedBook;
    }
    public String getOpenCloseSettlFlag() {
        return this.openCloseSettlFlag;
    }           

    public void setOpenCloseSettlFlag(String openCloseSettlFlag) {
        this.openCloseSettlFlag = openCloseSettlFlag;
    }
    public String getScope() {
        return this.scope;
    }           

    public void setScope(String scope) {
        this.scope = scope;
    }
    public Boolean getMDImplicitDelete() {
        return this.mDImplicitDelete;
    }           

    public void setMDImplicitDelete(Boolean mDImplicitDelete) {
        this.mDImplicitDelete = mDImplicitDelete;
    }
    public Integer getApplQueueAction() {
        return this.applQueueAction;
    }           

    public void setApplQueueAction(Integer applQueueAction) {
        this.applQueueAction = applQueueAction;
    }
    public Integer getApplQueueMax() {
        return this.applQueueMax;
    }           

    public void setApplQueueMax(Integer applQueueMax) {
        this.applQueueMax = applQueueMax;
    }
    public String getRefOrderID() {
        return this.refOrderID;
    }           

    public void setRefOrderID(String refOrderID) {
        this.refOrderID = refOrderID;
    }
    public String getRefOrderIDSource() {
        return this.refOrderIDSource;
    }           

    public void setRefOrderIDSource(String refOrderIDSource) {
        this.refOrderIDSource = refOrderIDSource;
    }
    public String getRefOrderSubID() {
        return this.refOrderSubID;
    }           

    public void setRefOrderSubID(String refOrderSubID) {
        this.refOrderSubID = refOrderSubID;
    }

    
    public Parties getParties() {
        return this.parties;
    }           

    public void setParties(Parties parties) {
        this.parties = parties;
    }

    public MarketDataRequest.NoMDEntryTypes getNoMDEntryTypes() {
        return this.noMDEntryTypes;
    }

    public void setNoMDEntryTypes(MarketDataRequest.NoMDEntryTypes noMDEntryTypes) {
        this.noMDEntryTypes = noMDEntryTypes;
    }
    public MarketDataRequest.NoRelatedSym getNoRelatedSym() {
        return this.noRelatedSym;
    }

    public void setNoRelatedSym(MarketDataRequest.NoRelatedSym noRelatedSym) {
        this.noRelatedSym = noRelatedSym;
    }
        

    public static class NoMDEntryTypes extends FixGroup<MarketDataRequest.NoMDEntryTypes.NoMDEntryTypesEntry> {

        @Override
        public int getField() {
            return 267;
        }

        public static class NoMDEntryTypesEntry {

            private String mDEntryType;

            public String getMDEntryType() {
                return this.mDEntryType;
            }           

            public void setMDEntryType(String mDEntryType) {
                this.mDEntryType = mDEntryType;
            }

        }
        
    }


    public static class NoRelatedSym extends FixGroup<MarketDataRequest.NoRelatedSym.NoRelatedSymEntry> {

        @Override
        public int getField() {
            return 146;
        }

        public static class NoRelatedSymEntry {

            private String bookingRefID;

            public String getBookingRefID() {
                return this.bookingRefID;
            }           

            public void setBookingRefID(String bookingRefID) {
                this.bookingRefID = bookingRefID;
            }

        }
        
    }

}

