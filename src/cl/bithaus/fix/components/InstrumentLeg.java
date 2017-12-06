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
public class InstrumentLeg implements FixComponent {

    private String legSymbol;           
    private String legSymbolSfx;           
    private String legSecurityID;           
    private String legSecurityIDSource;           
    private Integer legProduct;           
    private String legCFICode;           
    private String legSecurityType;           
    private String legSecuritySubType;           
    private String legMaturityMonthYear;           
    private String legMaturityDate;           
    private String legCouponPaymentDate;           
    private String legIssueDate;           
    private Integer legRepoCollateralSecurityType;           
    private Integer legRepurchaseTerm;           
    private BigDecimal legRepurchaseRate;           
    private BigDecimal legFactor;           
    private String legCreditRating;           
    private String legInstrRegistry;           
    private String legCountryOfIssue;           
    private String legStateOrProvinceOfIssue;           
    private String legLocaleOfIssue;           
    private String legRedemptionDate;           
    private BigDecimal legStrikePrice;           
    private String legStrikeCurrency;           
    private String legOptAttribute;           
    private BigDecimal legContractMultiplier;           
    private BigDecimal legCouponRate;           
    private String legSecurityExchange;           
    private String legIssuer;           
    private Integer encodedLegIssuerLen;           
    private String encodedLegIssuer;           
    private String legSecurityDesc;           
    private Integer encodedLegSecurityDescLen;           
    private String encodedLegSecurityDesc;           
    private BigDecimal legRatioQty;           
    private String legSide;           
    private String legCurrency;           
    private String legPool;           
    private String legDatedDate;           
    private String legContractSettlMonth;           
    private String legInterestAccrualDate;           

    public InstrumentLeg() { }

    public String getLegSymbol() {
        return this.legSymbol;
    }           

    public void setLegSymbol(String legSymbol) {
        this.legSymbol = legSymbol;
    }
    public String getLegSymbolSfx() {
        return this.legSymbolSfx;
    }           

    public void setLegSymbolSfx(String legSymbolSfx) {
        this.legSymbolSfx = legSymbolSfx;
    }
    public String getLegSecurityID() {
        return this.legSecurityID;
    }           

    public void setLegSecurityID(String legSecurityID) {
        this.legSecurityID = legSecurityID;
    }
    public String getLegSecurityIDSource() {
        return this.legSecurityIDSource;
    }           

    public void setLegSecurityIDSource(String legSecurityIDSource) {
        this.legSecurityIDSource = legSecurityIDSource;
    }
    public Integer getLegProduct() {
        return this.legProduct;
    }           

    public void setLegProduct(Integer legProduct) {
        this.legProduct = legProduct;
    }
    public String getLegCFICode() {
        return this.legCFICode;
    }           

    public void setLegCFICode(String legCFICode) {
        this.legCFICode = legCFICode;
    }
    public String getLegSecurityType() {
        return this.legSecurityType;
    }           

    public void setLegSecurityType(String legSecurityType) {
        this.legSecurityType = legSecurityType;
    }
    public String getLegSecuritySubType() {
        return this.legSecuritySubType;
    }           

    public void setLegSecuritySubType(String legSecuritySubType) {
        this.legSecuritySubType = legSecuritySubType;
    }
    public String getLegMaturityMonthYear() {
        return this.legMaturityMonthYear;
    }           

    public void setLegMaturityMonthYear(String legMaturityMonthYear) {
        this.legMaturityMonthYear = legMaturityMonthYear;
    }
    public String getLegMaturityDate() {
        return this.legMaturityDate;
    }           

    public void setLegMaturityDate(String legMaturityDate) {
        this.legMaturityDate = legMaturityDate;
    }
    public String getLegCouponPaymentDate() {
        return this.legCouponPaymentDate;
    }           

    public void setLegCouponPaymentDate(String legCouponPaymentDate) {
        this.legCouponPaymentDate = legCouponPaymentDate;
    }
    public String getLegIssueDate() {
        return this.legIssueDate;
    }           

