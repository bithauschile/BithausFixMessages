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
public class Parties implements FixComponent {


    public Parties() { }


    private Parties.NoPartyIDs noPartyIDs;

    public Parties.NoPartyIDs getNoPartyIDs() {
        return this.noPartyIDs;
    }

    public void setNoPartyIDs(Parties.NoPartyIDs noPartyIDs) {
        this.noPartyIDs = noPartyIDs;
    }
        

    public static class NoPartyIDs extends FixGroup<Parties.NoPartyIDs.NoPartyIDsEntry> {

        @Override
        public int getField() {
            return 453;
        }

        public static class NoPartyIDsEntry {

            private String partyID;
            private String partyIDSource;
            private Integer partyRole;

            public String getPartyID() {
                return this.partyID;
            }           

            public void setPartyID(String partyID) {
                this.partyID = partyID;
            }
            public String getPartyIDSource() {
                return this.partyIDSource;
            }           

            public void setPartyIDSource(String partyIDSource) {
                this.partyIDSource = partyIDSource;
            }
            public Integer getPartyRole() {
                return this.partyRole;
            }           

            public void setPartyRole(Integer partyRole) {
                this.partyRole = partyRole;
            }

        }
        
    }

}

