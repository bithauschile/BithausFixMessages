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
public class DiscretionInstructions implements FixComponent {

    private String discretionInst;           
    private BigDecimal discretionOffsetValue;           
    private Integer discretionMoveType;           
    private Integer discretionOffsetType;           
    private Integer discretionLimitType;           
    private Integer discretionRoundDirection;           
    private Integer discretionScope;           

    public DiscretionInstructions() { }

    public String getDiscretionInst() {
        return this.discretionInst;
    }           

    public void setDiscretionInst(String discretionInst) {
        this.discretionInst = discretionInst;
    }
    public BigDecimal getDiscretionOffsetValue() {
        return this.discretionOffsetValue;
    }           

    public void setDiscretionOffsetValue(BigDecimal discretionOffsetValue) {
        this.discretionOffsetValue = discretionOffsetValue;
    }
    public Integer getDiscretionMoveType() {
        return this.discretionMoveType;
    }           

    public void setDiscretionMoveType(Integer discretionMoveType) {
        this.discretionMoveType = discretionMoveType;
    }
    public Integer getDiscretionOffsetType() {
        return this.discretionOffsetType;
    }           

    public void setDiscretionOffsetType(Integer discretionOffsetType) {
        this.discretionOffsetType = discretionOffsetType;
    }
    public Integer getDiscretionLimitType() {
        return this.discretionLimitType;
    }           

    public void setDiscretionLimitType(Integer discretionLimitType) {
        this.discretionLimitType = discretionLimitType;
    }
    public Integer getDiscretionRoundDirection() {
        return this.discretionRoundDirection;
    }           

    public void setDiscretionRoundDirection(Integer discretionRoundDirection) {
        this.discretionRoundDirection = discretionRoundDirection;
    }
    public Integer getDiscretionScope() {
        return this.discretionScope;
    }           

    public void setDiscretionScope(Integer discretionScope) {
        this.discretionScope = discretionScope;
    }


        
}

