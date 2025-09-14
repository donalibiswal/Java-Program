package src;
abstract class BankAccount {
    abstract void deposit(double amount);
    abstract void withdraw(double amount);
}
class SavingsAccount extends BankAccount {
    void deposit(double amount) {
        System.out.println("Depositing " + amount + " in Savings Account.");
    }

    void withdraw(double amount) {
        System.out.println("Withdrawing " + amount + " from Savings Account.");
    }
}
public class Abstract_Bank {
    public static void main(String[] args) {
        BankAccount account = new SavingsAccount();
        account.deposit(1000);
        account.withdraw(500);
    }
}
