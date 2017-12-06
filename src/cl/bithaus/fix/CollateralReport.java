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
import cl.bithaus.fix.components.Instrument;
import cl.bithaus.fix.components.FinancingDetails;
import cl.bithaus.fix.components.InstrumentLeg;
import cl.bithaus.fix.components.TrdRegTimestamps;
import cl.bithaus.fix.components.SpreadOrBenchmarkCurveData;
import cl.bithaus.fix.components.Stipulations;
import cl.bithaus.fix.components.SettlInstructionsData;

/**
 * Fix Components Class
 * Generated for FIX 4.4
 * @author Bithaus Fix Message Generator
 */
public class CollateralReport extends FixBaseMessage {

    private String collRptID;           
    private String collInquiryID;           
    private Integer collStatus;           
    private Integer totNumReports;           
    private Boolean lastRptRequested;           
    private String account;           
    private Integer accountType;           
    private String clOrdID;           
    private String orderID;           
    private String secondaryOrderID;           
    private String secondaryClOrdID;           
    private String settlDate;           
    private BigDecimal quantity;           
    private Integer qtyType;           
    private String currency;           
    private Integer noLegs;           
    private BigDecimal marginExcess;           
    private BigDecimal totalNetValue;           
    private BigDecimal cashOutstanding;           
    private String side;           
    private BigDecimal price;           
    private Integer priceType;           
    private BigDecimal accruedInterestAmt;           
    private BigDecimal endAccruedInterestAmt;           
    private BigDecimal startCash;           
    private BigDecimal endCash;           
    private String tradingSessionID;           
    private String tradingSessionSubID;           
    private String settlSessID;           
    private String settlSessSubID;           
    private String clearingBusinessDate;           
    private String text;           
    private Integer encodedTextLen;           
    private String encodedText;           
    private Parties parties;           
    private Instrument instrument;           
    private FinancingDetails financingDetails;           
    private InstrumentLeg instrumentLeg;           
    private TrdRegTimestamps trdRegTimestamps;           
    private SpreadOrBenchmarkCurveData spreadOrBenchmarkCurveData;           
    private Stipulations stipulations;           
    private SettlInstructionsData settlInstructionsData;           
    private NoExecs noExecs;           
    private NoTrades noTrades;           
    private NoUnderlyings noUnderlyings;           
    private NoMiscFees noMiscFees;           

    public CollateralReport() { 
        super("BA", MsgCategory.APP);
    }

    public String getCollRptID() {
        return this.collRptID;
    }           

    public void setCollRptID(String collRptID) {
        this.collRptID = collRptID;
    }
    public String getCollInquiryID() {
        return this.collInquiryID;
    }           

    public void setCollInquiryID(String collInquiryID) {
        this.collInquiryID = collInquiryID;
    }
    public Integer getCollStatus() {
        return this.collStatus;
    }           

    public void setCollStatus(Integer collStatus) {
        this.collStatus = collStatus;
    }
    public Integer getTotNumReports() {
        return this.totNumReports;
    }           

    public void setTotNumReports(Integer totNumReports) {
        this.totNumReports = totNumReports;
    }
    public Boolean getLastRptRequested() {
        return this.lastRptRequested;
    }           

    public void setLastRptRequested(Boolean lastRptRequested) {
        this.lastRptRequested = lastRptRequested;
    }
    public String getAccount() {
        return this.account;
    }           

    public void setAccount(String account) {
        this.account = account;
    }
    public Integer getAccountType() {
        return this.accountType;
    }           

    public void setAccountType(Integer accountType) {
        this.accountType = accountType;
    }
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
    public String getSettlDate() {
        return this.settlDate;
    }           

