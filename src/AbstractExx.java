package src;
abstract class BankAccount {

    BankAccount() {
        System.out.println("creating a new account");
    }
    abstract void deposit();
    void withdraw() {
        System.out.println("withdraw money");
    }

    void getBalance() {
        System.out.println("get balance");
    }
}
class SavingsAccount extends BankAccount {

    void deposit() {
        System.out.println("deposit money");
    }
    void withdraw() {
        System.out.println("withdraw money");
    }
    void getBalance() {
        System.out.println("get balance");
    }
}
class CurrentAccount extends BankAccount {

    void deposit() {
        System.out.println("deposit money");
    }
    void withdraw() {
        System.out.println("withdraw money");
    }
    void getBalance() {
        System.out.println("get balance");
    }
}
public class AbstractExx {
    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount();
        s.deposit();
        s.withdraw();
        s.getBalance();
        
        CurrentAccount c = new CurrentAccount();
        c.deposit();   
        c.withdraw();
        c.getBalance();
    }
}