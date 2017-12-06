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
import cl.bithaus.fix.components.PositionQty;
import cl.bithaus.fix.components.PositionAmountData;

/**
 * Fix Components Class
 * Generated for FIX 4.4
 * @author Bithaus Fix Message Generator
 */
public class PositionReport extends FixBaseMessage {

    private String posMaintRptID;           
    private String posReqID;           
    private Integer posReqType;           
    private String subscriptionRequestType;           
    private Integer totalNumPosReports;           
    private Boolean unsolicitedIndicator;           
    private Integer posReqResult;           
    private String clearingBusinessDate;           
    private String settlSessID;           
    private String settlSessSubID;           
    private String account;           
    private Integer acctIDSource;           
    private Integer accountType;           
    private String currency;           
    private BigDecimal settlPrice;           
    private Integer settlPriceType;           
    private BigDecimal priorSettlPrice;           
    private String registStatus;           
    private String deliveryDate;           
    private String text;           
    private Integer encodedTextLen;           
    private String encodedText;           
    private Parties parties;           
    private Instrument instrument;           
    private PositionQty positionQty;           
    private PositionAmountData positionAmountData;           
    private NoLegs noLegs;           
    private NoUnderlyings noUnderlyings;           

    public PositionReport() { 
        super("AP", MsgCategory.APP);
    }

    public String getPosMaintRptID() {
        return this.posMaintRptID;
    }           

    public void setPosMaintRptID(String posMaintRptID) {
        this.posMaintRptID = posMaintRptID;
    }
    public String getPosReqID() {
        return this.posReqID;
    }           

    public void setPosReqID(String posReqID) {
        this.posReqID = posReqID;
    }
    public Integer getPosReqType() {
        return this.posReqType;
    }           

    public void setPosReqType(Integer posReqType) {
        this.posReqType = posReqType;
    }
    public String getSubscriptionRequestType() {
        return this.subscriptionRequestType;
    }           

    public void setSubscriptionRequestType(String subscriptionRequestType) {
        this.subscriptionRequestType = subscriptionRequestType;
    }
    public Integer getTotalNumPosReports() {
        return this.totalNumPosReports;
    }           

    public void setTotalNumPosReports(Integer totalNumPosReports) {
        this.totalNumPosReports = totalNumPosReports;
    }
    public Boolean getUnsolicitedIndicator() {
        return this.unsolicitedIndicator;
    }           

    public void setUnsolicitedIndicator(Boolean unsolicitedIndicator) {
        this.unsolicitedIndicator = unsolicitedIndicator;
    }
    public Integer getPosReqResult() {
        return this.posReqResult;
    }           

    public void setPosReqResult(Integer posReqResult) {
        this.posReqResult = posReqResult;
    }
    public String getClearingBusinessDate() {
        return this.clearingBusinessDate;
    }           

    public void setClearingBusinessDate(String clearingBusinessDate) {
        this.clearingBusinessDate = clearingBusinessDate;
    }
    public String getSettlSessID() {
        return this.settlSessID;
    }           

    public void setSettlSessID(String settlSessID) {
        this.settlSessID = settlSessID;
    }
    public String getSettlSessSubID() {
        return this.settlSessSubID;
    }           

    public void setSettlSessSubID(String settlSessSubID) {
        this.settlSessSubID = settlSessSubID;
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
    public String getCurrency() {
        return this.currency;
    }           

    public void setCurrency(String currency) {
        this.currency = currency;
    }
    public BigDecimal getSettlPrice() {
        return this.settlPrice;
    }           

    public void setSettlPrice(BigDecimal settlPrice) {
        this.settlPrice = settlPrice;
    }
    public Integer getSettlPriceType() {
        return this.settlPriceType;
    }           

    public void setSettlPriceType(Integer settlPriceType) {
        this.settlPriceType = settlPriceType;
    }
    public BigDecimal getPriorSettlPrice() {
        return this.priorSettlPrice;
    }           

    public void setPriorSettlPrice(BigDecimal priorSettlPrice) {
        this.priorSettlPrice = priorSettlPrice;
    }
    public String getRegistStatus() {
        return this.registStatus;
    }           

    public void setRegistStatus(String registStatus) {
        this.registStatus = registStatus;
    }
    public String getDeliveryDate() {
        return this.deliveryDate;
    }           

    public void setDeliveryDate(String deliveryDate) {
        this.deliveryDate = deliveryDate;
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
    
    public PositionQty getPositionQty() {
        return this.positionQty;
    }           

    public void setPositionQty(PositionQty positionQty) {
        this.positionQty = positionQty;
    }
    
    public PositionAmountData getPositionAmountData() {
        return this.positionAmountData;
    }           

    public void setPositionAmountData(PositionAmountData positionAmountData) {
        this.positionAmountData = positionAmountData;
    }

    public PositionReport.NoLegs getNoLegs() {
        return this.noLegs;
    }

    public void setNoLegs(PositionReport.NoLegs noLegs) {
        this.noLegs = noLegs;
    }
    public PositionReport.NoUnderlyings getNoUnderlyings() {
        return this.noUnderlyings;
    }

    public void setNoUnderlyings(PositionReport.NoUnderlyings noUnderlyings) {
        this.noUnderlyings = noUnderlyings;
    }
        

    public static class NoLegs extends FixGroup<PositionReport.NoLegs.NoLegsEntry> {

        @Override
        public int getField() {
            return 555;
        }

        public static class NoLegsEntry {



        }
        
    }


    public static class NoUnderlyings extends FixGroup<PositionReport.NoUnderlyings.NoUnderlyingsEntry> {

        @Override
        public int getField() {
            return 711;
        }

        public static class NoUnderlyingsEntry {

            private BigDecimal underlyingSettlPrice;
            private Integer underlyingSettlPriceType;

            public BigDecimal getUnderlyingSettlPrice() {
                return this.underlyingSettlPrice;
            }           

            public void setUnderlyingSettlPrice(BigDecimal underlyingSettlPrice) {
                this.underlyingSettlPrice = underlyingSettlPrice;
            }
            public Integer getUnderlyingSettlPriceType() {
                return this.underlyingSettlPriceType;
            }           

            public void setUnderlyingSettlPriceType(Integer underlyingSettlPriceType) {
                this.underlyingSettlPriceType = underlyingSettlPriceType;
            }

        }
        
    }

}

