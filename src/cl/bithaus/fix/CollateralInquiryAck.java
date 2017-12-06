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

/**
 * Fix Components Class
 * Generated for FIX 4.4
 * @author Bithaus Fix Message Generator
 */
public class CollateralInquiryAck extends FixBaseMessage {

    private String collInquiryID;           
    private Integer collInquiryStatus;           
    private Integer collInquiryResult;           
    private Integer totNumReports;           
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
    private String tradingSessionID;           
    private String tradingSessionSubID;           
    private String settlSessID;           
    private String settlSessSubID;           
    private String clearingBusinessDate;           
    private Integer responseTransportType;           
    private String responseDestination;           
    private String text;           
    private Integer encodedTextLen;           
    private String encodedText;           
    private Parties parties;           
    private Instrument instrument;           
    private FinancingDetails financingDetails;           
    private InstrumentLeg instrumentLeg;           
    private NoCollInquiryQualifier noCollInquiryQualifier;           
    private NoExecs noExecs;           
    private NoTrades noTrades;           
    private NoUnderlyings noUnderlyings;           

    public CollateralInquiryAck() { 
        super("BG", MsgCategory.APP);
    }

    public String getCollInquiryID() {
        return this.collInquiryID;
    }           

    public void setCollInquiryID(String collInquiryID) {
        this.collInquiryID = collInquiryID;
    }
    public Integer getCollInquiryStatus() {
        return this.collInquiryStatus;
    }           

    public void setCollInquiryStatus(Integer collInquiryStatus) {
        this.collInquiryStatus = collInquiryStatus;
    }
    public Integer getCollInquiryResult() {
        return this.collInquiryResult;
    }           

    public void setCollInquiryResult(Integer collInquiryResult) {
        this.collInquiryResult = collInquiryResult;
    }
    public Integer getTotNumReports() {
        return this.totNumReports;
    }           

    public void setTotNumReports(Integer totNumReports) {
        this.totNumReports = totNumReports;
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
    public Integer getResponseTransportType() {
        return this.responseTransportType;
    }           

    public void setResponseTransportType(Integer responseTransportType) {
        this.responseTransportType = responseTransportType;
    }
    public String getResponseDestination() {
        return this.responseDestination;
    }           

    public void setResponseDestination(String responseDestination) {
        this.responseDestination = responseDestination;
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

    public CollateralInquiryAck.NoCollInquiryQualifier getNoCollInquiryQualifier() {
        return this.noCollInquiryQualifier;
    }

    public void setNoCollInquiryQualifier(CollateralInquiryAck.NoCollInquiryQualifier noCollInquiryQualifier) {
        this.noCollInquiryQualifier = noCollInquiryQualifier;
    }
    public CollateralInquiryAck.NoExecs getNoExecs() {
        return this.noExecs;
    }

    public void setNoExecs(CollateralInquiryAck.NoExecs noExecs) {
        this.noExecs = noExecs;
    }
    public CollateralInquiryAck.NoTrades getNoTrades() {
        return this.noTrades;
    }

    public void setNoTrades(CollateralInquiryAck.NoTrades noTrades) {
        this.noTrades = noTrades;
    }
    public CollateralInquiryAck.NoUnderlyings getNoUnderlyings() {
        return this.noUnderlyings;
    }

    public void setNoUnderlyings(CollateralInquiryAck.NoUnderlyings noUnderlyings) {
        this.noUnderlyings = noUnderlyings;
    }
        

    public static class NoCollInquiryQualifier extends FixGroup<CollateralInquiryAck.NoCollInquiryQualifier.NoCollInquiryQualifierEntry> {

        @Override
        public int getField() {
            return 938;
        }

        public static class NoCollInquiryQualifierEntry {

            private Integer collInquiryQualifier;

            public Integer getCollInquiryQualifier() {
                return this.collInquiryQualifier;
            }           

            public void setCollInquiryQualifier(Integer collInquiryQualifier) {
                this.collInquiryQualifier = collInquiryQualifier;
            }

        }
        
    }


    public static class NoExecs extends FixGroup<CollateralInquiryAck.NoExecs.NoExecsEntry> {

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


    public static class NoTrades extends FixGroup<CollateralInquiryAck.NoTrades.NoTradesEntry> {

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


    public static class NoUnderlyings extends FixGroup<CollateralInquiryAck.NoUnderlyings.NoUnderlyingsEntry> {

        @Override
        public int getField() {
            return 711;
        }

        public static class NoUnderlyingsEntry {



        }
        
    }

}

