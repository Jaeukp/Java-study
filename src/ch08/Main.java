package ch08;

public class Main {
    public static void main(String[] args) {
        // 인터페이스 객체 생성이 불가하다.
//        shape s = new Shape();
        // 구현체로만 객체 생성이 가능하다.
        // 회사 경영진이 어이, 원으로 하니깐 별로야, 사각형으로 바꿔
        // 인터페이스를 쓰는 이유 1번째가 갈아끼기 쉽다.
        Circle circle = new Circle(5.0);
//        Shape s = new Circle(5);
        System.out.println("원이 넓이: " + circle.calculateArea());
        System.out.println("원의 둘레: " + circle.calculatePerimeter());

        Rectangle rectangle = new Rectangle(4, 7);
        System.out.println("사각형의 넓이: " + rectangle.calculateArea());
        System.out.println("사각형의 둘레: " + rectangle.calculatePerimeter());
    }
}
