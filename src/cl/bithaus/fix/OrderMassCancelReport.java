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
import cl.bithaus.fix.components.UnderlyingInstrument;

/**
 * Fix Components Class
 * Generated for FIX 4.4
 * @author Bithaus Fix Message Generator
 */
public class OrderMassCancelReport extends FixBaseMessage {

    private String clOrdID;           
    private String secondaryClOrdID;           
    private String orderID;           
    private String secondaryOrderID;           
    private String massCancelRequestType;           
    private String massCancelResponse;           
    private String massCancelRejectReason;           
    private Integer totalAffectedOrders;           
    private String tradingSessionID;           
    private String tradingSessionSubID;           
    private String side;           
    private Date transactTime;           
    private String text;           
    private Integer encodedTextLen;           
    private String encodedText;           
    private Instrument instrument;           
    private UnderlyingInstrument underlyingInstrument;           
    private NoAffectedOrders noAffectedOrders;           

    public OrderMassCancelReport() { 
        super("r", MsgCategory.APP);
    }

    public String getClOrdID() {
        return this.clOrdID;
    }           

    public void setClOrdID(String clOrdID) {
        this.clOrdID = clOrdID;
    }
    public String getSecondaryClOrdID() {
        return this.secondaryClOrdID;
    }           

    public void setSecondaryClOrdID(String secondaryClOrdID) {
        this.secondaryClOrdID = secondaryClOrdID;
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
    public String getMassCancelRequestType() {
        return this.massCancelRequestType;
    }           

    public void setMassCancelRequestType(String massCancelRequestType) {
        this.massCancelRequestType = massCancelRequestType;
    }
    public String getMassCancelResponse() {
        return this.massCancelResponse;
    }           

    public void setMassCancelResponse(String massCancelResponse) {
        this.massCancelResponse = massCancelResponse;
    }
    public String getMassCancelRejectReason() {
        return this.massCancelRejectReason;
    }           

    public void setMassCancelRejectReason(String massCancelRejectReason) {
        this.massCancelRejectReason = massCancelRejectReason;
    }
    public Integer getTotalAffectedOrders() {
        return this.totalAffectedOrders;
    }           

    public void setTotalAffectedOrders(Integer totalAffectedOrders) {
        this.totalAffectedOrders = totalAffectedOrders;
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
    public String getSide() {
        return this.side;
    }           

    public void setSide(String side) {
        this.side = side;
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

    
    public Instrument getInstrument() {
        return this.instrument;
    }           

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }
    
    public UnderlyingInstrument getUnderlyingInstrument() {
        return this.underlyingInstrument;
    }           

    public void setUnderlyingInstrument(UnderlyingInstrument underlyingInstrument) {
        this.underlyingInstrument = underlyingInstrument;
    }

    public OrderMassCancelReport.NoAffectedOrders getNoAffectedOrders() {
        return this.noAffectedOrders;
    }

    public void setNoAffectedOrders(OrderMassCancelReport.NoAffectedOrders noAffectedOrders) {
        this.noAffectedOrders = noAffectedOrders;
    }
        

    public static class NoAffectedOrders extends FixGroup<OrderMassCancelReport.NoAffectedOrders.NoAffectedOrdersEntry> {

        @Override
        public int getField() {
            return 534;
        }

        public static class NoAffectedOrdersEntry {

            private String origClOrdID;
            private String affectedOrderID;
            private String affectedSecondaryOrderID;

            public String getOrigClOrdID() {
                return this.origClOrdID;
            }           

            public void setOrigClOrdID(String origClOrdID) {
                this.origClOrdID = origClOrdID;
            }
            public String getAffectedOrderID() {
                return this.affectedOrderID;
            }           

            public void setAffectedOrderID(String affectedOrderID) {
                this.affectedOrderID = affectedOrderID;
            }
            public String getAffectedSecondaryOrderID() {
                return this.affectedSecondaryOrderID;
            }           

            public void setAffectedSecondaryOrderID(String affectedSecondaryOrderID) {
                this.affectedSecondaryOrderID = affectedSecondaryOrderID;
            }

        }
        
    }

}

