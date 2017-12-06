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
public class SettlementInstructions extends FixBaseMessage {

    private String settlInstMsgID;           
    private String settlInstReqID;           
    private String settlInstMode;           
    private Integer settlInstReqRejCode;           
    private String text;           
    private Integer encodedTextLen;           
    private String encodedText;           
    private String settlInstSource;           
    private String clOrdID;           
    private Date transactTime;           
    private NoSettlInst noSettlInst;           

    public SettlementInstructions() { 
        super("T", MsgCategory.APP);
    }

    public String getSettlInstMsgID() {
        return this.settlInstMsgID;
    }           

    public void setSettlInstMsgID(String settlInstMsgID) {
        this.settlInstMsgID = settlInstMsgID;
    }
    public String getSettlInstReqID() {
        return this.settlInstReqID;
    }           

    public void setSettlInstReqID(String settlInstReqID) {
        this.settlInstReqID = settlInstReqID;
    }
    public String getSettlInstMode() {
        return this.settlInstMode;
    }           

    public void setSettlInstMode(String settlInstMode) {
        this.settlInstMode = settlInstMode;
    }
    public Integer getSettlInstReqRejCode() {
        return this.settlInstReqRejCode;
    }           

    public void setSettlInstReqRejCode(Integer settlInstReqRejCode) {
        this.settlInstReqRejCode = settlInstReqRejCode;
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
    public String getSettlInstSource() {
        return this.settlInstSource;
    }           

    public void setSettlInstSource(String settlInstSource) {
        this.settlInstSource = settlInstSource;
    }
    public String getClOrdID() {
        return this.clOrdID;
    }           

    public void setClOrdID(String clOrdID) {
        this.clOrdID = clOrdID;
    }
    public Date getTransactTime() {
        return this.transactTime;
    }           

    public void setTransactTime(Date transactTime) {
        this.transactTime = transactTime;
    }


    public SettlementInstructions.NoSettlInst getNoSettlInst() {
        return this.noSettlInst;
    }

    public void setNoSettlInst(SettlementInstructions.NoSettlInst noSettlInst) {
        this.noSettlInst = noSettlInst;
    }
        

    public static class NoSettlInst extends FixGroup<SettlementInstructions.NoSettlInst.NoSettlInstEntry> {

        @Override
        public int getField() {
            return 778;
        }

        public static class NoSettlInstEntry {

            private String settlInstID;
            private String settlInstTransType;
            private String settlInstRefID;
            private String side;
            private Integer product;
            private String securityType;
            private String cFICode;
            private Date effectiveTime;
            private Date expireTime;
            private Date lastUpdateTime;
            private Integer paymentMethod;
            private String paymentRef;
            private String cardHolderName;
            private String cardNumber;
            private String cardStartDate;
            private String cardExpDate;
            private String cardIssNum;
            private String paymentDate;
            private String paymentRemitterID;

            public String getSettlInstID() {
                return this.settlInstID;
            }           

            public void setSettlInstID(String settlInstID) {
                this.settlInstID = settlInstID;
            }
            public String getSettlInstTransType() {
                return this.settlInstTransType;
            }           

            public void setSettlInstTransType(String settlInstTransType) {
                this.settlInstTransType = settlInstTransType;
            }
            public String getSettlInstRefID() {
                return this.settlInstRefID;
            }           

            public void setSettlInstRefID(String settlInstRefID) {
                this.settlInstRefID = settlInstRefID;
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
            public Integer getPaymentMethod() {
                return this.paymentMethod;
            }           

            public void setPaymentMethod(Integer paymentMethod) {
                this.paymentMethod = paymentMethod;
            }
            public String getPaymentRef() {
                return this.paymentRef;
            }           

            public void setPaymentRef(String paymentRef) {
                this.paymentRef = paymentRef;
            }
            public String getCardHolderName() {
                return this.cardHolderName;
            }           

            public void setCardHolderName(String cardHolderName) {
                this.cardHolderName = cardHolderName;
            }
            public String getCardNumber() {
                return this.cardNumber;
            }           

            public void setCardNumber(String cardNumber) {
                this.cardNumber = cardNumber;
            }
            public String getCardStartDate() {
                return this.cardStartDate;
            }           

            public void setCardStartDate(String cardStartDate) {
                this.cardStartDate = cardStartDate;
            }
            public String getCardExpDate() {
                return this.cardExpDate;
            }           

            public void setCardExpDate(String cardExpDate) {
                this.cardExpDate = cardExpDate;
            }
            public String getCardIssNum() {
                return this.cardIssNum;
            }           

            public void setCardIssNum(String cardIssNum) {
                this.cardIssNum = cardIssNum;
            }
            public String getPaymentDate() {
                return this.paymentDate;
            }           

            public void setPaymentDate(String paymentDate) {
                this.paymentDate = paymentDate;
            }
            public String getPaymentRemitterID() {
                return this.paymentRemitterID;
            }           

            public void setPaymentRemitterID(String paymentRemitterID) {
                this.paymentRemitterID = paymentRemitterID;
            }

        }
        
    }

}

