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
public class BidRequest extends FixBaseMessage {

    private String bidID;           
    private String clientBidID;           
    private String bidRequestTransType;           
    private String listName;           
    private Integer totNoRelatedSym;           
    private Integer bidType;           
    private Integer numTickets;           
    private String currency;           
    private BigDecimal sideValue1;           
    private BigDecimal sideValue2;           
    private Integer liquidityIndType;           
    private BigDecimal wtAverageLiquidity;           
    private Boolean exchangeForPhysical;           
    private BigDecimal outMainCntryUIndex;           
    private BigDecimal crossPercent;           
    private Integer progRptReqs;           
    private Integer progPeriodInterval;           
    private Integer incTaxInd;           
    private Boolean forexReq;           
    private Integer numBidders;           
    private String tradeDate;           
    private String bidTradeType;           
    private String basisPxType;           
    private Date strikeTime;           
    private String text;           
    private Integer encodedTextLen;           
    private String encodedText;           
    private NoBidDescriptors noBidDescriptors;           
    private NoBidComponents noBidComponents;           

    public BidRequest() { 
        super("k", MsgCategory.APP);
    }

    public String getBidID() {
        return this.bidID;
    }           

    public void setBidID(String bidID) {
        this.bidID = bidID;
    }
    public String getClientBidID() {
        return this.clientBidID;
    }           

    public void setClientBidID(String clientBidID) {
        this.clientBidID = clientBidID;
    }
    public String getBidRequestTransType() {
        return this.bidRequestTransType;
    }           

    public void setBidRequestTransType(String bidRequestTransType) {
        this.bidRequestTransType = bidRequestTransType;
    }
    public String getListName() {
        return this.listName;
    }           

    public void setListName(String listName) {
        this.listName = listName;
    }
    public Integer getTotNoRelatedSym() {
        return this.totNoRelatedSym;
    }           

    public void setTotNoRelatedSym(Integer totNoRelatedSym) {
        this.totNoRelatedSym = totNoRelatedSym;
    }
    public Integer getBidType() {
        return this.bidType;
    }           

    public void setBidType(Integer bidType) {
        this.bidType = bidType;
    }
    public Integer getNumTickets() {
        return this.numTickets;
    }           

    public void setNumTickets(Integer numTickets) {
        this.numTickets = numTickets;
    }
    public String getCurrency() {
        return this.currency;
    }           

    public void setCurrency(String currency) {
        this.currency = currency;
    }
    public BigDecimal getSideValue1() {
        return this.sideValue1;
    }           

    public void setSideValue1(BigDecimal sideValue1) {
        this.sideValue1 = sideValue1;
    }
    public BigDecimal getSideValue2() {
        return this.sideValue2;
    }           

    public void setSideValue2(BigDecimal sideValue2) {
        this.sideValue2 = sideValue2;
    }
    public Integer getLiquidityIndType() {
        return this.liquidityIndType;
    }           

    public void setLiquidityIndType(Integer liquidityIndType) {
        this.liquidityIndType = liquidityIndType;
    }
    public BigDecimal getWtAverageLiquidity() {
        return this.wtAverageLiquidity;
    }           

    public void setWtAverageLiquidity(BigDecimal wtAverageLiquidity) {
        this.wtAverageLiquidity = wtAverageLiquidity;
    }
    public Boolean getExchangeForPhysical() {
        return this.exchangeForPhysical;
    }           

    public void setExchangeForPhysical(Boolean exchangeForPhysical) {
        this.exchangeForPhysical = exchangeForPhysical;
    }
    public BigDecimal getOutMainCntryUIndex() {
        return this.outMainCntryUIndex;
    }           

    public void setOutMainCntryUIndex(BigDecimal outMainCntryUIndex) {
        this.outMainCntryUIndex = outMainCntryUIndex;
    }
    public BigDecimal getCrossPercent() {
        return this.crossPercent;
    }           

    public void setCrossPercent(BigDecimal crossPercent) {
        this.crossPercent = crossPercent;
    }
    public Integer getProgRptReqs() {
        return this.progRptReqs;
    }           

    public void setProgRptReqs(Integer progRptReqs) {
        this.progRptReqs = progRptReqs;
    }
    public Integer getProgPeriodInterval() {
        return this.progPeriodInterval;
    }           

    public void setProgPeriodInterval(Integer progPeriodInterval) {
        this.progPeriodInterval = progPeriodInterval;
    }
    public Integer getIncTaxInd() {
        return this.incTaxInd;
    }           

    public void setIncTaxInd(Integer incTaxInd) {
        this.incTaxInd = incTaxInd;
    }
    public Boolean getForexReq() {
        return this.forexReq;
    }           

    public void setForexReq(Boolean forexReq) {
        this.forexReq = forexReq;
    }
    public Integer getNumBidders() {
        return this.numBidders;
    }           

    public void setNumBidders(Integer numBidders) {
        this.numBidders = numBidders;
    }
    public String getTradeDate() {
        return this.tradeDate;
    }           

