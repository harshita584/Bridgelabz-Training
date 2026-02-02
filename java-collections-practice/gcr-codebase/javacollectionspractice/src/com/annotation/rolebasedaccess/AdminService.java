package com.annotation.rolebasedaccess;

@RoleAllowed("ADMIN")
public class AdminService {

    public void performAdminTask() {
        System.out.println("Admin task performed successfully!");
    }

    public void performGeneralTask() {
        System.out.println("General task executed.");
    }
}
