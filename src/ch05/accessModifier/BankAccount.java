package ch05.accessModifier;

public class BankAccount {
    private int balance;     // private 필드

    // private 메서드
    // 클래스 만든 사람만 가져다 쓸라고 함
    private  void deductFunds(int amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            // insufficient: 불충분
            System.out.println("Insufficient funds!");
        }
    }
}
