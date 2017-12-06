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
public class NestedParties2 implements FixComponent {


    public NestedParties2() { }


    private NestedParties2.NoNested2PartyIDs noNested2PartyIDs;

    public NestedParties2.NoNested2PartyIDs getNoNested2PartyIDs() {
        return this.noNested2PartyIDs;
    }

    public void setNoNested2PartyIDs(NestedParties2.NoNested2PartyIDs noNested2PartyIDs) {
        this.noNested2PartyIDs = noNested2PartyIDs;
    }
        

    public static class NoNested2PartyIDs extends FixGroup<NestedParties2.NoNested2PartyIDs.NoNested2PartyIDsEntry> {

        @Override
        public int getField() {
            return 756;
        }

        public static class NoNested2PartyIDsEntry {

            private String nested2PartyID;
            private String nested2PartyIDSource;
            private Integer nested2PartyRole;

            public String getNested2PartyID() {
                return this.nested2PartyID;
            }           

            public void setNested2PartyID(String nested2PartyID) {
                this.nested2PartyID = nested2PartyID;
            }
            public String getNested2PartyIDSource() {
                return this.nested2PartyIDSource;
            }           

            public void setNested2PartyIDSource(String nested2PartyIDSource) {
                this.nested2PartyIDSource = nested2PartyIDSource;
            }
            public Integer getNested2PartyRole() {
                return this.nested2PartyRole;
            }           

            public void setNested2PartyRole(Integer nested2PartyRole) {
                this.nested2PartyRole = nested2PartyRole;
            }

        }
        
    }

}

