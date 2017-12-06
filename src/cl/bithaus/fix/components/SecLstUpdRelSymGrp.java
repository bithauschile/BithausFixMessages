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
public class SecLstUpdRelSymGrp implements FixComponent {


    public SecLstUpdRelSymGrp() { }


    private SecLstUpdRelSymGrp.NoRelatedSym noRelatedSym;

    public SecLstUpdRelSymGrp.NoRelatedSym getNoRelatedSym() {
        return this.noRelatedSym;
    }

    public void setNoRelatedSym(SecLstUpdRelSymGrp.NoRelatedSym noRelatedSym) {
        this.noRelatedSym = noRelatedSym;
    }
        

    public static class NoRelatedSym extends FixGroup<SecLstUpdRelSymGrp.NoRelatedSym.NoRelatedSymEntry> {

        @Override
        public int getField() {
            return 146;
        }

        public static class NoRelatedSymEntry {

            private String text;
            private Integer encodedTextLen;
            private String encodedText;
            private String currency;
            private String listUpdateAction;
            private Date relSymTransactTime;

            public String getText() {
                return this.text;
            }           

            public void setText(String text) {
                this.text = text;
            }
            public Integer getEncodedTextLen() {
                return this.encodedTextLen;
            }           

            public void setEncodedTextLen(Integer encodedTextLen) {
                this.encodedTextLen = encodedTextLen;
            }
            public String getEncodedText() {
                return this.encodedText;
            }           

            public void setEncodedText(String encodedText) {
                this.encodedText = encodedText;
            }
            public String getCurrency() {
                return this.currency;
            }           

            public void setCurrency(String currency) {
                this.currency = currency;
            }
            public String getListUpdateAction() {
                return this.listUpdateAction;
            }           

            public void setListUpdateAction(String listUpdateAction) {
                this.listUpdateAction = listUpdateAction;
            }
            public Date getRelSymTransactTime() {
                return this.relSymTransactTime;
            }           

            public void setRelSymTransactTime(Date relSymTransactTime) {
                this.relSymTransactTime = relSymTransactTime;
            }

        }
        
    }

}

