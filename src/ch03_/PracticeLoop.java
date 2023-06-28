package ch03;

import java.util.Scanner;

public class PracticeLoop {
    public static void main(String[] args) {
        int sum = 0;
        // 문제 1 : 1부터 10까지의 숫자를 출력하는 프로그램을 작성하세요.
        /*for (int i = 1; i < 11; i++){
            System.out.println(i);
        }*/

        // 문제 2: 1부터 100까지의 숫자 중에서 홀수만 출력하는 프로그램을 작성하세요.
        /* for (int i = 1; i < 101; i++){
            if (i % 2 !=0){
                System.out.println(i);
            }*/

        // 문제 3 : 구구단 중 5단을 출력하는 프로그램을 작성하세요.
        /*for (int i = 1; i <= 9; i++){
            System.out.println(" 5 x " + "" +i + " = " + 5*i);
        }*/
        // 문제 4: 구구단 중 5단을 출력하는 프로그램을 작성하세요.
        /*for (int i = 10; i > 0; i--){
            System.out.println(i);
        }*/

        //문제 5: 1부터 100까지의 숫자 중 3의 배수인 숫자들의 합을 계산하는 프로그램을 작성하세요.
        /*int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                sum += i;
            }
        }
            System.out.println(sum);
    */
        /*
        for (int i = 0; i <= 100; i++){
            if (i % 3 == 0 || i % 5 == 0){
                System.out.println(i);
            }*/
        /*Scanner sc = new Scanner(System.in);
        System.out.println("숫자 입력");
        int number = sc.nextInt();
        for (int i = 0; i <= number; i++) {
            sum += i;
        }
        System.out.println("합계는 : " + sum);*/

        // 문제 8 :  0부터 10까지의 숫자를 거꾸로 출력하는 프로그램을 작성하세요.
        /*for (int i = 10; i >=0; i--){
            System.out.println(i);
        }*/

        // 문제 9 :  0부터 10까지의 숫자를 거꾸로 출력하는 프로그램을 작성하세요.
        /*for (int i = 9; i >=0; i--){
            System.out.println(" 7 x " + "" +i + " = " + 7*i);

         */
        for (int i = 1; i <= 5; i++) {
            for (int z = 1; z <= 5 - i; z++) {
                System.out.print(" ");
            }
            for (int a = 1; a<=i; a++){
                System.out.print("*");
            }

            System.out.println();
        }


    }
}
