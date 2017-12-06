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
public class MarketDataRequestReject extends FixBaseMessage {

    private String mDReqID;           
    private String mDReqRejReason;           
    private String text;           
    private Integer encodedTextLen;           
    private String encodedText;           
    private NoAltMDSource noAltMDSource;           

    public MarketDataRequestReject() { 
        super("Y", MsgCategory.APP);
    }

    public String getMDReqID() {
        return this.mDReqID;
    }           

    public void setMDReqID(String mDReqID) {
        this.mDReqID = mDReqID;
    }
    public String getMDReqRejReason() {
        return this.mDReqRejReason;
    }           

    public void setMDReqRejReason(String mDReqRejReason) {
        this.mDReqRejReason = mDReqRejReason;
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


    public MarketDataRequestReject.NoAltMDSource getNoAltMDSource() {
        return this.noAltMDSource;
    }

    public void setNoAltMDSource(MarketDataRequestReject.NoAltMDSource noAltMDSource) {
        this.noAltMDSource = noAltMDSource;
    }
        

    public static class NoAltMDSource extends FixGroup<MarketDataRequestReject.NoAltMDSource.NoAltMDSourceEntry> {

        @Override
        public int getField() {
            return 816;
        }

        public static class NoAltMDSourceEntry {

            private String altMDSourceID;

            public String getAltMDSourceID() {
                return this.altMDSourceID;
            }           

            public void setAltMDSourceID(String altMDSourceID) {
                this.altMDSourceID = altMDSourceID;
            }

        }
        
    }

}

