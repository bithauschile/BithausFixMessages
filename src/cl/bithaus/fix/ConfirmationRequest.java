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
public class ConfirmationRequest extends FixBaseMessage {

    private String confirmReqID;           
    private Integer confirmType;           
    private String allocID;           
    private String secondaryAllocID;           
    private String individualAllocID;           
    private Date transactTime;           
    private String allocAccount;           
    private Integer allocAcctIDSource;           
    private Integer allocAccountType;           
    private String text;           
    private Integer encodedTextLen;           
    private String encodedText;           
    private NoOrders noOrders;           

    public ConfirmationRequest() { 
        super("BH", MsgCategory.APP);
    }

    public String getConfirmReqID() {
        return this.confirmReqID;
    }           

    public void setConfirmReqID(String confirmReqID) {
        this.confirmReqID = confirmReqID;
    }
    public Integer getConfirmType() {
        return this.confirmType;
    }           

    public void setConfirmType(Integer confirmType) {
        this.confirmType = confirmType;
    }
    public String getAllocID() {
        return this.allocID;
    }           

    public void setAllocID(String allocID) {
        this.allocID = allocID;
    }
    public String getSecondaryAllocID() {
        return this.secondaryAllocID;
    }           

    public void setSecondaryAllocID(String secondaryAllocID) {
        this.secondaryAllocID = secondaryAllocID;
    }
    public String getIndividualAllocID() {
        return this.individualAllocID;
    }           

    public void setIndividualAllocID(String individualAllocID) {
        this.individualAllocID = individualAllocID;
    }
    public Date getTransactTime() {
        return this.transactTime;
    }           

    public void setTransactTime(Date transactTime) {
        this.transactTime = transactTime;
    }
    public String getAllocAccount() {
        return this.allocAccount;
    }           

    public void setAllocAccount(String allocAccount) {
        this.allocAccount = allocAccount;
    }
    public Integer getAllocAcctIDSource() {
        return this.allocAcctIDSource;
    }           

    public void setAllocAcctIDSource(Integer allocAcctIDSource) {
        this.allocAcctIDSource = allocAcctIDSource;
    }
    public Integer getAllocAccountType() {
        return this.allocAccountType;
    }           

    public void setAllocAccountType(Integer allocAccountType) {
        this.allocAccountType = allocAccountType;
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


    public ConfirmationRequest.NoOrders getNoOrders() {
        return this.noOrders;
    }

    public void setNoOrders(ConfirmationRequest.NoOrders noOrders) {
        this.noOrders = noOrders;
    }
        

    public static class NoOrders extends FixGroup<ConfirmationRequest.NoOrders.NoOrdersEntry> {

        @Override
        public int getField() {
            return 73;
        }

        public static class NoOrdersEntry {

            private String clOrdID;
            private String orderID;
            private String secondaryOrderID;
            private String secondaryClOrdID;
            private String listID;
            private BigDecimal orderQty;
            private BigDecimal orderAvgPx;
            private BigDecimal orderBookingQty;

            public String getClOrdID() {
                return this.clOrdID;
            }           

            public void setClOrdID(String clOrdID) {
                this.clOrdID = clOrdID;
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
            public String getSecondaryClOrdID() {
                return this.secondaryClOrdID;
            }           

            public void setSecondaryClOrdID(String secondaryClOrdID) {
                this.secondaryClOrdID = secondaryClOrdID;
            }
            public String getListID() {
                return this.listID;
            }           

            public void setListID(String listID) {
                this.listID = listID;
            }
            public BigDecimal getOrderQty() {
                return this.orderQty;
            }           

            public void setOrderQty(BigDecimal orderQty) {
                this.orderQty = orderQty;
            }
            public BigDecimal getOrderAvgPx() {
                return this.orderAvgPx;
            }           

            public void setOrderAvgPx(BigDecimal orderAvgPx) {
                this.orderAvgPx = orderAvgPx;
            }
            public BigDecimal getOrderBookingQty() {
                return this.orderBookingQty;
            }           

            public void setOrderBookingQty(BigDecimal orderBookingQty) {
                this.orderBookingQty = orderBookingQty;
            }

        }
        
    }

}

