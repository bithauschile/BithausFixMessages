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

package cl.bithaus.fix.components;

import cl.bithaus.fix.msg.base.FixComponent;
import cl.bithaus.fix.msg.base.FixGroup;
import java.util.Date;
import java.math.BigDecimal;


/**
 * Fix Components Class
 * Generated for FIX 4.4
 * @author Bithaus Fix Message Generator
 */
public class Instrument implements FixComponent {

    private String symbol;           
    private String symbolSfx;           
    private String securityID;           
    private String securityIDSource;           
    private Integer product;           
    private String cFICode;           
    private String securityType;           
    private String securitySubType;           
    private String maturityMonthYear;           
    private String maturityDate;           
    private String couponPaymentDate;           
    private String issueDate;           
    private Integer repoCollateralSecurityType;           
    private Integer repurchaseTerm;           
    private BigDecimal repurchaseRate;           
    private BigDecimal factor;           
    private String creditRating;           
    private String instrRegistry;           
    private String countryOfIssue;           
    private String stateOrProvinceOfIssue;           
    private String localeOfIssue;           
    private String redemptionDate;           
    private BigDecimal strikePrice;           
    private String strikeCurrency;           
    private String optAttribute;           
    private BigDecimal contractMultiplier;           
    private BigDecimal couponRate;           
    private String securityExchange;           
    private String issuer;           
    private Integer encodedIssuerLen;           
    private String encodedIssuer;           
    private String securityDesc;           
    private Integer encodedSecurityDescLen;           
    private String encodedSecurityDesc;           
    private String pool;           
    private String contractSettlMonth;           
    private Integer cPProgram;           
    private String cPRegType;           
    private String datedDate;           
    private String interestAccrualDate;           
    private String family;           
    private BigDecimal splitFactor;           
    private String bolson;           
    private String paymentCurrency;           
    private String adjustmentCurrency;           
    private BigDecimal minCut;           
    private BigDecimal issueAmount;           
    private String riskIndicator;           
    private Integer fixedIncomePriceType;           
    private String instrumentRisk;           
    private String instrumentType;           

    public Instrument() { }

