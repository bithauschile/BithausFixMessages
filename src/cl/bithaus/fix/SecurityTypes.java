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
public class SecurityTypes extends FixBaseMessage {

    private String securityReqID;           
    private String securityResponseID;           
    private Integer securityResponseType;           
    private Integer totNoSecurityTypes;           
    private Boolean lastFragment;           
    private String text;           
    private Integer encodedTextLen;           
    private String encodedText;           
    private String tradingSessionID;           
    private String tradingSessionSubID;           
    private String subscriptionRequestType;           
    private NoSecurityTypes noSecurityTypes;           

    public SecurityTypes() { 
        super("w", MsgCategory.APP);
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
    public Integer getSecurityResponseType() {
        return this.securityResponseType;
    }           

    public void setSecurityResponseType(Integer securityResponseType) {
        this.securityResponseType = securityResponseType;
    }
    public Integer getTotNoSecurityTypes() {
        return this.totNoSecurityTypes;
    }           

    public void setTotNoSecurityTypes(Integer totNoSecurityTypes) {
        this.totNoSecurityTypes = totNoSecurityTypes;
    }
    public Boolean getLastFragment() {
        return this.lastFragment;
    }           

    public void setLastFragment(Boolean lastFragment) {
        this.lastFragment = lastFragment;
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
    public String getSubscriptionRequestType() {
        return this.subscriptionRequestType;
    }           

    public void setSubscriptionRequestType(String subscriptionRequestType) {
        this.subscriptionRequestType = subscriptionRequestType;
    }


    public SecurityTypes.NoSecurityTypes getNoSecurityTypes() {
        return this.noSecurityTypes;
    }

    public void setNoSecurityTypes(SecurityTypes.NoSecurityTypes noSecurityTypes) {
        this.noSecurityTypes = noSecurityTypes;
    }
        

    public static class NoSecurityTypes extends FixGroup<SecurityTypes.NoSecurityTypes.NoSecurityTypesEntry> {

        @Override
        public int getField() {
            return 558;
        }

        public static class NoSecurityTypesEntry {

            private String securityType;
            private String securitySubType;
            private Integer product;
            private String cFICode;

            public String getSecurityType() {
                return this.securityType;
            }           

            public void setSecurityType(String securityType) {
                this.securityType = securityType;
            }
            public String getSecuritySubType() {
                return this.securitySubType;
            }           

            public void setSecuritySubType(String securitySubType) {
                this.securitySubType = securitySubType;
            }
            public Integer getProduct() {
                return this.product;
            }           

            public void setProduct(Integer product) {
                this.product = product;
            }
            public String getCFICode() {
                return this.cFICode;
            }           

            public void setCFICode(String cFICode) {
                this.cFICode = cFICode;
            }

        }
        
    }

}