    public void setSettlDate(String settlDate) {
        this.settlDate = settlDate;
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
    public String getCurrency() {
        return this.currency;
    }           

    public void setCurrency(String currency) {
        this.currency = currency;
    }
    public Integer getNoLegs() {
        return this.noLegs;
    }           

    public void setNoLegs(Integer noLegs) {
        this.noLegs = noLegs;
    }
    public BigDecimal getMarginExcess() {
        return this.marginExcess;
    }           

    public void setMarginExcess(BigDecimal marginExcess) {
        this.marginExcess = marginExcess;
    }
    public BigDecimal getTotalNetValue() {
        return this.totalNetValue;
    }           

    public void setTotalNetValue(BigDecimal totalNetValue) {
        this.totalNetValue = totalNetValue;
    }
    public BigDecimal getCashOutstanding() {
        return this.cashOutstanding;
    }           

    public void setCashOutstanding(BigDecimal cashOutstanding) {
        this.cashOutstanding = cashOutstanding;
    }
    public String getSide() {
        return this.side;
    }           

    public void setSide(String side) {
        this.side = side;
    }
    public BigDecimal getPrice() {
        return this.price;
    }           

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
    public Integer getPriceType() {
        return this.priceType;
    }           

    public void setPriceType(Integer priceType) {
        this.priceType = priceType;
    }
    public BigDecimal getAccruedInterestAmt() {
        return this.accruedInterestAmt;
    }           

    public void setAccruedInterestAmt(BigDecimal accruedInterestAmt) {
        this.accruedInterestAmt = accruedInterestAmt;
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
    public String getSettlSessID() {
        return this.settlSessID;
    }           

    public void setSettlSessID(String settlSessID) {
        this.settlSessID = settlSessID;
    }
    public String getSettlSessSubID() {
        return this.settlSessSubID;
    }           

    public void setSettlSessSubID(String settlSessSubID) {
        this.settlSessSubID = settlSessSubID;
    }
    public String getClearingBusinessDate() {
        return this.clearingBusinessDate;
    }           

    public void setClearingBusinessDate(String clearingBusinessDate) {
        this.clearingBusinessDate = clearingBusinessDate;
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
    
    public Instrument getInstrument() {
        return this.instrument;
    }           

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }
    
    public FinancingDetails getFinancingDetails() {
        return this.financingDetails;
    }           

    public void setFinancingDetails(FinancingDetails financingDetails) {
        this.financingDetails = financingDetails;
    }
    
    public InstrumentLeg getInstrumentLeg() {
        return this.instrumentLeg;
    }           

    public void setInstrumentLeg(InstrumentLeg instrumentLeg) {
        this.instrumentLeg = instrumentLeg;
    }
    
    public TrdRegTimestamps getTrdRegTimestamps() {
        return this.trdRegTimestamps;
    }           

    public void setTrdRegTimestamps(TrdRegTimestamps trdRegTimestamps) {
        this.trdRegTimestamps = trdRegTimestamps;
    }
    
    public SpreadOrBenchmarkCurveData getSpreadOrBenchmarkCurveData() {
        return this.spreadOrBenchmarkCurveData;
    }           

    public void setSpreadOrBenchmarkCurveData(SpreadOrBenchmarkCurveData spreadOrBenchmarkCurveData) {
        this.spreadOrBenchmarkCurveData = spreadOrBenchmarkCurveData;
    }
    
    public Stipulations getStipulations() {
        return this.stipulations;
    }           

    public void setStipulations(Stipulations stipulations) {
        this.stipulations = stipulations;
    }
    
    public SettlInstructionsData getSettlInstructionsData() {
        return this.settlInstructionsData;
    }           

    public void setSettlInstructionsData(SettlInstructionsData settlInstructionsData) {
        this.settlInstructionsData = settlInstructionsData;
    }

    public CollateralReport.NoExecs getNoExecs() {
        return this.noExecs;
    }

    public void setNoExecs(CollateralReport.NoExecs noExecs) {
        this.noExecs = noExecs;
    }
    public CollateralReport.NoTrades getNoTrades() {
        return this.noTrades;
    }

    public void setNoTrades(CollateralReport.NoTrades noTrades) {
        this.noTrades = noTrades;
    }
    public CollateralReport.NoUnderlyings getNoUnderlyings() {
        return this.noUnderlyings;
    }

    public void setNoUnderlyings(CollateralReport.NoUnderlyings noUnderlyings) {
        this.noUnderlyings = noUnderlyings;
    }
    public CollateralReport.NoMiscFees getNoMiscFees() {
        return this.noMiscFees;
    }

    public void setNoMiscFees(CollateralReport.NoMiscFees noMiscFees) {
        this.noMiscFees = noMiscFees;
    }
        

    public static class NoExecs extends FixGroup<CollateralReport.NoExecs.NoExecsEntry> {

        @Override
        public int getField() {
            return 124;
        }

        public static class NoExecsEntry {

            private String execID;

            public String getExecID() {
                return this.execID;
            }           

            public void setExecID(String execID) {
                this.execID = execID;
            }

        }
        
    }


    public static class NoTrades extends FixGroup<CollateralReport.NoTrades.NoTradesEntry> {

        @Override
        public int getField() {
            return 897;
        }

        public static class NoTradesEntry {

            private String tradeReportID;
            private String secondaryTradeReportID;

            public String getTradeReportID() {
                return this.tradeReportID;
            }           

            public void setTradeReportID(String tradeReportID) {
                this.tradeReportID = tradeReportID;
            }
            public String getSecondaryTradeReportID() {
                return this.secondaryTradeReportID;
            }           

            public void setSecondaryTradeReportID(String secondaryTradeReportID) {
                this.secondaryTradeReportID = secondaryTradeReportID;
            }

        }
        
    }


    public static class NoUnderlyings extends FixGroup<CollateralReport.NoUnderlyings.NoUnderlyingsEntry> {

        @Override
        public int getField() {
            return 711;
        }

        public static class NoUnderlyingsEntry {



        }
        
    }


    public static class NoMiscFees extends FixGroup<CollateralReport.NoMiscFees.NoMiscFeesEntry> {

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

