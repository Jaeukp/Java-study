package Solving;

public class Mainex {
    public static void main(String[] args) {
        basic.Animal dog = new basic.Dog();
        dog.makeSound(); // 멍멍
        dog.eat();       // 사료를 먹습니다.

        basic.Animal cat = new basic.Cat();
        cat.makeSound(); // 야옹
        cat.eat();       // 생선을 먹습니다.
    }
}
