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
import cl.bithaus.fix.components.OrderQtyData;

/**
 * Fix Components Class
 * Generated for FIX 4.4
 * @author Bithaus Fix Message Generator
 */
public class DontKnowTrade extends FixBaseMessage {

    private String orderID;           
    private String secondaryOrderID;           
    private String execID;           
    private String dKReason;           
    private String side;           
    private BigDecimal lastQty;           
    private BigDecimal lastPx;           
    private String text;           
    private Integer encodedTextLen;           
    private String encodedText;           
    private Instrument instrument;           
    private OrderQtyData orderQtyData;           
    private NoUnderlyings noUnderlyings;           
    private NoLegs noLegs;           

    public DontKnowTrade() { 
        super("Q", MsgCategory.APP);
    }

    public String getOrderID() {
        return this.orderID;
    }           

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }
    public String getSecondaryOrderID() {
        return this.secondaryOrderID;
    }           

    public void setSecondaryOrderID(String secondaryOrderID) {
        this.secondaryOrderID = secondaryOrderID;
    }
    public String getExecID() {
        return this.execID;
    }           

    public void setExecID(String execID) {
        this.execID = execID;
    }
    public String getDKReason() {
        return this.dKReason;
    }           

    public void setDKReason(String dKReason) {
        this.dKReason = dKReason;
    }
    public String getSide() {
        return this.side;
    }           

    public void setSide(String side) {
        this.side = side;
    }
    public BigDecimal getLastQty() {
        return this.lastQty;
    }           

    public void setLastQty(BigDecimal lastQty) {
        this.lastQty = lastQty;
    }
    public BigDecimal getLastPx() {
        return this.lastPx;
    }           

    public void setLastPx(BigDecimal lastPx) {
        this.lastPx = lastPx;
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
    
    public OrderQtyData getOrderQtyData() {
        return this.orderQtyData;
    }           

    public void setOrderQtyData(OrderQtyData orderQtyData) {
        this.orderQtyData = orderQtyData;
    }

    public DontKnowTrade.NoUnderlyings getNoUnderlyings() {
        return this.noUnderlyings;
    }

    public void setNoUnderlyings(DontKnowTrade.NoUnderlyings noUnderlyings) {
        this.noUnderlyings = noUnderlyings;
    }
    public DontKnowTrade.NoLegs getNoLegs() {
        return this.noLegs;
    }

    public void setNoLegs(DontKnowTrade.NoLegs noLegs) {
        this.noLegs = noLegs;
    }
        

    public static class NoUnderlyings extends FixGroup<DontKnowTrade.NoUnderlyings.NoUnderlyingsEntry> {

        @Override
        public int getField() {
            return 711;
        }

        public static class NoUnderlyingsEntry {



        }
        
    }


    public static class NoLegs extends FixGroup<DontKnowTrade.NoLegs.NoLegsEntry> {

        @Override
        public int getField() {
            return 555;
        }

        public static class NoLegsEntry {



        }
        
    }

}

