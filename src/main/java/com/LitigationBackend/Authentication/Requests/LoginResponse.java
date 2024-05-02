package com.LitigationBackend.Authentication.Requests;


public class LoginResponse {
    String message;
    Boolean status;
    String role;
    Integer userid;

    public LoginResponse(String message, Boolean status, String role, Integer userid) {
        this.message = message;
        this.status = status;
        this.role = role;
        this.userid = userid;
    }

    public LoginResponse() {
    }


    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "LoginResponse{" +
                "message='" + message + '\'' +
                ", status=" + status +
                '}';
    }
}
