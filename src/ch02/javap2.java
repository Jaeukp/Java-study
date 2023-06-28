package ch02;

public class javap2 {
    public static void main(String[] args) {

        int var = 7 - 1 * 20 / 5 ;
        System.out.println(var);

        System.out.println("------------------------------------------------------------");

        int colorPen = 5 * 12;
        int studentCount = 27;
        int divColorpen = 60 / 27;
        System.out.println("학생당 나눠가지는 색연필수 : "+divColorpen);
        int remainColorpen = 60 % 27;
        System.out.println("똑같이 나눠가지고 남은 볼펜수 : "+remainColorpen);

        int price = 187000;
        int oman = 187000 / 50000;
        int ilman = (price - oman * 50000) / 10000;
        int ochun = (price - oman * 50000 - ilman * 10000) / 5000;
        // int ochun = price % 50000 % 10000;
        // int ochun = price % 10000; //천단위 금액만 남음
        int ilchun = (price - oman * 50000 - ilman * 10000 - ochun * 5000) / 1000;


        System.out.println("5만원권 : "+oman+"장");
        System.out.println("1만원권 : "+ilman+"장");
        System.out.println("5천원권 : "+ochun+"장");
        System.out.println("1천원권 : "+ilchun+"장");

        int number = 1234;
        // 100으로 나누면 100 미안 숫자들은 날라감, 뒤에 2 자리 (일~십의 자리)
        int result = number / 100 * 100;
        System.out.println(result);

        // 6번, 나머지 연산을 잘 쓰면,

    }
}
