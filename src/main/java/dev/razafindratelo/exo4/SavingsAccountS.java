package mg.training.exo4;

public class SavingsAccountS {
    private double interest;
    protected int accountId;
    protected Customer customer;
    protected double sold;

    public SavingsAccountS(int accountId, Customer customer) {
        this.accountId = accountId;
        this.customer = customer;
        this.sold = 0;
        this.interest = 0;
    }

    public SavingsAccountS(int accountId, Customer customer, double sold) {
        this.accountId = accountId;
        this.customer = customer;
        this.sold = (sold > 0) ? sold : 0;
    }

    public SavingsAccountS(int accountId, Customer customer, double sold, double interest) {
        this.accountId = accountId;
        this.customer = customer;
        this.sold = (sold > 0) ? sold : 0;
        this.interest = (interest > 0) ? interest : 0;
    }
    public int getAccountId() {
        return accountId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getSold() {
        return sold;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setSold(double sold) {
        this.sold = (sold < 0) ? 0 : sold;
    }

    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        if (interest < 0) System.out.println("You cannot set a negative interest");
        else this.interest = interest;
    }

    public void debit(double amount) {
        if (amount < 0) {
            System.out.println("You can't debit negative amount.");
        } else {
            this.sold += amount;
        }
    }

    public void credit(double amount) {
        if (amount < 0 || this.sold < amount) {
            System.out.println("Please, check your sold or the amount you entered.");
        } else {
            System.out.println("Operation successful!");
            this.sold -= amount;
        }
    }

    public void transferToAccount(Account target, double amount) {
        if (amount < 0 || this.sold < amount) {
            System.out.println("Please, check your sold or the amount you entered.");
        } else {
            this.sold -= amount;
            target.debit(amount);
        }
    }

    public void applyInterest() {
        this.sold += (this.interest * this.sold) / 100;
    }

    @Override
    public String toString() {
        return "SavingsAccount {" +
                "accountId = " + accountId +
                ", customer = " + customer +
                ", sold = " + sold +
                '}';
    }
}
