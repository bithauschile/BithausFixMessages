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
public class TradingSessionStatus extends FixBaseMessage {

    private String tradSesReqID;           
    private String tradingSessionID;           
    private String tradingSessionSubID;           
    private Integer tradSesMethod;           
    private Integer tradSesMode;           
    private Boolean unsolicitedIndicator;           
    private Integer tradSesStatus;           
    private Integer tradSesStatusRejReason;           
    private Date tradSesStartTime;           
    private Date tradSesOpenTime;           
    private Date tradSesPreCloseTime;           
    private Date tradSesCloseTime;           
    private Date tradSesEndTime;           
    private BigDecimal totalVolumeTraded;           
    private String text;           
    private Integer encodedTextLen;           
    private String encodedText;           
    private String exDestination;           
    private Integer auctionId;           
    private String marketSegmentID;           
    private Integer offersNumber;           
    private BigDecimal offersAmount;           

    public TradingSessionStatus() { 
        super("h", MsgCategory.APP);
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
    public Boolean getUnsolicitedIndicator() {
        return this.unsolicitedIndicator;
    }           

    public void setUnsolicitedIndicator(Boolean unsolicitedIndicator) {
        this.unsolicitedIndicator = unsolicitedIndicator;
    }
    public Integer getTradSesStatus() {
        return this.tradSesStatus;
    }           

    public void setTradSesStatus(Integer tradSesStatus) {
        this.tradSesStatus = tradSesStatus;
    }
    public Integer getTradSesStatusRejReason() {
        return this.tradSesStatusRejReason;
    }           

    public void setTradSesStatusRejReason(Integer tradSesStatusRejReason) {
        this.tradSesStatusRejReason = tradSesStatusRejReason;
    }
    public Date getTradSesStartTime() {
        return this.tradSesStartTime;
    }           

    public void setTradSesStartTime(Date tradSesStartTime) {
        this.tradSesStartTime = tradSesStartTime;
    }
    public Date getTradSesOpenTime() {
        return this.tradSesOpenTime;
    }           

    public void setTradSesOpenTime(Date tradSesOpenTime) {
        this.tradSesOpenTime = tradSesOpenTime;
    }
    public Date getTradSesPreCloseTime() {
        return this.tradSesPreCloseTime;
    }           

    public void setTradSesPreCloseTime(Date tradSesPreCloseTime) {
        this.tradSesPreCloseTime = tradSesPreCloseTime;
    }
    public Date getTradSesCloseTime() {
        return this.tradSesCloseTime;
    }           

    public void setTradSesCloseTime(Date tradSesCloseTime) {
        this.tradSesCloseTime = tradSesCloseTime;
    }
    public Date getTradSesEndTime() {
        return this.tradSesEndTime;
    }           

    public void setTradSesEndTime(Date tradSesEndTime) {
        this.tradSesEndTime = tradSesEndTime;
    }
    public BigDecimal getTotalVolumeTraded() {
        return this.totalVolumeTraded;
    }           

    public void setTotalVolumeTraded(BigDecimal totalVolumeTraded) {
        this.totalVolumeTraded = totalVolumeTraded;
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
    public String getExDestination() {
        return this.exDestination;
    }           

    public void setExDestination(String exDestination) {
        this.exDestination = exDestination;
    }
    public Integer getAuctionId() {
        return this.auctionId;
    }           

    public void setAuctionId(Integer auctionId) {
        this.auctionId = auctionId;
    }
    public String getMarketSegmentID() {
        return this.marketSegmentID;
    }           

    public void setMarketSegmentID(String marketSegmentID) {
        this.marketSegmentID = marketSegmentID;
    }
    public Integer getOffersNumber() {
        return this.offersNumber;
    }           

    public void setOffersNumber(Integer offersNumber) {
        this.offersNumber = offersNumber;
    }
    public BigDecimal getOffersAmount() {
        return this.offersAmount;
    }           

    public void setOffersAmount(BigDecimal offersAmount) {
        this.offersAmount = offersAmount;
    }


        
}

