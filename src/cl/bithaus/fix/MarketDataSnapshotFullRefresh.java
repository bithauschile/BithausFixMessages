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
import cl.bithaus.fix.components.Instrument;

/**
 * Fix Components Class
 * Generated for FIX 4.4
 * @author Bithaus Fix Message Generator
 */
public class MarketDataSnapshotFullRefresh extends FixBaseMessage {

    private String mDReqID;           
    private String financialStatus;           
    private String corporateAction;           
    private BigDecimal netChgPrevDay;           
    private Boolean lastFragment;           
    private Integer applQueueDepth;           
    private Integer applQueueResolution;           
    private Instrument instrument;           
    private NoUnderlyings noUnderlyings;           
    private NoLegs noLegs;           
    private NoMDEntries noMDEntries;           

    public MarketDataSnapshotFullRefresh() { 
        super("W", MsgCategory.APP);
    }

    public String getMDReqID() {
        return this.mDReqID;
    }           

    public void setMDReqID(String mDReqID) {
        this.mDReqID = mDReqID;
    }
    public String getFinancialStatus() {
        return this.financialStatus;
    }           

    public void setFinancialStatus(String financialStatus) {
        this.financialStatus = financialStatus;
    }
    public String getCorporateAction() {
        return this.corporateAction;
    }           

    public void setCorporateAction(String corporateAction) {
        this.corporateAction = corporateAction;
    }
    public BigDecimal getNetChgPrevDay() {
        return this.netChgPrevDay;
    }           

    public void setNetChgPrevDay(BigDecimal netChgPrevDay) {
        this.netChgPrevDay = netChgPrevDay;
    }
    public Boolean getLastFragment() {
        return this.lastFragment;
    }           

    public void setLastFragment(Boolean lastFragment) {
        this.lastFragment = lastFragment;
    }
    public Integer getApplQueueDepth() {
        return this.applQueueDepth;
    }           

    public void setApplQueueDepth(Integer applQueueDepth) {
        this.applQueueDepth = applQueueDepth;
    }
    public Integer getApplQueueResolution() {
        return this.applQueueResolution;
    }           

