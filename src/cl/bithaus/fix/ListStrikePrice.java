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

/**
 * Fix Components Class
 * Generated for FIX 4.4
 * @author Bithaus Fix Message Generator
 */
public class ListStrikePrice extends FixBaseMessage {

    private String listID;           
    private Integer totNoStrikes;           
    private Boolean lastFragment;           
    private NoStrikes noStrikes;           
    private NoUnderlyings noUnderlyings;           

    public ListStrikePrice() { 
        super("m", MsgCategory.APP);
    }

    public String getListID() {
        return this.listID;
    }           

    public void setListID(String listID) {
        this.listID = listID;
    }
    public Integer getTotNoStrikes() {
        return this.totNoStrikes;
    }           

    public void setTotNoStrikes(Integer totNoStrikes) {
        this.totNoStrikes = totNoStrikes;
    }
    public Boolean getLastFragment() {
        return this.lastFragment;
    }           

    public void setLastFragment(Boolean lastFragment) {
        this.lastFragment = lastFragment;
    }


    public ListStrikePrice.NoStrikes getNoStrikes() {
        return this.noStrikes;
    }

    public void setNoStrikes(ListStrikePrice.NoStrikes noStrikes) {
        this.noStrikes = noStrikes;
    }
    public ListStrikePrice.NoUnderlyings getNoUnderlyings() {
        return this.noUnderlyings;
    }

    public void setNoUnderlyings(ListStrikePrice.NoUnderlyings noUnderlyings) {
        this.noUnderlyings = noUnderlyings;
    }
        

    public static class NoStrikes extends FixGroup<ListStrikePrice.NoStrikes.NoStrikesEntry> {

        @Override
        public int getField() {
            return 428;
        }

        public static class NoStrikesEntry {



        }
        
    }


    public static class NoUnderlyings extends FixGroup<ListStrikePrice.NoUnderlyings.NoUnderlyingsEntry> {

        @Override
        public int getField() {
            return 711;
        }

        public static class NoUnderlyingsEntry {

            private BigDecimal prevClosePx;
            private String clOrdID;
            private String secondaryClOrdID;
            private String side;
            private BigDecimal price;
            private String currency;
            private String text;
            private Integer encodedTextLen;
            private String encodedText;

            public BigDecimal getPrevClosePx() {
                return this.prevClosePx;
            }           

            public void setPrevClosePx(BigDecimal prevClosePx) {
                this.prevClosePx = prevClosePx;
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
            public String getCurrency() {
                return this.currency;
            }           

            public void setCurrency(String currency) {
                this.currency = currency;
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

}

