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
public class UnderlyingInstrument implements FixComponent {

    private String underlyingSymbol;           
    private String underlyingSymbolSfx;           
    private String underlyingSecurityID;           
    private String underlyingSecurityIDSource;           
    private Integer underlyingProduct;           
    private String underlyingCFICode;           
    private String underlyingSecurityType;           
    private String underlyingSecuritySubType;           
    private String underlyingMaturityMonthYear;           
    private String underlyingMaturityDate;           
    private String underlyingCouponPaymentDate;           
    private String underlyingIssueDate;           
    private Integer underlyingRepoCollateralSecurityType;           
    private Integer underlyingRepurchaseTerm;           
    private BigDecimal underlyingRepurchaseRate;           
    private BigDecimal underlyingFactor;           
    private String underlyingCreditRating;           
    private String underlyingInstrRegistry;           
    private String underlyingCountryOfIssue;           
    private String underlyingStateOrProvinceOfIssue;           
    private String underlyingLocaleOfIssue;           
    private String underlyingRedemptionDate;           
    private BigDecimal underlyingStrikePrice;           
    private String underlyingStrikeCurrency;           
    private String underlyingOptAttribute;           
    private BigDecimal underlyingContractMultiplier;           
    private BigDecimal underlyingCouponRate;           
    private String underlyingSecurityExchange;           
    private String underlyingIssuer;           
    private Integer encodedUnderlyingIssuerLen;           
    private String encodedUnderlyingIssuer;           
    private String underlyingSecurityDesc;           
    private Integer encodedUnderlyingSecurityDescLen;           
    private String encodedUnderlyingSecurityDesc;           
    private String underlyingCPProgram;           
    private String underlyingCPRegType;           
    private String underlyingCurrency;           
    private BigDecimal underlyingQty;           
    private BigDecimal underlyingPx;           
    private BigDecimal underlyingDirtyPrice;           
    private BigDecimal underlyingEndPrice;           
    private BigDecimal underlyingStartValue;           
    private BigDecimal underlyingCurrentValue;           
    private BigDecimal underlyingEndValue;           

    public UnderlyingInstrument() { }

    public String getUnderlyingSymbol() {
        return this.underlyingSymbol;
    }           

    public void setUnderlyingSymbol(String underlyingSymbol) {
        this.underlyingSymbol = underlyingSymbol;
    }
    public String getUnderlyingSymbolSfx() {
        return this.underlyingSymbolSfx;
    }           

    public void setUnderlyingSymbolSfx(String underlyingSymbolSfx) {
        this.underlyingSymbolSfx = underlyingSymbolSfx;
    }
    public String getUnderlyingSecurityID() {
        return this.underlyingSecurityID;
    }           

    public void setUnderlyingSecurityID(String underlyingSecurityID) {
        this.underlyingSecurityID = underlyingSecurityID;
    }
    public String getUnderlyingSecurityIDSource() {
        return this.underlyingSecurityIDSource;
    }           

    public void setUnderlyingSecurityIDSource(String underlyingSecurityIDSource) {
        this.underlyingSecurityIDSource = underlyingSecurityIDSource;
    }
    public Integer getUnderlyingProduct() {
        return this.underlyingProduct;
    }           

    public void setUnderlyingProduct(Integer underlyingProduct) {
        this.underlyingProduct = underlyingProduct;
    }
    public String getUnderlyingCFICode() {
        return this.underlyingCFICode;
    }           

    public void setUnderlyingCFICode(String underlyingCFICode) {
        this.underlyingCFICode = underlyingCFICode;
    }
    public String getUnderlyingSecurityType() {
        return this.underlyingSecurityType;
    }           

    public void setUnderlyingSecurityType(String underlyingSecurityType) {
        this.underlyingSecurityType = underlyingSecurityType;
    }
    public String getUnderlyingSecuritySubType() {
        return this.underlyingSecuritySubType;
    }           

    public void setUnderlyingSecuritySubType(String underlyingSecuritySubType) {
        this.underlyingSecuritySubType = underlyingSecuritySubType;
    }
    public String getUnderlyingMaturityMonthYear() {
        return this.underlyingMaturityMonthYear;
    }           

    public void setUnderlyingMaturityMonthYear(String underlyingMaturityMonthYear) {
        this.underlyingMaturityMonthYear = underlyingMaturityMonthYear;
    }
    public String getUnderlyingMaturityDate() {
        return this.underlyingMaturityDate;
    }           

    public void setUnderlyingMaturityDate(String underlyingMaturityDate) {
        this.underlyingMaturityDate = underlyingMaturityDate;
    }
    public String getUnderlyingCouponPaymentDate() {
        return this.underlyingCouponPaymentDate;
    }           

    public void setUnderlyingCouponPaymentDate(String underlyingCouponPaymentDate) {
        this.underlyingCouponPaymentDate = underlyingCouponPaymentDate;
    }
    public String getUnderlyingIssueDate() {
        return this.underlyingIssueDate;
    }           

    public void setUnderlyingIssueDate(String underlyingIssueDate) {
        this.underlyingIssueDate = underlyingIssueDate;
    }
    public Integer getUnderlyingRepoCollateralSecurityType() {
        return this.underlyingRepoCollateralSecurityType;
    }           