    public void setLegIssueDate(String legIssueDate) {
        this.legIssueDate = legIssueDate;
    }
    public Integer getLegRepoCollateralSecurityType() {
        return this.legRepoCollateralSecurityType;
    }           

    public void setLegRepoCollateralSecurityType(Integer legRepoCollateralSecurityType) {
        this.legRepoCollateralSecurityType = legRepoCollateralSecurityType;
    }
    public Integer getLegRepurchaseTerm() {
        return this.legRepurchaseTerm;
    }           

    public void setLegRepurchaseTerm(Integer legRepurchaseTerm) {
        this.legRepurchaseTerm = legRepurchaseTerm;
    }
    public BigDecimal getLegRepurchaseRate() {
        return this.legRepurchaseRate;
    }           

    public void setLegRepurchaseRate(BigDecimal legRepurchaseRate) {
        this.legRepurchaseRate = legRepurchaseRate;
    }
    public BigDecimal getLegFactor() {
        return this.legFactor;
    }           

    public void setLegFactor(BigDecimal legFactor) {
        this.legFactor = legFactor;
    }
    public String getLegCreditRating() {
        return this.legCreditRating;
    }           

    public void setLegCreditRating(String legCreditRating) {
        this.legCreditRating = legCreditRating;
    }
    public String getLegInstrRegistry() {
        return this.legInstrRegistry;
    }           

    public void setLegInstrRegistry(String legInstrRegistry) {
        this.legInstrRegistry = legInstrRegistry;
    }
    public String getLegCountryOfIssue() {
        return this.legCountryOfIssue;
    }           

    public void setLegCountryOfIssue(String legCountryOfIssue) {
        this.legCountryOfIssue = legCountryOfIssue;
    }
    public String getLegStateOrProvinceOfIssue() {
        return this.legStateOrProvinceOfIssue;
    }           

    public void setLegStateOrProvinceOfIssue(String legStateOrProvinceOfIssue) {
        this.legStateOrProvinceOfIssue = legStateOrProvinceOfIssue;
    }
    public String getLegLocaleOfIssue() {
        return this.legLocaleOfIssue;
    }           

    public void setLegLocaleOfIssue(String legLocaleOfIssue) {
        this.legLocaleOfIssue = legLocaleOfIssue;
    }
    public String getLegRedemptionDate() {
        return this.legRedemptionDate;
    }           

    public void setLegRedemptionDate(String legRedemptionDate) {
        this.legRedemptionDate = legRedemptionDate;
    }
    public BigDecimal getLegStrikePrice() {
        return this.legStrikePrice;
    }           

    public void setLegStrikePrice(BigDecimal legStrikePrice) {
        this.legStrikePrice = legStrikePrice;
    }
    public String getLegStrikeCurrency() {
        return this.legStrikeCurrency;
    }           

    public void setLegStrikeCurrency(String legStrikeCurrency) {
        this.legStrikeCurrency = legStrikeCurrency;
    }
    public String getLegOptAttribute() {
        return this.legOptAttribute;
    }           

    public void setLegOptAttribute(String legOptAttribute) {
        this.legOptAttribute = legOptAttribute;
    }
    public BigDecimal getLegContractMultiplier() {
        return this.legContractMultiplier;
    }           

    public void setLegContractMultiplier(BigDecimal legContractMultiplier) {
        this.legContractMultiplier = legContractMultiplier;
    }
    public BigDecimal getLegCouponRate() {
        return this.legCouponRate;
    }           

    public void setLegCouponRate(BigDecimal legCouponRate) {
        this.legCouponRate = legCouponRate;
    }
    public String getLegSecurityExchange() {
        return this.legSecurityExchange;
    }           

    public void setLegSecurityExchange(String legSecurityExchange) {
        this.legSecurityExchange = legSecurityExchange;
    }
    public String getLegIssuer() {
        return this.legIssuer;
    }           

