package mg.training.exo4;

public class SavingsAccount extends Account {
    private double interest;

    public SavingsAccount(int accountId, Customer customer) {
        super(accountId, customer);
        this.interest = 0;
    }

    public SavingsAccount(int accountId, Customer customer, double sold, double interest) {
        super(accountId, customer, sold);
        this.interest = interest;
    }

    public SavingsAccount(int accountId, Customer customer2, double sold) {
        super(accountId, customer2, sold);
    }

    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        if (interest < 0) System.out.println("You cannot set a negative interest");
        else this.interest = interest;
    }

    public void applyInterest() {
        this.sold += (this.interest * this.sold) / 100;
    }
}
