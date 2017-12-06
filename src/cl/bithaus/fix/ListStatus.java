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
public class ListStatus extends FixBaseMessage {

    private String listID;           
    private Integer listStatusType;           
    private Integer noRpts;           
    private Integer listOrderStatus;           
    private Integer rptSeq;           
    private String listStatusText;           
    private Integer encodedListStatusTextLen;           
    private String encodedListStatusText;           
    private Date transactTime;           
    private Integer totNoOrders;           
    private Boolean lastFragment;           
    private NoOrders noOrders;           

    public ListStatus() { 
        super("N", MsgCategory.APP);
    }

    public String getListID() {
        return this.listID;
    }           

    public void setListID(String listID) {
        this.listID = listID;
    }
    public Integer getListStatusType() {
        return this.listStatusType;
    }           

    public void setListStatusType(Integer listStatusType) {
        this.listStatusType = listStatusType;
    }
    public Integer getNoRpts() {
        return this.noRpts;
    }           

    public void setNoRpts(Integer noRpts) {
        this.noRpts = noRpts;
    }
    public Integer getListOrderStatus() {
        return this.listOrderStatus;
    }           

    public void setListOrderStatus(Integer listOrderStatus) {
        this.listOrderStatus = listOrderStatus;
    }
    public Integer getRptSeq() {
        return this.rptSeq;
    }           

    public void setRptSeq(Integer rptSeq) {
        this.rptSeq = rptSeq;
    }
    public String getListStatusText() {
        return this.listStatusText;
    }           

    public void setListStatusText(String listStatusText) {
        this.listStatusText = listStatusText;
    }
    public Integer getEncodedListStatusTextLen() {
        return this.encodedListStatusTextLen;
    }           

    public void setEncodedListStatusTextLen(Integer encodedListStatusTextLen) {
        this.encodedListStatusTextLen = encodedListStatusTextLen;
    }
    public String getEncodedListStatusText() {
        return this.encodedListStatusText;
    }           

    public void setEncodedListStatusText(String encodedListStatusText) {
        this.encodedListStatusText = encodedListStatusText;
    }
    public Date getTransactTime() {
        return this.transactTime;
    }           

    public void setTransactTime(Date transactTime) {
        this.transactTime = transactTime;
    }
    public Integer getTotNoOrders() {
        return this.totNoOrders;
    }           

    public void setTotNoOrders(Integer totNoOrders) {
        this.totNoOrders = totNoOrders;
    }
    public Boolean getLastFragment() {
        return this.lastFragment;
    }           

    public void setLastFragment(Boolean lastFragment) {
        this.lastFragment = lastFragment;
    }


    public ListStatus.NoOrders getNoOrders() {
        return this.noOrders;
    }

    public void setNoOrders(ListStatus.NoOrders noOrders) {
        this.noOrders = noOrders;
    }
        

    public static class NoOrders extends FixGroup<ListStatus.NoOrders.NoOrdersEntry> {

        @Override
        public int getField() {
            return 73;
        }

        public static class NoOrdersEntry {

            private String clOrdID;
            private String secondaryClOrdID;
            private BigDecimal cumQty;
            private String ordStatus;
            private Boolean workingIndicator;
            private BigDecimal leavesQty;
            private BigDecimal cxlQty;
            private BigDecimal avgPx;
            private Integer ordRejReason;
            private String text;
            private Integer encodedTextLen;
            private String encodedText;

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
            public BigDecimal getCumQty() {
                return this.cumQty;
            }           

            public void setCumQty(BigDecimal cumQty) {
                this.cumQty = cumQty;
            }
            public String getOrdStatus() {
                return this.ordStatus;
            }           

            public void setOrdStatus(String ordStatus) {
                this.ordStatus = ordStatus;
            }
            public Boolean getWorkingIndicator() {
                return this.workingIndicator;
            }           

            public void setWorkingIndicator(Boolean workingIndicator) {
                this.workingIndicator = workingIndicator;
            }
            public BigDecimal getLeavesQty() {
                return this.leavesQty;
            }           

            public void setLeavesQty(BigDecimal leavesQty) {
                this.leavesQty = leavesQty;
            }
            public BigDecimal getCxlQty() {
                return this.cxlQty;
            }           

            public void setCxlQty(BigDecimal cxlQty) {
                this.cxlQty = cxlQty;
            }
            public BigDecimal getAvgPx() {
                return this.avgPx;
            }           

            public void setAvgPx(BigDecimal avgPx) {
                this.avgPx = avgPx;
            }
            public Integer getOrdRejReason() {
                return this.ordRejReason;
            }           

            public void setOrdRejReason(Integer ordRejReason) {
                this.ordRejReason = ordRejReason;
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

        }
        
    }

}

