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
public class ConfirmationAck extends FixBaseMessage {

    private String confirmID;           
    private String tradeDate;           
    private Date transactTime;           
    private Integer affirmStatus;           
    private Integer confirmRejReason;           
    private String matchStatus;           
    private String text;           
    private Integer encodedTextLen;           
    private String encodedText;           

    public ConfirmationAck() { 
        super("AU", MsgCategory.APP);
    }

    public String getConfirmID() {
        return this.confirmID;
    }           

    public void setConfirmID(String confirmID) {
        this.confirmID = confirmID;
    }
    public String getTradeDate() {
        return this.tradeDate;
    }           

    public void setTradeDate(String tradeDate) {
        this.tradeDate = tradeDate;
    }
    public Date getTransactTime() {
        return this.transactTime;
    }           

    public void setTransactTime(Date transactTime) {
        this.transactTime = transactTime;
    }
    public Integer getAffirmStatus() {
        return this.affirmStatus;
    }           

    public void setAffirmStatus(Integer affirmStatus) {
        this.affirmStatus = affirmStatus;
    }
    public Integer getConfirmRejReason() {
        return this.confirmRejReason;
    }           

    public void setConfirmRejReason(Integer confirmRejReason) {
        this.confirmRejReason = confirmRejReason;
    }
    public String getMatchStatus() {
        return this.matchStatus;
    }           

    public void setMatchStatus(String matchStatus) {
        this.matchStatus = matchStatus;
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

