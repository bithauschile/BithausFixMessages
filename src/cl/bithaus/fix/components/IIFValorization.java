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

package cl.bithaus.fix.components;

import cl.bithaus.fix.msg.base.FixComponent;
import cl.bithaus.fix.msg.base.FixGroup;
import java.util.Date;
import java.math.BigDecimal;


/**
 * Fix Components Class
 * Generated for FIX 4.4
 * @author Bithaus Fix Message Generator
 */
public class IIFValorization implements FixComponent {

    private String iifValAdjustmentCurrency;           
    private Date iifValDate;           
    private String iifValSettlType;           
    private Date iifValDueDate;           
    private Integer iifValDueDays;           
    private BigDecimal iifValInterestRate;           
    private BigDecimal iifValRescueAmount;           
    private BigDecimal iifValInvestmentAmount;           
    private BigDecimal iifValInvestmentAmountAdjustedCurrence;           
    private String iifValFloatSymbol;           
    private String iifValFloatIssueDate;           
    private BigDecimal iifValFloatNominalQty;           
    private BigDecimal iifValFloatEstimatedInterestRate;           
    private Boolean iifValReferentialValue;           

    public IIFValorization() { }

    public String getIifValAdjustmentCurrency() {
        return this.iifValAdjustmentCurrency;
    }           

    public void setIifValAdjustmentCurrency(String iifValAdjustmentCurrency) {
        this.iifValAdjustmentCurrency = iifValAdjustmentCurrency;
    }
    public Date getIifValDate() {
        return this.iifValDate;
    }           

    public void setIifValDate(Date iifValDate) {
        this.iifValDate = iifValDate;
    }
    public String getIifValSettlType() {
        return this.iifValSettlType;
    }           

    public void setIifValSettlType(String iifValSettlType) {
        this.iifValSettlType = iifValSettlType;
    }
    public Date getIifValDueDate() {
        return this.iifValDueDate;
    }           

    public void setIifValDueDate(Date iifValDueDate) {
        this.iifValDueDate = iifValDueDate;
    }
    public Integer getIifValDueDays() {
        return this.iifValDueDays;
    }           

    public void setIifValDueDays(Integer iifValDueDays) {
        this.iifValDueDays = iifValDueDays;
    }
    public BigDecimal getIifValInterestRate() {
        return this.iifValInterestRate;
    }           

    public void setIifValInterestRate(BigDecimal iifValInterestRate) {
        this.iifValInterestRate = iifValInterestRate;
    }
    public BigDecimal getIifValRescueAmount() {
        return this.iifValRescueAmount;
    }           

    public void setIifValRescueAmount(BigDecimal iifValRescueAmount) {
        this.iifValRescueAmount = iifValRescueAmount;
    }
    public BigDecimal getIifValInvestmentAmount() {
        return this.iifValInvestmentAmount;
    }           

    public void setIifValInvestmentAmount(BigDecimal iifValInvestmentAmount) {
        this.iifValInvestmentAmount = iifValInvestmentAmount;
    }
    public BigDecimal getIifValInvestmentAmountAdjustedCurrence() {
        return this.iifValInvestmentAmountAdjustedCurrence;
    }           

    public void setIifValInvestmentAmountAdjustedCurrence(BigDecimal iifValInvestmentAmountAdjustedCurrence) {
        this.iifValInvestmentAmountAdjustedCurrence = iifValInvestmentAmountAdjustedCurrence;
    }
    public String getIifValFloatSymbol() {
        return this.iifValFloatSymbol;
    }           

    public void setIifValFloatSymbol(String iifValFloatSymbol) {
        this.iifValFloatSymbol = iifValFloatSymbol;
    }
    public String getIifValFloatIssueDate() {
        return this.iifValFloatIssueDate;
    }           

    public void setIifValFloatIssueDate(String iifValFloatIssueDate) {
        this.iifValFloatIssueDate = iifValFloatIssueDate;
    }
    public BigDecimal getIifValFloatNominalQty() {
        return this.iifValFloatNominalQty;
    }           

    public void setIifValFloatNominalQty(BigDecimal iifValFloatNominalQty) {
        this.iifValFloatNominalQty = iifValFloatNominalQty;
    }
    public BigDecimal getIifValFloatEstimatedInterestRate() {
        return this.iifValFloatEstimatedInterestRate;
    }           

    public void setIifValFloatEstimatedInterestRate(BigDecimal iifValFloatEstimatedInterestRate) {
        this.iifValFloatEstimatedInterestRate = iifValFloatEstimatedInterestRate;
    }
    public Boolean getIifValReferentialValue() {
        return this.iifValReferentialValue;
    }           

    public void setIifValReferentialValue(Boolean iifValReferentialValue) {
        this.iifValReferentialValue = iifValReferentialValue;
    }


        
}

