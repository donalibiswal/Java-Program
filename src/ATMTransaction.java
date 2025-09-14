package src;
class Bank {
    void transaction() {
        System.out.println("Processing bank transaction");
    }
}

class ATM extends Bank {
    void transaction() {
        System.out.println("Processing ATM withdrawal");
    }
}

public class ATMTransaction {
    public static void main(String[] args) {
        Bank myTransaction = new ATM();
        myTransaction.transaction();
    }
}
