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
public class TrdRegTimestamps implements FixComponent {


    public TrdRegTimestamps() { }


    private TrdRegTimestamps.NoTrdRegTimestamps noTrdRegTimestamps;

    public TrdRegTimestamps.NoTrdRegTimestamps getNoTrdRegTimestamps() {
        return this.noTrdRegTimestamps;
    }

    public void setNoTrdRegTimestamps(TrdRegTimestamps.NoTrdRegTimestamps noTrdRegTimestamps) {
        this.noTrdRegTimestamps = noTrdRegTimestamps;
    }
        

    public static class NoTrdRegTimestamps extends FixGroup<TrdRegTimestamps.NoTrdRegTimestamps.NoTrdRegTimestampsEntry> {

        @Override
        public int getField() {
            return 768;
        }

        public static class NoTrdRegTimestampsEntry {

            private Date trdRegTimestamp;
            private Integer trdRegTimestampType;
            private String trdRegTimestampOrigin;

            public Date getTrdRegTimestamp() {
                return this.trdRegTimestamp;
            }           

            public void setTrdRegTimestamp(Date trdRegTimestamp) {
                this.trdRegTimestamp = trdRegTimestamp;
            }
            public Integer getTrdRegTimestampType() {
                return this.trdRegTimestampType;
            }           

            public void setTrdRegTimestampType(Integer trdRegTimestampType) {
                this.trdRegTimestampType = trdRegTimestampType;
            }
            public String getTrdRegTimestampOrigin() {
                return this.trdRegTimestampOrigin;
            }           

            public void setTrdRegTimestampOrigin(String trdRegTimestampOrigin) {
                this.trdRegTimestampOrigin = trdRegTimestampOrigin;
            }

        }
        
    }

}

