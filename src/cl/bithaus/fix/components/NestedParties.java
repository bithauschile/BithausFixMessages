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
public class NestedParties implements FixComponent {


    public NestedParties() { }


    private NestedParties.NoNestedPartyIDs noNestedPartyIDs;

    public NestedParties.NoNestedPartyIDs getNoNestedPartyIDs() {
        return this.noNestedPartyIDs;
    }

    public void setNoNestedPartyIDs(NestedParties.NoNestedPartyIDs noNestedPartyIDs) {
        this.noNestedPartyIDs = noNestedPartyIDs;
    }
        

    public static class NoNestedPartyIDs extends FixGroup<NestedParties.NoNestedPartyIDs.NoNestedPartyIDsEntry> {

        @Override
        public int getField() {
            return 539;
        }

        public static class NoNestedPartyIDsEntry {

            private String nestedPartyID;
            private String nestedPartyIDSource;
            private Integer nestedPartyRole;

            public String getNestedPartyID() {
                return this.nestedPartyID;
            }           

            public void setNestedPartyID(String nestedPartyID) {
                this.nestedPartyID = nestedPartyID;
            }
            public String getNestedPartyIDSource() {
                return this.nestedPartyIDSource;
            }           

            public void setNestedPartyIDSource(String nestedPartyIDSource) {
                this.nestedPartyIDSource = nestedPartyIDSource;
            }
            public Integer getNestedPartyRole() {
                return this.nestedPartyRole;
            }           

            public void setNestedPartyRole(Integer nestedPartyRole) {
                this.nestedPartyRole = nestedPartyRole;
            }

        }
        
    }

}

