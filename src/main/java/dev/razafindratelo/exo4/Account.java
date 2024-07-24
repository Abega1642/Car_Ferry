package mg.training.exo4;

public class Account {
    protected int accountId;
    protected Customer customer;
    protected double sold;

    public Account(int accountId, Customer customer) {
        this.accountId = accountId;
        this.customer = customer;
        this.sold = 0;
    }

    public Account(int accountId, Customer customer, double sold) {
        this.accountId = accountId;
        this.customer = customer;
        this.sold = (sold > 0) ? sold : 0;
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

    public void credit(double amount) {
        if (amount < 0) {
            System.out.println("You can't debit negative amount.");
        } else {
            this.sold += amount;
        }
    }

    public void debit(double amount) {
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

    @Override
    public String toString() {
        return "Account {" +
                "accountId = " + accountId +
                ", customer = " + customer.toString() +
                ", sold = " + sold +
                '}';
    }

}
