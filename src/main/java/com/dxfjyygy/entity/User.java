package com.dxfjyygy.entity;

import java.io.Serializable;

/**
 * Created by longjinwen on 2017/3/15.
 */
public class User  implements Serializable{
    private String username;

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    private String passwd;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


}
