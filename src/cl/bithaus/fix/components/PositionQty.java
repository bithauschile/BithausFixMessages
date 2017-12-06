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
public class PositionQty implements FixComponent {


    public PositionQty() { }


    private PositionQty.NoPositions noPositions;

    public PositionQty.NoPositions getNoPositions() {
        return this.noPositions;
    }

    public void setNoPositions(PositionQty.NoPositions noPositions) {
        this.noPositions = noPositions;
    }
        

    public static class NoPositions extends FixGroup<PositionQty.NoPositions.NoPositionsEntry> {

        @Override
        public int getField() {
            return 702;
        }

        public static class NoPositionsEntry {

            private String posType;
            private BigDecimal longQty;
            private BigDecimal shortQty;
            private Integer posQtyStatus;

            public String getPosType() {
                return this.posType;
            }           

            public void setPosType(String posType) {
                this.posType = posType;
            }
            public BigDecimal getLongQty() {
                return this.longQty;
            }           

            public void setLongQty(BigDecimal longQty) {
                this.longQty = longQty;
            }
            public BigDecimal getShortQty() {
                return this.shortQty;
            }           

            public void setShortQty(BigDecimal shortQty) {
                this.shortQty = shortQty;
            }
            public Integer getPosQtyStatus() {
                return this.posQtyStatus;
            }           

            public void setPosQtyStatus(Integer posQtyStatus) {
                this.posQtyStatus = posQtyStatus;
            }

        }
        
    }

}

