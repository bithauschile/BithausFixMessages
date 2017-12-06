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
public class AllocationInstructionAck extends FixBaseMessage {

    private String allocID;           
    private String secondaryAllocID;           
    private String tradeDate;           
    private Date transactTime;           
    private Integer allocStatus;           
    private Integer allocRejCode;           
    private Integer allocType;           
    private Integer allocIntermedReqType;           
    private String matchStatus;           
    private Integer product;           
    private String securityType;           
    private String text;           
    private Integer encodedTextLen;           
    private String encodedText;           
    private Parties parties;           
    private NoAllocs noAllocs;           

    public AllocationInstructionAck() { 
        super("P", MsgCategory.APP);
    }

    public String getAllocID() {
        return this.allocID;
    }           

    public void setAllocID(String allocID) {
        this.allocID = allocID;
    }
    public String getSecondaryAllocID() {
        return this.secondaryAllocID;
    }           

    public void setSecondaryAllocID(String secondaryAllocID) {
        this.secondaryAllocID = secondaryAllocID;
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
    public Integer getAllocStatus() {
        return this.allocStatus;
    }           

    public void setAllocStatus(Integer allocStatus) {
        this.allocStatus = allocStatus;
    }
    public Integer getAllocRejCode() {
        return this.allocRejCode;
    }           

    public void setAllocRejCode(Integer allocRejCode) {
        this.allocRejCode = allocRejCode;
    }
    public Integer getAllocType() {
        return this.allocType;
    }           

    public void setAllocType(Integer allocType) {
        this.allocType = allocType;
    }
    public Integer getAllocIntermedReqType() {
        return this.allocIntermedReqType;
    }           

    public void setAllocIntermedReqType(Integer allocIntermedReqType) {
        this.allocIntermedReqType = allocIntermedReqType;
    }
    public String getMatchStatus() {
        return this.matchStatus;
    }           

    public void setMatchStatus(String matchStatus) {
        this.matchStatus = matchStatus;
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

    
    public Parties getParties() {
        return this.parties;
    }           

    public void setParties(Parties parties) {
        this.parties = parties;
    }

    public AllocationInstructionAck.NoAllocs getNoAllocs() {
        return this.noAllocs;
    }

    public void setNoAllocs(AllocationInstructionAck.NoAllocs noAllocs) {
        this.noAllocs = noAllocs;
    }
        

    public static class NoAllocs extends FixGroup<AllocationInstructionAck.NoAllocs.NoAllocsEntry> {

        @Override
        public int getField() {
            return 78;
        }

        public static class NoAllocsEntry {

            private String allocAccount;
            private Integer allocAcctIDSource;
            private BigDecimal allocPrice;
            private String individualAllocID;
            private Integer individualAllocRejCode;
            private String allocText;
            private Integer encodedAllocTextLen;
            private String encodedAllocText;

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
            public BigDecimal getAllocPrice() {
                return this.allocPrice;
            }           

            public void setAllocPrice(BigDecimal allocPrice) {
                this.allocPrice = allocPrice;
            }
            public String getIndividualAllocID() {
                return this.individualAllocID;
            }           

            public void setIndividualAllocID(String individualAllocID) {
                this.individualAllocID = individualAllocID;
            }
            public Integer getIndividualAllocRejCode() {
                return this.individualAllocRejCode;
            }           

            public void setIndividualAllocRejCode(Integer individualAllocRejCode) {
                this.individualAllocRejCode = individualAllocRejCode;
            }
            public String getAllocText() {
                return this.allocText;
            }           

            public void setAllocText(String allocText) {
                this.allocText = allocText;
            }
            public Integer getEncodedAllocTextLen() {
                return this.encodedAllocTextLen;
            }           

            public void setEncodedAllocTextLen(Integer encodedAllocTextLen) {
                this.encodedAllocTextLen = encodedAllocTextLen;
            }
            public String getEncodedAllocText() {
                return this.encodedAllocText;
            }           

            public void setEncodedAllocText(String encodedAllocText) {
                this.encodedAllocText = encodedAllocText;
            }

        }
        
    }

}

