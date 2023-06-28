package ch08.Paractice1.AccounT;

import ch08.Paractice1.Account;

public class Account1 implements Bankable {
    private double balance;

    public void deposit(double amount) {
        balance += amount;
        System.out.println(amount + "원이 입금되었습니다.");
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(amount + "원이 출금되었습니다.");
        } else {
            System.out.println("잔액이 부족합니다.");
        }
    }

    @Override
    public double deposit() {
        return 0;
    }

    @Override
    public double withdraw() {
        return 0;
    }
//    private  String accountNumber;
//
//    private double balance;
//    private double deposit;
//
//    public Account1(String accountNumber, double balance, double deposit){
//        this.accountNumber = accountNumber;
//        this.balance = balance;
//        this.deposit = deposit;
//    }
//    @Override
//    public double deposit() {
//        return balance;
//    }
//
//    @Override
//    public double withdraw() {
//        return deposit;
//    }
//    public void deposit(double )

}
