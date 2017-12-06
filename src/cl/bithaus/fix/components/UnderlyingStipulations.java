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
public class UnderlyingStipulations implements FixComponent {


    public UnderlyingStipulations() { }


    private UnderlyingStipulations.NoUnderlyingStips noUnderlyingStips;

    public UnderlyingStipulations.NoUnderlyingStips getNoUnderlyingStips() {
        return this.noUnderlyingStips;
    }

    public void setNoUnderlyingStips(UnderlyingStipulations.NoUnderlyingStips noUnderlyingStips) {
        this.noUnderlyingStips = noUnderlyingStips;
    }
        

    public static class NoUnderlyingStips extends FixGroup<UnderlyingStipulations.NoUnderlyingStips.NoUnderlyingStipsEntry> {

        @Override
        public int getField() {
            return 887;
        }

        public static class NoUnderlyingStipsEntry {

            private String underlyingStipType;
            private String underlyingStipValue;

            public String getUnderlyingStipType() {
                return this.underlyingStipType;
            }           

            public void setUnderlyingStipType(String underlyingStipType) {
                this.underlyingStipType = underlyingStipType;
            }
            public String getUnderlyingStipValue() {
                return this.underlyingStipValue;
            }           

            public void setUnderlyingStipValue(String underlyingStipValue) {
                this.underlyingStipValue = underlyingStipValue;
            }

        }
        
    }

}

