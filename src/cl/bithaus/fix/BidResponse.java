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
public class BidResponse extends FixBaseMessage {

    private String bidID;           
    private String clientBidID;           
    private NoBidComponents noBidComponents;           

    public BidResponse() { 
        super("l", MsgCategory.APP);
    }

    public String getBidID() {
        return this.bidID;
    }           

    public void setBidID(String bidID) {
        this.bidID = bidID;
    }
    public String getClientBidID() {
        return this.clientBidID;
    }           

    public void setClientBidID(String clientBidID) {
        this.clientBidID = clientBidID;
    }


    public BidResponse.NoBidComponents getNoBidComponents() {
        return this.noBidComponents;
    }

    public void setNoBidComponents(BidResponse.NoBidComponents noBidComponents) {
        this.noBidComponents = noBidComponents;
    }
        

    public static class NoBidComponents extends FixGroup<BidResponse.NoBidComponents.NoBidComponentsEntry> {

        @Override
        public int getField() {
            return 420;
        }

        public static class NoBidComponentsEntry {

            private String listID;
            private String country;
            private String side;
            private BigDecimal price;
            private Integer priceType;
            private BigDecimal fairValue;
            private Integer netGrossInd;
            private String settlType;
            private String settlDate;
            private String tradingSessionID;
            private String tradingSessionSubID;
            private String text;
            private Integer encodedTextLen;
            private String encodedText;

            public String getListID() {
                return this.listID;
            }           

            public void setListID(String listID) {
                this.listID = listID;
            }
            public String getCountry() {
                return this.country;
            }           

            public void setCountry(String country) {
                this.country = country;
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
            public BigDecimal getFairValue() {
                return this.fairValue;
            }           

            public void setFairValue(BigDecimal fairValue) {
                this.fairValue = fairValue;
            }
            public Integer getNetGrossInd() {
                return this.netGrossInd;
            }           

            public void setNetGrossInd(Integer netGrossInd) {
                this.netGrossInd = netGrossInd;
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

