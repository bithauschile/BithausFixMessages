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
public class LegBenchmarkCurveData implements FixComponent {

    private String legBenchmarkCurveCurrency;           
    private String legBenchmarkCurveName;           
    private String legBenchmarkCurvePoint;           
    private BigDecimal legBenchmarkPrice;           
    private Integer legBenchmarkPriceType;           

    public LegBenchmarkCurveData() { }

    public String getLegBenchmarkCurveCurrency() {
        return this.legBenchmarkCurveCurrency;
    }           

    public void setLegBenchmarkCurveCurrency(String legBenchmarkCurveCurrency) {
        this.legBenchmarkCurveCurrency = legBenchmarkCurveCurrency;
    }
    public String getLegBenchmarkCurveName() {
        return this.legBenchmarkCurveName;
    }           

    public void setLegBenchmarkCurveName(String legBenchmarkCurveName) {
        this.legBenchmarkCurveName = legBenchmarkCurveName;
    }
    public String getLegBenchmarkCurvePoint() {
        return this.legBenchmarkCurvePoint;
    }           

    public void setLegBenchmarkCurvePoint(String legBenchmarkCurvePoint) {
        this.legBenchmarkCurvePoint = legBenchmarkCurvePoint;
    }
    public BigDecimal getLegBenchmarkPrice() {
        return this.legBenchmarkPrice;
    }           

    public void setLegBenchmarkPrice(BigDecimal legBenchmarkPrice) {
        this.legBenchmarkPrice = legBenchmarkPrice;
    }
    public Integer getLegBenchmarkPriceType() {
        return this.legBenchmarkPriceType;
    }           

    public void setLegBenchmarkPriceType(Integer legBenchmarkPriceType) {
        this.legBenchmarkPriceType = legBenchmarkPriceType;
    }


        
}

