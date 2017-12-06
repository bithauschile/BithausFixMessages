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
public class UserResponse extends FixBaseMessage {

    private String userRequestID;           
    private String username;           
    private Integer userStatus;           
    private String userStatusText;           

    public UserResponse() { 
        super("BF", MsgCategory.APP);
    }

    public String getUserRequestID() {
        return this.userRequestID;
    }           

    public void setUserRequestID(String userRequestID) {
        this.userRequestID = userRequestID;
    }
    public String getUsername() {
        return this.username;
    }           

    public void setUsername(String username) {
        this.username = username;
    }
    public Integer getUserStatus() {
        return this.userStatus;
    }           

    public void setUserStatus(Integer userStatus) {
        this.userStatus = userStatus;
    }
    public String getUserStatusText() {
        return this.userStatusText;
    }           

    public void setUserStatusText(String userStatusText) {
        this.userStatusText = userStatusText;
    }


        
}

