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
public class InstrumentExtension implements FixComponent {

    private Integer deliveryForm;           
    private BigDecimal pctAtRisk;           

    public InstrumentExtension() { }

    public Integer getDeliveryForm() {
        return this.deliveryForm;
    }           

    public void setDeliveryForm(Integer deliveryForm) {
        this.deliveryForm = deliveryForm;
    }
    public BigDecimal getPctAtRisk() {
        return this.pctAtRisk;
    }           

    public void setPctAtRisk(BigDecimal pctAtRisk) {
        this.pctAtRisk = pctAtRisk;
    }

    private InstrumentExtension.NoInstrAttrib noInstrAttrib;

    public InstrumentExtension.NoInstrAttrib getNoInstrAttrib() {
        return this.noInstrAttrib;
    }

    public void setNoInstrAttrib(InstrumentExtension.NoInstrAttrib noInstrAttrib) {
        this.noInstrAttrib = noInstrAttrib;
    }
        

    public static class NoInstrAttrib extends FixGroup<InstrumentExtension.NoInstrAttrib.NoInstrAttribEntry> {

        @Override
        public int getField() {
            return 870;
        }

        public static class NoInstrAttribEntry {

            private Integer instrAttribType;
            private String instrAttribValue;

            public Integer getInstrAttribType() {
                return this.instrAttribType;
            }           

            public void setInstrAttribType(Integer instrAttribType) {
                this.instrAttribType = instrAttribType;
            }
            public String getInstrAttribValue() {
                return this.instrAttribValue;
            }           

            public void setInstrAttribValue(String instrAttribValue) {
                this.instrAttribValue = instrAttribValue;
            }

        }
        
    }

}

