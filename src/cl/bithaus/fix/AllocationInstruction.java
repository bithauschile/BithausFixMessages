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
import cl.bithaus.fix.components.InstrumentExtension;
import cl.bithaus.fix.components.FinancingDetails;
import cl.bithaus.fix.components.SpreadOrBenchmarkCurveData;
import cl.bithaus.fix.components.Parties;
import cl.bithaus.fix.components.Stipulations;
import cl.bithaus.fix.components.YieldData;

/**
 * Fix Components Class
 * Generated for FIX 4.4
 * @author Bithaus Fix Message Generator
 */
public class AllocationInstruction extends FixBaseMessage {

    private String allocID;           
    private String allocTransType;           
    private Integer allocType;           
    private String secondaryAllocID;           
    private String refAllocID;           
    private Integer allocCancReplaceReason;           
    private Integer allocIntermedReqType;           
    private String allocLinkID;           
    private Integer allocLinkType;           
    private String bookingRefID;           
    private Integer allocNoOrdersType;           
    private Boolean previouslyReported;           
    private Boolean reversalIndicator;           
    private String matchType;           
    private String side;           
    private BigDecimal quantity;           
    private Integer qtyType;           
    private String lastMkt;           
    private String tradeOriginationDate;           
    private String tradingSessionID;           
    private String tradingSessionSubID;           
    private Integer priceType;           
    private BigDecimal avgPx;           
    private BigDecimal avgParPx;           
    private String currency;           
    private Integer avgPxPrecision;           
    private String tradeDate;           
    private Date transactTime;           
    private String settlType;           
    private String settlDate;           
    private Integer bookingType;           
    private BigDecimal grossTradeAmt;           
    private BigDecimal concession;           
    private BigDecimal totalTakedown;           
    private BigDecimal netMoney;           
    private String positionEffect;           
    private Boolean autoAcceptIndicator;           
    private String text;           
    private Integer encodedTextLen;           
    private String encodedText;           
    private Integer numDaysInterest;           
    private BigDecimal accruedInterestRate;           
    private BigDecimal accruedInterestAmt;           
    private BigDecimal totalAccruedInterestAmt;           
    private BigDecimal interestAtMaturity;           
    private BigDecimal endAccruedInterestAmt;           
    private BigDecimal startCash;           
    private BigDecimal endCash;           
    private Boolean legalConfirm;           
    private Integer totNoAllocs;           
    private Boolean lastFragment;           
    private Instrument instrument;           
    private InstrumentExtension instrumentExtension;           
    private FinancingDetails financingDetails;           
    private SpreadOrBenchmarkCurveData spreadOrBenchmarkCurveData;           
    private Parties parties;           
    private Stipulations stipulations;           
    private YieldData yieldData;           
    private NoOrders noOrders;           
    private NoExecs noExecs;           
    private NoUnderlyings noUnderlyings;           
    private NoLegs noLegs;           
    private NoAllocs noAllocs;           

    public AllocationInstruction() { 
        super("J", MsgCategory.APP);
    }

    public String getAllocID() {
        return this.allocID;
    }           

    public void setAllocID(String allocID) {
        this.allocID = allocID;
    }
    public String getAllocTransType() {
        return this.allocTransType;
    }           

    public void setAllocTransType(String allocTransType) {
        this.allocTransType = allocTransType;
    }
    public Integer getAllocType() {
        return this.allocType;
    }           

    public void setAllocType(Integer allocType) {
        this.allocType = allocType;
    }
    public String getSecondaryAllocID() {
        return this.secondaryAllocID;
    }           

    public void setSecondaryAllocID(String secondaryAllocID) {
        this.secondaryAllocID = secondaryAllocID;
    }
    public String getRefAllocID() {
        return this.refAllocID;
    }           

    public void setRefAllocID(String refAllocID) {
        this.refAllocID = refAllocID;
    }
    public Integer getAllocCancReplaceReason() {
        return this.allocCancReplaceReason;
    }           

