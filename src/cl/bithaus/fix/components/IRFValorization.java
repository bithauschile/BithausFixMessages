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
public class IRFValorization implements FixComponent {

    private String irfValSymbol;           
    private String irfValAdjustmentCurrency;           
    private Date irfValDate;           
    private String irfValSettlType;           
    private BigDecimal irfValQty;           
    private BigDecimal irfValTir;           
    private BigDecimal irfValPrice;           
    private BigDecimal irfValAmount;           
    private BigDecimal irfValAmountAdjustedCurrency;           
    private BigDecimal irfValSettlAmount;           
    private BigDecimal irfValPar;           
    private String irfValPeriod;           
    private BigDecimal irfValDuration;           
    private BigDecimal irfValConvex;           
    private BigDecimal irfValFloatingRateParValue;           
    private BigDecimal irfValFloatingRateEstRate;           
    private Integer irfValOtherPeriodYears;           
    private BigDecimal irfValOtherEstYearInflationRate;           
    private Boolean irfValReferentialValue;           

    public IRFValorization() { }

    public String getIrfValSymbol() {
        return this.irfValSymbol;
    }           

    public void setIrfValSymbol(String irfValSymbol) {
        this.irfValSymbol = irfValSymbol;
    }
    public String getIrfValAdjustmentCurrency() {
        return this.irfValAdjustmentCurrency;
    }           

    public void setIrfValAdjustmentCurrency(String irfValAdjustmentCurrency) {
        this.irfValAdjustmentCurrency = irfValAdjustmentCurrency;
    }
    public Date getIrfValDate() {
        return this.irfValDate;
    }           

    public void setIrfValDate(Date irfValDate) {
        this.irfValDate = irfValDate;
    }
    public String getIrfValSettlType() {
        return this.irfValSettlType;
    }           

    public void setIrfValSettlType(String irfValSettlType) {
        this.irfValSettlType = irfValSettlType;
    }
    public BigDecimal getIrfValQty() {
        return this.irfValQty;
    }           

    public void setIrfValQty(BigDecimal irfValQty) {
        this.irfValQty = irfValQty;
    }
    public BigDecimal getIrfValTir() {
        return this.irfValTir;
    }           

    public void setIrfValTir(BigDecimal irfValTir) {
        this.irfValTir = irfValTir;
    }
    public BigDecimal getIrfValPrice() {
        return this.irfValPrice;
    }           

    public void setIrfValPrice(BigDecimal irfValPrice) {
        this.irfValPrice = irfValPrice;
    }
    public BigDecimal getIrfValAmount() {
        return this.irfValAmount;
    }           

    public void setIrfValAmount(BigDecimal irfValAmount) {
        this.irfValAmount = irfValAmount;
    }
    public BigDecimal getIrfValAmountAdjustedCurrency() {
        return this.irfValAmountAdjustedCurrency;
    }           

    public void setIrfValAmountAdjustedCurrency(BigDecimal irfValAmountAdjustedCurrency) {
        this.irfValAmountAdjustedCurrency = irfValAmountAdjustedCurrency;
    }
    public BigDecimal getIrfValSettlAmount() {
        return this.irfValSettlAmount;
    }           

    public void setIrfValSettlAmount(BigDecimal irfValSettlAmount) {
        this.irfValSettlAmount = irfValSettlAmount;
    }
    public BigDecimal getIrfValPar() {
        return this.irfValPar;
    }           

    public void setIrfValPar(BigDecimal irfValPar) {
        this.irfValPar = irfValPar;
    }
    public String getIrfValPeriod() {
        return this.irfValPeriod;
    }           

    public void setIrfValPeriod(String irfValPeriod) {
        this.irfValPeriod = irfValPeriod;
    }
    public BigDecimal getIrfValDuration() {
        return this.irfValDuration;
    }           

    public void setIrfValDuration(BigDecimal irfValDuration) {
        this.irfValDuration = irfValDuration;
    }
    public BigDecimal getIrfValConvex() {
        return this.irfValConvex;
    }           

    public void setIrfValConvex(BigDecimal irfValConvex) {
        this.irfValConvex = irfValConvex;
    }
    public BigDecimal getIrfValFloatingRateParValue() {
        return this.irfValFloatingRateParValue;
    }           

    public void setIrfValFloatingRateParValue(BigDecimal irfValFloatingRateParValue) {
        this.irfValFloatingRateParValue = irfValFloatingRateParValue;
    }
    public BigDecimal getIrfValFloatingRateEstRate() {
        return this.irfValFloatingRateEstRate;
    }           

    public void setIrfValFloatingRateEstRate(BigDecimal irfValFloatingRateEstRate) {
        this.irfValFloatingRateEstRate = irfValFloatingRateEstRate;
    }
    public Integer getIrfValOtherPeriodYears() {
        return this.irfValOtherPeriodYears;
    }           

    public void setIrfValOtherPeriodYears(Integer irfValOtherPeriodYears) {
        this.irfValOtherPeriodYears = irfValOtherPeriodYears;
    }
    public BigDecimal getIrfValOtherEstYearInflationRate() {
        return this.irfValOtherEstYearInflationRate;
    }           

    public void setIrfValOtherEstYearInflationRate(BigDecimal irfValOtherEstYearInflationRate) {
        this.irfValOtherEstYearInflationRate = irfValOtherEstYearInflationRate;
    }
    public Boolean getIrfValReferentialValue() {
        return this.irfValReferentialValue;
    }           

    public void setIrfValReferentialValue(Boolean irfValReferentialValue) {
        this.irfValReferentialValue = irfValReferentialValue;
    }


        
}

