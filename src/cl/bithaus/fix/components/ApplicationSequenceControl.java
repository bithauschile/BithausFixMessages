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
public class ApplicationSequenceControl implements FixComponent {

    private String applID;           
    private Integer applSeqNum;           
    private Integer applLastSeqNum;           
    private Boolean applResendFlag;           

    public ApplicationSequenceControl() { }

    public String getApplID() {
        return this.applID;
    }           

    public void setApplID(String applID) {
        this.applID = applID;
    }
    public Integer getApplSeqNum() {
        return this.applSeqNum;
    }           

    public void setApplSeqNum(Integer applSeqNum) {
        this.applSeqNum = applSeqNum;
    }
    public Integer getApplLastSeqNum() {
        return this.applLastSeqNum;
    }           

    public void setApplLastSeqNum(Integer applLastSeqNum) {
        this.applLastSeqNum = applLastSeqNum;
    }
    public Boolean getApplResendFlag() {
        return this.applResendFlag;
    }           

    public void setApplResendFlag(Boolean applResendFlag) {
        this.applResendFlag = applResendFlag;
    }


        
}

