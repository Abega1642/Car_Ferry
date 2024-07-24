package mg.training.exo4;
import java.util.Date;
import java.util.GregorianCalendar;

public class AccountTest {

    public static void main(String[] args) {
        Customer customer1 = new Customer("Razafindratelo", "Abegà", "+261 38 22 694 35", "hei.abega@gmail.com", new Date(),"Ambohipanja");
        Customer customer2 = new Customer("USER", "user", "+261 38 00 000 00", "user@gmail.com", new Date(),"Address");
        Account account1 = new Account(1, customer1);
        Account account2 = new Account(2, customer2, 50000d);


        System.out.println("Testing Customer Account");
        System.out.println(account1);
        System.out.println(account2);
        System.out.println(String.format("This is the account 2 sold : %s", account2.getSold()));
        System.out.println(String.format("This is the account 1 sold : %s", account1.getSold()));
        account2.transferToAccount(account1, 4000d);
        System.out.println("---------- account 2 transfert 4000 to account 1 ---------");
        System.out.println(String.format("This is the account 1 sold : %s", account1.getSold()));
        System.out.println(String.format("This is the account 2 sold : %s", account2.getSold()));
        account2.credit(4000d);
        System.out.println("---------- account 2 credited his account (4000) ---------");
        System.out.println(String.format("This is the account 2 sold : %s", account2.getSold()));
        account2.debit(1000d);
        System.out.println("---------- account 2 debited his account (1000) ----------");
        System.out.println(String.format("This is the account 2 sold : %s", account2.getSold()));


        SavingsAccount savingsAccount1 = new SavingsAccount(1, customer1);

        System.out.println("\n-------------   Testing SavingsAccount --------------\n");
        System.out.println(savingsAccount1);
        System.out.println("--- Trying credit -5000 : ");
        savingsAccount1.credit(-5000d);
        System.out.println("---- SavingsAccount after credit (-5000): sold = "+savingsAccount1.getSold());
        savingsAccount1.debit(5000d);
        System.out.println("---- SavingsAccount after debit 5000: sold = "+savingsAccount1.getSold());
        savingsAccount1.credit(5000d);
        System.out.println("---- SavingsAccount after credited his account (5000): sold = " + savingsAccount1.getSold());
        System.out.println(savingsAccount1);
        savingsAccount1.setSold(50000d);
        System.out.println("---- SavingsAccount after setting sold to 50000: sold = "+savingsAccount1.getSold());
        System.out.println("---- account 1 before a transfer of 50000: sold = "+account1.getSold());
        savingsAccount1.transferToAccount(account1, 5000d);
        System.out.println("---- Account 1 after the 5000 transfer : sold = "+account1.getSold());
        System.out.println("--- Trying to transfer -5000 to account 1");
        savingsAccount1.transferToAccount(account1, -5000d);
        System.out.println("--- SavingsAccount before having interest : interest = " + savingsAccount1.getInterest() +" sold = "+savingsAccount1.getSold());
        savingsAccount1.setInterest(5);
        savingsAccount1.applyInterest();
        System.out.println("---- SavingsAccount after having 5% of interest : savingsAccount sold = " + savingsAccount1.getSold());
        System.out.println("...");
        System.out.println("---- SavingsAccount before having a negative interest : savingsAccount sold = " + savingsAccount1.getSold());
        savingsAccount1.setInterest(-5);

        CurrentAccountS currentAccount1 = new CurrentAccountS(1, customer1);
        System.out.println("\n-------------   Testing CurrentAccount --------------\n");
        currentAccount1.setSold(-5000);
        System.out.println("---- CurrentAccount after setting the sold to -5000 : sold = " + currentAccount1.getSold());
        currentAccount1.debit(-5000);
        System.out.println("---- CurrentAccount after debiting -5000 : sold = " + currentAccount1.getSold());
        System.out.println("--- Trying to credit 5750");
        currentAccount1.credit(5750);
        System.out.println("---- CurrentAccount after credited (5750): sold = "+currentAccount1.getSold());
        System.out.println("--- Trying to transfer 5000 to account 1");
        currentAccount1.transferToAccount(account1, 5000d);




    }
}
