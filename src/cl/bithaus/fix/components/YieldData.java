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
public class YieldData implements FixComponent {

    private String yieldType;           
    private BigDecimal yield;           
    private String yieldCalcDate;           
    private String yieldRedemptionDate;           
    private BigDecimal yieldRedemptionPrice;           
    private Integer yieldRedemptionPriceType;           

    public YieldData() { }

    public String getYieldType() {
        return this.yieldType;
    }           

    public void setYieldType(String yieldType) {
        this.yieldType = yieldType;
    }
    public BigDecimal getYield() {
        return this.yield;
    }           

    public void setYield(BigDecimal yield) {
        this.yield = yield;
    }
    public String getYieldCalcDate() {
        return this.yieldCalcDate;
    }           

    public void setYieldCalcDate(String yieldCalcDate) {
        this.yieldCalcDate = yieldCalcDate;
    }
    public String getYieldRedemptionDate() {
        return this.yieldRedemptionDate;
    }           

    public void setYieldRedemptionDate(String yieldRedemptionDate) {
        this.yieldRedemptionDate = yieldRedemptionDate;
    }
    public BigDecimal getYieldRedemptionPrice() {
        return this.yieldRedemptionPrice;
    }           

    public void setYieldRedemptionPrice(BigDecimal yieldRedemptionPrice) {
        this.yieldRedemptionPrice = yieldRedemptionPrice;
    }
    public Integer getYieldRedemptionPriceType() {
        return this.yieldRedemptionPriceType;
    }           

    public void setYieldRedemptionPriceType(Integer yieldRedemptionPriceType) {
        this.yieldRedemptionPriceType = yieldRedemptionPriceType;
    }


        
}

