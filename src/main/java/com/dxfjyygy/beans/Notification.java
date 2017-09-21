package com.dxfjyygy.beans;

/**
 * Created by longjinwen on 20/09/2017.
 */
public class Notification {
    private long pkId;
    private String subject;
    private String body;
    private String email;

    public long getPkId() {
        return pkId;
    }

    public void setPkId(long pkId) {
        this.pkId = pkId;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
