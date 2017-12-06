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

/**
 * Fix Components Class
 * Generated for FIX 4.4
 * @author Bithaus Fix Message Generator
 */
public class OrderStatusRequest extends FixBaseMessage {

    private String orderID;           
    private String clOrdID;           
    private String secondaryClOrdID;           
    private String clOrdLinkID;           
    private String ordStatusReqID;           
    private String account;           
    private Integer acctIDSource;           
    private String side;           
    private String exDestination;           
    private Parties parties;           
    private Instrument instrument;           
    private FinancingDetails financingDetails;           
    private NoUnderlyings noUnderlyings;           

    public OrderStatusRequest() { 
        super("H", MsgCategory.APP);
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
    public String getOrdStatusReqID() {
        return this.ordStatusReqID;
    }           

    public void setOrdStatusReqID(String ordStatusReqID) {
        this.ordStatusReqID = ordStatusReqID;
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
    public String getSide() {
        return this.side;
    }           

    public void setSide(String side) {
        this.side = side;
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

    public OrderStatusRequest.NoUnderlyings getNoUnderlyings() {
        return this.noUnderlyings;
    }

    public void setNoUnderlyings(OrderStatusRequest.NoUnderlyings noUnderlyings) {
        this.noUnderlyings = noUnderlyings;
    }
        

    public static class NoUnderlyings extends FixGroup<OrderStatusRequest.NoUnderlyings.NoUnderlyingsEntry> {

        @Override
        public int getField() {
            return 711;
        }

        public static class NoUnderlyingsEntry {



        }
        
    }

}