    public String getSymbol() {
        return this.symbol;
    }           

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }
    public String getSymbolSfx() {
        return this.symbolSfx;
    }           

    public void setSymbolSfx(String symbolSfx) {
        this.symbolSfx = symbolSfx;
    }
    public String getSecurityID() {
        return this.securityID;
    }           

    public void setSecurityID(String securityID) {
        this.securityID = securityID;
    }
    public String getSecurityIDSource() {
        return this.securityIDSource;
    }           

    public void setSecurityIDSource(String securityIDSource) {
        this.securityIDSource = securityIDSource;
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
    public String getMaturityMonthYear() {
        return this.maturityMonthYear;
    }           

    public void setMaturityMonthYear(String maturityMonthYear) {
        this.maturityMonthYear = maturityMonthYear;
    }
    public String getMaturityDate() {
        return this.maturityDate;
    }           

    public void setMaturityDate(String maturityDate) {
        this.maturityDate = maturityDate;
    }
    public String getCouponPaymentDate() {
        return this.couponPaymentDate;
    }           

    public void setCouponPaymentDate(String couponPaymentDate) {
        this.couponPaymentDate = couponPaymentDate;
    }
    public String getIssueDate() {
        return this.issueDate;
    }           

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }
    public Integer getRepoCollateralSecurityType() {
        return this.repoCollateralSecurityType;
    }           

    public void setRepoCollateralSecurityType(Integer repoCollateralSecurityType) {
        this.repoCollateralSecurityType = repoCollateralSecurityType;
    }
    public Integer getRepurchaseTerm() {
        return this.repurchaseTerm;
    }           

    public void setRepurchaseTerm(Integer repurchaseTerm) {
        this.repurchaseTerm = repurchaseTerm;
    }
    public BigDecimal getRepurchaseRate() {
        return this.repurchaseRate;
    }           

    public void setRepurchaseRate(BigDecimal repurchaseRate) {
        this.repurchaseRate = repurchaseRate;
    }
    public BigDecimal getFactor() {
        return this.factor;
    }           

    public void setFactor(BigDecimal factor) {
        this.factor = factor;
    }
    public String getCreditRating() {
        return this.creditRating;
    }           

    public void setCreditRating(String creditRating) {
        this.creditRating = creditRating;
    }
    public String getInstrRegistry() {
        return this.instrRegistry;
    }           

    public void setInstrRegistry(String instrRegistry) {
        this.instrRegistry = instrRegistry;
    }
    public String getCountryOfIssue() {
        return this.countryOfIssue;
    }           

    public void setCountryOfIssue(String countryOfIssue) {
        this.countryOfIssue = countryOfIssue;
    }
    public String getStateOrProvinceOfIssue() {
        return this.stateOrProvinceOfIssue;
    }           

    public void setStateOrProvinceOfIssue(String stateOrProvinceOfIssue) {
        this.stateOrProvinceOfIssue = stateOrProvinceOfIssue;
    }
    public String getLocaleOfIssue() {
        return this.localeOfIssue;
    }           

    public void setLocaleOfIssue(String localeOfIssue) {
        this.localeOfIssue = localeOfIssue;
    }
    public String getRedemptionDate() {
        return this.redemptionDate;
    }           

    public void setRedemptionDate(String redemptionDate) {
        this.redemptionDate = redemptionDate;
    }
    public BigDecimal getStrikePrice() {
        return this.strikePrice;
    }           

    public void setStrikePrice(BigDecimal strikePrice) {
        this.strikePrice = strikePrice;
    }
    public String getStrikeCurrency() {
        return this.strikeCurrency;
    }           

    public void setStrikeCurrency(String strikeCurrency) {
        this.strikeCurrency = strikeCurrency;
    }
    public String getOptAttribute() {
        return this.optAttribute;
    }           

    public void setOptAttribute(String optAttribute) {
        this.optAttribute = optAttribute;
    }
    public BigDecimal getContractMultiplier() {
        return this.contractMultiplier;
    }           

    public void setContractMultiplier(BigDecimal contractMultiplier) {
        this.contractMultiplier = contractMultiplier;
    }
    public BigDecimal getCouponRate() {
        return this.couponRate;
    }           

    public void setCouponRate(BigDecimal couponRate) {
        this.couponRate = couponRate;
    }
    public String getSecurityExchange() {
        return this.securityExchange;
    }           

    public void setSecurityExchange(String securityExchange) {
        this.securityExchange = securityExchange;
    }
    public String getIssuer() {
        return this.issuer;
    }           

    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }
    public Integer getEncodedIssuerLen() {
        return this.encodedIssuerLen;
    }           

    public void setEncodedIssuerLen(Integer encodedIssuerLen) {
        this.encodedIssuerLen = encodedIssuerLen;
    }
    public String getEncodedIssuer() {
        return this.encodedIssuer;
    }           

    public void setEncodedIssuer(String encodedIssuer) {
        this.encodedIssuer = encodedIssuer;
    }
    public String getSecurityDesc() {
        return this.securityDesc;
    }           

    public void setSecurityDesc(String securityDesc) {
        this.securityDesc = securityDesc;
    }
    public Integer getEncodedSecurityDescLen() {
        return this.encodedSecurityDescLen;
    }           

    public void setEncodedSecurityDescLen(Integer encodedSecurityDescLen) {
        this.encodedSecurityDescLen = encodedSecurityDescLen;
    }
    public String getEncodedSecurityDesc() {
        return this.encodedSecurityDesc;
    }           

    public void setEncodedSecurityDesc(String encodedSecurityDesc) {
        this.encodedSecurityDesc = encodedSecurityDesc;
    }
    public String getPool() {
        return this.pool;
    }           

    public void setPool(String pool) {
        this.pool = pool;
    }
    public String getContractSettlMonth() {
        return this.contractSettlMonth;
    }           

    public void setContractSettlMonth(String contractSettlMonth) {
        this.contractSettlMonth = contractSettlMonth;
    }
    public Integer getCPProgram() {
        return this.cPProgram;
    }           

    public void setCPProgram(Integer cPProgram) {
        this.cPProgram = cPProgram;
    }
    public String getCPRegType() {
        return this.cPRegType;
    }           

    public void setCPRegType(String cPRegType) {
        this.cPRegType = cPRegType;
    }
    public String getDatedDate() {
        return this.datedDate;
    }           

    public void setDatedDate(String datedDate) {
        this.datedDate = datedDate;
    }
    public String getInterestAccrualDate() {
        return this.interestAccrualDate;
    }           

    public void setInterestAccrualDate(String interestAccrualDate) {
        this.interestAccrualDate = interestAccrualDate;
    }
    public String getFamily() {
        return this.family;
    }           

    public void setFamily(String family) {
        this.family = family;
    }
    public BigDecimal getSplitFactor() {
        return this.splitFactor;
    }           

    public void setSplitFactor(BigDecimal splitFactor) {
        this.splitFactor = splitFactor;
    }
    public String getBolson() {
        return this.bolson;
    }           

    public void setBolson(String bolson) {
        this.bolson = bolson;
    }
    public String getPaymentCurrency() {
        return this.paymentCurrency;
    }           

    public void setPaymentCurrency(String paymentCurrency) {
        this.paymentCurrency = paymentCurrency;
    }
    public String getAdjustmentCurrency() {
        return this.adjustmentCurrency;
    }           

    public void setAdjustmentCurrency(String adjustmentCurrency) {
        this.adjustmentCurrency = adjustmentCurrency;
    }
    public BigDecimal getMinCut() {
        return this.minCut;
    }           

    public void setMinCut(BigDecimal minCut) {
        this.minCut = minCut;
    }
    public BigDecimal getIssueAmount() {
        return this.issueAmount;
    }           

    public void setIssueAmount(BigDecimal issueAmount) {
        this.issueAmount = issueAmount;
    }
    public String getRiskIndicator() {
        return this.riskIndicator;
    }           

    public void setRiskIndicator(String riskIndicator) {
        this.riskIndicator = riskIndicator;
    }
    public Integer getFixedIncomePriceType() {
        return this.fixedIncomePriceType;
    }           

    public void setFixedIncomePriceType(Integer fixedIncomePriceType) {
        this.fixedIncomePriceType = fixedIncomePriceType;
    }
    public String getInstrumentRisk() {
        return this.instrumentRisk;
    }           

    public void setInstrumentRisk(String instrumentRisk) {
        this.instrumentRisk = instrumentRisk;
    }
    public String getInstrumentType() {
        return this.instrumentType;
    }           

    public void setInstrumentType(String instrumentType) {
        this.instrumentType = instrumentType;
    }

    private Instrument.NoSecurityAltID noSecurityAltID;
    private Instrument.NoEvents noEvents;

    public Instrument.NoSecurityAltID getNoSecurityAltID() {
        return this.noSecurityAltID;
    }

    public void setNoSecurityAltID(Instrument.NoSecurityAltID noSecurityAltID) {
        this.noSecurityAltID = noSecurityAltID;
    }
    public Instrument.NoEvents getNoEvents() {
        return this.noEvents;
    }

    public void setNoEvents(Instrument.NoEvents noEvents) {
        this.noEvents = noEvents;
    }
        

    public static class NoSecurityAltID extends FixGroup<Instrument.NoSecurityAltID.NoSecurityAltIDEntry> {

        @Override
        public int getField() {
            return 454;
        }

        public static class NoSecurityAltIDEntry {

            private String securityAltID;
            private String securityAltIDSource;

            public String getSecurityAltID() {
                return this.securityAltID;
            }           

            public void setSecurityAltID(String securityAltID) {
                this.securityAltID = securityAltID;
            }
            public String getSecurityAltIDSource() {
                return this.securityAltIDSource;
            }           

            public void setSecurityAltIDSource(String securityAltIDSource) {
                this.securityAltIDSource = securityAltIDSource;
            }

        }
        
    }


    public static class NoEvents extends FixGroup<Instrument.NoEvents.NoEventsEntry> {

        @Override
        public int getField() {
            return 864;
        }

        public static class NoEventsEntry {

            private Integer eventType;
            private String eventDate;
            private BigDecimal eventPx;
            private String eventText;

            public Integer getEventType() {
                return this.eventType;
            }           

            public void setEventType(Integer eventType) {
                this.eventType = eventType;
            }
            public String getEventDate() {
                return this.eventDate;
            }           

            public void setEventDate(String eventDate) {
                this.eventDate = eventDate;
            }
            public BigDecimal getEventPx() {
                return this.eventPx;
            }           

            public void setEventPx(BigDecimal eventPx) {
                this.eventPx = eventPx;
            }
            public String getEventText() {
                return this.eventText;
            }           

            public void setEventText(String eventText) {
                this.eventText = eventText;
            }

        }
        
    }

}

