package com.eventtracker;

public class UserActions {
    @AuditTrail(action = "User Login")
    public void login() {
    }

    @AuditTrail(action = "File Upload")
    public void uploadFile() {
    }

    public void helperMethod() {
    }
}
