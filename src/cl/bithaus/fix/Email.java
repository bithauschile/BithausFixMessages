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
public class Email extends FixBaseMessage {

    private String emailThreadID;           
    private String emailType;           
    private Date origTime;           
    private String subject;           
    private Integer encodedSubjectLen;           
    private String encodedSubject;           
    private String orderID;           
    private String clOrdID;           
    private Integer rawDataLength;           
    private String rawData;           
    private String newsSourceSystem;           
    private NoRoutingIDs noRoutingIDs;           
    private NoRelatedSym noRelatedSym;           
    private NoUnderlyings noUnderlyings;           
    private NoLegs noLegs;           
    private LinesOfText linesOfText;           

    public Email() { 
        super("C", MsgCategory.APP);
    }

    public String getEmailThreadID() {
        return this.emailThreadID;
    }           

    public void setEmailThreadID(String emailThreadID) {
        this.emailThreadID = emailThreadID;
    }
    public String getEmailType() {
        return this.emailType;
    }           

    public void setEmailType(String emailType) {
        this.emailType = emailType;
    }
    public Date getOrigTime() {
        return this.origTime;
    }           

    public void setOrigTime(Date origTime) {
        this.origTime = origTime;
    }
    public String getSubject() {
        return this.subject;
    }           

    public void setSubject(String subject) {
        this.subject = subject;
    }
    public Integer getEncodedSubjectLen() {
        return this.encodedSubjectLen;
    }           

    public void setEncodedSubjectLen(Integer encodedSubjectLen) {
        this.encodedSubjectLen = encodedSubjectLen;
    }
    public String getEncodedSubject() {
        return this.encodedSubject;
    }           

    public void setEncodedSubject(String encodedSubject) {
        this.encodedSubject = encodedSubject;
    }
    public String getOrderID() {
        return this.orderID;
    }           

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }
    public String getClOrdID() {
        return this.clOrdID;
    }           

    public void setClOrdID(String clOrdID) {
        this.clOrdID = clOrdID;
    }
    public Integer getRawDataLength() {
        return this.rawDataLength;
    }           

    public void setRawDataLength(Integer rawDataLength) {
        this.rawDataLength = rawDataLength;
    }
    public String getRawData() {
        return this.rawData;
    }           

    public void setRawData(String rawData) {
        this.rawData = rawData;
    }
    public String getNewsSourceSystem() {
        return this.newsSourceSystem;
    }           

    public void setNewsSourceSystem(String newsSourceSystem) {
        this.newsSourceSystem = newsSourceSystem;
    }


    public Email.NoRoutingIDs getNoRoutingIDs() {
        return this.noRoutingIDs;
    }

    public void setNoRoutingIDs(Email.NoRoutingIDs noRoutingIDs) {
        this.noRoutingIDs = noRoutingIDs;
    }
    public Email.NoRelatedSym getNoRelatedSym() {
        return this.noRelatedSym;
    }

    public void setNoRelatedSym(Email.NoRelatedSym noRelatedSym) {
        this.noRelatedSym = noRelatedSym;
    }
    public Email.NoUnderlyings getNoUnderlyings() {
        return this.noUnderlyings;
    }

    public void setNoUnderlyings(Email.NoUnderlyings noUnderlyings) {
        this.noUnderlyings = noUnderlyings;
    }
    public Email.NoLegs getNoLegs() {
        return this.noLegs;
    }

    public void setNoLegs(Email.NoLegs noLegs) {
        this.noLegs = noLegs;
    }
    public Email.LinesOfText getLinesOfText() {
        return this.linesOfText;
    }

    public void setLinesOfText(Email.LinesOfText linesOfText) {
        this.linesOfText = linesOfText;
    }
        

    public static class NoRoutingIDs extends FixGroup<Email.NoRoutingIDs.NoRoutingIDsEntry> {

        @Override
        public int getField() {
            return 215;
        }

        public static class NoRoutingIDsEntry {

            private Integer routingType;
            private String routingID;

            public Integer getRoutingType() {
                return this.routingType;
            }           

            public void setRoutingType(Integer routingType) {
                this.routingType = routingType;
            }
            public String getRoutingID() {
                return this.routingID;
            }           

            public void setRoutingID(String routingID) {
                this.routingID = routingID;
            }

        }
        
    }


    public static class NoRelatedSym extends FixGroup<Email.NoRelatedSym.NoRelatedSymEntry> {

        @Override
        public int getField() {
            return 146;
        }

        public static class NoRelatedSymEntry {



        }
        
    }


    public static class NoUnderlyings extends FixGroup<Email.NoUnderlyings.NoUnderlyingsEntry> {

        @Override
        public int getField() {
            return 711;
        }

        public static class NoUnderlyingsEntry {



        }
        
    }


    public static class NoLegs extends FixGroup<Email.NoLegs.NoLegsEntry> {

        @Override
        public int getField() {
            return 555;
        }

        public static class NoLegsEntry {



        }
        
    }


    public static class LinesOfText extends FixGroup<Email.LinesOfText.LinesOfTextEntry> {

        @Override
        public int getField() {
            return 33;
        }

        public static class LinesOfTextEntry {

            private String text;
            private Integer encodedTextLen;
            private String encodedText;

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

        }
        
    }

}

