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
public class Stipulations implements FixComponent {


    public Stipulations() { }


    private Stipulations.NoStipulations noStipulations;

    public Stipulations.NoStipulations getNoStipulations() {
        return this.noStipulations;
    }

    public void setNoStipulations(Stipulations.NoStipulations noStipulations) {
        this.noStipulations = noStipulations;
    }
        

    public static class NoStipulations extends FixGroup<Stipulations.NoStipulations.NoStipulationsEntry> {

        @Override
        public int getField() {
            return 232;
        }

        public static class NoStipulationsEntry {

            private String stipulationType;
            private String stipulationValue;

            public String getStipulationType() {
                return this.stipulationType;
            }           

            public void setStipulationType(String stipulationType) {
                this.stipulationType = stipulationType;
            }
            public String getStipulationValue() {
                return this.stipulationValue;
            }           

            public void setStipulationValue(String stipulationValue) {
                this.stipulationValue = stipulationValue;
            }

        }
        
    }

}

