package mg.training.exo4;

public class CurrentAccountS {
    protected int accountId;
    protected Customer customer;
    protected double sold;
    private double limit;

    public CurrentAccountS(int accountId, Customer customer) {
        this.accountId = accountId;
        this.customer = customer;
        this.sold = 0;
        this.limit = -10000d;
    }

    public CurrentAccountS(int accountId, Customer customer, double sold) {
        this.accountId = accountId;
        this.customer = customer;
        this.sold = sold;
        this.limit = -10000d;
    }

    public CurrentAccountS(int accountId, Customer customer, double sold, double limit) {
        this.accountId = accountId;
        this.customer = customer;
        this.limit = limit;
        if (this.sold < this.limit) {
            System.out.println("Sold limit exceeded");
        } else {
            this.sold = sold;
        }
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
        this.sold = sold;
    }

    public void credit(double amount) {
        this.sold += amount;
    }

    public void debit(double amount) {
        if (this.sold < 0 || amount < 0 || this.sold < amount) {
            System.out.println("Please, check your sold or the amount you entered.");
        } else {
            System.out.println("Operation successful!");
            this.sold -= amount;
        }
    }

    public void transferToAccount(Account target, double amount) {
        if (this.sold < 0 || amount < 0 || this.sold < amount) {
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
