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
public class NestedParties3 implements FixComponent {


    public NestedParties3() { }


    private NestedParties3.NoNested3PartyIDs noNested3PartyIDs;

    public NestedParties3.NoNested3PartyIDs getNoNested3PartyIDs() {
        return this.noNested3PartyIDs;
    }

    public void setNoNested3PartyIDs(NestedParties3.NoNested3PartyIDs noNested3PartyIDs) {
        this.noNested3PartyIDs = noNested3PartyIDs;
    }
        

    public static class NoNested3PartyIDs extends FixGroup<NestedParties3.NoNested3PartyIDs.NoNested3PartyIDsEntry> {

        @Override
        public int getField() {
            return 948;
        }

        public static class NoNested3PartyIDsEntry {

            private String nested3PartyID;
            private String nested3PartyIDSource;
            private Integer nested3PartyRole;

            public String getNested3PartyID() {
                return this.nested3PartyID;
            }           

            public void setNested3PartyID(String nested3PartyID) {
                this.nested3PartyID = nested3PartyID;
            }
            public String getNested3PartyIDSource() {
                return this.nested3PartyIDSource;
            }           

            public void setNested3PartyIDSource(String nested3PartyIDSource) {
                this.nested3PartyIDSource = nested3PartyIDSource;
            }
            public Integer getNested3PartyRole() {
                return this.nested3PartyRole;
            }           

            public void setNested3PartyRole(Integer nested3PartyRole) {
                this.nested3PartyRole = nested3PartyRole;
            }

        }
        
    }

}

