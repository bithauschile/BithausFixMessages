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
public class TradeParties implements FixComponent {


    public TradeParties() { }


    private TradeParties.NoSides noSides;

    public TradeParties.NoSides getNoSides() {
        return this.noSides;
    }

    public void setNoSides(TradeParties.NoSides noSides) {
        this.noSides = noSides;
    }
        

    public static class NoSides extends FixGroup<TradeParties.NoSides.NoSidesEntry> {

        @Override
        public int getField() {
            return 552;
        }

        public static class NoSidesEntry {

            private String side;
            private String enteringFirm;
            private String executingFirm;
            private String enteringTrader;
            private String fundManager;

            public String getSide() {
                return this.side;
            }           

            public void setSide(String side) {
                this.side = side;
            }
            public String getEnteringFirm() {
                return this.enteringFirm;
            }           

            public void setEnteringFirm(String enteringFirm) {
                this.enteringFirm = enteringFirm;
            }
            public String getExecutingFirm() {
                return this.executingFirm;
            }           

            public void setExecutingFirm(String executingFirm) {
                this.executingFirm = executingFirm;
            }
            public String getEnteringTrader() {
                return this.enteringTrader;
            }           

            public void setEnteringTrader(String enteringTrader) {
                this.enteringTrader = enteringTrader;
            }
            public String getFundManager() {
                return this.fundManager;
            }           

            public void setFundManager(String fundManager) {
                this.fundManager = fundManager;
            }

        }
        
    }

}

