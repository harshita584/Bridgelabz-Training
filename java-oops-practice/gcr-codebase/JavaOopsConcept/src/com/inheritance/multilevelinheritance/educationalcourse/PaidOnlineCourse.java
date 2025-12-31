package com.inheritance.multilevelinheritance.educationalcourse;

class PaidOnlineCourse extends OnlineCourse {
    double fee;
    double discount;

    PaidOnlineCourse(String courseName, int duration, String platform,
                     boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("Course Fee: ₹" + fee);
        System.out.println("Discount: ₹" + discount);
    }
}

