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
public class CommissionData implements FixComponent {

    private BigDecimal commission;           
    private String commType;           
    private String commCurrency;           
    private String fundRenewWaiv;           

    public CommissionData() { }

    public BigDecimal getCommission() {
        return this.commission;
    }           

    public void setCommission(BigDecimal commission) {
        this.commission = commission;
    }
    public String getCommType() {
        return this.commType;
    }           

    public void setCommType(String commType) {
        this.commType = commType;
    }
    public String getCommCurrency() {
        return this.commCurrency;
    }           

    public void setCommCurrency(String commCurrency) {
        this.commCurrency = commCurrency;
    }
    public String getFundRenewWaiv() {
        return this.fundRenewWaiv;
    }           

    public void setFundRenewWaiv(String fundRenewWaiv) {
        this.fundRenewWaiv = fundRenewWaiv;
    }


        
}

