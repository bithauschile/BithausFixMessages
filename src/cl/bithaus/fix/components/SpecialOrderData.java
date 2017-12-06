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
public class SpecialOrderData implements FixComponent {

    private String specialOrderType;           
    private Integer numberOfOrders;           
    private Integer orderNumber;           

    public SpecialOrderData() { }

    public String getSpecialOrderType() {
        return this.specialOrderType;
    }           

    public void setSpecialOrderType(String specialOrderType) {
        this.specialOrderType = specialOrderType;
    }
    public Integer getNumberOfOrders() {
        return this.numberOfOrders;
    }           

    public void setNumberOfOrders(Integer numberOfOrders) {
        this.numberOfOrders = numberOfOrders;
    }
    public Integer getOrderNumber() {
        return this.orderNumber;
    }           

    public void setOrderNumber(Integer orderNumber) {
        this.orderNumber = orderNumber;
    }

    private SpecialOrderData.NoSpecialOrderData noSpecialOrderData;

    public SpecialOrderData.NoSpecialOrderData getNoSpecialOrderData() {
        return this.noSpecialOrderData;
    }

    public void setNoSpecialOrderData(SpecialOrderData.NoSpecialOrderData noSpecialOrderData) {
        this.noSpecialOrderData = noSpecialOrderData;
    }
        

    public static class NoSpecialOrderData extends FixGroup<SpecialOrderData.NoSpecialOrderData.NoSpecialOrderDataEntry> {

        @Override
        public int getField() {
            return 10131;
        }

        public static class NoSpecialOrderDataEntry {

            private String specialOrderDataTypeID;
            private String specialOrderDataValue;

            public String getSpecialOrderDataTypeID() {
                return this.specialOrderDataTypeID;
            }           

            public void setSpecialOrderDataTypeID(String specialOrderDataTypeID) {
                this.specialOrderDataTypeID = specialOrderDataTypeID;
            }
            public String getSpecialOrderDataValue() {
                return this.specialOrderDataValue;
            }           

            public void setSpecialOrderDataValue(String specialOrderDataValue) {
                this.specialOrderDataValue = specialOrderDataValue;
            }

        }
        
    }

}