    public void setUnderlyingRepoCollateralSecurityType(Integer underlyingRepoCollateralSecurityType) {
        this.underlyingRepoCollateralSecurityType = underlyingRepoCollateralSecurityType;
    }
    public Integer getUnderlyingRepurchaseTerm() {
        return this.underlyingRepurchaseTerm;
    }           

    public void setUnderlyingRepurchaseTerm(Integer underlyingRepurchaseTerm) {
        this.underlyingRepurchaseTerm = underlyingRepurchaseTerm;
    }
    public BigDecimal getUnderlyingRepurchaseRate() {
        return this.underlyingRepurchaseRate;
    }           

    public void setUnderlyingRepurchaseRate(BigDecimal underlyingRepurchaseRate) {
        this.underlyingRepurchaseRate = underlyingRepurchaseRate;
    }
    public BigDecimal getUnderlyingFactor() {
        return this.underlyingFactor;
    }           

    public void setUnderlyingFactor(BigDecimal underlyingFactor) {
        this.underlyingFactor = underlyingFactor;
    }
    public String getUnderlyingCreditRating() {
        return this.underlyingCreditRating;
    }           

    public void setUnderlyingCreditRating(String underlyingCreditRating) {
        this.underlyingCreditRating = underlyingCreditRating;
    }
    public String getUnderlyingInstrRegistry() {
        return this.underlyingInstrRegistry;
    }           

    public void setUnderlyingInstrRegistry(String underlyingInstrRegistry) {
        this.underlyingInstrRegistry = underlyingInstrRegistry;
    }
    public String getUnderlyingCountryOfIssue() {
        return this.underlyingCountryOfIssue;
    }           

    public void setUnderlyingCountryOfIssue(String underlyingCountryOfIssue) {
        this.underlyingCountryOfIssue = underlyingCountryOfIssue;
    }
    public String getUnderlyingStateOrProvinceOfIssue() {
        return this.underlyingStateOrProvinceOfIssue;
    }           

    public void setUnderlyingStateOrProvinceOfIssue(String underlyingStateOrProvinceOfIssue) {
        this.underlyingStateOrProvinceOfIssue = underlyingStateOrProvinceOfIssue;
    }
    public String getUnderlyingLocaleOfIssue() {
        return this.underlyingLocaleOfIssue;
    }           

    public void setUnderlyingLocaleOfIssue(String underlyingLocaleOfIssue) {
        this.underlyingLocaleOfIssue = underlyingLocaleOfIssue;
    }
    public String getUnderlyingRedemptionDate() {
        return this.underlyingRedemptionDate;
    }           

    public void setUnderlyingRedemptionDate(String underlyingRedemptionDate) {
        this.underlyingRedemptionDate = underlyingRedemptionDate;
    }
    public BigDecimal getUnderlyingStrikePrice() {
        return this.underlyingStrikePrice;
    }           

    public void setUnderlyingStrikePrice(BigDecimal underlyingStrikePrice) {
        this.underlyingStrikePrice = underlyingStrikePrice;
    }
    public String getUnderlyingStrikeCurrency() {
        return this.underlyingStrikeCurrency;
    }           

    public void setUnderlyingStrikeCurrency(String underlyingStrikeCurrency) {
        this.underlyingStrikeCurrency = underlyingStrikeCurrency;
    }
    public String getUnderlyingOptAttribute() {
        return this.underlyingOptAttribute;
    }           

    public void setUnderlyingOptAttribute(String underlyingOptAttribute) {
        this.underlyingOptAttribute = underlyingOptAttribute;
    }
    public BigDecimal getUnderlyingContractMultiplier() {
        return this.underlyingContractMultiplier;
    }           

    public void setUnderlyingContractMultiplier(BigDecimal underlyingContractMultiplier) {
        this.underlyingContractMultiplier = underlyingContractMultiplier;
    }
    public BigDecimal getUnderlyingCouponRate() {
        return this.underlyingCouponRate;
    }           

    public void setUnderlyingCouponRate(BigDecimal underlyingCouponRate) {
        this.underlyingCouponRate = underlyingCouponRate;
    }
    public String getUnderlyingSecurityExchange() {
        return this.underlyingSecurityExchange;
    }           

    public void setUnderlyingSecurityExchange(String underlyingSecurityExchange) {
        this.underlyingSecurityExchange = underlyingSecurityExchange;
    }
    public String getUnderlyingIssuer() {
        return this.underlyingIssuer;
    }           

    public void setUnderlyingIssuer(String underlyingIssuer) {
        this.underlyingIssuer = underlyingIssuer;
    }
    public Integer getEncodedUnderlyingIssuerLen() {
        return this.encodedUnderlyingIssuerLen;
    }           

    public void setEncodedUnderlyingIssuerLen(Integer encodedUnderlyingIssuerLen) {
        this.encodedUnderlyingIssuerLen = encodedUnderlyingIssuerLen;
    }
    public String getEncodedUnderlyingIssuer() {
        return this.encodedUnderlyingIssuer;
    }           

