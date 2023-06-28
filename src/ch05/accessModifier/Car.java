package ch05.accessModifier;

// 차량 정보
public class Car {

    // 다른 클래스에서는 메서드로만 접근
    // public 메서드
    // public 어디서든 (어떤 클래스에서도) 접근 가능하다
    public  void startEngine() {
        BankAccount account = new BankAccount();
        // 다른 클래스에서 접근 불가능한 메서드(private)
        // account.deductFunds

        Animal animal = new Animal();
        // protected 메서드
        animal.eat();

        System.out.println("Engine started!");
    }
}
