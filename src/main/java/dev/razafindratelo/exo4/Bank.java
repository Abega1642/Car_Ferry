package mg.training.exo4;

import java.util.*;

public class Bank {
    private Set<Account> closed = new HashSet<>();
    private Set<Account> opened = new HashSet<>();
    private List<Account> accounts = new ArrayList<>();

    public Bank() {};

    public Bank(Set<Account> closed, Set<Account> opened) {
        this.closed = closed;
        this.opened = opened;
    }

    public Bank(List<Account> accounts) {
        this.accounts = accounts;
        for (Account account : accounts) {
            if (account.getSold() < 0) {
                this.closed.add(account);
            } else {
                this.opened.add(account);
            }
        }
    }

    public void addCloseAccount(Account account) {
        closed.add(account);
    }

    public void addOpenAccount(Account account) {
        opened.add(account);
    }

    public Set<Account> getClosed() {
        return closed;
    }

    public Set<Account> getOpened() {
        return opened;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void update (){
        for (Account account : opened) {
            if(account.getSold() < 0) {
                this.opened.remove(account);
                this.closed.add(account);
            }
        }
        for (Account account : accounts) {
            if (account.getSold() < 0) {
                this.opened.remove(account);
                this.closed.add(account);
            } else {
                ((SavingsAccount) accounts).applyInterest();
                this.opened.add(account);
            }
        }
    }



    @Override
    public String toString() {
        return "Bank {" +
                "closed = " + closed +
                ", opened = " + opened +
                ", accounts = " + accounts +
                '}';
    }

    public static void main(String[] args) {
        Customer abega = new Customer("Razafindratelo", "Abegà", "123", "email@gmail.com", new Date(), "address");

        CurrentAccount currentAccount1 = new CurrentAccount(1, abega, -1000d);
        CurrentAccount currentAccount2 = new CurrentAccount(2, abega, -1500d);
        SavingsAccount savingsAccount1 = new SavingsAccount(3,abega, 1000000d, 1);
        Account account1 = new Account(4, abega, 150d);

        List<Account> accounts = new ArrayList<>();
        accounts.add(account1);
        accounts.add(currentAccount2);
        accounts.add(savingsAccount1);
        accounts.add(currentAccount1);

        Bank bank = new Bank(accounts);

        System.out.println("---- Adding a new bank account : ");
        Account account2 = new Account(5, abega, 150000d);
        bank.getAccounts().add(account2);

        System.out.println(accounts);
        System.out.println("---- Showing all closed account : -----");

        for (Account account : bank.getClosed()) {
            System.out.println(account.toString());
        }
        System.out.println("---- Showing all opened account : -----");
        for (Account account : bank.getOpened()) {
            System.out.println(account.toString());
        }
        System.out.println("---- Applying 10% of interest to savings account : ----");
        System.out.println(" Savings account : solde = " + savingsAccount1.getSold());

        ((SavingsAccount) accounts.get(2)).applyInterest();

        System.out.println("Savings account after applying the interest : sold = " + savingsAccount1.getSold());

        System.out.println("Showing all accounts");
        System.out.println(accounts);
        bank.update();

        System.out.println("--- Showing all closed account : -----");
        for (Account account : bank.getClosed()) {
            System.out.println(account.toString());
        }
        System.out.println("---- Showing all opened account : -----");
        for (Account account : bank.getOpened()) {
            System.out.println(account.toString());
        }

    }


}
