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
import cl.bithaus.fix.components.FinancingDetails;
import cl.bithaus.fix.components.OrderQtyData;
import cl.bithaus.fix.components.Stipulations;
import cl.bithaus.fix.components.SpreadOrBenchmarkCurveData;
import cl.bithaus.fix.components.YieldData;

/**
 * Fix Components Class
 * Generated for FIX 4.4
 * @author Bithaus Fix Message Generator
 */
public class IndicationOfInterest extends FixBaseMessage {

    private String iOIid;           
    private String iOITransType;           
    private String iOIRefID;           
    private String side;           
    private Integer qtyType;           
    private String iOIQty;           
    private String currency;           
    private Integer priceType;           
    private BigDecimal price;           
    private Date validUntilTime;           
    private String iOIQltyInd;           
    private Boolean iOINaturalFlag;           
    private String text;           
    private Integer encodedTextLen;           
    private String encodedText;           
    private Date transactTime;           
    private String uRLLink;           
    private Instrument instrument;           
    private FinancingDetails financingDetails;           
    private OrderQtyData orderQtyData;           
    private Stipulations stipulations;           
    private SpreadOrBenchmarkCurveData spreadOrBenchmarkCurveData;           
    private YieldData yieldData;           
    private NoUnderlyings noUnderlyings;           
    private NoLegs noLegs;           
    private NoIOIQualifiers noIOIQualifiers;           
    private NoRoutingIDs noRoutingIDs;           

    public IndicationOfInterest() { 
        super("6", MsgCategory.APP);
    }

    public String getIOIid() {
        return this.iOIid;
    }           

    public void setIOIid(String iOIid) {
        this.iOIid = iOIid;
    }
    public String getIOITransType() {
        return this.iOITransType;
    }           

    public void setIOITransType(String iOITransType) {
        this.iOITransType = iOITransType;
    }
    public String getIOIRefID() {
        return this.iOIRefID;
    }           

    public void setIOIRefID(String iOIRefID) {
        this.iOIRefID = iOIRefID;
    }
    public String getSide() {
        return this.side;
    }           

    public void setSide(String side) {
        this.side = side;
    }
    public Integer getQtyType() {
        return this.qtyType;
    }           

    public void setQtyType(Integer qtyType) {
        this.qtyType = qtyType;
    }
    public String getIOIQty() {
        return this.iOIQty;
    }           

    public void setIOIQty(String iOIQty) {
        this.iOIQty = iOIQty;
    }
    public String getCurrency() {
        return this.currency;
    }           

    public void setCurrency(String currency) {
        this.currency = currency;
    }
    public Integer getPriceType() {
        return this.priceType;
    }           

    public void setPriceType(Integer priceType) {
        this.priceType = priceType;
    }
    public BigDecimal getPrice() {
        return this.price;
    }           

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
    public Date getValidUntilTime() {
        return this.validUntilTime;
    }           

    public void setValidUntilTime(Date validUntilTime) {
        this.validUntilTime = validUntilTime;
    }
    public String getIOIQltyInd() {
        return this.iOIQltyInd;
    }           

    public void setIOIQltyInd(String iOIQltyInd) {
        this.iOIQltyInd = iOIQltyInd;
    }
    public Boolean getIOINaturalFlag() {
        return this.iOINaturalFlag;
    }           

    public void setIOINaturalFlag(Boolean iOINaturalFlag) {
        this.iOINaturalFlag = iOINaturalFlag;
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
    public Date getTransactTime() {
        return this.transactTime;
    }           

    public void setTransactTime(Date transactTime) {
        this.transactTime = transactTime;
    }
    public String getURLLink() {
        return this.uRLLink;
    }           

    public void setURLLink(String uRLLink) {
        this.uRLLink = uRLLink;
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
    
    public OrderQtyData getOrderQtyData() {
        return this.orderQtyData;
    }           

    public void setOrderQtyData(OrderQtyData orderQtyData) {
        this.orderQtyData = orderQtyData;
    }
    
    public Stipulations getStipulations() {
        return this.stipulations;
    }           

    public void setStipulations(Stipulations stipulations) {
        this.stipulations = stipulations;
    }
    
    public SpreadOrBenchmarkCurveData getSpreadOrBenchmarkCurveData() {
        return this.spreadOrBenchmarkCurveData;
    }           

    public void setSpreadOrBenchmarkCurveData(SpreadOrBenchmarkCurveData spreadOrBenchmarkCurveData) {
        this.spreadOrBenchmarkCurveData = spreadOrBenchmarkCurveData;
    }
    
    public YieldData getYieldData() {
        return this.yieldData;
    }           

    public void setYieldData(YieldData yieldData) {
        this.yieldData = yieldData;
    }

    public IndicationOfInterest.NoUnderlyings getNoUnderlyings() {
        return this.noUnderlyings;
    }

    public void setNoUnderlyings(IndicationOfInterest.NoUnderlyings noUnderlyings) {
        this.noUnderlyings = noUnderlyings;
    }
    public IndicationOfInterest.NoLegs getNoLegs() {
        return this.noLegs;
    }

    public void setNoLegs(IndicationOfInterest.NoLegs noLegs) {
        this.noLegs = noLegs;
    }
    public IndicationOfInterest.NoIOIQualifiers getNoIOIQualifiers() {
        return this.noIOIQualifiers;
    }

    public void setNoIOIQualifiers(IndicationOfInterest.NoIOIQualifiers noIOIQualifiers) {
        this.noIOIQualifiers = noIOIQualifiers;
    }
    public IndicationOfInterest.NoRoutingIDs getNoRoutingIDs() {
        return this.noRoutingIDs;
    }

    public void setNoRoutingIDs(IndicationOfInterest.NoRoutingIDs noRoutingIDs) {
        this.noRoutingIDs = noRoutingIDs;
    }
        

    public static class NoUnderlyings extends FixGroup<IndicationOfInterest.NoUnderlyings.NoUnderlyingsEntry> {

        @Override
        public int getField() {
            return 711;
        }

        public static class NoUnderlyingsEntry {



        }
        
    }


    public static class NoLegs extends FixGroup<IndicationOfInterest.NoLegs.NoLegsEntry> {

        @Override
        public int getField() {
            return 555;
        }

        public static class NoLegsEntry {

            private String legIOIQty;

            public String getLegIOIQty() {
                return this.legIOIQty;
            }           

            public void setLegIOIQty(String legIOIQty) {
                this.legIOIQty = legIOIQty;
            }

        }
        
    }


    public static class NoIOIQualifiers extends FixGroup<IndicationOfInterest.NoIOIQualifiers.NoIOIQualifiersEntry> {

        @Override
        public int getField() {
            return 199;
        }

        public static class NoIOIQualifiersEntry {

            private String iOIQualifier;

            public String getIOIQualifier() {
                return this.iOIQualifier;
            }           

            public void setIOIQualifier(String iOIQualifier) {
                this.iOIQualifier = iOIQualifier;
            }

        }
        
    }


    public static class NoRoutingIDs extends FixGroup<IndicationOfInterest.NoRoutingIDs.NoRoutingIDsEntry> {

        @Override
        public int getField() {
            return 215;
        }

        public static class NoRoutingIDsEntry {

            private Integer routingType;
            private String routingID;

            public Integer getRoutingType() {
                return this.routingType;
            }           

            public void setRoutingType(Integer routingType) {
                this.routingType = routingType;
            }
            public String getRoutingID() {
                return this.routingID;
            }           

            public void setRoutingID(String routingID) {
                this.routingID = routingID;
            }

        }
        
    }

}

