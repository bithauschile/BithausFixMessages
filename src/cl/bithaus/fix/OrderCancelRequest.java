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
import cl.bithaus.fix.components.Instrument;
import cl.bithaus.fix.components.FinancingDetails;
import cl.bithaus.fix.components.OrderQtyData;
import cl.bithaus.fix.components.SpecialOrderData;

/**
 * Fix Components Class
 * Generated for FIX 4.4
 * @author Bithaus Fix Message Generator
 */
public class OrderCancelRequest extends FixBaseMessage {

    private String origClOrdID;           
    private String orderID;           
    private String clOrdID;           
    private String secondaryClOrdID;           
    private String clOrdLinkID;           
    private String listID;           
    private Date origOrdModTime;           
    private String account;           
    private Integer acctIDSource;           
    private Integer accountType;           
    private String side;           
    private Date transactTime;           
    private String complianceID;           
    private String text;           
    private Integer encodedTextLen;           
    private String encodedText;           
    private String moveToOIB;           
    private String exDestination;           
    private Parties parties;           
    private Instrument instrument;           
    private FinancingDetails financingDetails;           
    private OrderQtyData orderQtyData;           
    private SpecialOrderData specialOrderData;           
    private NoUnderlyings noUnderlyings;           

    public OrderCancelRequest() { 
        super("F", MsgCategory.APP);
    }

    public String getOrigClOrdID() {
        return this.origClOrdID;
    }           

    public void setOrigClOrdID(String origClOrdID) {
        this.origClOrdID = origClOrdID;
    }
    public String getOrderID() {
        return this.orderID;
    }           

    public void setOrderID(String orderID) {
        this.orderID = orderID;
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
    public String getClOrdLinkID() {
        return this.clOrdLinkID;
    }           

    public void setClOrdLinkID(String clOrdLinkID) {
        this.clOrdLinkID = clOrdLinkID;
    }
    public String getListID() {
        return this.listID;
    }           

    public void setListID(String listID) {
        this.listID = listID;
    }
    public Date getOrigOrdModTime() {
        return this.origOrdModTime;
    }           

    public void setOrigOrdModTime(Date origOrdModTime) {
        this.origOrdModTime = origOrdModTime;
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
    public String getComplianceID() {
        return this.complianceID;
    }           

    public void setComplianceID(String complianceID) {
        this.complianceID = complianceID;
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
    public String getMoveToOIB() {
        return this.moveToOIB;
    }           

    public void setMoveToOIB(String moveToOIB) {
        this.moveToOIB = moveToOIB;
    }
    public String getExDestination() {
        return this.exDestination;
    }           

    public void setExDestination(String exDestination) {
        this.exDestination = exDestination;
    }

    
    public Parties getParties() {
        return this.parties;
    }           

    public void setParties(Parties parties) {
        this.parties = parties;
    }
    
    public Instrument getInstrument() {
        return this.instrument;
    }           

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }
    
    public FinancingDetails getFinancingDetails() {
        return this.financingDetails;
    }           

    public void setFinancingDetails(FinancingDetails financingDetails) {
        this.financingDetails = financingDetails;
    }
    
    public OrderQtyData getOrderQtyData() {
        return this.orderQtyData;
    }           

    public void setOrderQtyData(OrderQtyData orderQtyData) {
        this.orderQtyData = orderQtyData;
    }
    
    public SpecialOrderData getSpecialOrderData() {
        return this.specialOrderData;
    }           

    public void setSpecialOrderData(SpecialOrderData specialOrderData) {
        this.specialOrderData = specialOrderData;
    }

    public OrderCancelRequest.NoUnderlyings getNoUnderlyings() {
        return this.noUnderlyings;
    }

    public void setNoUnderlyings(OrderCancelRequest.NoUnderlyings noUnderlyings) {
        this.noUnderlyings = noUnderlyings;
    }
        

    public static class NoUnderlyings extends FixGroup<OrderCancelRequest.NoUnderlyings.NoUnderlyingsEntry> {

        @Override
        public int getField() {
            return 711;
        }

        public static class NoUnderlyingsEntry {



        }
        
    }

}

