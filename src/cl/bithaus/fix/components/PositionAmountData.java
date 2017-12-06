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
public class PositionAmountData implements FixComponent {


    public PositionAmountData() { }


    private PositionAmountData.NoPosAmt noPosAmt;

    public PositionAmountData.NoPosAmt getNoPosAmt() {
        return this.noPosAmt;
    }

    public void setNoPosAmt(PositionAmountData.NoPosAmt noPosAmt) {
        this.noPosAmt = noPosAmt;
    }
        

    public static class NoPosAmt extends FixGroup<PositionAmountData.NoPosAmt.NoPosAmtEntry> {

        @Override
        public int getField() {
            return 753;
        }

        public static class NoPosAmtEntry {

            private String posAmtType;
            private BigDecimal posAmt;

            public String getPosAmtType() {
                return this.posAmtType;
            }           

            public void setPosAmtType(String posAmtType) {
                this.posAmtType = posAmtType;
            }
            public BigDecimal getPosAmt() {
                return this.posAmt;
            }           

            public void setPosAmt(BigDecimal posAmt) {
                this.posAmt = posAmt;
            }

        }
        
    }

}