    public void setTradeDate(String tradeDate) {
        this.tradeDate = tradeDate;
    }
    public String getBidTradeType() {
        return this.bidTradeType;
    }           

    public void setBidTradeType(String bidTradeType) {
        this.bidTradeType = bidTradeType;
    }
    public String getBasisPxType() {
        return this.basisPxType;
    }           

    public void setBasisPxType(String basisPxType) {
        this.basisPxType = basisPxType;
    }
    public Date getStrikeTime() {
        return this.strikeTime;
    }           

    public void setStrikeTime(Date strikeTime) {
        this.strikeTime = strikeTime;
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


    public BidRequest.NoBidDescriptors getNoBidDescriptors() {
        return this.noBidDescriptors;
    }

    public void setNoBidDescriptors(BidRequest.NoBidDescriptors noBidDescriptors) {
        this.noBidDescriptors = noBidDescriptors;
    }
    public BidRequest.NoBidComponents getNoBidComponents() {
        return this.noBidComponents;
    }

    public void setNoBidComponents(BidRequest.NoBidComponents noBidComponents) {
        this.noBidComponents = noBidComponents;
    }
        

    public static class NoBidDescriptors extends FixGroup<BidRequest.NoBidDescriptors.NoBidDescriptorsEntry> {

        @Override
        public int getField() {
            return 398;
        }

        public static class NoBidDescriptorsEntry {

            private Integer bidDescriptorType;
            private String bidDescriptor;
            private Integer sideValueInd;
            private BigDecimal liquidityValue;
            private Integer liquidityNumSecurities;
            private BigDecimal liquidityPctLow;
            private BigDecimal liquidityPctHigh;
            private BigDecimal eFPTrackingError;
            private BigDecimal fairValue;
            private BigDecimal outsideIndexPct;
            private BigDecimal valueOfFutures;

            public Integer getBidDescriptorType() {
                return this.bidDescriptorType;
            }           

            public void setBidDescriptorType(Integer bidDescriptorType) {
                this.bidDescriptorType = bidDescriptorType;
            }
            public String getBidDescriptor() {
                return this.bidDescriptor;
            }           

            public void setBidDescriptor(String bidDescriptor) {
                this.bidDescriptor = bidDescriptor;
            }
            public Integer getSideValueInd() {
                return this.sideValueInd;
            }           

            public void setSideValueInd(Integer sideValueInd) {
                this.sideValueInd = sideValueInd;
            }
            public BigDecimal getLiquidityValue() {
                return this.liquidityValue;
            }           

            public void setLiquidityValue(BigDecimal liquidityValue) {
                this.liquidityValue = liquidityValue;
            }
            public Integer getLiquidityNumSecurities() {
                return this.liquidityNumSecurities;
            }           

            public void setLiquidityNumSecurities(Integer liquidityNumSecurities) {
                this.liquidityNumSecurities = liquidityNumSecurities;
            }
            public BigDecimal getLiquidityPctLow() {
                return this.liquidityPctLow;
            }           

            public void setLiquidityPctLow(BigDecimal liquidityPctLow) {
                this.liquidityPctLow = liquidityPctLow;
            }
            public BigDecimal getLiquidityPctHigh() {
                return this.liquidityPctHigh;
            }           

            public void setLiquidityPctHigh(BigDecimal liquidityPctHigh) {
                this.liquidityPctHigh = liquidityPctHigh;
            }
            public BigDecimal getEFPTrackingError() {
                return this.eFPTrackingError;
            }           

            public void setEFPTrackingError(BigDecimal eFPTrackingError) {
                this.eFPTrackingError = eFPTrackingError;
            }
            public BigDecimal getFairValue() {
                return this.fairValue;
            }           

            public void setFairValue(BigDecimal fairValue) {
                this.fairValue = fairValue;
            }
            public BigDecimal getOutsideIndexPct() {
                return this.outsideIndexPct;
            }           

            public void setOutsideIndexPct(BigDecimal outsideIndexPct) {
                this.outsideIndexPct = outsideIndexPct;
            }
            public BigDecimal getValueOfFutures() {
                return this.valueOfFutures;
            }           

            public void setValueOfFutures(BigDecimal valueOfFutures) {
                this.valueOfFutures = valueOfFutures;
            }

        }
        
    }


    public static class NoBidComponents extends FixGroup<BidRequest.NoBidComponents.NoBidComponentsEntry> {

        @Override
        public int getField() {
            return 420;
        }

        public static class NoBidComponentsEntry {

            private String listID;
            private String side;
            private String tradingSessionID;
            private String tradingSessionSubID;
            private Integer netGrossInd;
            private String settlType;
            private String settlDate;
            private String account;
            private Integer acctIDSource;

            public String getListID() {
                return this.listID;
            }           

            public void setListID(String listID) {
                this.listID = listID;
            }
            public String getSide() {
                return this.side;
            }           

            public void setSide(String side) {
                this.side = side;
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
            public Integer getNetGrossInd() {
                return this.netGrossInd;
            }           

            public void setNetGrossInd(Integer netGrossInd) {
                this.netGrossInd = netGrossInd;
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

        }
        
    }

}

