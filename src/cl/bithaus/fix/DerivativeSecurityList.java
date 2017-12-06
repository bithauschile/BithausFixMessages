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
import cl.bithaus.fix.components.UnderlyingInstrument;

/**
 * Fix Components Class
 * Generated for FIX 4.4
 * @author Bithaus Fix Message Generator
 */
public class DerivativeSecurityList extends FixBaseMessage {

    private String securityReqID;           
    private String securityResponseID;           
    private Integer securityRequestResult;           
    private Integer totNoRelatedSym;           
    private Boolean lastFragment;           
    private UnderlyingInstrument underlyingInstrument;           
    private NoRelatedSym noRelatedSym;           

    public DerivativeSecurityList() { 
        super("AA", MsgCategory.APP);
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
    public Boolean getLastFragment() {
        return this.lastFragment;
    }           

    public void setLastFragment(Boolean lastFragment) {
        this.lastFragment = lastFragment;
    }

    
    public UnderlyingInstrument getUnderlyingInstrument() {
        return this.underlyingInstrument;
    }           

    public void setUnderlyingInstrument(UnderlyingInstrument underlyingInstrument) {
        this.underlyingInstrument = underlyingInstrument;
    }

    public DerivativeSecurityList.NoRelatedSym getNoRelatedSym() {
        return this.noRelatedSym;
    }

    public void setNoRelatedSym(DerivativeSecurityList.NoRelatedSym noRelatedSym) {
        this.noRelatedSym = noRelatedSym;
    }
        

    public static class NoRelatedSym extends FixGroup<DerivativeSecurityList.NoRelatedSym.NoRelatedSymEntry> {

        @Override
        public int getField() {
            return 146;
        }

        public static class NoRelatedSymEntry {

            private String currency;
            private Integer expirationCycle;
            private String tradingSessionID;
            private String tradingSessionSubID;
            private String text;
            private Integer encodedTextLen;
            private String encodedText;

            public String getCurrency() {
                return this.currency;
            }           

            public void setCurrency(String currency) {
                this.currency = currency;
            }
            public Integer getExpirationCycle() {
                return this.expirationCycle;
            }           

            public void setExpirationCycle(Integer expirationCycle) {
                this.expirationCycle = expirationCycle;
            }
            public String getTradingSessionID() {
                return this.tradingSessionID;
            }           

            public void setTradingSessionID(String tradingSessionID) {
                this.tradingSessionID = tradingSessionID;
            }
            public String getTradingSessionSubID() {
                return this.tradingSessionSubID;
            }           

            public void setTradingSessionSubID(String tradingSessionSubID) {
                this.tradingSessionSubID = tradingSessionSubID;
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
        
    }

}

