package ch02;

public class Increments {
    public static void main(String[] args) {
        // increment, decrement(reduction)
        // 증가 또는 감소 연산
        int a = 10;
        System.out.println(a);
        a = a + 1;
        System.out.println(a);
        System.out.println("------------------------------------------------------------");
        // ++(플플), ++++(샵)
        // 증가 연산은 결과적으로 변수의 값을 증가시킨다
        System.out.println(++a);
        System.out.println(a);


        System.out.println("------------------------------------------------------------");

        //후행 연산
        // 현재 처리하고 있는 구문(statement)에서는 현재 값을 반영
        // 다음 식부터 증가된 값이 반영
        System.out.println(a++);    // 세미컬런으로 끝나는 1개의 단위를 구문, 식(expression)
        System.out.println(a);

        System.out.println("------------------------------------------------------------");

        //감소 연산
        System.out.println(--a);
        System.out.println(a--);
        System.out.println(a);
    }
}
