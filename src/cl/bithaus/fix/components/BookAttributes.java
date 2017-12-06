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
public class BookAttributes implements FixComponent {

    private String settlType;           
    private String cross;           
    private Integer crossType;           
    private String roundLotBook;           
    private BigDecimal orderQty;           

    public BookAttributes() { }

    public String getSettlType() {
        return this.settlType;
    }           

    public void setSettlType(String settlType) {
        this.settlType = settlType;
    }
    public String getCross() {
        return this.cross;
    }           

    public void setCross(String cross) {
        this.cross = cross;
    }
    public Integer getCrossType() {
        return this.crossType;
    }           

    public void setCrossType(Integer crossType) {
        this.crossType = crossType;
    }
    public String getRoundLotBook() {
        return this.roundLotBook;
    }           

    public void setRoundLotBook(String roundLotBook) {
        this.roundLotBook = roundLotBook;
    }
    public BigDecimal getOrderQty() {
        return this.orderQty;
    }           

    public void setOrderQty(BigDecimal orderQty) {
        this.orderQty = orderQty;
    }


        
}

