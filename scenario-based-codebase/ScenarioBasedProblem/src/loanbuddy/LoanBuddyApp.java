package loanbuddy;

public class LoanBuddyApp {
    public static void main(String[] args) {

        Applicant applicant =
                new Applicant("Harshita Patel", 720, 20000, 500000);

        LoanApplication loan =
                new HomeLoan(applicant, 240);

        if (loan.approveLoan()) {
        	System.out.println("Applicant Name: "+ applicant.getName());
            System.out.println("Loan Approved");
            System.out.println("Monthly EMI: Rs." + loan.calculateEMI());
        } else {
        	System.out.println("Applicant Name: "+ applicant.getName());
            System.out.println("Loan Rejected");
            System.out.println("Your low income is the reason of loan rejection.");
        }

        System.out.println("Loan Status: " + loan.getLoanStatus());
    }
}