    public void setApplQueueResolution(Integer applQueueResolution) {
        this.applQueueResolution = applQueueResolution;
    }

    
    public Instrument getInstrument() {
        return this.instrument;
    }           

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }

    public MarketDataSnapshotFullRefresh.NoUnderlyings getNoUnderlyings() {
        return this.noUnderlyings;
    }

    public void setNoUnderlyings(MarketDataSnapshotFullRefresh.NoUnderlyings noUnderlyings) {
        this.noUnderlyings = noUnderlyings;
    }
    public MarketDataSnapshotFullRefresh.NoLegs getNoLegs() {
        return this.noLegs;
    }

    public void setNoLegs(MarketDataSnapshotFullRefresh.NoLegs noLegs) {
        this.noLegs = noLegs;
    }
    public MarketDataSnapshotFullRefresh.NoMDEntries getNoMDEntries() {
        return this.noMDEntries;
    }

    public void setNoMDEntries(MarketDataSnapshotFullRefresh.NoMDEntries noMDEntries) {
        this.noMDEntries = noMDEntries;
    }
        

    public static class NoUnderlyings extends FixGroup<MarketDataSnapshotFullRefresh.NoUnderlyings.NoUnderlyingsEntry> {

        @Override
        public int getField() {
            return 711;
        }

        public static class NoUnderlyingsEntry {



        }
        
    }


    public static class NoLegs extends FixGroup<MarketDataSnapshotFullRefresh.NoLegs.NoLegsEntry> {

        @Override
        public int getField() {
            return 555;
        }

        public static class NoLegsEntry {



        }
        
    }


    public static class NoMDEntries extends FixGroup<MarketDataSnapshotFullRefresh.NoMDEntries.NoMDEntriesEntry> {

        @Override
        public int getField() {
            return 268;
        }

        public static class NoMDEntriesEntry {

            private String mDEntryType;
            private BigDecimal mDEntryPx;
            private String currency;
            private String settlCurrency;
            private BigDecimal mDEntrySize;
            private Date mDEntryDate;
            private Date mDEntryTime;
            private String tickDirection;
            private String mDMkt;
            private String tradingSessionID;
            private String tradingSessionSubID;
            private String quoteCondition;
            private String tradeCondition;
            private String mDEntryOriginator;
            private String locationID;
            private String deskID;
            private String openCloseSettlFlag;
            private String timeInForce;
            private String expireDate;
            private Date expireTime;
            private BigDecimal minQty;
            private String execInst;
            private Integer sellerDays;
            private String orderID;
            private String secondaryOrderID;
            private String quoteEntryID;
            private String mDEntryBuyer;
            private String mDEntrySeller;
            private Integer numberOfOrders;
            private Integer mDEntryPositionNo;
            private String scope;
            private BigDecimal priceDelta;
            private String text;
            private Integer encodedTextLen;
            private String encodedText;
            private String tradeID;
            private String clOrdID;
            private String mDEntryID;
            private String mDEntryRefID;
            private String entryStep;
            private BigDecimal closingPrice;
            private Boolean shortSell;
            private String bookingRefID;
            private String prePayment;
            private BigDecimal publicRate;
            private BigDecimal maxRate;
            private BigDecimal ownRate;
            private String bestStance;
            private String divisible;
            private String modified;
            private BigDecimal forwardPrice;
            private BigDecimal indexSocietyFactor;
            private BigDecimal indexWeight;
            private BigDecimal indexNoFreeFloat;
            private Integer auctionId;
            private String mDMaturity;
            private String mDAdjustmentCurrency;
            private String settlType;
            private String coraMaturity;
            private BigDecimal duration;
            private BigDecimal convexity;
            private BigDecimal tIR;
            private BigDecimal localCurrencyValue;
            private BigDecimal valuedAmount;
            private String issuer;
            private BigDecimal invesmentAmount;
            private String dcvTitle;
            private Integer priceType;
            private String side;
            private BigDecimal orderQty;
            private BigDecimal orderQty2;
            private BigDecimal ownDemand;
            private BigDecimal totalDemand;
            private String aggressor;
            private String orderSubID;
            private String fractionID;
            private Integer noFractions;
            private Integer noAdjudicatedFractions;
            private Boolean hasPriority;
            private Boolean hasBid;
            private Integer noOffers;
            private BigDecimal tradeVolume;
            private String settlDate;
            private BigDecimal minRate;
            private BigDecimal change;
            private BigDecimal returnLastSevenDays;
            private BigDecimal returnLastThirtyDays;
            private BigDecimal returnLatsFiftyTwoWeeks;
            private BigDecimal minRateLastFiftyTwoWeeks;
            private BigDecimal maxRateLastFiftyTwoWeeks;

            public String getMDEntryType() {
                return this.mDEntryType;
            }           

            public void setMDEntryType(String mDEntryType) {
                this.mDEntryType = mDEntryType;
            }
            public BigDecimal getMDEntryPx() {
                return this.mDEntryPx;
            }           

            public void setMDEntryPx(BigDecimal mDEntryPx) {
                this.mDEntryPx = mDEntryPx;
            }
            public String getCurrency() {
                return this.currency;
            }           

            public void setCurrency(String currency) {
                this.currency = currency;
            }
            public String getSettlCurrency() {
                return this.settlCurrency;
            }           

            public void setSettlCurrency(String settlCurrency) {
                this.settlCurrency = settlCurrency;
            }
            public BigDecimal getMDEntrySize() {
                return this.mDEntrySize;
            }           

            public void setMDEntrySize(BigDecimal mDEntrySize) {
                this.mDEntrySize = mDEntrySize;
            }
            public Date getMDEntryDate() {
                return this.mDEntryDate;
            }           

            public void setMDEntryDate(Date mDEntryDate) {
                this.mDEntryDate = mDEntryDate;
            }
            public Date getMDEntryTime() {
                return this.mDEntryTime;
            }           

            public void setMDEntryTime(Date mDEntryTime) {
                this.mDEntryTime = mDEntryTime;
            }
            public String getTickDirection() {
                return this.tickDirection;
            }           

            public void setTickDirection(String tickDirection) {
                this.tickDirection = tickDirection;
            }
            public String getMDMkt() {
                return this.mDMkt;
            }           

            public void setMDMkt(String mDMkt) {
                this.mDMkt = mDMkt;
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
            public String getQuoteCondition() {
                return this.quoteCondition;
            }           

            public void setQuoteCondition(String quoteCondition) {
                this.quoteCondition = quoteCondition;
            }
            public String getTradeCondition() {
                return this.tradeCondition;
            }           

            public void setTradeCondition(String tradeCondition) {
                this.tradeCondition = tradeCondition;
            }
            public String getMDEntryOriginator() {
                return this.mDEntryOriginator;
            }           

            public void setMDEntryOriginator(String mDEntryOriginator) {
                this.mDEntryOriginator = mDEntryOriginator;
            }
            public String getLocationID() {
                return this.locationID;
            }           

            public void setLocationID(String locationID) {
                this.locationID = locationID;
            }
            public String getDeskID() {
                return this.deskID;
            }           

            public void setDeskID(String deskID) {
                this.deskID = deskID;
            }
            public String getOpenCloseSettlFlag() {
                return this.openCloseSettlFlag;
            }           

            public void setOpenCloseSettlFlag(String openCloseSettlFlag) {
                this.openCloseSettlFlag = openCloseSettlFlag;
            }
            public String getTimeInForce() {
                return this.timeInForce;
            }           

            public void setTimeInForce(String timeInForce) {
                this.timeInForce = timeInForce;
            }
            public String getExpireDate() {
                return this.expireDate;
            }           

            public void setExpireDate(String expireDate) {
                this.expireDate = expireDate;
            }
            public Date getExpireTime() {
                return this.expireTime;
            }           

            public void setExpireTime(Date expireTime) {
                this.expireTime = expireTime;
            }
            public BigDecimal getMinQty() {
                return this.minQty;
            }           

            public void setMinQty(BigDecimal minQty) {
                this.minQty = minQty;
            }
            public String getExecInst() {
                return this.execInst;
            }           

            public void setExecInst(String execInst) {
                this.execInst = execInst;
            }
            public Integer getSellerDays() {
                return this.sellerDays;
            }           

            public void setSellerDays(Integer sellerDays) {
                this.sellerDays = sellerDays;
            }
            public String getOrderID() {
                return this.orderID;
            }           

            public void setOrderID(String orderID) {
                this.orderID = orderID;
            }
            public String getSecondaryOrderID() {
                return this.secondaryOrderID;
            }           

            public void setSecondaryOrderID(String secondaryOrderID) {
                this.secondaryOrderID = secondaryOrderID;
            }
            public String getQuoteEntryID() {
                return this.quoteEntryID;
            }           

            public void setQuoteEntryID(String quoteEntryID) {
                this.quoteEntryID = quoteEntryID;
            }
            public String getMDEntryBuyer() {
                return this.mDEntryBuyer;
            }           

            public void setMDEntryBuyer(String mDEntryBuyer) {
                this.mDEntryBuyer = mDEntryBuyer;
            }
            public String getMDEntrySeller() {
                return this.mDEntrySeller;
            }           

            public void setMDEntrySeller(String mDEntrySeller) {
                this.mDEntrySeller = mDEntrySeller;
            }
            public Integer getNumberOfOrders() {
                return this.numberOfOrders;
            }           

            public void setNumberOfOrders(Integer numberOfOrders) {
                this.numberOfOrders = numberOfOrders;
            }
            public Integer getMDEntryPositionNo() {
                return this.mDEntryPositionNo;
            }           

            public void setMDEntryPositionNo(Integer mDEntryPositionNo) {
                this.mDEntryPositionNo = mDEntryPositionNo;
            }
            public String getScope() {
                return this.scope;
            }           

            public void setScope(String scope) {
                this.scope = scope;
            }
            public BigDecimal getPriceDelta() {
                return this.priceDelta;
            }           

            public void setPriceDelta(BigDecimal priceDelta) {
                this.priceDelta = priceDelta;
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
            public String getTradeID() {
                return this.tradeID;
            }           

            public void setTradeID(String tradeID) {
                this.tradeID = tradeID;
            }
            public String getClOrdID() {
                return this.clOrdID;
            }           

            public void setClOrdID(String clOrdID) {
                this.clOrdID = clOrdID;
            }
            public String getMDEntryID() {
                return this.mDEntryID;
            }           

            public void setMDEntryID(String mDEntryID) {
                this.mDEntryID = mDEntryID;
            }
            public String getMDEntryRefID() {
                return this.mDEntryRefID;
            }           

            public void setMDEntryRefID(String mDEntryRefID) {
                this.mDEntryRefID = mDEntryRefID;
            }
            public String getEntryStep() {
                return this.entryStep;
            }           

            public void setEntryStep(String entryStep) {
                this.entryStep = entryStep;
            }
            public BigDecimal getClosingPrice() {
                return this.closingPrice;
            }           

            public void setClosingPrice(BigDecimal closingPrice) {
                this.closingPrice = closingPrice;
            }
            public Boolean getShortSell() {
                return this.shortSell;
            }           

            public void setShortSell(Boolean shortSell) {
                this.shortSell = shortSell;
            }
            public String getBookingRefID() {
                return this.bookingRefID;
            }           

            public void setBookingRefID(String bookingRefID) {
                this.bookingRefID = bookingRefID;
            }
            public String getPrePayment() {
                return this.prePayment;
            }           

            public void setPrePayment(String prePayment) {
                this.prePayment = prePayment;
            }
            public BigDecimal getPublicRate() {
                return this.publicRate;
            }           

            public void setPublicRate(BigDecimal publicRate) {
                this.publicRate = publicRate;
            }
            public BigDecimal getMaxRate() {
                return this.maxRate;
            }           

            public void setMaxRate(BigDecimal maxRate) {
                this.maxRate = maxRate;
            }
            public BigDecimal getOwnRate() {
                return this.ownRate;
            }           

            public void setOwnRate(BigDecimal ownRate) {
                this.ownRate = ownRate;
            }
            public String getBestStance() {
                return this.bestStance;
            }           

            public void setBestStance(String bestStance) {
                this.bestStance = bestStance;
            }
            public String getDivisible() {
                return this.divisible;
            }           

            public void setDivisible(String divisible) {
                this.divisible = divisible;
            }
            public String getModified() {
                return this.modified;
            }           

            public void setModified(String modified) {
                this.modified = modified;
            }
            public BigDecimal getForwardPrice() {
                return this.forwardPrice;
            }           

            public void setForwardPrice(BigDecimal forwardPrice) {
                this.forwardPrice = forwardPrice;
            }
            public BigDecimal getIndexSocietyFactor() {
                return this.indexSocietyFactor;
            }           

            public void setIndexSocietyFactor(BigDecimal indexSocietyFactor) {
                this.indexSocietyFactor = indexSocietyFactor;
            }
            public BigDecimal getIndexWeight() {
                return this.indexWeight;
            }           

            public void setIndexWeight(BigDecimal indexWeight) {
                this.indexWeight = indexWeight;
            }
            public BigDecimal getIndexNoFreeFloat() {
                return this.indexNoFreeFloat;
            }           

            public void setIndexNoFreeFloat(BigDecimal indexNoFreeFloat) {
                this.indexNoFreeFloat = indexNoFreeFloat;
            }
            public Integer getAuctionId() {
                return this.auctionId;
            }           

            public void setAuctionId(Integer auctionId) {
                this.auctionId = auctionId;
            }
            public String getMDMaturity() {
                return this.mDMaturity;
            }           

            public void setMDMaturity(String mDMaturity) {
                this.mDMaturity = mDMaturity;
            }
            public String getMDAdjustmentCurrency() {
                return this.mDAdjustmentCurrency;
            }           

            public void setMDAdjustmentCurrency(String mDAdjustmentCurrency) {
                this.mDAdjustmentCurrency = mDAdjustmentCurrency;
            }
            public String getSettlType() {
                return this.settlType;
            }           

            public void setSettlType(String settlType) {
                this.settlType = settlType;
            }
            public String getCoraMaturity() {
                return this.coraMaturity;
            }           

            public void setCoraMaturity(String coraMaturity) {
                this.coraMaturity = coraMaturity;
            }
            public BigDecimal getDuration() {
                return this.duration;
            }           

            public void setDuration(BigDecimal duration) {
                this.duration = duration;
            }
            public BigDecimal getConvexity() {
                return this.convexity;
            }           

            public void setConvexity(BigDecimal convexity) {
                this.convexity = convexity;
            }
            public BigDecimal getTIR() {
                return this.tIR;
            }           

            public void setTIR(BigDecimal tIR) {
                this.tIR = tIR;
            }
            public BigDecimal getLocalCurrencyValue() {
                return this.localCurrencyValue;
            }           

            public void setLocalCurrencyValue(BigDecimal localCurrencyValue) {
                this.localCurrencyValue = localCurrencyValue;
            }
            public BigDecimal getValuedAmount() {
                return this.valuedAmount;
            }           

            public void setValuedAmount(BigDecimal valuedAmount) {
                this.valuedAmount = valuedAmount;
            }
            public String getIssuer() {
                return this.issuer;
            }           

            public void setIssuer(String issuer) {
                this.issuer = issuer;
            }
            public BigDecimal getInvesmentAmount() {
                return this.invesmentAmount;
            }           

            public void setInvesmentAmount(BigDecimal invesmentAmount) {
                this.invesmentAmount = invesmentAmount;
            }
            public String getDcvTitle() {
                return this.dcvTitle;
            }           

            public void setDcvTitle(String dcvTitle) {
                this.dcvTitle = dcvTitle;
            }
            public Integer getPriceType() {
                return this.priceType;
            }           

            public void setPriceType(Integer priceType) {
                this.priceType = priceType;
            }
            public String getSide() {
                return this.side;
            }           

            public void setSide(String side) {
                this.side = side;
            }
            public BigDecimal getOrderQty() {
                return this.orderQty;
            }           

            public void setOrderQty(BigDecimal orderQty) {
                this.orderQty = orderQty;
            }
            public BigDecimal getOrderQty2() {
                return this.orderQty2;
            }           

            public void setOrderQty2(BigDecimal orderQty2) {
                this.orderQty2 = orderQty2;
            }
            public BigDecimal getOwnDemand() {
                return this.ownDemand;
            }           

            public void setOwnDemand(BigDecimal ownDemand) {
                this.ownDemand = ownDemand;
            }
            public BigDecimal getTotalDemand() {
                return this.totalDemand;
            }           

            public void setTotalDemand(BigDecimal totalDemand) {
                this.totalDemand = totalDemand;
            }
            public String getAggressor() {
                return this.aggressor;
            }           

            public void setAggressor(String aggressor) {
                this.aggressor = aggressor;
            }
            public String getOrderSubID() {
                return this.orderSubID;
            }           

            public void setOrderSubID(String orderSubID) {
                this.orderSubID = orderSubID;
            }
            public String getFractionID() {
                return this.fractionID;
            }           

            public void setFractionID(String fractionID) {
                this.fractionID = fractionID;
            }
            public Integer getNoFractions() {
                return this.noFractions;
            }           

            public void setNoFractions(Integer noFractions) {
                this.noFractions = noFractions;
            }
            public Integer getNoAdjudicatedFractions() {
                return this.noAdjudicatedFractions;
            }           

            public void setNoAdjudicatedFractions(Integer noAdjudicatedFractions) {
                this.noAdjudicatedFractions = noAdjudicatedFractions;
            }
            public Boolean getHasPriority() {
                return this.hasPriority;
            }           

            public void setHasPriority(Boolean hasPriority) {
                this.hasPriority = hasPriority;
            }
            public Boolean getHasBid() {
                return this.hasBid;
            }           

            public void setHasBid(Boolean hasBid) {
                this.hasBid = hasBid;
            }
            public Integer getNoOffers() {
                return this.noOffers;
            }           

            public void setNoOffers(Integer noOffers) {
                this.noOffers = noOffers;
            }
            public BigDecimal getTradeVolume() {
                return this.tradeVolume;
            }           

            public void setTradeVolume(BigDecimal tradeVolume) {
                this.tradeVolume = tradeVolume;
            }
            public String getSettlDate() {
                return this.settlDate;
            }           

            public void setSettlDate(String settlDate) {
                this.settlDate = settlDate;
            }
            public BigDecimal getMinRate() {
                return this.minRate;
            }           

            public void setMinRate(BigDecimal minRate) {
                this.minRate = minRate;
            }
            public BigDecimal getChange() {
                return this.change;
            }           

            public void setChange(BigDecimal change) {
                this.change = change;
            }
            public BigDecimal getReturnLastSevenDays() {
                return this.returnLastSevenDays;
            }           

            public void setReturnLastSevenDays(BigDecimal returnLastSevenDays) {
                this.returnLastSevenDays = returnLastSevenDays;
            }
            public BigDecimal getReturnLastThirtyDays() {
                return this.returnLastThirtyDays;
            }           

            public void setReturnLastThirtyDays(BigDecimal returnLastThirtyDays) {
                this.returnLastThirtyDays = returnLastThirtyDays;
            }
            public BigDecimal getReturnLatsFiftyTwoWeeks() {
                return this.returnLatsFiftyTwoWeeks;
            }           

            public void setReturnLatsFiftyTwoWeeks(BigDecimal returnLatsFiftyTwoWeeks) {
                this.returnLatsFiftyTwoWeeks = returnLatsFiftyTwoWeeks;
            }
            public BigDecimal getMinRateLastFiftyTwoWeeks() {
                return this.minRateLastFiftyTwoWeeks;
            }           

            public void setMinRateLastFiftyTwoWeeks(BigDecimal minRateLastFiftyTwoWeeks) {
                this.minRateLastFiftyTwoWeeks = minRateLastFiftyTwoWeeks;
            }
            public BigDecimal getMaxRateLastFiftyTwoWeeks() {
                return this.maxRateLastFiftyTwoWeeks;
            }           

            public void setMaxRateLastFiftyTwoWeeks(BigDecimal maxRateLastFiftyTwoWeeks) {
                this.maxRateLastFiftyTwoWeeks = maxRateLastFiftyTwoWeeks;
            }

        }
        
    }

}

