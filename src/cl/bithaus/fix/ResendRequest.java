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
public class ResendRequest extends FixBaseMessage {

    private Integer beginSeqNo;           
    private Integer endSeqNo;           

    public ResendRequest() { 
        super("2", MsgCategory.ADMIN);
    }

    public Integer getBeginSeqNo() {
        return this.beginSeqNo;
    }           

    public void setBeginSeqNo(Integer beginSeqNo) {
        this.beginSeqNo = beginSeqNo;
    }
    public Integer getEndSeqNo() {
        return this.endSeqNo;
    }           

    public void setEndSeqNo(Integer endSeqNo) {
        this.endSeqNo = endSeqNo;
    }


        
}

