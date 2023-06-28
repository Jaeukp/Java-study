package ch03;

import java.util.Scanner;

public class Conditions {
    public static void main(String[] args) {
        // 조건문(condition)
        // 코드를 실행할지 말지를 결정하는데 사용 : 프로그램의 로직(logic)을 제어하는 핵심적인 부분

        /* if 문
        - if (조건식){
            식이 true일 떄 실행할 구문
        }
        조건식 : true / false를 반환하는 식
         */
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        /*
        if (age >= 18){
            System.out.println("성인입니다.");
        }*/
        //System.out.println("\n프로그램이 종료되었습니다.");


        // if-else 문
        // if 문의 조건식이 참(true)이면, if 블록({}) 안에 코드가 실행
        // if 문의 조건식이 거짓(false)이면, else 블록({}) 안에 코드가 실행
        /*
        if (age >=21){
            System.out.println("성인입니다.");
        } else {
            System.out.println("미성년자입니다.");
        }
        */
        // else -if 문
        if (age >= 60){
            System.out.println("노인입니다.");
        } else if (age >= 18) {
            System.out.println("성인입니다.");
        } else {
            System.out.println("미성년자 입니다");
        }
    }
}
