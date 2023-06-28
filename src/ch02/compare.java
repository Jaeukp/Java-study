package ch02;

public class compare {
    public static void main(String[] args) {
        // 동등 비교 연산자
        // 동일한지 비교
        int a = 5;
        int b = 3;
        boolean result = (a == b); // false
        System.out.println(result);

        // 문자열 비교에는 == ! 사용 불가능
//        String str1 = "abc";
//        String str2 = "abc";
//        boolean resultStr = (str1 == str2);
//        boolean resultStrNot = (str1 != str2);
//        System.out.println(resultStr);
//        System.out.println(resultStrNot);

        String str3 = new String("abc");
        String str4 = new String("abc");
        boolean resultStr = (str3 == str4);
        boolean resultStrNot = (str3 != str4);
        System.out.println(resultStr);
        System.out.println(resultStrNot);
        System.out.println("----------------");

        // 자바에서 문자열 비교는 문자열변수명.equals(변수/값)
        boolean resultStr3 = (str3.equals(str4));
        // 논리적으로 반대의 연산을 하고 싶을때, !
        // 결과값이 반대로 반환됨
        boolean resultStrNot3 = (!str3.equals(str4));
        System.out.println(resultStr3);
        System.out.println(resultStrNot3);

        // reference 참고자료형 = 값이 있는 공간의 주소

        // 부등 비교 연산자
        // not equal
        // ! = not
        boolean resultNot = (a != b); // true
        System.out.println(resultNot);
    }
}