    public void setEncodedUnderlyingIssuer(String encodedUnderlyingIssuer) {
        this.encodedUnderlyingIssuer = encodedUnderlyingIssuer;
    }
    public String getUnderlyingSecurityDesc() {
        return this.underlyingSecurityDesc;
    }           

    public void setUnderlyingSecurityDesc(String underlyingSecurityDesc) {
        this.underlyingSecurityDesc = underlyingSecurityDesc;
    }
    public Integer getEncodedUnderlyingSecurityDescLen() {
        return this.encodedUnderlyingSecurityDescLen;
    }           

    public void setEncodedUnderlyingSecurityDescLen(Integer encodedUnderlyingSecurityDescLen) {
        this.encodedUnderlyingSecurityDescLen = encodedUnderlyingSecurityDescLen;
    }
    public String getEncodedUnderlyingSecurityDesc() {
        return this.encodedUnderlyingSecurityDesc;
    }           

    public void setEncodedUnderlyingSecurityDesc(String encodedUnderlyingSecurityDesc) {
        this.encodedUnderlyingSecurityDesc = encodedUnderlyingSecurityDesc;
    }
    public String getUnderlyingCPProgram() {
        return this.underlyingCPProgram;
    }           

    public void setUnderlyingCPProgram(String underlyingCPProgram) {
        this.underlyingCPProgram = underlyingCPProgram;
    }
    public String getUnderlyingCPRegType() {
        return this.underlyingCPRegType;
    }           

    public void setUnderlyingCPRegType(String underlyingCPRegType) {
        this.underlyingCPRegType = underlyingCPRegType;
    }
    public String getUnderlyingCurrency() {
        return this.underlyingCurrency;
    }           

    public void setUnderlyingCurrency(String underlyingCurrency) {
        this.underlyingCurrency = underlyingCurrency;
    }
    public BigDecimal getUnderlyingQty() {
        return this.underlyingQty;
    }           

    public void setUnderlyingQty(BigDecimal underlyingQty) {
        this.underlyingQty = underlyingQty;
    }
    public BigDecimal getUnderlyingPx() {
        return this.underlyingPx;
    }           

    public void setUnderlyingPx(BigDecimal underlyingPx) {
        this.underlyingPx = underlyingPx;
    }
    public BigDecimal getUnderlyingDirtyPrice() {
        return this.underlyingDirtyPrice;
    }           

    public void setUnderlyingDirtyPrice(BigDecimal underlyingDirtyPrice) {
        this.underlyingDirtyPrice = underlyingDirtyPrice;
    }
    public BigDecimal getUnderlyingEndPrice() {
        return this.underlyingEndPrice;
    }           

    public void setUnderlyingEndPrice(BigDecimal underlyingEndPrice) {
        this.underlyingEndPrice = underlyingEndPrice;
    }
    public BigDecimal getUnderlyingStartValue() {
        return this.underlyingStartValue;
    }           

    public void setUnderlyingStartValue(BigDecimal underlyingStartValue) {
        this.underlyingStartValue = underlyingStartValue;
    }
    public BigDecimal getUnderlyingCurrentValue() {
        return this.underlyingCurrentValue;
    }           

    public void setUnderlyingCurrentValue(BigDecimal underlyingCurrentValue) {
        this.underlyingCurrentValue = underlyingCurrentValue;
    }
    public BigDecimal getUnderlyingEndValue() {
        return this.underlyingEndValue;
    }           

    public void setUnderlyingEndValue(BigDecimal underlyingEndValue) {
        this.underlyingEndValue = underlyingEndValue;
    }

    private UnderlyingInstrument.NoUnderlyingSecurityAltID noUnderlyingSecurityAltID;

    public UnderlyingInstrument.NoUnderlyingSecurityAltID getNoUnderlyingSecurityAltID() {
        return this.noUnderlyingSecurityAltID;
    }

    public void setNoUnderlyingSecurityAltID(UnderlyingInstrument.NoUnderlyingSecurityAltID noUnderlyingSecurityAltID) {
        this.noUnderlyingSecurityAltID = noUnderlyingSecurityAltID;
    }
        

    public static class NoUnderlyingSecurityAltID extends FixGroup<UnderlyingInstrument.NoUnderlyingSecurityAltID.NoUnderlyingSecurityAltIDEntry> {

        @Override
        public int getField() {
            return 457;
        }

        public static class NoUnderlyingSecurityAltIDEntry {

            private String underlyingSecurityAltID;
            private String underlyingSecurityAltIDSource;

            public String getUnderlyingSecurityAltID() {
                return this.underlyingSecurityAltID;
            }           

            public void setUnderlyingSecurityAltID(String underlyingSecurityAltID) {
                this.underlyingSecurityAltID = underlyingSecurityAltID;
            }
            public String getUnderlyingSecurityAltIDSource() {
                return this.underlyingSecurityAltIDSource;
            }           

            public void setUnderlyingSecurityAltIDSource(String underlyingSecurityAltIDSource) {
                this.underlyingSecurityAltIDSource = underlyingSecurityAltIDSource;
            }

        }
        
    }

}

