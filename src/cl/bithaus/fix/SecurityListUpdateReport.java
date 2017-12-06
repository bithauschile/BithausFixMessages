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
import cl.bithaus.fix.components.SecLstUpdRelSymGrp;
import cl.bithaus.fix.components.ApplicationSequenceControl;

/**
 * Fix Components Class
 * Generated for FIX 4.4
 * @author Bithaus Fix Message Generator
 */
public class SecurityListUpdateReport extends FixBaseMessage {

    private Integer securityReportID;           
    private String securityReqID;           
    private String securityResponseID;           
    private Integer securityRequestResult;           
    private Integer totNoRelatedSym;           
    private String clearingBusinessDate;           
    private String securityUpdateAction;           
    private String corporateAction;           
    private Boolean lastFragment;           
    private String marketID;           
    private String marketSegmentID;           
    private String securityListID;           
    private String securityListRefID;           
    private String securityListDesc;           
    private Integer encodedSecurityListDescLen;           
    private String encodedSecurityListDesc;           
    private Integer securityListType;           
    private Integer securityListTypeSource;           
    private Date transactTime;           
    private SecLstUpdRelSymGrp secLstUpdRelSymGrp;           
    private ApplicationSequenceControl applicationSequenceControl;           

    public SecurityListUpdateReport() { 
        super("BK", MsgCategory.APP);
    }

    public Integer getSecurityReportID() {
        return this.securityReportID;
    }           

    public void setSecurityReportID(Integer securityReportID) {
        this.securityReportID = securityReportID;
    }
    public String getSecurityReqID() {
        return this.securityReqID;
    }           

    public void setSecurityReqID(String securityReqID) {
        this.securityReqID = securityReqID;
    }
    public String getSecurityResponseID() {
        return this.securityResponseID;
    }           

    public void setSecurityResponseID(String securityResponseID) {
        this.securityResponseID = securityResponseID;
    }
    public Integer getSecurityRequestResult() {
        return this.securityRequestResult;
    }           

    public void setSecurityRequestResult(Integer securityRequestResult) {
        this.securityRequestResult = securityRequestResult;
    }
    public Integer getTotNoRelatedSym() {
        return this.totNoRelatedSym;
    }           

    public void setTotNoRelatedSym(Integer totNoRelatedSym) {
        this.totNoRelatedSym = totNoRelatedSym;
    }
    public String getClearingBusinessDate() {
        return this.clearingBusinessDate;
    }           

    public void setClearingBusinessDate(String clearingBusinessDate) {
        this.clearingBusinessDate = clearingBusinessDate;
    }
    public String getSecurityUpdateAction() {
        return this.securityUpdateAction;
    }           

    public void setSecurityUpdateAction(String securityUpdateAction) {
        this.securityUpdateAction = securityUpdateAction;
    }
    public String getCorporateAction() {
        return this.corporateAction;
    }           

    public void setCorporateAction(String corporateAction) {
        this.corporateAction = corporateAction;
    }
    public Boolean getLastFragment() {
        return this.lastFragment;
    }           

    public void setLastFragment(Boolean lastFragment) {
        this.lastFragment = lastFragment;
    }
    public String getMarketID() {
        return this.marketID;
    }           

    public void setMarketID(String marketID) {
        this.marketID = marketID;
    }
    public String getMarketSegmentID() {
        return this.marketSegmentID;
    }           

    public void setMarketSegmentID(String marketSegmentID) {
        this.marketSegmentID = marketSegmentID;
    }
    public String getSecurityListID() {
        return this.securityListID;
    }           

    public void setSecurityListID(String securityListID) {
        this.securityListID = securityListID;
    }
    public String getSecurityListRefID() {
        return this.securityListRefID;
    }           

    public void setSecurityListRefID(String securityListRefID) {
        this.securityListRefID = securityListRefID;
    }
    public String getSecurityListDesc() {
        return this.securityListDesc;
    }           

    public void setSecurityListDesc(String securityListDesc) {
        this.securityListDesc = securityListDesc;
    }
    public Integer getEncodedSecurityListDescLen() {
        return this.encodedSecurityListDescLen;
    }           

    public void setEncodedSecurityListDescLen(Integer encodedSecurityListDescLen) {
        this.encodedSecurityListDescLen = encodedSecurityListDescLen;
    }
    public String getEncodedSecurityListDesc() {
        return this.encodedSecurityListDesc;
    }           

    public void setEncodedSecurityListDesc(String encodedSecurityListDesc) {
        this.encodedSecurityListDesc = encodedSecurityListDesc;
    }
    public Integer getSecurityListType() {
        return this.securityListType;
    }           

    public void setSecurityListType(Integer securityListType) {
        this.securityListType = securityListType;
    }
    public Integer getSecurityListTypeSource() {
        return this.securityListTypeSource;
    }           

    public void setSecurityListTypeSource(Integer securityListTypeSource) {
        this.securityListTypeSource = securityListTypeSource;
    }
    public Date getTransactTime() {
        return this.transactTime;
    }           

    public void setTransactTime(Date transactTime) {
        this.transactTime = transactTime;
    }

    
    public SecLstUpdRelSymGrp getSecLstUpdRelSymGrp() {
        return this.secLstUpdRelSymGrp;
    }           

    public void setSecLstUpdRelSymGrp(SecLstUpdRelSymGrp secLstUpdRelSymGrp) {
        this.secLstUpdRelSymGrp = secLstUpdRelSymGrp;
    }
    
    public ApplicationSequenceControl getApplicationSequenceControl() {
        return this.applicationSequenceControl;
    }           

    public void setApplicationSequenceControl(ApplicationSequenceControl applicationSequenceControl) {
        this.applicationSequenceControl = applicationSequenceControl;
    }

        
}