    public void setLegIssuer(String legIssuer) {
        this.legIssuer = legIssuer;
    }
    public Integer getEncodedLegIssuerLen() {
        return this.encodedLegIssuerLen;
    }           

    public void setEncodedLegIssuerLen(Integer encodedLegIssuerLen) {
        this.encodedLegIssuerLen = encodedLegIssuerLen;
    }
    public String getEncodedLegIssuer() {
        return this.encodedLegIssuer;
    }           

    public void setEncodedLegIssuer(String encodedLegIssuer) {
        this.encodedLegIssuer = encodedLegIssuer;
    }
    public String getLegSecurityDesc() {
        return this.legSecurityDesc;
    }           

    public void setLegSecurityDesc(String legSecurityDesc) {
        this.legSecurityDesc = legSecurityDesc;
    }
    public Integer getEncodedLegSecurityDescLen() {
        return this.encodedLegSecurityDescLen;
    }           

    public void setEncodedLegSecurityDescLen(Integer encodedLegSecurityDescLen) {
        this.encodedLegSecurityDescLen = encodedLegSecurityDescLen;
    }
    public String getEncodedLegSecurityDesc() {
        return this.encodedLegSecurityDesc;
    }           

    public void setEncodedLegSecurityDesc(String encodedLegSecurityDesc) {
        this.encodedLegSecurityDesc = encodedLegSecurityDesc;
    }
    public BigDecimal getLegRatioQty() {
        return this.legRatioQty;
    }           

    public void setLegRatioQty(BigDecimal legRatioQty) {
        this.legRatioQty = legRatioQty;
    }
    public String getLegSide() {
        return this.legSide;
    }           

    public void setLegSide(String legSide) {
        this.legSide = legSide;
    }
    public String getLegCurrency() {
        return this.legCurrency;
    }           

    public void setLegCurrency(String legCurrency) {
        this.legCurrency = legCurrency;
    }
    public String getLegPool() {
        return this.legPool;
    }           

    public void setLegPool(String legPool) {
        this.legPool = legPool;
    }
    public String getLegDatedDate() {
        return this.legDatedDate;
    }           

    public void setLegDatedDate(String legDatedDate) {
        this.legDatedDate = legDatedDate;
    }
    public String getLegContractSettlMonth() {
        return this.legContractSettlMonth;
    }           

    public void setLegContractSettlMonth(String legContractSettlMonth) {
        this.legContractSettlMonth = legContractSettlMonth;
    }
    public String getLegInterestAccrualDate() {
        return this.legInterestAccrualDate;
    }           

    public void setLegInterestAccrualDate(String legInterestAccrualDate) {
        this.legInterestAccrualDate = legInterestAccrualDate;
    }

    private InstrumentLeg.NoLegSecurityAltID noLegSecurityAltID;

    public InstrumentLeg.NoLegSecurityAltID getNoLegSecurityAltID() {
        return this.noLegSecurityAltID;
    }

    public void setNoLegSecurityAltID(InstrumentLeg.NoLegSecurityAltID noLegSecurityAltID) {
        this.noLegSecurityAltID = noLegSecurityAltID;
    }
        

    public static class NoLegSecurityAltID extends FixGroup<InstrumentLeg.NoLegSecurityAltID.NoLegSecurityAltIDEntry> {

        @Override
        public int getField() {
            return 604;
        }

        public static class NoLegSecurityAltIDEntry {

            private String legSecurityAltID;
            private String legSecurityAltIDSource;

            public String getLegSecurityAltID() {
                return this.legSecurityAltID;
            }           

            public void setLegSecurityAltID(String legSecurityAltID) {
                this.legSecurityAltID = legSecurityAltID;
            }
            public String getLegSecurityAltIDSource() {
                return this.legSecurityAltIDSource;
            }           

            public void setLegSecurityAltIDSource(String legSecurityAltIDSource) {
                this.legSecurityAltIDSource = legSecurityAltIDSource;
            }

        }
        
    }

}

