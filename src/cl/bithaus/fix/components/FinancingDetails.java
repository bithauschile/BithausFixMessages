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
public class FinancingDetails implements FixComponent {

    private String agreementDesc;           
    private String agreementID;           
    private String agreementDate;           
    private String agreementCurrency;           
    private Integer terminationType;           
    private String startDate;           
    private String endDate;           
    private Integer deliveryType;           
    private BigDecimal marginRatio;           

    public FinancingDetails() { }

    public String getAgreementDesc() {
        return this.agreementDesc;
    }           

    public void setAgreementDesc(String agreementDesc) {
        this.agreementDesc = agreementDesc;
    }
    public String getAgreementID() {
        return this.agreementID;
    }           

    public void setAgreementID(String agreementID) {
        this.agreementID = agreementID;
    }
    public String getAgreementDate() {
        return this.agreementDate;
    }           

    public void setAgreementDate(String agreementDate) {
        this.agreementDate = agreementDate;
    }
    public String getAgreementCurrency() {
        return this.agreementCurrency;
    }           

    public void setAgreementCurrency(String agreementCurrency) {
        this.agreementCurrency = agreementCurrency;
    }
    public Integer getTerminationType() {
        return this.terminationType;
    }           

    public void setTerminationType(Integer terminationType) {
        this.terminationType = terminationType;
    }
    public String getStartDate() {
        return this.startDate;
    }           

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }
    public String getEndDate() {
        return this.endDate;
    }           

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
    public Integer getDeliveryType() {
        return this.deliveryType;
    }           

    public void setDeliveryType(Integer deliveryType) {
        this.deliveryType = deliveryType;
    }
    public BigDecimal getMarginRatio() {
        return this.marginRatio;
    }           

    public void setMarginRatio(BigDecimal marginRatio) {
        this.marginRatio = marginRatio;
    }


        
}

