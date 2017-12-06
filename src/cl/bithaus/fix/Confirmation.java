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
import cl.bithaus.fix.components.TrdRegTimestamps;
import cl.bithaus.fix.components.Instrument;
import cl.bithaus.fix.components.InstrumentExtension;
import cl.bithaus.fix.components.FinancingDetails;
import cl.bithaus.fix.components.YieldData;
import cl.bithaus.fix.components.SpreadOrBenchmarkCurveData;
import cl.bithaus.fix.components.SettlInstructionsData;
import cl.bithaus.fix.components.CommissionData;
import cl.bithaus.fix.components.Stipulations;

/**
 * Fix Components Class
 * Generated for FIX 4.4
 * @author Bithaus Fix Message Generator
 */
public class Confirmation extends FixBaseMessage {

    private String confirmID;           
    private String confirmRefID;           
    private String confirmReqID;           
    private Integer confirmTransType;           
    private Integer confirmType;           
    private Boolean copyMsgIndicator;           
    private Boolean legalConfirm;           
    private Integer confirmStatus;           
    private String allocID;           
    private String secondaryAllocID;           
    private String individualAllocID;           
    private Date transactTime;           
    private String tradeDate;           
    private BigDecimal allocQty;           
    private Integer qtyType;           
    private String side;           
    private String currency;           
    private String lastMkt;           
    private String allocAccount;           
    private Integer allocAcctIDSource;           
    private Integer allocAccountType;           
    private BigDecimal avgPx;           
    private Integer avgPxPrecision;           
    private Integer priceType;           
    private BigDecimal avgParPx;           
    private BigDecimal reportedPx;           
    private String text;           
    private Integer encodedTextLen;           
    private String encodedText;           
    private String processCode;           
    private BigDecimal grossTradeAmt;           
    private Integer numDaysInterest;           
    private String exDate;           
    private BigDecimal accruedInterestRate;           
    private BigDecimal accruedInterestAmt;           
    private BigDecimal interestAtMaturity;           
    private BigDecimal endAccruedInterestAmt;           
    private BigDecimal startCash;           
    private BigDecimal endCash;           
    private BigDecimal concession;           
    private BigDecimal totalTakedown;           
    private BigDecimal netMoney;           
    private BigDecimal maturityNetMoney;           
    private BigDecimal settlCurrAmt;           
    private String settlCurrency;           
    private BigDecimal settlCurrFxRate;           
    private String settlCurrFxRateCalc;           
    private String settlType;           
    private String settlDate;           
    private BigDecimal sharedCommission;           
    private Parties parties;           
    private TrdRegTimestamps trdRegTimestamps;           
    private Instrument instrument;           
    private InstrumentExtension instrumentExtension;           
    private FinancingDetails financingDetails;           
    private YieldData yieldData;           
    private SpreadOrBenchmarkCurveData spreadOrBenchmarkCurveData;           
    private SettlInstructionsData settlInstructionsData;           
    private CommissionData commissionData;           
    private Stipulations stipulations;           
    private NoOrders noOrders;           
    private NoUnderlyings noUnderlyings;           
    private NoLegs noLegs;           
    private NoCapacities noCapacities;           
    private NoMiscFees noMiscFees;           

    public Confirmation() { 
        super("AK", MsgCategory.APP);
    }

    public String getConfirmID() {
        return this.confirmID;
    }           

    public void setConfirmID(String confirmID) {
        this.confirmID = confirmID;
    }
    public String getConfirmRefID() {
        return this.confirmRefID;
    }           

    public void setConfirmRefID(String confirmRefID) {
        this.confirmRefID = confirmRefID;
    }
    public String getConfirmReqID() {
        return this.confirmReqID;
    }           

    public void setConfirmReqID(String confirmReqID) {
        this.confirmReqID = confirmReqID;
    }
    public Integer getConfirmTransType() {
        return this.confirmTransType;
    }           

    public void setConfirmTransType(Integer confirmTransType) {
        this.confirmTransType = confirmTransType;
    }
    public Integer getConfirmType() {
        return this.confirmType;
    }           

    public void setConfirmType(Integer confirmType) {
        this.confirmType = confirmType;
    }
    public Boolean getCopyMsgIndicator() {
        return this.copyMsgIndicator;
    }           

    public void setCopyMsgIndicator(Boolean copyMsgIndicator) {
        this.copyMsgIndicator = copyMsgIndicator;
    }
    public Boolean getLegalConfirm() {
        return this.legalConfirm;
    }           

    public void setLegalConfirm(Boolean legalConfirm) {
        this.legalConfirm = legalConfirm;
    }
    public Integer getConfirmStatus() {
        return this.confirmStatus;
    }           

