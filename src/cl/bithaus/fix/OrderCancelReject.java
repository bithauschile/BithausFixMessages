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
public class OrderCancelReject extends FixBaseMessage {

    private String orderID;           
    private String secondaryOrderID;           
    private String secondaryClOrdID;           
    private String clOrdID;           
    private String clOrdLinkID;           
    private String origClOrdID;           
    private String ordStatus;           
    private Boolean workingIndicator;           
    private Date origOrdModTime;           
    private String listID;           
    private String account;           
    private Integer acctIDSource;           
    private Integer accountType;           
    private String tradeOriginationDate;           
    private String tradeDate;           
    private Date transactTime;           
    private String cxlRejResponseTo;           
    private Integer cxlRejReason;           
    private String text;           
    private Integer encodedTextLen;           
    private String encodedText;           

    public OrderCancelReject() { 
        super("9", MsgCategory.APP);
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
    public String getClOrdID() {
        return this.clOrdID;
    }           

    public void setClOrdID(String clOrdID) {
        this.clOrdID = clOrdID;
    }
    public String getClOrdLinkID() {
        return this.clOrdLinkID;
    }           

    public void setClOrdLinkID(String clOrdLinkID) {
        this.clOrdLinkID = clOrdLinkID;
    }
    public String getOrigClOrdID() {
        return this.origClOrdID;
    }           

    public void setOrigClOrdID(String origClOrdID) {
        this.origClOrdID = origClOrdID;
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
    public Date getOrigOrdModTime() {
        return this.origOrdModTime;
    }           

    public void setOrigOrdModTime(Date origOrdModTime) {
        this.origOrdModTime = origOrdModTime;
    }
    public String getListID() {
        return this.listID;
    }           

    public void setListID(String listID) {
        this.listID = listID;
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
    public String getTradeOriginationDate() {
        return this.tradeOriginationDate;
    }           

    public void setTradeOriginationDate(String tradeOriginationDate) {
        this.tradeOriginationDate = tradeOriginationDate;
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
    public String getCxlRejResponseTo() {
        return this.cxlRejResponseTo;
    }           

    public void setCxlRejResponseTo(String cxlRejResponseTo) {
        this.cxlRejResponseTo = cxlRejResponseTo;
    }
    public Integer getCxlRejReason() {
        return this.cxlRejReason;
    }           

    public void setCxlRejReason(Integer cxlRejReason) {
        this.cxlRejReason = cxlRejReason;
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

