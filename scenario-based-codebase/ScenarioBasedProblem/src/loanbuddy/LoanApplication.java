package loanbuddy;

public abstract class LoanApplication implements IApprovable {

    protected Applicant applicant;
    protected int term; // in months
    protected double interestRate; // annual
    private String loanStatus;

    public LoanApplication(Applicant applicant, int term, double interestRate) {
        this.applicant = applicant;
        this.term = term;
        this.interestRate = interestRate;
        this.loanStatus = "PENDING";
    }

    protected void setLoanStatus(String status) {
        this.loanStatus = status;
    }

    public String getLoanStatus() {
        return loanStatus;
    }
}