    public void setAllocCancReplaceReason(Integer allocCancReplaceReason) {
        this.allocCancReplaceReason = allocCancReplaceReason;
    }
    public Integer getAllocIntermedReqType() {
        return this.allocIntermedReqType;
    }           

    public void setAllocIntermedReqType(Integer allocIntermedReqType) {
        this.allocIntermedReqType = allocIntermedReqType;
    }
    public String getAllocLinkID() {
        return this.allocLinkID;
    }           

    public void setAllocLinkID(String allocLinkID) {
        this.allocLinkID = allocLinkID;
    }
    public Integer getAllocLinkType() {
        return this.allocLinkType;
    }           

    public void setAllocLinkType(Integer allocLinkType) {
        this.allocLinkType = allocLinkType;
    }
    public String getBookingRefID() {
        return this.bookingRefID;
    }           

    public void setBookingRefID(String bookingRefID) {
        this.bookingRefID = bookingRefID;
    }
    public Integer getAllocNoOrdersType() {
        return this.allocNoOrdersType;
    }           

    public void setAllocNoOrdersType(Integer allocNoOrdersType) {
        this.allocNoOrdersType = allocNoOrdersType;
    }
    public Boolean getPreviouslyReported() {
        return this.previouslyReported;
    }           

    public void setPreviouslyReported(Boolean previouslyReported) {
        this.previouslyReported = previouslyReported;
    }
    public Boolean getReversalIndicator() {
        return this.reversalIndicator;
    }           

    public void setReversalIndicator(Boolean reversalIndicator) {
        this.reversalIndicator = reversalIndicator;
    }
    public String getMatchType() {
        return this.matchType;
    }           

    public void setMatchType(String matchType) {
        this.matchType = matchType;
    }
    public String getSide() {
        return this.side;
    }           

