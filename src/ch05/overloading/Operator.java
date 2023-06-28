package ch05.overloading;

public class Operator {

    // 메서드 오버로딩(method overloading)
    // 메서드 이름은 동일
    // 매개변수의 갸수 또는 타입이 다른 경우
    // 변환 타입(X), 접근제한자(x)

    // 메서드 시그니처(method signature)
    // 어떤 메서드의 유일함을 나타내는 껍데기(프로토타입, 선언부)
    // method 이름 + 매개변수(개수, 타입)

    // 정수값 2개 받고 곱하기
    public int multiply(int x, int y) {
        System.out.println("(int,int)");
        return x * y;
    }

    // 실수값 2개 받고 곱하기
    public double multiply(double x, double y) {
        System.out.println("(double,double)");
        return  (x * y);
    }

    // 실수값 2개 받고 곱하기
    public int multiply(double x, double y, int z) {
        System.out.println("(double,double)");
        return (int) (x * y) * z;
    }

    public int multiply(int[] nums) {
        if(nums == null || nums.length == 0) {
            System.out.println();
        }

        int mulResult = 1;
        for(int num : nums) {
            mulResult *= num;
        }

        return mulResult;
    }
}
