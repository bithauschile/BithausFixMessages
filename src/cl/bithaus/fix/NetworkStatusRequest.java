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

package cl.bithaus.fix;

import cl.bithaus.fix.msg.base.FixGroup;
import java.util.Date;
import java.math.BigDecimal;

/**
 * Fix Components Class
 * Generated for FIX 4.4
 * @author Bithaus Fix Message Generator
 */
public class NetworkStatusRequest extends FixBaseMessage {

    private Integer networkRequestType;           
    private String networkRequestID;           
    private NoCompIDs noCompIDs;           

    public NetworkStatusRequest() { 
        super("BC", MsgCategory.APP);
    }

    public Integer getNetworkRequestType() {
        return this.networkRequestType;
    }           

    public void setNetworkRequestType(Integer networkRequestType) {
        this.networkRequestType = networkRequestType;
    }
    public String getNetworkRequestID() {
        return this.networkRequestID;
    }           

    public void setNetworkRequestID(String networkRequestID) {
        this.networkRequestID = networkRequestID;
    }


    public NetworkStatusRequest.NoCompIDs getNoCompIDs() {
        return this.noCompIDs;
    }

    public void setNoCompIDs(NetworkStatusRequest.NoCompIDs noCompIDs) {
        this.noCompIDs = noCompIDs;
    }
        

    public static class NoCompIDs extends FixGroup<NetworkStatusRequest.NoCompIDs.NoCompIDsEntry> {

        @Override
        public int getField() {
            return 936;
        }

        public static class NoCompIDsEntry {

            private String refCompID;
            private String refSubID;
            private String locationID;
            private String deskID;

            public String getRefCompID() {
                return this.refCompID;
            }           

            public void setRefCompID(String refCompID) {
                this.refCompID = refCompID;
            }
            public String getRefSubID() {
                return this.refSubID;
            }           

            public void setRefSubID(String refSubID) {
                this.refSubID = refSubID;
            }
            public String getLocationID() {
                return this.locationID;
            }           

            public void setLocationID(String locationID) {
                this.locationID = locationID;
            }
            public String getDeskID() {
                return this.deskID;
            }           

            public void setDeskID(String deskID) {
                this.deskID = deskID;
            }

        }
        
    }

}

