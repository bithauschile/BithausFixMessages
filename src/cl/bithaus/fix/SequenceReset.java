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
public class SequenceReset extends FixBaseMessage {

    private Boolean gapFillFlag;           
    private Integer newSeqNo;           

    public SequenceReset() { 
        super("4", MsgCategory.ADMIN);
    }

    public Boolean getGapFillFlag() {
        return this.gapFillFlag;
    }           

    public void setGapFillFlag(Boolean gapFillFlag) {
        this.gapFillFlag = gapFillFlag;
    }
    public Integer getNewSeqNo() {
        return this.newSeqNo;
    }           

    public void setNewSeqNo(Integer newSeqNo) {
        this.newSeqNo = newSeqNo;
    }


        
}

