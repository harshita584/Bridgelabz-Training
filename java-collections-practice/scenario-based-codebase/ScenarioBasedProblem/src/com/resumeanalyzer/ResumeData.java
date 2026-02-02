package com.resumeanalyzer;

public class ResumeData {
    private String email;
    private String phone;
    private int keywordCount;

    public ResumeData(String email, String phone, int keywordCount) {
        this.email = email;
        this.phone = phone;
        this.keywordCount = keywordCount;
    }

    public String getEmail() {
        return email;
    }

    public int getKeywordCount() {
        return keywordCount;
    }

    public String toString() {
        return "Email: " + email + " Phone: " + phone + " Keywords : " + keywordCount;
    }
}
