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
public class OIBBestPriceData implements FixComponent {


    public OIBBestPriceData() { }


    private OIBBestPriceData.NoOIBBestPrices noOIBBestPrices;

    public OIBBestPriceData.NoOIBBestPrices getNoOIBBestPrices() {
        return this.noOIBBestPrices;
    }

    public void setNoOIBBestPrices(OIBBestPriceData.NoOIBBestPrices noOIBBestPrices) {
        this.noOIBBestPrices = noOIBBestPrices;
    }
        

    public static class NoOIBBestPrices extends FixGroup<OIBBestPriceData.NoOIBBestPrices.NoOIBBestPricesEntry> {

        @Override
        public int getField() {
            return 10231;
        }

        public static class NoOIBBestPricesEntry {

            private String oIBBestPriceExchange;
            private Date oIBBestPriceTime;
            private BigDecimal oIBBestPriceBuyingQty;
            private BigDecimal oIBBestPriceBuyingPrice;
            private BigDecimal oIBBestPriceSellingQty;
            private BigDecimal oIBBestPriceSellingPrice;

            public String getOIBBestPriceExchange() {
                return this.oIBBestPriceExchange;
            }           

            public void setOIBBestPriceExchange(String oIBBestPriceExchange) {
                this.oIBBestPriceExchange = oIBBestPriceExchange;
            }
            public Date getOIBBestPriceTime() {
                return this.oIBBestPriceTime;
            }           

            public void setOIBBestPriceTime(Date oIBBestPriceTime) {
                this.oIBBestPriceTime = oIBBestPriceTime;
            }
            public BigDecimal getOIBBestPriceBuyingQty() {
                return this.oIBBestPriceBuyingQty;
            }           

            public void setOIBBestPriceBuyingQty(BigDecimal oIBBestPriceBuyingQty) {
                this.oIBBestPriceBuyingQty = oIBBestPriceBuyingQty;
            }
            public BigDecimal getOIBBestPriceBuyingPrice() {
                return this.oIBBestPriceBuyingPrice;
            }           

            public void setOIBBestPriceBuyingPrice(BigDecimal oIBBestPriceBuyingPrice) {
                this.oIBBestPriceBuyingPrice = oIBBestPriceBuyingPrice;
            }
            public BigDecimal getOIBBestPriceSellingQty() {
                return this.oIBBestPriceSellingQty;
            }           

            public void setOIBBestPriceSellingQty(BigDecimal oIBBestPriceSellingQty) {
                this.oIBBestPriceSellingQty = oIBBestPriceSellingQty;
            }
            public BigDecimal getOIBBestPriceSellingPrice() {
                return this.oIBBestPriceSellingPrice;
            }           

            public void setOIBBestPriceSellingPrice(BigDecimal oIBBestPriceSellingPrice) {
                this.oIBBestPriceSellingPrice = oIBBestPriceSellingPrice;
            }

        }
        
    }

}

