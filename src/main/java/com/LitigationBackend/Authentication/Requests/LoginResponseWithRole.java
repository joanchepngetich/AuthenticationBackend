package com.LitigationBackend.Authentication.Requests;

public class LoginResponseWithRole extends LoginResponse{
    private String role;
    private Integer userid;
    private String usename;

    public LoginResponseWithRole(String message, boolean success, String role, Integer userid, String username) {
        super(message, success, role, userid);
        this.role = role;
        this.userid = userid;
        this.usename = username;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }
}
