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
public class SettlParties implements FixComponent {


    public SettlParties() { }


    private SettlParties.NoSettlPartyIDs noSettlPartyIDs;

    public SettlParties.NoSettlPartyIDs getNoSettlPartyIDs() {
        return this.noSettlPartyIDs;
    }

    public void setNoSettlPartyIDs(SettlParties.NoSettlPartyIDs noSettlPartyIDs) {
        this.noSettlPartyIDs = noSettlPartyIDs;
    }
        

    public static class NoSettlPartyIDs extends FixGroup<SettlParties.NoSettlPartyIDs.NoSettlPartyIDsEntry> {

        @Override
        public int getField() {
            return 781;
        }

        public static class NoSettlPartyIDsEntry {

            private String settlPartyID;
            private String settlPartyIDSource;
            private Integer settlPartyRole;

            public String getSettlPartyID() {
                return this.settlPartyID;
            }           

            public void setSettlPartyID(String settlPartyID) {
                this.settlPartyID = settlPartyID;
            }
            public String getSettlPartyIDSource() {
                return this.settlPartyIDSource;
            }           

            public void setSettlPartyIDSource(String settlPartyIDSource) {
                this.settlPartyIDSource = settlPartyIDSource;
            }
            public Integer getSettlPartyRole() {
                return this.settlPartyRole;
            }           

            public void setSettlPartyRole(Integer settlPartyRole) {
                this.settlPartyRole = settlPartyRole;
            }

        }
        
    }

}

