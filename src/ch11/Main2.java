package ch11;

public class Main2 {
    public static void main(String[] args) {
        try {
            divide(10,0);
        } catch (ArithmeticException e) {
            System.out.println("산술 연산의 오류가 발생하였습니다." + e.getMessage());
        } finally {
            // 정상처리 상황과 예외처리 상황ㅇ 모두 실행되는 코드 블록
            System.out.println("연산이 실행되었습니다");
        }
    }

    // 매서드 throws 예외종류
    public static int divide(int a, int b) throws ArithmeticException {
        int result = 0;
            result = a / b;

        return result;
    }
}
