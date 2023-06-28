package ch07.abstractClass;

public abstract class Account {
    String accountNumber;
    double balance;

    Account(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " deposited. New balance: " + balance);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println(amount + " withdrawn. New balance: " + balance);
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    abstract void endOfMonth(); // 추상 메소드: 매월 말에 실행되는 작업
}

class SavingsAccount extends Account {
    double interestRate;

    SavingsAccount(String accountNumber, double initialBalance, double interestRate) {
        super(accountNumber, initialBalance);
        this.interestRate = interestRate;
    }

    @Override
    void endOfMonth() {
        double interest = balance * interestRate;
        balance += interest;
        System.out.println("Interest of " + interest + " added. New balance: " + balance);
    }
}

class CheckingAccount extends Account {
    CheckingAccount(String accountNumber, double initialBalance) {
        super(accountNumber, initialBalance);
    }

    @Override
    void endOfMonth() {
        System.out.println("End of month statement. Balance: " + balance);
    }
}

