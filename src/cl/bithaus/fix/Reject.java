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

/**
 * Fix Components Class
 * Generated for FIX 4.4
 * @author Bithaus Fix Message Generator
 */
public class Reject extends FixBaseMessage {

    private Integer refSeqNum;           
    private Integer refTagID;           
    private String refMsgType;           
    private Integer sessionRejectReason;           
    private String text;           
    private Integer encodedTextLen;           
    private String encodedText;           

    public Reject() { 
        super("3", MsgCategory.ADMIN);
    }

    public Integer getRefSeqNum() {
        return this.refSeqNum;
    }           

    public void setRefSeqNum(Integer refSeqNum) {
        this.refSeqNum = refSeqNum;
    }
    public Integer getRefTagID() {
        return this.refTagID;
    }           

    public void setRefTagID(Integer refTagID) {
        this.refTagID = refTagID;
    }
    public String getRefMsgType() {
        return this.refMsgType;
    }           

    public void setRefMsgType(String refMsgType) {
        this.refMsgType = refMsgType;
    }
    public Integer getSessionRejectReason() {
        return this.sessionRejectReason;
    }           

    public void setSessionRejectReason(Integer sessionRejectReason) {
        this.sessionRejectReason = sessionRejectReason;
    }
    public String getText() {
        return this.text;
    }           

    public void setText(String text) {
        this.text = text;
    }
    public Integer getEncodedTextLen() {
        return this.encodedTextLen;
    }           

    public void setEncodedTextLen(Integer encodedTextLen) {
        this.encodedTextLen = encodedTextLen;
    }
    public String getEncodedText() {
        return this.encodedText;
    }           

    public void setEncodedText(String encodedText) {
        this.encodedText = encodedText;
    }


        
}

