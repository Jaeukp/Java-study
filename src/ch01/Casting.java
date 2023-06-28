package ch01;

public class Casting {
    public static void main(String[] args) {
        // 형변환(형식 변환, casting, conversion)
        // casting(배우, 마법주문을 외운다)
        // 변수나 값의 자료형을 다른 자료형으로 변환하는 과정

        // 1. 믁시적 형변환(자동 형변환, implicit conversion)
        // implicit(묵시적): 무엇을 표기/표현을 안해 주어도 내부적으로 알아서 해주는 것
        // 웬만하면 잘 안 쓰는게 좋음.(알 수 없는 오류 가능성, side-effect, smell)
        int x = 10;
        System.out.println(x);
        double y = x;
        System.out.println(y);

        // 묵시적 변환의 원리는
        // 더 좁은 값을 저장할수 있는 변수를 더 넓은 값을 저장할 수 있는 변수에 대입
        // double a = 10.5;
        // int b + a;

        // 명시적 형변환(explicit conversion)
        // 명시적(explicit) : 표기를 해주는 것
        double a = 10.5;
        int b = (int) a;
        System.out.println(b);

        //완성형 코드를 저장한다
        char c = '꿹';
        int num = c;
        System.out.println(num);

        double f = 2.15;
        int z = (int) f;
        System.out.println(z);

        //문자열 <-> 숫자
        // "10" -> 10
        //int number = 10;
        //String str = Integer.toString(number);
        //System.out.println(str);
        //String strValue = String.valueOf(number);
        //System.out.println(strValue);

        // 소숫점이 있는 10진수: decimal
        //double decimal = 10.5;
        //String strDecimal = Double.toString(x);
        //System.out.println(strDecimal);
        //String strDecimalValue = String.valueOf(10.5);
        //System.out.println(strDecimalValue);
        // 숫자 => 문자열
        //String.valueOf(아무데이터값)

        // 문자열 -> 숫자
        //String numStr = "10";
        //자료형클래스.valueof(문자열)
        //int num1 = Integer.valueOf(numStr);
        //int num2 = Integer.parseInt(numStr);
        //System.out.println(num1);
        //System.out.println(num2);
        //double nim3 = Double.valueOf()

        //문제1
        int number = 123;
        String str = Integer.toString(number);
        System.out.println(str);
        String strValue = String.valueOf(number);
        System.out.println(strValue);

        //문제2
        //double decimal = 3.14;
        //String strDecimal = Double.toString(x);
        //System.out.println(strDecimal);
        //String strDecimalValue = String.valueOf(3.14);
        //System.out.println(strDecimalValue);

        //문제3
        int cusa = 456;
        String std = Integer.toString(cusa);
        System.out.println(std);
        String stdValue = String.valueOf(cusa);
        System.out.println(stdValue);

        //문제4
        double diamond = 2.718;
        String strDecimal = String.valueOf(diamond);
        System.out.println(strDecimal);
        String strDecimalValue = Double.toString(2.718);
        System.out.println(strDecimalValue);



        // String.valueOf(숫자자료형) : 숫자 -> 문자열
        // Integer.toString(문자열) : 문자열 -> 정수
        // Double.valuef(문자열) : 문자열 -> 실수
        // 데이터타입.valueOf(입력값) : 입력값을 데이터타입의 값으로 변환 한다.

        // 자바의 숫자를 저장하자
        // 소수점 X : int
        // 소수점 X, 20억 넘을 것 같아 : long
        // 소숫점 O : double
        // 글자를 저장 : String


    }
}