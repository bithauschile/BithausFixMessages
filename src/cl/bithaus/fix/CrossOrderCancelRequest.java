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
public class CrossOrderCancelRequest extends FixBaseMessage {

    private String orderID;           
    private String crossID;           
    private String origCrossID;           
    private Integer crossType;           
    private Integer crossPrioritization;           
    private Date transactTime;           
    private String exDestination;           
    private Instrument instrument;           
    private NoSides noSides;           
    private NoUnderlyings noUnderlyings;           
    private NoLegs noLegs;           

    public CrossOrderCancelRequest() { 
        super("u", MsgCategory.APP);
    }

    public String getOrderID() {
        return this.orderID;
    }           

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }
    public String getCrossID() {
        return this.crossID;
    }           

    public void setCrossID(String crossID) {
        this.crossID = crossID;
    }
    public String getOrigCrossID() {
        return this.origCrossID;
    }           

    public void setOrigCrossID(String origCrossID) {
        this.origCrossID = origCrossID;
    }
    public Integer getCrossType() {
        return this.crossType;
    }           

    public void setCrossType(Integer crossType) {
        this.crossType = crossType;
    }
    public Integer getCrossPrioritization() {
        return this.crossPrioritization;
    }           

    public void setCrossPrioritization(Integer crossPrioritization) {
        this.crossPrioritization = crossPrioritization;
    }
    public Date getTransactTime() {
        return this.transactTime;
    }           

    public void setTransactTime(Date transactTime) {
        this.transactTime = transactTime;
    }
    public String getExDestination() {
        return this.exDestination;
    }           

    public void setExDestination(String exDestination) {
        this.exDestination = exDestination;
    }

    
    public Instrument getInstrument() {
        return this.instrument;
    }           

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }

    public CrossOrderCancelRequest.NoSides getNoSides() {
        return this.noSides;
    }

    public void setNoSides(CrossOrderCancelRequest.NoSides noSides) {
        this.noSides = noSides;
    }
    public CrossOrderCancelRequest.NoUnderlyings getNoUnderlyings() {
        return this.noUnderlyings;
    }

    public void setNoUnderlyings(CrossOrderCancelRequest.NoUnderlyings noUnderlyings) {
        this.noUnderlyings = noUnderlyings;
    }
    public CrossOrderCancelRequest.NoLegs getNoLegs() {
        return this.noLegs;
    }

    public void setNoLegs(CrossOrderCancelRequest.NoLegs noLegs) {
        this.noLegs = noLegs;
    }
        

    public static class NoSides extends FixGroup<CrossOrderCancelRequest.NoSides.NoSidesEntry> {

        @Override
        public int getField() {
            return 552;
        }

        public static class NoSidesEntry {

            private String side;
            private String origClOrdID;
            private String clOrdID;
            private String secondaryClOrdID;
            private String clOrdLinkID;
            private Date origOrdModTime;
            private String tradeOriginationDate;
            private String tradeDate;
            private String complianceID;
            private String text;
            private Integer encodedTextLen;
            private String encodedText;

            public String getSide() {
                return this.side;
            }           

            public void setSide(String side) {
                this.side = side;
            }
            public String getOrigClOrdID() {
                return this.origClOrdID;
            }           

            public void setOrigClOrdID(String origClOrdID) {
                this.origClOrdID = origClOrdID;
            }
            public String getClOrdID() {
                return this.clOrdID;
            }           

            public void setClOrdID(String clOrdID) {
                this.clOrdID = clOrdID;
            }
            public String getSecondaryClOrdID() {
                return this.secondaryClOrdID;
            }           

            public void setSecondaryClOrdID(String secondaryClOrdID) {
                this.secondaryClOrdID = secondaryClOrdID;
            }
            public String getClOrdLinkID() {
                return this.clOrdLinkID;
            }           

            public void setClOrdLinkID(String clOrdLinkID) {
                this.clOrdLinkID = clOrdLinkID;
            }
            public Date getOrigOrdModTime() {
                return this.origOrdModTime;
            }           

            public void setOrigOrdModTime(Date origOrdModTime) {
                this.origOrdModTime = origOrdModTime;
            }
            public String getTradeOriginationDate() {
                return this.tradeOriginationDate;
            }           

            public void setTradeOriginationDate(String tradeOriginationDate) {
                this.tradeOriginationDate = tradeOriginationDate;
            }
            public String getTradeDate() {
                return this.tradeDate;
            }           

            public void setTradeDate(String tradeDate) {
                this.tradeDate = tradeDate;
            }
            public String getComplianceID() {
                return this.complianceID;
            }           

            public void setComplianceID(String complianceID) {
                this.complianceID = complianceID;
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

        }
        
    }


    public static class NoUnderlyings extends FixGroup<CrossOrderCancelRequest.NoUnderlyings.NoUnderlyingsEntry> {

        @Override
        public int getField() {
            return 711;
        }

        public static class NoUnderlyingsEntry {



        }
        
    }


    public static class NoLegs extends FixGroup<CrossOrderCancelRequest.NoLegs.NoLegsEntry> {

        @Override
        public int getField() {
            return 555;
        }

        public static class NoLegsEntry {



        }
        
    }

}

