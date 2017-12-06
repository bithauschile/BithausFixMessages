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

/**
 * Fix Components Class
 * Generated for FIX 4.4
 * @author Bithaus Fix Message Generator
 */
public class RegistrationInstructions extends FixBaseMessage {

    private String registID;           
    private String registTransType;           
    private String registRefID;           
    private String clOrdID;           
    private String account;           
    private Integer acctIDSource;           
    private String registAcctType;           
    private Integer taxAdvantageType;           
    private String ownershipType;           
    private Parties parties;           
    private NoRegistDtls noRegistDtls;           
    private NoDistribInsts noDistribInsts;           

    public RegistrationInstructions() { 
        super("o", MsgCategory.APP);
    }

    public String getRegistID() {
        return this.registID;
    }           

    public void setRegistID(String registID) {
        this.registID = registID;
    }
    public String getRegistTransType() {
        return this.registTransType;
    }           

    public void setRegistTransType(String registTransType) {
        this.registTransType = registTransType;
    }
    public String getRegistRefID() {
        return this.registRefID;
    }           

    public void setRegistRefID(String registRefID) {
        this.registRefID = registRefID;
    }
    public String getClOrdID() {
        return this.clOrdID;
    }           

    public void setClOrdID(String clOrdID) {
        this.clOrdID = clOrdID;
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
    public String getRegistAcctType() {
        return this.registAcctType;
    }           

    public void setRegistAcctType(String registAcctType) {
        this.registAcctType = registAcctType;
    }
    public Integer getTaxAdvantageType() {
        return this.taxAdvantageType;
    }           

    public void setTaxAdvantageType(Integer taxAdvantageType) {
        this.taxAdvantageType = taxAdvantageType;
    }
    public String getOwnershipType() {
        return this.ownershipType;
    }           

    public void setOwnershipType(String ownershipType) {
        this.ownershipType = ownershipType;
    }

    
    public Parties getParties() {
        return this.parties;
    }           

    public void setParties(Parties parties) {
        this.parties = parties;
    }

    public RegistrationInstructions.NoRegistDtls getNoRegistDtls() {
        return this.noRegistDtls;
    }

    public void setNoRegistDtls(RegistrationInstructions.NoRegistDtls noRegistDtls) {
        this.noRegistDtls = noRegistDtls;
    }
    public RegistrationInstructions.NoDistribInsts getNoDistribInsts() {
        return this.noDistribInsts;
    }

    public void setNoDistribInsts(RegistrationInstructions.NoDistribInsts noDistribInsts) {
        this.noDistribInsts = noDistribInsts;
    }
        

    public static class NoRegistDtls extends FixGroup<RegistrationInstructions.NoRegistDtls.NoRegistDtlsEntry> {

        @Override
        public int getField() {
            return 473;
        }

        public static class NoRegistDtlsEntry {

            private String registDtls;
            private String registEmail;
            private String mailingDtls;
            private String mailingInst;
            private Integer ownerType;
            private String dateOfBirth;
            private String investorCountryOfResidence;

            public String getRegistDtls() {
                return this.registDtls;
            }           

            public void setRegistDtls(String registDtls) {
                this.registDtls = registDtls;
            }
            public String getRegistEmail() {
                return this.registEmail;
            }           

            public void setRegistEmail(String registEmail) {
                this.registEmail = registEmail;
            }
            public String getMailingDtls() {
                return this.mailingDtls;
            }           

            public void setMailingDtls(String mailingDtls) {
                this.mailingDtls = mailingDtls;
            }
            public String getMailingInst() {
                return this.mailingInst;
            }           

            public void setMailingInst(String mailingInst) {
                this.mailingInst = mailingInst;
            }
            public Integer getOwnerType() {
                return this.ownerType;
            }           

            public void setOwnerType(Integer ownerType) {
                this.ownerType = ownerType;
            }
            public String getDateOfBirth() {
                return this.dateOfBirth;
            }           

            public void setDateOfBirth(String dateOfBirth) {
                this.dateOfBirth = dateOfBirth;
            }
            public String getInvestorCountryOfResidence() {
                return this.investorCountryOfResidence;
            }           

            public void setInvestorCountryOfResidence(String investorCountryOfResidence) {
                this.investorCountryOfResidence = investorCountryOfResidence;
            }

        }
        
    }


    public static class NoDistribInsts extends FixGroup<RegistrationInstructions.NoDistribInsts.NoDistribInstsEntry> {

        @Override
        public int getField() {
            return 510;
        }

        public static class NoDistribInstsEntry {

            private Integer distribPaymentMethod;
            private BigDecimal distribPercentage;
            private String cashDistribCurr;
            private String cashDistribAgentName;
            private String cashDistribAgentCode;
            private String cashDistribAgentAcctNumber;
            private String cashDistribPayRef;
            private String cashDistribAgentAcctName;

            public Integer getDistribPaymentMethod() {
                return this.distribPaymentMethod;
            }           

            public void setDistribPaymentMethod(Integer distribPaymentMethod) {
                this.distribPaymentMethod = distribPaymentMethod;
            }
            public BigDecimal getDistribPercentage() {
                return this.distribPercentage;
            }           

            public void setDistribPercentage(BigDecimal distribPercentage) {
                this.distribPercentage = distribPercentage;
            }
            public String getCashDistribCurr() {
                return this.cashDistribCurr;
            }           

            public void setCashDistribCurr(String cashDistribCurr) {
                this.cashDistribCurr = cashDistribCurr;
            }
            public String getCashDistribAgentName() {
                return this.cashDistribAgentName;
            }           

            public void setCashDistribAgentName(String cashDistribAgentName) {
                this.cashDistribAgentName = cashDistribAgentName;
            }
            public String getCashDistribAgentCode() {
                return this.cashDistribAgentCode;
            }           

            public void setCashDistribAgentCode(String cashDistribAgentCode) {
                this.cashDistribAgentCode = cashDistribAgentCode;
            }
            public String getCashDistribAgentAcctNumber() {
                return this.cashDistribAgentAcctNumber;
            }           

            public void setCashDistribAgentAcctNumber(String cashDistribAgentAcctNumber) {
                this.cashDistribAgentAcctNumber = cashDistribAgentAcctNumber;
            }
            public String getCashDistribPayRef() {
                return this.cashDistribPayRef;
            }           

            public void setCashDistribPayRef(String cashDistribPayRef) {
                this.cashDistribPayRef = cashDistribPayRef;
            }
            public String getCashDistribAgentAcctName() {
                return this.cashDistribAgentAcctName;
            }           

            public void setCashDistribAgentAcctName(String cashDistribAgentAcctName) {
                this.cashDistribAgentAcctName = cashDistribAgentAcctName;
            }

        }
        
    }

}