    public void setSide(String side) {
        this.side = side;
    }
    public BigDecimal getQuantity() {
        return this.quantity;
    }           

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }
    public Integer getQtyType() {
        return this.qtyType;
    }           

    public void setQtyType(Integer qtyType) {
        this.qtyType = qtyType;
    }
    public String getLastMkt() {
        return this.lastMkt;
    }           

    public void setLastMkt(String lastMkt) {
        this.lastMkt = lastMkt;
    }
    public String getTradeOriginationDate() {
        return this.tradeOriginationDate;
    }           

    public void setTradeOriginationDate(String tradeOriginationDate) {
        this.tradeOriginationDate = tradeOriginationDate;
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
    public Integer getPriceType() {
        return this.priceType;
    }           

    public void setPriceType(Integer priceType) {
        this.priceType = priceType;
    }
    public BigDecimal getAvgPx() {
        return this.avgPx;
    }           

    public void setAvgPx(BigDecimal avgPx) {
        this.avgPx = avgPx;
    }
    public BigDecimal getAvgParPx() {
        return this.avgParPx;
    }           

    public void setAvgParPx(BigDecimal avgParPx) {
        this.avgParPx = avgParPx;
    }
    public String getCurrency() {
        return this.currency;
    }           

    public void setCurrency(String currency) {
        this.currency = currency;
    }
    public Integer getAvgPxPrecision() {
        return this.avgPxPrecision;
    }           

    public void setAvgPxPrecision(Integer avgPxPrecision) {
        this.avgPxPrecision = avgPxPrecision;
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
    public Integer getBookingType() {
        return this.bookingType;
    }           

    public void setBookingType(Integer bookingType) {
        this.bookingType = bookingType;
    }
    public BigDecimal getGrossTradeAmt() {
        return this.grossTradeAmt;
    }           

    public void setGrossTradeAmt(BigDecimal grossTradeAmt) {
        this.grossTradeAmt = grossTradeAmt;
    }
    public BigDecimal getConcession() {
        return this.concession;
    }           

    public void setConcession(BigDecimal concession) {
        this.concession = concession;
    }
    public BigDecimal getTotalTakedown() {
        return this.totalTakedown;
    }           

    public void setTotalTakedown(BigDecimal totalTakedown) {
        this.totalTakedown = totalTakedown;
    }
    public BigDecimal getNetMoney() {
        return this.netMoney;
    }           

    public void setNetMoney(BigDecimal netMoney) {
        this.netMoney = netMoney;
    }
    public String getPositionEffect() {
        return this.positionEffect;
    }           

    public void setPositionEffect(String positionEffect) {
        this.positionEffect = positionEffect;
    }
    public Boolean getAutoAcceptIndicator() {
        return this.autoAcceptIndicator;
    }           

    public void setAutoAcceptIndicator(Boolean autoAcceptIndicator) {
        this.autoAcceptIndicator = autoAcceptIndicator;
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
    public Integer getNumDaysInterest() {
        return this.numDaysInterest;
    }           

    public void setNumDaysInterest(Integer numDaysInterest) {
        this.numDaysInterest = numDaysInterest;
    }
    public BigDecimal getAccruedInterestRate() {
        return this.accruedInterestRate;
    }           

    public void setAccruedInterestRate(BigDecimal accruedInterestRate) {
        this.accruedInterestRate = accruedInterestRate;
    }
    public BigDecimal getAccruedInterestAmt() {
        return this.accruedInterestAmt;
    }           

    public void setAccruedInterestAmt(BigDecimal accruedInterestAmt) {
        this.accruedInterestAmt = accruedInterestAmt;
    }
    public BigDecimal getTotalAccruedInterestAmt() {
        return this.totalAccruedInterestAmt;
    }           

    public void setTotalAccruedInterestAmt(BigDecimal totalAccruedInterestAmt) {
        this.totalAccruedInterestAmt = totalAccruedInterestAmt;
    }
    public BigDecimal getInterestAtMaturity() {
        return this.interestAtMaturity;
    }           

    public void setInterestAtMaturity(BigDecimal interestAtMaturity) {
        this.interestAtMaturity = interestAtMaturity;
    }
    public BigDecimal getEndAccruedInterestAmt() {
        return this.endAccruedInterestAmt;
    }           

    public void setEndAccruedInterestAmt(BigDecimal endAccruedInterestAmt) {
        this.endAccruedInterestAmt = endAccruedInterestAmt;
    }
    public BigDecimal getStartCash() {
        return this.startCash;
    }           

    public void setStartCash(BigDecimal startCash) {
        this.startCash = startCash;
    }
    public BigDecimal getEndCash() {
        return this.endCash;
    }           

    public void setEndCash(BigDecimal endCash) {
        this.endCash = endCash;
    }
    public Boolean getLegalConfirm() {
        return this.legalConfirm;
    }           

    public void setLegalConfirm(Boolean legalConfirm) {
        this.legalConfirm = legalConfirm;
    }
    public Integer getTotNoAllocs() {
        return this.totNoAllocs;
    }           

    public void setTotNoAllocs(Integer totNoAllocs) {
        this.totNoAllocs = totNoAllocs;
    }
    public Boolean getLastFragment() {
        return this.lastFragment;
    }           

    public void setLastFragment(Boolean lastFragment) {
        this.lastFragment = lastFragment;
    }

    
    public Instrument getInstrument() {
        return this.instrument;
    }           

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }
    
    public InstrumentExtension getInstrumentExtension() {
        return this.instrumentExtension;
    }           

    public void setInstrumentExtension(InstrumentExtension instrumentExtension) {
        this.instrumentExtension = instrumentExtension;
    }
    
    public FinancingDetails getFinancingDetails() {
        return this.financingDetails;
    }           

    public void setFinancingDetails(FinancingDetails financingDetails) {
        this.financingDetails = financingDetails;
    }
    
    public SpreadOrBenchmarkCurveData getSpreadOrBenchmarkCurveData() {
        return this.spreadOrBenchmarkCurveData;
    }           

    public void setSpreadOrBenchmarkCurveData(SpreadOrBenchmarkCurveData spreadOrBenchmarkCurveData) {
        this.spreadOrBenchmarkCurveData = spreadOrBenchmarkCurveData;
    }
    
    public Parties getParties() {
        return this.parties;
    }           

    public void setParties(Parties parties) {
        this.parties = parties;
    }
    
    public Stipulations getStipulations() {
        return this.stipulations;
    }           

    public void setStipulations(Stipulations stipulations) {
        this.stipulations = stipulations;
    }
    
    public YieldData getYieldData() {
        return this.yieldData;
    }           

    public void setYieldData(YieldData yieldData) {
        this.yieldData = yieldData;
    }

    public AllocationInstruction.NoOrders getNoOrders() {
        return this.noOrders;
    }

    public void setNoOrders(AllocationInstruction.NoOrders noOrders) {
        this.noOrders = noOrders;
    }
    public AllocationInstruction.NoExecs getNoExecs() {
        return this.noExecs;
    }

    public void setNoExecs(AllocationInstruction.NoExecs noExecs) {
        this.noExecs = noExecs;
    }
    public AllocationInstruction.NoUnderlyings getNoUnderlyings() {
        return this.noUnderlyings;
    }

    public void setNoUnderlyings(AllocationInstruction.NoUnderlyings noUnderlyings) {
        this.noUnderlyings = noUnderlyings;
    }
    public AllocationInstruction.NoLegs getNoLegs() {
        return this.noLegs;
    }

    public void setNoLegs(AllocationInstruction.NoLegs noLegs) {
        this.noLegs = noLegs;
    }
    public AllocationInstruction.NoAllocs getNoAllocs() {
        return this.noAllocs;
    }

    public void setNoAllocs(AllocationInstruction.NoAllocs noAllocs) {
        this.noAllocs = noAllocs;
    }
        

    public static class NoOrders extends FixGroup<AllocationInstruction.NoOrders.NoOrdersEntry> {

        @Override
        public int getField() {
            return 73;
        }

        public static class NoOrdersEntry {

            private String clOrdID;
            private String orderID;
            private String secondaryOrderID;
            private String secondaryClOrdID;
            private String listID;
            private BigDecimal orderQty;
            private BigDecimal orderAvgPx;
            private BigDecimal orderBookingQty;

            public String getClOrdID() {
                return this.clOrdID;
            }           

            public void setClOrdID(String clOrdID) {
                this.clOrdID = clOrdID;
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
            public String getSecondaryClOrdID() {
                return this.secondaryClOrdID;
            }           

            public void setSecondaryClOrdID(String secondaryClOrdID) {
                this.secondaryClOrdID = secondaryClOrdID;
            }
            public String getListID() {
                return this.listID;
            }           

            public void setListID(String listID) {
                this.listID = listID;
            }
            public BigDecimal getOrderQty() {
                return this.orderQty;
            }           

            public void setOrderQty(BigDecimal orderQty) {
                this.orderQty = orderQty;
            }
            public BigDecimal getOrderAvgPx() {
                return this.orderAvgPx;
            }           

            public void setOrderAvgPx(BigDecimal orderAvgPx) {
                this.orderAvgPx = orderAvgPx;
            }
            public BigDecimal getOrderBookingQty() {
                return this.orderBookingQty;
            }           

            public void setOrderBookingQty(BigDecimal orderBookingQty) {
                this.orderBookingQty = orderBookingQty;
            }

        }
        
    }


    public static class NoExecs extends FixGroup<AllocationInstruction.NoExecs.NoExecsEntry> {

        @Override
        public int getField() {
            return 124;
        }

        public static class NoExecsEntry {

            private BigDecimal lastQty;
            private String execID;
            private String secondaryExecID;
            private BigDecimal lastPx;
            private BigDecimal lastParPx;
            private String lastCapacity;

            public BigDecimal getLastQty() {
                return this.lastQty;
            }           

            public void setLastQty(BigDecimal lastQty) {
                this.lastQty = lastQty;
            }
            public String getExecID() {
                return this.execID;
            }           

            public void setExecID(String execID) {
                this.execID = execID;
            }
            public String getSecondaryExecID() {
                return this.secondaryExecID;
            }           

            public void setSecondaryExecID(String secondaryExecID) {
                this.secondaryExecID = secondaryExecID;
            }
            public BigDecimal getLastPx() {
                return this.lastPx;
            }           

            public void setLastPx(BigDecimal lastPx) {
                this.lastPx = lastPx;
            }
            public BigDecimal getLastParPx() {
                return this.lastParPx;
            }           

            public void setLastParPx(BigDecimal lastParPx) {
                this.lastParPx = lastParPx;
            }
            public String getLastCapacity() {
                return this.lastCapacity;
            }           

            public void setLastCapacity(String lastCapacity) {
                this.lastCapacity = lastCapacity;
            }

        }
        
    }


    public static class NoUnderlyings extends FixGroup<AllocationInstruction.NoUnderlyings.NoUnderlyingsEntry> {

        @Override
        public int getField() {
            return 711;
        }

        public static class NoUnderlyingsEntry {



        }
        
    }


    public static class NoLegs extends FixGroup<AllocationInstruction.NoLegs.NoLegsEntry> {

        @Override
        public int getField() {
            return 555;
        }

        public static class NoLegsEntry {



        }
        
    }


    public static class NoAllocs extends FixGroup<AllocationInstruction.NoAllocs.NoAllocsEntry> {

        @Override
        public int getField() {
            return 78;
        }

        public static class NoAllocsEntry {

            private String allocAccount;
            private Integer allocAcctIDSource;
            private String matchStatus;
            private BigDecimal allocPrice;
            private BigDecimal allocQty;
            private String individualAllocID;
            private String processCode;
            private Boolean notifyBrokerOfCredit;
            private Integer allocHandlInst;
            private String allocText;
            private Integer encodedAllocTextLen;
            private String encodedAllocText;
            private BigDecimal allocAvgPx;
            private BigDecimal allocNetMoney;
            private BigDecimal settlCurrAmt;
            private BigDecimal allocSettlCurrAmt;
            private String settlCurrency;
            private String allocSettlCurrency;
            private BigDecimal settlCurrFxRate;
            private String settlCurrFxRateCalc;
            private BigDecimal accruedInterestAmt;
            private BigDecimal allocAccruedInterestAmt;
            private BigDecimal allocInterestAtMaturity;
            private String settlInstMode;
            private Integer noClearingInstructions;
            private Integer clearingInstruction;
            private String clearingFeeIndicator;
            private Integer allocSettlInstType;

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
            public String getMatchStatus() {
                return this.matchStatus;
            }           

            public void setMatchStatus(String matchStatus) {
                this.matchStatus = matchStatus;
            }
            public BigDecimal getAllocPrice() {
                return this.allocPrice;
            }           

            public void setAllocPrice(BigDecimal allocPrice) {
                this.allocPrice = allocPrice;
            }
            public BigDecimal getAllocQty() {
                return this.allocQty;
            }           

            public void setAllocQty(BigDecimal allocQty) {
                this.allocQty = allocQty;
            }
            public String getIndividualAllocID() {
                return this.individualAllocID;
            }           

            public void setIndividualAllocID(String individualAllocID) {
                this.individualAllocID = individualAllocID;
            }
            public String getProcessCode() {
                return this.processCode;
            }           

            public void setProcessCode(String processCode) {
                this.processCode = processCode;
            }
            public Boolean getNotifyBrokerOfCredit() {
                return this.notifyBrokerOfCredit;
            }           

            public void setNotifyBrokerOfCredit(Boolean notifyBrokerOfCredit) {
                this.notifyBrokerOfCredit = notifyBrokerOfCredit;
            }
            public Integer getAllocHandlInst() {
                return this.allocHandlInst;
            }           

            public void setAllocHandlInst(Integer allocHandlInst) {
                this.allocHandlInst = allocHandlInst;
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
            public BigDecimal getAllocAvgPx() {
                return this.allocAvgPx;
            }           

            public void setAllocAvgPx(BigDecimal allocAvgPx) {
                this.allocAvgPx = allocAvgPx;
            }
            public BigDecimal getAllocNetMoney() {
                return this.allocNetMoney;
            }           

            public void setAllocNetMoney(BigDecimal allocNetMoney) {
                this.allocNetMoney = allocNetMoney;
            }
            public BigDecimal getSettlCurrAmt() {
                return this.settlCurrAmt;
            }           

            public void setSettlCurrAmt(BigDecimal settlCurrAmt) {
                this.settlCurrAmt = settlCurrAmt;
            }
            public BigDecimal getAllocSettlCurrAmt() {
                return this.allocSettlCurrAmt;
            }           

            public void setAllocSettlCurrAmt(BigDecimal allocSettlCurrAmt) {
                this.allocSettlCurrAmt = allocSettlCurrAmt;
            }
            public String getSettlCurrency() {
                return this.settlCurrency;
            }           

            public void setSettlCurrency(String settlCurrency) {
                this.settlCurrency = settlCurrency;
            }
            public String getAllocSettlCurrency() {
                return this.allocSettlCurrency;
            }           

            public void setAllocSettlCurrency(String allocSettlCurrency) {
                this.allocSettlCurrency = allocSettlCurrency;
            }
            public BigDecimal getSettlCurrFxRate() {
                return this.settlCurrFxRate;
            }           

            public void setSettlCurrFxRate(BigDecimal settlCurrFxRate) {
                this.settlCurrFxRate = settlCurrFxRate;
            }
            public String getSettlCurrFxRateCalc() {
                return this.settlCurrFxRateCalc;
            }           

            public void setSettlCurrFxRateCalc(String settlCurrFxRateCalc) {
                this.settlCurrFxRateCalc = settlCurrFxRateCalc;
            }
            public BigDecimal getAccruedInterestAmt() {
                return this.accruedInterestAmt;
            }           

            public void setAccruedInterestAmt(BigDecimal accruedInterestAmt) {
                this.accruedInterestAmt = accruedInterestAmt;
            }
            public BigDecimal getAllocAccruedInterestAmt() {
                return this.allocAccruedInterestAmt;
            }           

            public void setAllocAccruedInterestAmt(BigDecimal allocAccruedInterestAmt) {
                this.allocAccruedInterestAmt = allocAccruedInterestAmt;
            }
            public BigDecimal getAllocInterestAtMaturity() {
                return this.allocInterestAtMaturity;
            }           

            public void setAllocInterestAtMaturity(BigDecimal allocInterestAtMaturity) {
                this.allocInterestAtMaturity = allocInterestAtMaturity;
            }
            public String getSettlInstMode() {
                return this.settlInstMode;
            }           

            public void setSettlInstMode(String settlInstMode) {
                this.settlInstMode = settlInstMode;
            }
            public Integer getNoClearingInstructions() {
                return this.noClearingInstructions;
            }           

            public void setNoClearingInstructions(Integer noClearingInstructions) {
                this.noClearingInstructions = noClearingInstructions;
            }
            public Integer getClearingInstruction() {
                return this.clearingInstruction;
            }           

            public void setClearingInstruction(Integer clearingInstruction) {
                this.clearingInstruction = clearingInstruction;
            }
            public String getClearingFeeIndicator() {
                return this.clearingFeeIndicator;
            }           

            public void setClearingFeeIndicator(String clearingFeeIndicator) {
                this.clearingFeeIndicator = clearingFeeIndicator;
            }
            public Integer getAllocSettlInstType() {
                return this.allocSettlInstType;
            }           

            public void setAllocSettlInstType(Integer allocSettlInstType) {
                this.allocSettlInstType = allocSettlInstType;
            }

        }
        
    }

}

