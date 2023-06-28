package Solving;

public class basic {
    // 인터페이스 선언
    public interface Animal {
        void makeSound(); // 추상 메서드

        void eat();       // 추상 메서드
    }

    // 다중 인터페이스 구현
    public static class Dog implements Animal {
        @Override
        public void makeSound() {
            System.out.println("멍멍");
        }

        @Override
        public void eat() {
            System.out.println("사료를 먹습니다.");
        }
    }

    // 다중 인터페이스 구현
    public static class Cat implements Animal {
        @Override
        public void makeSound() {
            System.out.println("야옹");
        }

        @Override
        public void eat() {
            System.out.println("생선을 먹습니다.");
        }
    }

    // 인터페이스 사용
}
