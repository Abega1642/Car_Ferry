package mg.training.exo4;

public class CurrentAccount extends Account{
    private double limit;
    public CurrentAccount(int accountId, Customer customer) {
        super(accountId, customer);
    }

    public CurrentAccount(int accountId, Customer customer, double sold) {
        super(accountId, customer);
        this.limit = -1000d;
        if (sold < this.limit) {
            System.out.println("SOld exceeds limit");
        } else {
            this.sold = sold;
        }
    }
    public CurrentAccount(int accountId, Customer customer, double sold,double limit) {
        super(accountId, customer);
        this.limit = limit;
        if (sold < this.limit) {
            System.out.println("SOld exceeds limit");
        } else {
            this.sold = sold;
        }
    }

    @Override
    public void setSold(double sold) {
        if (sold < this.limit) {
            System.out.println("SOld exceeds limit");
        } else {
            this.sold = sold;
        }
    }

    @Override
    public void debit(double amount) {
        if (this.sold < 0 || amount < 0 || this.sold < amount) {
            System.out.println("Please, check your sold or the amount you entered.");
        } else{
            if (this.sold - amount < this.limit) {
                System.out.println("Sold exceeds limit");
            }
            this.sold -= amount;
            System.out.println("Operation successful!");
        }
    }

    @Override
    public void credit(double amount) {
        this.sold += amount;
    }

    @Override
    public void transferToAccount(Account target, double amount) {
        if (this.sold < 0 || amount < 0 || this.sold < amount) {
            System.out.println("Please, check your sold or the amount you entered.");
        } else {
            if (this.sold - amount < this.limit) {
                System.out.println("Sold exceeds limit");
            } else {
                this.sold -= amount;
                target.debit(amount);
            }

        }
    }


}
