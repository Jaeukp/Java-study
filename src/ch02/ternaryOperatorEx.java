package ch02;

public class ternaryOperatorEx {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        int max = (a > b) ? b : a;
        System.out.println("큰 값: " + max);
    }
}
