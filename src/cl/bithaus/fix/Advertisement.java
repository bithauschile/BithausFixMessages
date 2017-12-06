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
public class Advertisement extends FixBaseMessage {

    private String advId;           
    private String advTransType;           
    private String advRefID;           
    private String advSide;           
    private BigDecimal quantity;           
    private Integer qtyType;           
    private BigDecimal price;           
    private String currency;           
    private String tradeDate;           
    private Date transactTime;           
    private String text;           
    private Integer encodedTextLen;           
    private String encodedText;           
    private String uRLLink;           
    private String lastMkt;           
    private String tradingSessionID;           
    private String tradingSessionSubID;           
    private Instrument instrument;           
    private NoLegs noLegs;           
    private NoUnderlyings noUnderlyings;           

    public Advertisement() { 
        super("7", MsgCategory.APP);
    }

    public String getAdvId() {
        return this.advId;
    }           

    public void setAdvId(String advId) {
        this.advId = advId;
    }
    public String getAdvTransType() {
        return this.advTransType;
    }           

    public void setAdvTransType(String advTransType) {
        this.advTransType = advTransType;
    }
    public String getAdvRefID() {
        return this.advRefID;
    }           

    public void setAdvRefID(String advRefID) {
        this.advRefID = advRefID;
    }
    public String getAdvSide() {
        return this.advSide;
    }           

    public void setAdvSide(String advSide) {
        this.advSide = advSide;
    }
    public BigDecimal getQuantity() {
        return this.quantity;
    }           

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }
    public Integer getQtyType() {
        return this.qtyType;
    }           

    public void setQtyType(Integer qtyType) {
        this.qtyType = qtyType;
    }
    public BigDecimal getPrice() {
        return this.price;
    }           

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
    public String getCurrency() {
        return this.currency;
    }           

    public void setCurrency(String currency) {
        this.currency = currency;
    }
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
    public String getURLLink() {
        return this.uRLLink;
    }           

    public void setURLLink(String uRLLink) {
        this.uRLLink = uRLLink;
    }
    public String getLastMkt() {
        return this.lastMkt;
    }           

    public void setLastMkt(String lastMkt) {
        this.lastMkt = lastMkt;
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

    
    public Instrument getInstrument() {
        return this.instrument;
    }           

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }

    public Advertisement.NoLegs getNoLegs() {
        return this.noLegs;
    }

    public void setNoLegs(Advertisement.NoLegs noLegs) {
        this.noLegs = noLegs;
    }
    public Advertisement.NoUnderlyings getNoUnderlyings() {
        return this.noUnderlyings;
    }

    public void setNoUnderlyings(Advertisement.NoUnderlyings noUnderlyings) {
        this.noUnderlyings = noUnderlyings;
    }
        

    public static class NoLegs extends FixGroup<Advertisement.NoLegs.NoLegsEntry> {

        @Override
        public int getField() {
            return 555;
        }

        public static class NoLegsEntry {



        }
        
    }


    public static class NoUnderlyings extends FixGroup<Advertisement.NoUnderlyings.NoUnderlyingsEntry> {

        @Override
        public int getField() {
            return 711;
        }

        public static class NoUnderlyingsEntry {



        }
        
    }

}

