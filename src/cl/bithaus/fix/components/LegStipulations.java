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
public class LegStipulations implements FixComponent {


    public LegStipulations() { }


    private LegStipulations.NoLegStipulations noLegStipulations;

    public LegStipulations.NoLegStipulations getNoLegStipulations() {
        return this.noLegStipulations;
    }

    public void setNoLegStipulations(LegStipulations.NoLegStipulations noLegStipulations) {
        this.noLegStipulations = noLegStipulations;
    }
        

    public static class NoLegStipulations extends FixGroup<LegStipulations.NoLegStipulations.NoLegStipulationsEntry> {

        @Override
        public int getField() {
            return 683;
        }

        public static class NoLegStipulationsEntry {

            private String legStipulationType;
            private String legStipulationValue;

            public String getLegStipulationType() {
                return this.legStipulationType;
            }           

            public void setLegStipulationType(String legStipulationType) {
                this.legStipulationType = legStipulationType;
            }
            public String getLegStipulationValue() {
                return this.legStipulationValue;
            }           

            public void setLegStipulationValue(String legStipulationValue) {
                this.legStipulationValue = legStipulationValue;
            }

        }
        
    }

}

