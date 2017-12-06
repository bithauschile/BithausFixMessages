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
public class SecurityList extends FixBaseMessage {

    private String securityReqID;           
    private String securityResponseID;           
    private Integer securityRequestResult;           
    private Integer totNoRelatedSym;           
    private Boolean lastFragment;           
    private NoRelatedSym noRelatedSym;           

    public SecurityList() { 
        super("y", MsgCategory.APP);
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


    public SecurityList.NoRelatedSym getNoRelatedSym() {
        return this.noRelatedSym;
    }

    public void setNoRelatedSym(SecurityList.NoRelatedSym noRelatedSym) {
        this.noRelatedSym = noRelatedSym;
    }
        

    public static class NoRelatedSym extends FixGroup<SecurityList.NoRelatedSym.NoRelatedSymEntry> {

        @Override
        public int getField() {
            return 146;
        }

        public static class NoRelatedSymEntry {

            private String currency;
            private BigDecimal roundLot;
            private BigDecimal minTradeVol;
            private String tradingSessionID;
            private String tradingSessionSubID;
            private Integer expirationCycle;
            private String text;
            private Integer encodedTextLen;
            private String encodedText;
            private String presenceCategory;
            private Boolean automaticCrossAuthorization;
            private BigDecimal numericPresence;
            private Boolean serializedAuthorization;
            private Integer priceType;
            private String mDAdjustmentCurrency;
            private String mDMaturity;

            public String getCurrency() {
                return this.currency;
            }           

            public void setCurrency(String currency) {
                this.currency = currency;
            }
            public BigDecimal getRoundLot() {
                return this.roundLot;
            }           

            public void setRoundLot(BigDecimal roundLot) {
                this.roundLot = roundLot;
            }
            public BigDecimal getMinTradeVol() {
                return this.minTradeVol;
            }           

            public void setMinTradeVol(BigDecimal minTradeVol) {
                this.minTradeVol = minTradeVol;
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
            public Integer getExpirationCycle() {
                return this.expirationCycle;
            }           

            public void setExpirationCycle(Integer expirationCycle) {
                this.expirationCycle = expirationCycle;
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
            public String getPresenceCategory() {
                return this.presenceCategory;
            }           

            public void setPresenceCategory(String presenceCategory) {
                this.presenceCategory = presenceCategory;
            }
            public Boolean getAutomaticCrossAuthorization() {
                return this.automaticCrossAuthorization;
            }           

            public void setAutomaticCrossAuthorization(Boolean automaticCrossAuthorization) {
                this.automaticCrossAuthorization = automaticCrossAuthorization;
            }
            public BigDecimal getNumericPresence() {
                return this.numericPresence;
            }           

            public void setNumericPresence(BigDecimal numericPresence) {
                this.numericPresence = numericPresence;
            }
            public Boolean getSerializedAuthorization() {
                return this.serializedAuthorization;
            }           

            public void setSerializedAuthorization(Boolean serializedAuthorization) {
                this.serializedAuthorization = serializedAuthorization;
            }
            public Integer getPriceType() {
                return this.priceType;
            }           

            public void setPriceType(Integer priceType) {
                this.priceType = priceType;
            }
            public String getMDAdjustmentCurrency() {
                return this.mDAdjustmentCurrency;
            }           

            public void setMDAdjustmentCurrency(String mDAdjustmentCurrency) {
                this.mDAdjustmentCurrency = mDAdjustmentCurrency;
            }
            public String getMDMaturity() {
                return this.mDMaturity;
            }           

            public void setMDMaturity(String mDMaturity) {
                this.mDMaturity = mDMaturity;
            }

        }
        
    }

}

