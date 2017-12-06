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
import cl.bithaus.fix.components.InstrumentLeg;
import cl.bithaus.fix.components.PositionQty;
import cl.bithaus.fix.components.PositionAmountData;

/**
 * Fix Components Class
 * Generated for FIX 4.4
 * @author Bithaus Fix Message Generator
 */
public class AssignmentReport extends FixBaseMessage {

    private String asgnRptID;           
    private Integer totNumAssignmentReports;           
    private Boolean lastRptRequested;           
    private String account;           
    private Integer accountType;           
    private String currency;           
    private Integer noLegs;           
    private BigDecimal thresholdAmount;           
    private BigDecimal settlPrice;           
    private Integer settlPriceType;           
    private BigDecimal underlyingSettlPrice;           
    private String expireDate;           
    private String assignmentMethod;           
    private BigDecimal assignmentUnit;           
    private BigDecimal openInterest;           
    private String exerciseMethod;           
    private String settlSessID;           
    private String settlSessSubID;           
    private String clearingBusinessDate;           
    private String text;           
    private Integer encodedTextLen;           
    private String encodedText;           
    private Parties parties;           
    private Instrument instrument;           
    private InstrumentLeg instrumentLeg;           
    private PositionQty positionQty;           
    private PositionAmountData positionAmountData;           
    private NoUnderlyings noUnderlyings;           

    public AssignmentReport() { 
        super("AW", MsgCategory.APP);
    }

    public String getAsgnRptID() {
        return this.asgnRptID;
    }           

    public void setAsgnRptID(String asgnRptID) {
        this.asgnRptID = asgnRptID;
    }
    public Integer getTotNumAssignmentReports() {
        return this.totNumAssignmentReports;
    }           

    public void setTotNumAssignmentReports(Integer totNumAssignmentReports) {
        this.totNumAssignmentReports = totNumAssignmentReports;
    }
    public Boolean getLastRptRequested() {
        return this.lastRptRequested;
    }           

    public void setLastRptRequested(Boolean lastRptRequested) {
        this.lastRptRequested = lastRptRequested;
    }
    public String getAccount() {
        return this.account;
    }           

    public void setAccount(String account) {
        this.account = account;
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
    public Integer getNoLegs() {
        return this.noLegs;
    }           

    public void setNoLegs(Integer noLegs) {
        this.noLegs = noLegs;
    }
    public BigDecimal getThresholdAmount() {
        return this.thresholdAmount;
    }           

    public void setThresholdAmount(BigDecimal thresholdAmount) {
        this.thresholdAmount = thresholdAmount;
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
    public BigDecimal getUnderlyingSettlPrice() {
        return this.underlyingSettlPrice;
    }           

    public void setUnderlyingSettlPrice(BigDecimal underlyingSettlPrice) {
        this.underlyingSettlPrice = underlyingSettlPrice;
    }
    public String getExpireDate() {
        return this.expireDate;
    }           

    public void setExpireDate(String expireDate) {
        this.expireDate = expireDate;
    }
    public String getAssignmentMethod() {
        return this.assignmentMethod;
    }           

    public void setAssignmentMethod(String assignmentMethod) {
        this.assignmentMethod = assignmentMethod;
    }
    public BigDecimal getAssignmentUnit() {
        return this.assignmentUnit;
    }           

    public void setAssignmentUnit(BigDecimal assignmentUnit) {
        this.assignmentUnit = assignmentUnit;
    }
    public BigDecimal getOpenInterest() {
        return this.openInterest;
    }           

    public void setOpenInterest(BigDecimal openInterest) {
        this.openInterest = openInterest;
    }
    public String getExerciseMethod() {
        return this.exerciseMethod;
    }           

    public void setExerciseMethod(String exerciseMethod) {
        this.exerciseMethod = exerciseMethod;
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
    public String getClearingBusinessDate() {
        return this.clearingBusinessDate;
    }           

    public void setClearingBusinessDate(String clearingBusinessDate) {
        this.clearingBusinessDate = clearingBusinessDate;
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
    
    public InstrumentLeg getInstrumentLeg() {
        return this.instrumentLeg;
    }           

    public void setInstrumentLeg(InstrumentLeg instrumentLeg) {
        this.instrumentLeg = instrumentLeg;
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

    public AssignmentReport.NoUnderlyings getNoUnderlyings() {
        return this.noUnderlyings;
    }

    public void setNoUnderlyings(AssignmentReport.NoUnderlyings noUnderlyings) {
        this.noUnderlyings = noUnderlyings;
    }
        

    public static class NoUnderlyings extends FixGroup<AssignmentReport.NoUnderlyings.NoUnderlyingsEntry> {

        @Override
        public int getField() {
            return 711;
        }

        public static class NoUnderlyingsEntry {



        }
        
    }

}

