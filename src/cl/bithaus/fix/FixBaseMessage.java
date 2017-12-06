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

import java.util.Date;


/**
 * Fix Base Message Class
 * Generated for FIX 4.4
 * @author Bithaus Fix Message Generator
 */
public abstract class FixBaseMessage {

    private final Header header;
    private final Trailer trailer;
    private final MsgCategory msgCategory;

    public static enum MsgCategory {
        ADMIN,
        APP;
    };

    /**
     * Message constructor
     * @param msgType FIX message type code
     * @param msgCat FIX message category
     */
    public FixBaseMessage(String msgType, MsgCategory msgCat) { 

        this.msgCategory = msgCat;

        this.header = new Header();
        this.header.setMsgType(msgType);

        this.trailer = new Trailer();
    }

    public Header getHeader() {
        return this.header;
    }

    public Trailer getTrailer() {
        return this.trailer;
    }

    public MsgCategory getMsgCategory() {
        return this.msgCategory;
    }

    public static class Header {

        private String beginString;           
        private Integer bodyLength;           
        private String msgType;           
        private String senderCompID;           
        private String targetCompID;           
        private String onBehalfOfCompID;           
        private String deliverToCompID;           
        private Integer secureDataLen;           
        private String secureData;           
        private Integer msgSeqNum;           
        private String senderSubID;           
        private String senderLocationID;           
        private String targetSubID;           
        private String targetLocationID;           
        private String onBehalfOfSubID;           
        private String onBehalfOfLocationID;           
        private String deliverToSubID;           
        private String deliverToLocationID;           
        private Boolean possDupFlag;           
        private Boolean possResend;           
        private Date sendingTime;           
        private Date origSendingTime;           
        private Integer xmlDataLen;           
        private String xmlData;           
        private String messageEncoding;           
        private Integer lastMsgSeqNumProcessed;           

        public Header() { }

        public String getBeginString() {
            return this.beginString;
        }           

        public void setBeginString(String beginString) {
            this.beginString = beginString;
        }

        public Integer getBodyLength() {
            return this.bodyLength;
        }           

        public void setBodyLength(Integer bodyLength) {
            this.bodyLength = bodyLength;
        }

        public String getMsgType() {
            return this.msgType;
        }           

        public void setMsgType(String msgType) {
            this.msgType = msgType;
        }

        public String getSenderCompID() {
            return this.senderCompID;
        }           

        public void setSenderCompID(String senderCompID) {
            this.senderCompID = senderCompID;
        }

        public String getTargetCompID() {
            return this.targetCompID;
        }           

        public void setTargetCompID(String targetCompID) {
            this.targetCompID = targetCompID;
        }

        public String getOnBehalfOfCompID() {
            return this.onBehalfOfCompID;
        }           

        public void setOnBehalfOfCompID(String onBehalfOfCompID) {
            this.onBehalfOfCompID = onBehalfOfCompID;
        }

        public String getDeliverToCompID() {
            return this.deliverToCompID;
        }           

        public void setDeliverToCompID(String deliverToCompID) {
            this.deliverToCompID = deliverToCompID;
        }

        public Integer getSecureDataLen() {
            return this.secureDataLen;
        }           

        public void setSecureDataLen(Integer secureDataLen) {
            this.secureDataLen = secureDataLen;
        }

        public String getSecureData() {
            return this.secureData;
        }           

        public void setSecureData(String secureData) {
            this.secureData = secureData;
        }

        public Integer getMsgSeqNum() {
            return this.msgSeqNum;
        }           

        public void setMsgSeqNum(Integer msgSeqNum) {
            this.msgSeqNum = msgSeqNum;
        }

        public String getSenderSubID() {
            return this.senderSubID;
        }           

        public void setSenderSubID(String senderSubID) {
            this.senderSubID = senderSubID;
        }

        public String getSenderLocationID() {
            return this.senderLocationID;
        }           

        public void setSenderLocationID(String senderLocationID) {
            this.senderLocationID = senderLocationID;
        }

        public String getTargetSubID() {
            return this.targetSubID;
        }           

        public void setTargetSubID(String targetSubID) {
            this.targetSubID = targetSubID;
        }

        public String getTargetLocationID() {
            return this.targetLocationID;
        }           

        public void setTargetLocationID(String targetLocationID) {
            this.targetLocationID = targetLocationID;
        }

        public String getOnBehalfOfSubID() {
            return this.onBehalfOfSubID;
        }           

        public void setOnBehalfOfSubID(String onBehalfOfSubID) {
            this.onBehalfOfSubID = onBehalfOfSubID;
        }

        public String getOnBehalfOfLocationID() {
            return this.onBehalfOfLocationID;
        }           

        public void setOnBehalfOfLocationID(String onBehalfOfLocationID) {
            this.onBehalfOfLocationID = onBehalfOfLocationID;
        }

        public String getDeliverToSubID() {
            return this.deliverToSubID;
        }           

        public void setDeliverToSubID(String deliverToSubID) {
            this.deliverToSubID = deliverToSubID;
        }

        public String getDeliverToLocationID() {
            return this.deliverToLocationID;
        }           

        public void setDeliverToLocationID(String deliverToLocationID) {
            this.deliverToLocationID = deliverToLocationID;
        }

        public Boolean getPossDupFlag() {
            return this.possDupFlag;
        }           

        public void setPossDupFlag(Boolean possDupFlag) {
            this.possDupFlag = possDupFlag;
        }

        public Boolean getPossResend() {
            return this.possResend;
        }           

        public void setPossResend(Boolean possResend) {
            this.possResend = possResend;
        }

        public Date getSendingTime() {
            return this.sendingTime;
        }           

        public void setSendingTime(Date sendingTime) {
            this.sendingTime = sendingTime;
        }

        public Date getOrigSendingTime() {
            return this.origSendingTime;
        }           

        public void setOrigSendingTime(Date origSendingTime) {
            this.origSendingTime = origSendingTime;
        }

        public Integer getXmlDataLen() {
            return this.xmlDataLen;
        }           

        public void setXmlDataLen(Integer xmlDataLen) {
            this.xmlDataLen = xmlDataLen;
        }

        public String getXmlData() {
            return this.xmlData;
        }           

        public void setXmlData(String xmlData) {
            this.xmlData = xmlData;
        }

        public String getMessageEncoding() {
            return this.messageEncoding;
        }           

        public void setMessageEncoding(String messageEncoding) {
            this.messageEncoding = messageEncoding;
        }

        public Integer getLastMsgSeqNumProcessed() {
            return this.lastMsgSeqNumProcessed;
        }           

        public void setLastMsgSeqNumProcessed(Integer lastMsgSeqNumProcessed) {
            this.lastMsgSeqNumProcessed = lastMsgSeqNumProcessed;
        }

        
    }

    public static class Trailer {

        private Integer signatureLength;           
        private String signature;           
        private String checkSum;           

        public Trailer() { }

        public Integer getSignatureLength() {
            return this.signatureLength;
        }           

        public void setSignatureLength(Integer signatureLength) {
            this.signatureLength = signatureLength;
        }

        public String getSignature() {
            return this.signature;
        }           

        public void setSignature(String signature) {
            this.signature = signature;
        }

        public String getCheckSum() {
            return this.checkSum;
        }           

        public void setCheckSum(String checkSum) {
            this.checkSum = checkSum;
        }

        
    }
}





