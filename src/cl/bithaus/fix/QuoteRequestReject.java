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
import cl.bithaus.fix.components.SpreadOrBenchmarkCurveData;
import cl.bithaus.fix.components.YieldData;
import cl.bithaus.fix.components.Parties;

/**
 * Fix Components Class
 * Generated for FIX 4.4
 * @author Bithaus Fix Message Generator
 */
public class QuoteRequestReject extends FixBaseMessage {

    private String quoteReqID;           
    private String rFQReqID;           
    private Integer quoteRequestRejectReason;           
    private Integer quotePriceType;           
    private String ordType;           
    private Date expireTime;           
    private Date transactTime;           
    private Integer priceType;           
    private BigDecimal price;           
    private BigDecimal price2;           
    private String text;           
    private Integer encodedTextLen;           
    private String encodedText;           
    private SpreadOrBenchmarkCurveData spreadOrBenchmarkCurveData;           
    private YieldData yieldData;           
    private Parties parties;           
    private NoRelatedSym noRelatedSym;           
    private NoQuoteQualifiers noQuoteQualifiers;           

    public QuoteRequestReject() { 
        super("AG", MsgCategory.APP);
    }

    public String getQuoteReqID() {
        return this.quoteReqID;
    }           

    public void setQuoteReqID(String quoteReqID) {
        this.quoteReqID = quoteReqID;
    }
    public String getRFQReqID() {
        return this.rFQReqID;
    }           

    public void setRFQReqID(String rFQReqID) {
        this.rFQReqID = rFQReqID;
    }
    public Integer getQuoteRequestRejectReason() {
        return this.quoteRequestRejectReason;
    }           

    public void setQuoteRequestRejectReason(Integer quoteRequestRejectReason) {
        this.quoteRequestRejectReason = quoteRequestRejectReason;
    }
    public Integer getQuotePriceType() {
        return this.quotePriceType;
    }           

    public void setQuotePriceType(Integer quotePriceType) {
        this.quotePriceType = quotePriceType;
    }
    public String getOrdType() {
        return this.ordType;
    }           

    public void setOrdType(String ordType) {
        this.ordType = ordType;
    }
    public Date getExpireTime() {
        return this.expireTime;
    }           

    public void setExpireTime(Date expireTime) {
        this.expireTime = expireTime;
    }
    public Date getTransactTime() {
        return this.transactTime;
    }           

    public void setTransactTime(Date transactTime) {
        this.transactTime = transactTime;
    }
    public Integer getPriceType() {
        return this.priceType;
    }           

    public void setPriceType(Integer priceType) {
        this.priceType = priceType;
    }
    public BigDecimal getPrice() {
        return this.price;
    }           

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
    public BigDecimal getPrice2() {
        return this.price2;
    }           

    public void setPrice2(BigDecimal price2) {
        this.price2 = price2;
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

    
    public SpreadOrBenchmarkCurveData getSpreadOrBenchmarkCurveData() {
        return this.spreadOrBenchmarkCurveData;
    }           

    public void setSpreadOrBenchmarkCurveData(SpreadOrBenchmarkCurveData spreadOrBenchmarkCurveData) {
        this.spreadOrBenchmarkCurveData = spreadOrBenchmarkCurveData;
    }
    
    public YieldData getYieldData() {
        return this.yieldData;
    }           

    public void setYieldData(YieldData yieldData) {
        this.yieldData = yieldData;
    }
    
    public Parties getParties() {
        return this.parties;
    }           

    public void setParties(Parties parties) {
        this.parties = parties;
    }

    public QuoteRequestReject.NoRelatedSym getNoRelatedSym() {
        return this.noRelatedSym;
    }

    public void setNoRelatedSym(QuoteRequestReject.NoRelatedSym noRelatedSym) {
        this.noRelatedSym = noRelatedSym;
    }
    public QuoteRequestReject.NoQuoteQualifiers getNoQuoteQualifiers() {
        return this.noQuoteQualifiers;
    }

    public void setNoQuoteQualifiers(QuoteRequestReject.NoQuoteQualifiers noQuoteQualifiers) {
        this.noQuoteQualifiers = noQuoteQualifiers;
    }
        

    public static class NoRelatedSym extends FixGroup<QuoteRequestReject.NoRelatedSym.NoRelatedSymEntry> {

        @Override
        public int getField() {
            return 146;
        }

        public static class NoRelatedSymEntry {

            private BigDecimal prevClosePx;
            private Integer quoteRequestType;
            private Integer quoteType;
            private String tradingSessionID;
            private String tradingSessionSubID;
            private String tradeOriginationDate;
            private String side;
            private Integer qtyType;
            private String settlType;
            private String settlDate;
            private String settlDate2;
            private BigDecimal orderQty2;
            private String currency;
            private String account;
            private Integer acctIDSource;
            private Integer accountType;

            public BigDecimal getPrevClosePx() {
                return this.prevClosePx;
            }           

            public void setPrevClosePx(BigDecimal prevClosePx) {
                this.prevClosePx = prevClosePx;
            }
            public Integer getQuoteRequestType() {
                return this.quoteRequestType;
            }           

            public void setQuoteRequestType(Integer quoteRequestType) {
                this.quoteRequestType = quoteRequestType;
            }
            public Integer getQuoteType() {
                return this.quoteType;
            }           

            public void setQuoteType(Integer quoteType) {
                this.quoteType = quoteType;
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
            public String getTradeOriginationDate() {
                return this.tradeOriginationDate;
            }           

            public void setTradeOriginationDate(String tradeOriginationDate) {
                this.tradeOriginationDate = tradeOriginationDate;
            }
            public String getSide() {
                return this.side;
            }           

            public void setSide(String side) {
                this.side = side;
            }
            public Integer getQtyType() {
                return this.qtyType;
            }           

            public void setQtyType(Integer qtyType) {
                this.qtyType = qtyType;
            }
            public String getSettlType() {
                return this.settlType;
            }           

            public void setSettlType(String settlType) {
                this.settlType = settlType;
            }
            public String getSettlDate() {
                return this.settlDate;
            }           

            public void setSettlDate(String settlDate) {
                this.settlDate = settlDate;
            }
            public String getSettlDate2() {
                return this.settlDate2;
            }           

            public void setSettlDate2(String settlDate2) {
                this.settlDate2 = settlDate2;
            }
            public BigDecimal getOrderQty2() {
                return this.orderQty2;
            }           

            public void setOrderQty2(BigDecimal orderQty2) {
                this.orderQty2 = orderQty2;
            }
            public String getCurrency() {
                return this.currency;
            }           

            public void setCurrency(String currency) {
                this.currency = currency;
            }
            public String getAccount() {
                return this.account;
            }           

            public void setAccount(String account) {
                this.account = account;
            }
            public Integer getAcctIDSource() {
                return this.acctIDSource;
            }           

            public void setAcctIDSource(Integer acctIDSource) {
                this.acctIDSource = acctIDSource;
            }
            public Integer getAccountType() {
                return this.accountType;
            }           

            public void setAccountType(Integer accountType) {
                this.accountType = accountType;
            }

        }
        
    }


    public static class NoQuoteQualifiers extends FixGroup<QuoteRequestReject.NoQuoteQualifiers.NoQuoteQualifiersEntry> {

        @Override
        public int getField() {
            return 735;
        }

        public static class NoQuoteQualifiersEntry {

            private String quoteQualifier;

            public String getQuoteQualifier() {
                return this.quoteQualifier;
            }           

            public void setQuoteQualifier(String quoteQualifier) {
                this.quoteQualifier = quoteQualifier;
            }

        }
        
    }

}

