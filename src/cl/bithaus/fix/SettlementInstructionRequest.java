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
public class SettlementInstructionRequest extends FixBaseMessage {

    private String settlInstReqID;           
    private Date transactTime;           
    private String allocAccount;           
    private Integer allocAcctIDSource;           
    private String side;           
    private Integer product;           
    private String securityType;           
    private String cFICode;           
    private Date effectiveTime;           
    private Date expireTime;           
    private Date lastUpdateTime;           
    private Integer standInstDbType;           
    private String standInstDbName;           
    private String standInstDbID;           
    private Parties parties;           

    public SettlementInstructionRequest() { 
        super("AV", MsgCategory.APP);
    }

    public String getSettlInstReqID() {
        return this.settlInstReqID;
    }           

    public void setSettlInstReqID(String settlInstReqID) {
        this.settlInstReqID = settlInstReqID;
    }
    public Date getTransactTime() {
        return this.transactTime;
    }           

    public void setTransactTime(Date transactTime) {
        this.transactTime = transactTime;
    }
    public String getAllocAccount() {
        return this.allocAccount;
    }           

    public void setAllocAccount(String allocAccount) {
        this.allocAccount = allocAccount;
    }
    public Integer getAllocAcctIDSource() {
        return this.allocAcctIDSource;
    }           

    public void setAllocAcctIDSource(Integer allocAcctIDSource) {
        this.allocAcctIDSource = allocAcctIDSource;
    }
    public String getSide() {
        return this.side;
    }           

    public void setSide(String side) {
        this.side = side;
    }
    public Integer getProduct() {
        return this.product;
    }           

    public void setProduct(Integer product) {
        this.product = product;
    }
    public String getSecurityType() {
        return this.securityType;
    }           

    public void setSecurityType(String securityType) {
        this.securityType = securityType;
    }
    public String getCFICode() {
        return this.cFICode;
    }           

    public void setCFICode(String cFICode) {
        this.cFICode = cFICode;
    }
    public Date getEffectiveTime() {
        return this.effectiveTime;
    }           

    public void setEffectiveTime(Date effectiveTime) {
        this.effectiveTime = effectiveTime;
    }
    public Date getExpireTime() {
        return this.expireTime;
    }           

    public void setExpireTime(Date expireTime) {
        this.expireTime = expireTime;
    }
    public Date getLastUpdateTime() {
        return this.lastUpdateTime;
    }           

    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }
    public Integer getStandInstDbType() {
        return this.standInstDbType;
    }           

    public void setStandInstDbType(Integer standInstDbType) {
        this.standInstDbType = standInstDbType;
    }
    public String getStandInstDbName() {
        return this.standInstDbName;
    }           

    public void setStandInstDbName(String standInstDbName) {
        this.standInstDbName = standInstDbName;
    }
    public String getStandInstDbID() {
        return this.standInstDbID;
    }           

    public void setStandInstDbID(String standInstDbID) {
        this.standInstDbID = standInstDbID;
    }

    
    public Parties getParties() {
        return this.parties;
    }           

    public void setParties(Parties parties) {
        this.parties = parties;
    }

        
}

