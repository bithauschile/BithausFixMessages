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
public class SpreadOrBenchmarkCurveData implements FixComponent {

    private BigDecimal spread;           
    private String benchmarkCurveCurrency;           
    private String benchmarkCurveName;           
    private String benchmarkCurvePoint;           
    private BigDecimal benchmarkPrice;           
    private Integer benchmarkPriceType;           
    private String benchmarkSecurityID;           
    private String benchmarkSecurityIDSource;           

    public SpreadOrBenchmarkCurveData() { }

    public BigDecimal getSpread() {
        return this.spread;
    }           

    public void setSpread(BigDecimal spread) {
        this.spread = spread;
    }
    public String getBenchmarkCurveCurrency() {
        return this.benchmarkCurveCurrency;
    }           

    public void setBenchmarkCurveCurrency(String benchmarkCurveCurrency) {
        this.benchmarkCurveCurrency = benchmarkCurveCurrency;
    }
    public String getBenchmarkCurveName() {
        return this.benchmarkCurveName;
    }           

    public void setBenchmarkCurveName(String benchmarkCurveName) {
        this.benchmarkCurveName = benchmarkCurveName;
    }
    public String getBenchmarkCurvePoint() {
        return this.benchmarkCurvePoint;
    }           

    public void setBenchmarkCurvePoint(String benchmarkCurvePoint) {
        this.benchmarkCurvePoint = benchmarkCurvePoint;
    }
    public BigDecimal getBenchmarkPrice() {
        return this.benchmarkPrice;
    }           

    public void setBenchmarkPrice(BigDecimal benchmarkPrice) {
        this.benchmarkPrice = benchmarkPrice;
    }
    public Integer getBenchmarkPriceType() {
        return this.benchmarkPriceType;
    }           

    public void setBenchmarkPriceType(Integer benchmarkPriceType) {
        this.benchmarkPriceType = benchmarkPriceType;
    }
    public String getBenchmarkSecurityID() {
        return this.benchmarkSecurityID;
    }           

    public void setBenchmarkSecurityID(String benchmarkSecurityID) {
        this.benchmarkSecurityID = benchmarkSecurityID;
    }
    public String getBenchmarkSecurityIDSource() {
        return this.benchmarkSecurityIDSource;
    }           

    public void setBenchmarkSecurityIDSource(String benchmarkSecurityIDSource) {
        this.benchmarkSecurityIDSource = benchmarkSecurityIDSource;
    }


        
}

