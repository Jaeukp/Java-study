package ch03;

import java.util.Scanner;

public class ConditionsCase {
    public static void main(String[] args) {
        // switch 문
        // 1주일에서 몇번째 요일인가
        Scanner sc = new Scanner(System.in);
        int dayOfWeek = sc.nextInt();
        // switch(변수) {..}
        // switch문의 변수의 값에 따라서 나눠서 실행
        // break를 사용하지 않으면 case에 맞는 코드를 실행 후 뒤에 있는 코드가 실행되므로 break를 case 구문 가장 마지막에 사용 권고
        // 일치하는 case문을 찾지 못한다면 default 값을 찾게 됨.
        switch (dayOfWeek) {
            case 1:
                System.out.println("월요일입니다.");
                break;
            case 2:
                System.out.println("화요일입니다.");
                break;
            case 3:
                System.out.println("수요일입니다.");
                break;
            default:
                System.out.println("목요일, 금요일, 토요일, 또는 일요일입니다.");
        }


        if (dayOfWeek == 1){
            System.out.println("월요일입니다.");
        } else if (dayOfWeek==2) {
            System.out.println("화요일입니다.");
        } else if (dayOfWeek==3) {
            System.out.println("수요일입니다.");
        } else {
            System.out.println("목요일, 금요일, 토요일, 또는 일요일입니다.");
        }
    }
}