    public void setConfirmStatus(Integer confirmStatus) {
        this.confirmStatus = confirmStatus;
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
    public String getIndividualAllocID() {
        return this.individualAllocID;
    }           

    public void setIndividualAllocID(String individualAllocID) {
        this.individualAllocID = individualAllocID;
    }
    public Date getTransactTime() {
        return this.transactTime;
    }           

    public void setTransactTime(Date transactTime) {
        this.transactTime = transactTime;
    }
    public String getTradeDate() {
        return this.tradeDate;
    }           

    public void setTradeDate(String tradeDate) {
        this.tradeDate = tradeDate;
    }
    public BigDecimal getAllocQty() {
        return this.allocQty;
    }           

    public void setAllocQty(BigDecimal allocQty) {
        this.allocQty = allocQty;
    }
    public Integer getQtyType() {
        return this.qtyType;
    }           

    public void setQtyType(Integer qtyType) {
        this.qtyType = qtyType;
    }
    public String getSide() {
        return this.side;
    }           

    public void setSide(String side) {
        this.side = side;
    }
    public String getCurrency() {
        return this.currency;
    }           

    public void setCurrency(String currency) {
        this.currency = currency;
    }
    public String getLastMkt() {
        return this.lastMkt;
    }           

    public void setLastMkt(String lastMkt) {
        this.lastMkt = lastMkt;
    }
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
    public Integer getAllocAccountType() {
        return this.allocAccountType;
    }           

    public void setAllocAccountType(Integer allocAccountType) {
        this.allocAccountType = allocAccountType;
    }
    public BigDecimal getAvgPx() {
        return this.avgPx;
    }           

    public void setAvgPx(BigDecimal avgPx) {
        this.avgPx = avgPx;
    }
    public Integer getAvgPxPrecision() {
        return this.avgPxPrecision;
    }           

    public void setAvgPxPrecision(Integer avgPxPrecision) {
        this.avgPxPrecision = avgPxPrecision;
    }
    public Integer getPriceType() {
        return this.priceType;
    }           

    public void setPriceType(Integer priceType) {
        this.priceType = priceType;
    }
    public BigDecimal getAvgParPx() {
        return this.avgParPx;
    }           

    public void setAvgParPx(BigDecimal avgParPx) {
        this.avgParPx = avgParPx;
    }
    public BigDecimal getReportedPx() {
        return this.reportedPx;
    }           

    public void setReportedPx(BigDecimal reportedPx) {
        this.reportedPx = reportedPx;
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
    public String getProcessCode() {
        return this.processCode;
    }           

    public void setProcessCode(String processCode) {
        this.processCode = processCode;
    }
    public BigDecimal getGrossTradeAmt() {
        return this.grossTradeAmt;
    }           

    public void setGrossTradeAmt(BigDecimal grossTradeAmt) {
        this.grossTradeAmt = grossTradeAmt;
    }
    public Integer getNumDaysInterest() {
        return this.numDaysInterest;
    }           

    public void setNumDaysInterest(Integer numDaysInterest) {
        this.numDaysInterest = numDaysInterest;
    }
    public String getExDate() {
        return this.exDate;
    }           

    public void setExDate(String exDate) {
        this.exDate = exDate;
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
    public BigDecimal getMaturityNetMoney() {
        return this.maturityNetMoney;
    }           

    public void setMaturityNetMoney(BigDecimal maturityNetMoney) {
        this.maturityNetMoney = maturityNetMoney;
    }
    public BigDecimal getSettlCurrAmt() {
        return this.settlCurrAmt;
    }           

    public void setSettlCurrAmt(BigDecimal settlCurrAmt) {
        this.settlCurrAmt = settlCurrAmt;
    }
    public String getSettlCurrency() {
        return this.settlCurrency;
    }           

    public void setSettlCurrency(String settlCurrency) {
        this.settlCurrency = settlCurrency;
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
    public BigDecimal getSharedCommission() {
        return this.sharedCommission;
    }           

    public void setSharedCommission(BigDecimal sharedCommission) {
        this.sharedCommission = sharedCommission;
    }

    
    public Parties getParties() {
        return this.parties;
    }           

    public void setParties(Parties parties) {
        this.parties = parties;
    }
    
    public TrdRegTimestamps getTrdRegTimestamps() {
        return this.trdRegTimestamps;
    }           

    public void setTrdRegTimestamps(TrdRegTimestamps trdRegTimestamps) {
        this.trdRegTimestamps = trdRegTimestamps;
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
    
    public YieldData getYieldData() {
        return this.yieldData;
    }           

    public void setYieldData(YieldData yieldData) {
        this.yieldData = yieldData;
    }
    
    public SpreadOrBenchmarkCurveData getSpreadOrBenchmarkCurveData() {
        return this.spreadOrBenchmarkCurveData;
    }           

    public void setSpreadOrBenchmarkCurveData(SpreadOrBenchmarkCurveData spreadOrBenchmarkCurveData) {
        this.spreadOrBenchmarkCurveData = spreadOrBenchmarkCurveData;
    }
    
    public SettlInstructionsData getSettlInstructionsData() {
        return this.settlInstructionsData;
    }           

    public void setSettlInstructionsData(SettlInstructionsData settlInstructionsData) {
        this.settlInstructionsData = settlInstructionsData;
    }
    
    public CommissionData getCommissionData() {
        return this.commissionData;
    }           

    public void setCommissionData(CommissionData commissionData) {
        this.commissionData = commissionData;
    }
    
    public Stipulations getStipulations() {
        return this.stipulations;
    }           

    public void setStipulations(Stipulations stipulations) {
        this.stipulations = stipulations;
    }

    public Confirmation.NoOrders getNoOrders() {
        return this.noOrders;
    }

    public void setNoOrders(Confirmation.NoOrders noOrders) {
        this.noOrders = noOrders;
    }
    public Confirmation.NoUnderlyings getNoUnderlyings() {
        return this.noUnderlyings;
    }

    public void setNoUnderlyings(Confirmation.NoUnderlyings noUnderlyings) {
        this.noUnderlyings = noUnderlyings;
    }
    public Confirmation.NoLegs getNoLegs() {
        return this.noLegs;
    }

    public void setNoLegs(Confirmation.NoLegs noLegs) {
        this.noLegs = noLegs;
    }
    public Confirmation.NoCapacities getNoCapacities() {
        return this.noCapacities;
    }

    public void setNoCapacities(Confirmation.NoCapacities noCapacities) {
        this.noCapacities = noCapacities;
    }
    public Confirmation.NoMiscFees getNoMiscFees() {
        return this.noMiscFees;
    }

    public void setNoMiscFees(Confirmation.NoMiscFees noMiscFees) {
        this.noMiscFees = noMiscFees;
    }
        

    public static class NoOrders extends FixGroup<Confirmation.NoOrders.NoOrdersEntry> {

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


    public static class NoUnderlyings extends FixGroup<Confirmation.NoUnderlyings.NoUnderlyingsEntry> {

        @Override
        public int getField() {
            return 711;
        }

        public static class NoUnderlyingsEntry {



        }
        
    }


    public static class NoLegs extends FixGroup<Confirmation.NoLegs.NoLegsEntry> {

        @Override
        public int getField() {
            return 555;
        }

        public static class NoLegsEntry {



        }
        
    }


    public static class NoCapacities extends FixGroup<Confirmation.NoCapacities.NoCapacitiesEntry> {

        @Override
        public int getField() {
            return 862;
        }

        public static class NoCapacitiesEntry {

            private String orderCapacity;
            private String orderRestrictions;
            private BigDecimal orderCapacityQty;

            public String getOrderCapacity() {
                return this.orderCapacity;
            }           

            public void setOrderCapacity(String orderCapacity) {
                this.orderCapacity = orderCapacity;
            }
            public String getOrderRestrictions() {
                return this.orderRestrictions;
            }           

            public void setOrderRestrictions(String orderRestrictions) {
                this.orderRestrictions = orderRestrictions;
            }
            public BigDecimal getOrderCapacityQty() {
                return this.orderCapacityQty;
            }           

            public void setOrderCapacityQty(BigDecimal orderCapacityQty) {
                this.orderCapacityQty = orderCapacityQty;
            }

        }
        
    }


    public static class NoMiscFees extends FixGroup<Confirmation.NoMiscFees.NoMiscFeesEntry> {

        @Override
        public int getField() {
            return 136;
        }

        public static class NoMiscFeesEntry {

            private BigDecimal miscFeeAmt;
            private String miscFeeCurr;
            private String miscFeeType;
            private Integer miscFeeBasis;

            public BigDecimal getMiscFeeAmt() {
                return this.miscFeeAmt;
            }           

            public void setMiscFeeAmt(BigDecimal miscFeeAmt) {
                this.miscFeeAmt = miscFeeAmt;
            }
            public String getMiscFeeCurr() {
                return this.miscFeeCurr;
            }           

            public void setMiscFeeCurr(String miscFeeCurr) {
                this.miscFeeCurr = miscFeeCurr;
            }
            public String getMiscFeeType() {
                return this.miscFeeType;
            }           

            public void setMiscFeeType(String miscFeeType) {
                this.miscFeeType = miscFeeType;
            }
            public Integer getMiscFeeBasis() {
                return this.miscFeeBasis;
            }           

            public void setMiscFeeBasis(Integer miscFeeBasis) {
                this.miscFeeBasis = miscFeeBasis;
            }

        }
        
    }

}

