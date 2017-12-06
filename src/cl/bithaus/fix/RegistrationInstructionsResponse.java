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

package cl.bithaus.fix;

import cl.bithaus.fix.msg.base.FixGroup;
import java.util.Date;
import java.math.BigDecimal;
import cl.bithaus.fix.components.Parties;

/**
 * Fix Components Class
 * Generated for FIX 4.4
 * @author Bithaus Fix Message Generator
 */
public class RegistrationInstructionsResponse extends FixBaseMessage {

    private String registID;           
    private String registTransType;           
    private String registRefID;           
    private String clOrdID;           
    private String account;           
    private Integer acctIDSource;           
    private String registStatus;           
    private Integer registRejReasonCode;           
    private String registRejReasonText;           
    private Parties parties;           

    public RegistrationInstructionsResponse() { 
        super("p", MsgCategory.APP);
    }

    public String getRegistID() {
        return this.registID;
    }           

    public void setRegistID(String registID) {
        this.registID = registID;
    }
    public String getRegistTransType() {
        return this.registTransType;
    }           

    public void setRegistTransType(String registTransType) {
        this.registTransType = registTransType;
    }
    public String getRegistRefID() {
        return this.registRefID;
    }           

    public void setRegistRefID(String registRefID) {
        this.registRefID = registRefID;
    }
    public String getClOrdID() {
        return this.clOrdID;
    }           

    public void setClOrdID(String clOrdID) {
        this.clOrdID = clOrdID;
    }
    public String getAccount() {
        return this.account;
    }           

    public void setAccount(String account) {
        this.account = account;
    }
    public Integer getAcctIDSource() {
        return this.acctIDSource;
    }           

    public void setAcctIDSource(Integer acctIDSource) {
        this.acctIDSource = acctIDSource;
    }
    public String getRegistStatus() {
        return this.registStatus;
    }           

    public void setRegistStatus(String registStatus) {
        this.registStatus = registStatus;
    }
    public Integer getRegistRejReasonCode() {
        return this.registRejReasonCode;
    }           

    public void setRegistRejReasonCode(Integer registRejReasonCode) {
        this.registRejReasonCode = registRejReasonCode;
    }
    public String getRegistRejReasonText() {
        return this.registRejReasonText;
    }           

    public void setRegistRejReasonText(String registRejReasonText) {
        this.registRejReasonText = registRejReasonText;
    }

    
    public Parties getParties() {
        return this.parties;
    }           

    public void setParties(Parties parties) {
        this.parties = parties;
    }

        
}

