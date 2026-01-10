package loanbuddy;

public class AutoLoan extends LoanApplication {

    public AutoLoan(Applicant applicant, int term) {
        super(applicant, term, 10.5);
    }

    public boolean approveLoan() {
        if (applicant.getCreditScore() >= 650 && applicant.getIncome() >= 30000) {
            setLoanStatus("APPROVED");
            return true;
        }
        setLoanStatus("REJECTED");
        return false;
    }

    public double calculateEMI() {
        double P = applicant.getLoanAmount();
        double R = interestRate / (12 * 100);
        int N = term;

        double emi = (P * R * Math.pow(1 + R, N)) / (Math.pow(1 + R, N) - 1);

        return emi + 500; // fixed processing fee
    }
}
