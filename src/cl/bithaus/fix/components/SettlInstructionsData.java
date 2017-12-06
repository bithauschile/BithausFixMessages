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
public class SettlInstructionsData implements FixComponent {

    private Integer settlDeliveryType;           
    private Integer standInstDbType;           
    private String standInstDbName;           
    private String standInstDbID;           

    public SettlInstructionsData() { }

    public Integer getSettlDeliveryType() {
        return this.settlDeliveryType;
    }           

    public void setSettlDeliveryType(Integer settlDeliveryType) {
        this.settlDeliveryType = settlDeliveryType;
    }
    public Integer getStandInstDbType() {
        return this.standInstDbType;
    }           

    public void setStandInstDbType(Integer standInstDbType) {
        this.standInstDbType = standInstDbType;
    }
    public String getStandInstDbName() {
        return this.standInstDbName;
    }           

    public void setStandInstDbName(String standInstDbName) {
        this.standInstDbName = standInstDbName;
    }
    public String getStandInstDbID() {
        return this.standInstDbID;
    }           

    public void setStandInstDbID(String standInstDbID) {
        this.standInstDbID = standInstDbID;
    }

    private SettlInstructionsData.NoDlvyInst noDlvyInst;

    public SettlInstructionsData.NoDlvyInst getNoDlvyInst() {
        return this.noDlvyInst;
    }

    public void setNoDlvyInst(SettlInstructionsData.NoDlvyInst noDlvyInst) {
        this.noDlvyInst = noDlvyInst;
    }
        

    public static class NoDlvyInst extends FixGroup<SettlInstructionsData.NoDlvyInst.NoDlvyInstEntry> {

        @Override
        public int getField() {
            return 85;
        }

        public static class NoDlvyInstEntry {

            private String settlInstSource;
            private String dlvyInstType;

            public String getSettlInstSource() {
                return this.settlInstSource;
            }           

            public void setSettlInstSource(String settlInstSource) {
                this.settlInstSource = settlInstSource;
            }
            public String getDlvyInstType() {
                return this.dlvyInstType;
            }           

            public void setDlvyInstType(String dlvyInstType) {
                this.dlvyInstType = dlvyInstType;
            }

        }
        
    }

}

