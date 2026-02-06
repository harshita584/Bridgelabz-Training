package com.streamapi.filtermembership;

import java.time.LocalDate;

public class Member {
    String name;
    LocalDate expiryDate;

    public Member(String name, LocalDate expiryDate) {
        this.name = name;
        this.expiryDate = expiryDate;
    }
}
