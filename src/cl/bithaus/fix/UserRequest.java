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
public class UserRequest extends FixBaseMessage {

    private String userRequestID;           
    private Integer userRequestType;           
    private String username;           
    private String password;           
    private String newPassword;           
    private Integer rawDataLength;           
    private String rawData;           

    public UserRequest() { 
        super("BE", MsgCategory.APP);
    }

    public String getUserRequestID() {
        return this.userRequestID;
    }           

    public void setUserRequestID(String userRequestID) {
        this.userRequestID = userRequestID;
    }
    public Integer getUserRequestType() {
        return this.userRequestType;
    }           

    public void setUserRequestType(Integer userRequestType) {
        this.userRequestType = userRequestType;
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
    public String getNewPassword() {
        return this.newPassword;
    }           

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
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


        
}

