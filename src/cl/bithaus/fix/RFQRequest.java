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
public class RFQRequest extends FixBaseMessage {

    private String rFQReqID;           
    private String subscriptionRequestType;           
    private NoRelatedSym noRelatedSym;           

    public RFQRequest() { 
        super("AH", MsgCategory.APP);
    }

    public String getRFQReqID() {
        return this.rFQReqID;
    }           

    public void setRFQReqID(String rFQReqID) {
        this.rFQReqID = rFQReqID;
    }
    public String getSubscriptionRequestType() {
        return this.subscriptionRequestType;
    }           

    public void setSubscriptionRequestType(String subscriptionRequestType) {
        this.subscriptionRequestType = subscriptionRequestType;
    }


    public RFQRequest.NoRelatedSym getNoRelatedSym() {
        return this.noRelatedSym;
    }

    public void setNoRelatedSym(RFQRequest.NoRelatedSym noRelatedSym) {
        this.noRelatedSym = noRelatedSym;
    }
        

    public static class NoRelatedSym extends FixGroup<RFQRequest.NoRelatedSym.NoRelatedSymEntry> {

        @Override
        public int getField() {
            return 146;
        }

        public static class NoRelatedSymEntry {

            private BigDecimal prevClosePx;
            private Integer quoteRequestType;
            private Integer quoteType;
            private String tradingSessionID;
            private String tradingSessionSubID;

            public BigDecimal getPrevClosePx() {
                return this.prevClosePx;
            }           

            public void setPrevClosePx(BigDecimal prevClosePx) {
                this.prevClosePx = prevClosePx;
            }
            public Integer getQuoteRequestType() {
                return this.quoteRequestType;
            }           

            public void setQuoteRequestType(Integer quoteRequestType) {
                this.quoteRequestType = quoteRequestType;
            }
            public Integer getQuoteType() {
                return this.quoteType;
            }           

            public void setQuoteType(Integer quoteType) {
                this.quoteType = quoteType;
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

        }
        
    }

}

