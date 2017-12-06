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

/**
 * Fix Components Class
 * Generated for FIX 4.4
 * @author Bithaus Fix Message Generator
 */
public class TradingSessionStatusRequest extends FixBaseMessage {

    private String tradSesReqID;           
    private String tradingSessionID;           
    private String tradingSessionSubID;           
    private Integer tradSesMethod;           
    private Integer tradSesMode;           
    private String subscriptionRequestType;           
    private String exDestination;           
    private String marketSegmentID;           

    public TradingSessionStatusRequest() { 
        super("g", MsgCategory.APP);
    }

    public String getTradSesReqID() {
        return this.tradSesReqID;
    }           

    public void setTradSesReqID(String tradSesReqID) {
        this.tradSesReqID = tradSesReqID;
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
    public Integer getTradSesMethod() {
        return this.tradSesMethod;
    }           

    public void setTradSesMethod(Integer tradSesMethod) {
        this.tradSesMethod = tradSesMethod;
    }
    public Integer getTradSesMode() {
        return this.tradSesMode;
    }           

    public void setTradSesMode(Integer tradSesMode) {
        this.tradSesMode = tradSesMode;
    }
    public String getSubscriptionRequestType() {
        return this.subscriptionRequestType;
    }           

    public void setSubscriptionRequestType(String subscriptionRequestType) {
        this.subscriptionRequestType = subscriptionRequestType;
    }
    public String getExDestination() {
        return this.exDestination;
    }           

    public void setExDestination(String exDestination) {
        this.exDestination = exDestination;
    }
    public String getMarketSegmentID() {
        return this.marketSegmentID;
    }           

    public void setMarketSegmentID(String marketSegmentID) {
        this.marketSegmentID = marketSegmentID;
    }


        
}

