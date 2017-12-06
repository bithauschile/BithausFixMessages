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
public class News extends FixBaseMessage {

    private Date origTime;           
    private String urgency;           
    private String headline;           
    private Integer encodedHeadlineLen;           
    private String encodedHeadline;           
    private String uRLLink;           
    private Integer rawDataLength;           
    private String rawData;           
    private Integer newsType;           
    private String newsCode;           
    private String newsSourceSystem;           
    private NoRoutingIDs noRoutingIDs;           
    private NoRelatedSym noRelatedSym;           
    private NoLegs noLegs;           
    private NoUnderlyings noUnderlyings;           
    private LinesOfText linesOfText;           

    public News() { 
        super("B", MsgCategory.APP);
    }

    public Date getOrigTime() {
        return this.origTime;
    }           

    public void setOrigTime(Date origTime) {
        this.origTime = origTime;
    }
    public String getUrgency() {
        return this.urgency;
    }           

    public void setUrgency(String urgency) {
        this.urgency = urgency;
    }
    public String getHeadline() {
        return this.headline;
    }           

    public void setHeadline(String headline) {
        this.headline = headline;
    }
    public Integer getEncodedHeadlineLen() {
        return this.encodedHeadlineLen;
    }           

    public void setEncodedHeadlineLen(Integer encodedHeadlineLen) {
        this.encodedHeadlineLen = encodedHeadlineLen;
    }
    public String getEncodedHeadline() {
        return this.encodedHeadline;
    }           

    public void setEncodedHeadline(String encodedHeadline) {
        this.encodedHeadline = encodedHeadline;
    }
    public String getURLLink() {
        return this.uRLLink;
    }           

    public void setURLLink(String uRLLink) {
        this.uRLLink = uRLLink;
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
    public Integer getNewsType() {
        return this.newsType;
    }           

    public void setNewsType(Integer newsType) {
        this.newsType = newsType;
    }
    public String getNewsCode() {
        return this.newsCode;
    }           

    public void setNewsCode(String newsCode) {
        this.newsCode = newsCode;
    }
    public String getNewsSourceSystem() {
        return this.newsSourceSystem;
    }           

    public void setNewsSourceSystem(String newsSourceSystem) {
        this.newsSourceSystem = newsSourceSystem;
    }


    public News.NoRoutingIDs getNoRoutingIDs() {
        return this.noRoutingIDs;
    }

    public void setNoRoutingIDs(News.NoRoutingIDs noRoutingIDs) {
        this.noRoutingIDs = noRoutingIDs;
    }
    public News.NoRelatedSym getNoRelatedSym() {
        return this.noRelatedSym;
    }

    public void setNoRelatedSym(News.NoRelatedSym noRelatedSym) {
        this.noRelatedSym = noRelatedSym;
    }
    public News.NoLegs getNoLegs() {
        return this.noLegs;
    }

    public void setNoLegs(News.NoLegs noLegs) {
        this.noLegs = noLegs;
    }
    public News.NoUnderlyings getNoUnderlyings() {
        return this.noUnderlyings;
    }

    public void setNoUnderlyings(News.NoUnderlyings noUnderlyings) {
        this.noUnderlyings = noUnderlyings;
    }
    public News.LinesOfText getLinesOfText() {
        return this.linesOfText;
    }

    public void setLinesOfText(News.LinesOfText linesOfText) {
        this.linesOfText = linesOfText;
    }
        

    public static class NoRoutingIDs extends FixGroup<News.NoRoutingIDs.NoRoutingIDsEntry> {

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


    public static class NoRelatedSym extends FixGroup<News.NoRelatedSym.NoRelatedSymEntry> {

        @Override
        public int getField() {
            return 146;
        }

        public static class NoRelatedSymEntry {



        }
        
    }


    public static class NoLegs extends FixGroup<News.NoLegs.NoLegsEntry> {

        @Override
        public int getField() {
            return 555;
        }

        public static class NoLegsEntry {



        }
        
    }


    public static class NoUnderlyings extends FixGroup<News.NoUnderlyings.NoUnderlyingsEntry> {

        @Override
        public int getField() {
            return 711;
        }

        public static class NoUnderlyingsEntry {



        }
        
    }


    public static class LinesOfText extends FixGroup<News.LinesOfText.LinesOfTextEntry> {

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

