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
public class Logon extends FixBaseMessage {

    private Integer encryptMethod;           
    private Integer heartBtInt;           
    private Integer rawDataLength;           
    private String rawData;           
    private Boolean resetSeqNumFlag;           
    private Integer nextExpectedMsgSeqNum;           
    private Integer maxMessageSize;           
    private Boolean testMessageIndicator;           
    private String username;           
    private String password;           
    private NoMsgTypes noMsgTypes;           

    public Logon() { 
        super("A", MsgCategory.ADMIN);
    }

    public Integer getEncryptMethod() {
        return this.encryptMethod;
    }           

    public void setEncryptMethod(Integer encryptMethod) {
        this.encryptMethod = encryptMethod;
    }
    public Integer getHeartBtInt() {
        return this.heartBtInt;
    }           

    public void setHeartBtInt(Integer heartBtInt) {
        this.heartBtInt = heartBtInt;
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
    public Boolean getResetSeqNumFlag() {
        return this.resetSeqNumFlag;
    }           

    public void setResetSeqNumFlag(Boolean resetSeqNumFlag) {
        this.resetSeqNumFlag = resetSeqNumFlag;
    }
    public Integer getNextExpectedMsgSeqNum() {
        return this.nextExpectedMsgSeqNum;
    }           

    public void setNextExpectedMsgSeqNum(Integer nextExpectedMsgSeqNum) {
        this.nextExpectedMsgSeqNum = nextExpectedMsgSeqNum;
    }
    public Integer getMaxMessageSize() {
        return this.maxMessageSize;
    }           

    public void setMaxMessageSize(Integer maxMessageSize) {
        this.maxMessageSize = maxMessageSize;
    }
    public Boolean getTestMessageIndicator() {
        return this.testMessageIndicator;
    }           

    public void setTestMessageIndicator(Boolean testMessageIndicator) {
        this.testMessageIndicator = testMessageIndicator;
    }
    public String getUsername() {
        return this.username;
    }           

    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return this.password;
    }           

    public void setPassword(String password) {
        this.password = password;
    }


    public Logon.NoMsgTypes getNoMsgTypes() {
        return this.noMsgTypes;
    }

    public void setNoMsgTypes(Logon.NoMsgTypes noMsgTypes) {
        this.noMsgTypes = noMsgTypes;
    }
        

    public static class NoMsgTypes extends FixGroup<Logon.NoMsgTypes.NoMsgTypesEntry> {

        @Override
        public int getField() {
            return 384;
        }

        public static class NoMsgTypesEntry {

            private String refMsgType;
            private String msgDirection;

            public String getRefMsgType() {
                return this.refMsgType;
            }           

            public void setRefMsgType(String refMsgType) {
                this.refMsgType = refMsgType;
            }
            public String getMsgDirection() {
                return this.msgDirection;
            }           

            public void setMsgDirection(String msgDirection) {
                this.msgDirection = msgDirection;
            }

        }
        
    }

}

