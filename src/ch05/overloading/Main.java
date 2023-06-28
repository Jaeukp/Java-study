package ch05.overloading;

public class Main {
    public static void main(String[] args) {
        Operator op = new Operator();

        int resultInt = op.multiply(4, 5);
        double resultDouble = op.multiply(4.1, 6.2);

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int resultMul = op.multiply(arr);
        System.out.println(resultMul);
    }
}
