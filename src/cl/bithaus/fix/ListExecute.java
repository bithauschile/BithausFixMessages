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
public class ListExecute extends FixBaseMessage {

    private String listID;           
    private String clientBidID;           
    private String bidID;           
    private Date transactTime;           
    private String text;           
    private Integer encodedTextLen;           
    private String encodedText;           

    public ListExecute() { 
        super("L", MsgCategory.APP);
    }

    public String getListID() {
        return this.listID;
    }           

    public void setListID(String listID) {
        this.listID = listID;
    }
    public String getClientBidID() {
        return this.clientBidID;
    }           

    public void setClientBidID(String clientBidID) {
        this.clientBidID = clientBidID;
    }
    public String getBidID() {
        return this.bidID;
    }           

    public void setBidID(String bidID) {
        this.bidID = bidID;
    }
    public Date getTransactTime() {
        return this.transactTime;
    }           

    public void setTransactTime(Date transactTime) {
        this.transactTime = transactTime;
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

