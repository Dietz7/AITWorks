package classwork_15.bank;

import classwork_15.bank.model.BankAccount;

public class BankAppl {
    public static void main(String[] args) {

        BankAccount acc0 = new BankAccount(1000L, "Peter", "Bank #1", 101, 100);

        System.out.println(acc0.getBalance());
        System.out.println(acc0.getOwner());
        acc0.display();
        acc0.deposit(500);
        System.out.println(acc0.getBalance());
        acc0.display();

        BankAccount acc1 = new BankAccount(2000, "John", "Bank '1", 101);
        acc1.display();

        BankAccount acc2 = new BankAccount(3000, "Bank '1", 101);
        acc2.deposit(1000000);

        acc2.display("Mr. ");
        acc2.setOwner("Pin Guin");
        acc2.display("Mr");
    }
}
