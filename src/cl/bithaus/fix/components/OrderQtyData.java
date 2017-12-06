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
public class OrderQtyData implements FixComponent {

    private BigDecimal orderQty;           
    private BigDecimal cashOrderQty;           
    private BigDecimal orderPercent;           
    private String roundingDirection;           
    private BigDecimal roundingModulus;           

    public OrderQtyData() { }

    public BigDecimal getOrderQty() {
        return this.orderQty;
    }           

    public void setOrderQty(BigDecimal orderQty) {
        this.orderQty = orderQty;
    }
    public BigDecimal getCashOrderQty() {
        return this.cashOrderQty;
    }           

    public void setCashOrderQty(BigDecimal cashOrderQty) {
        this.cashOrderQty = cashOrderQty;
    }
    public BigDecimal getOrderPercent() {
        return this.orderPercent;
    }           

    public void setOrderPercent(BigDecimal orderPercent) {
        this.orderPercent = orderPercent;
    }
    public String getRoundingDirection() {
        return this.roundingDirection;
    }           

    public void setRoundingDirection(String roundingDirection) {
        this.roundingDirection = roundingDirection;
    }
    public BigDecimal getRoundingModulus() {
        return this.roundingModulus;
    }           

    public void setRoundingModulus(BigDecimal roundingModulus) {
        this.roundingModulus = roundingModulus;
    }


        
}

