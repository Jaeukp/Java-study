package Practice;

import java.io.InputStream;
import java.util.Scanner;

public class ch3practice1 {
//    private Scanner scanner;
//    public ch3practice1(int maxSize) {
//        scanner = new Scanner(System.in);
//    }
    public static void main(String[] args) {
        //문제 1: 1부터 10까지의 숫자를 출력하는 프로그램을 작성하세요.
//
//        for (int i = 1; i < 10; i++) {
//            System.out.println(i);
//        }
        //1부터 100까지의 숫자 중에서 홀수만 출력하는 프로그램을 작성하세요.
//        for (int a = 1; a <= 100; a++) {
//            if (a % 2 != 0) {
//                System.out.println(a);
//            }
//        }

        //구구단 중 5단을 출력하는 프로그램을 작성하세요.
//        int gugudan = 5;
//
//        for (int c = 1; c <= 9; c++) {
//        int result = gugudan * c;
//            System.out.println(gugudan + "X" + c +"=" + result);
//        }
        //10부터 1까지 역순으로 출력하는 프로그램을 작성하세요.
//    for (int i = 10; i >= 1; i--) {
//        System.out.println(i);
//    }
        //1부터 100까지의 숫자 중 3의 배수인 숫자들의 합을 계산하는 프로그램을 작성하세요.
//        int number = 3;
//
//        for (int i = 1; i <= 100; i++) {
//            int result = number * i;
//            System.out.println(result);
//        }
//        int sum = 0;
//        for (int num = 1; num <= 100; num++) {
//            if (num % 3 == 0) {
//                sum += num; // sum = sum + num; 같은 의미
//            }
//        }
//
//        System.out.println("3의 배수인 숫자들의 합: " + sum);
        //0부터 100까지의 숫자 중에서 3의 배수이거나 5의 배수인 숫자들을 출력하는 프로그램을 작성하세요.
//        int sum = 0;
//        int num = 0;
//
//        for (int fum = 0; fum <=100; fum++) {
//            if (fum % 3 == 0) {
//                System.out.println("3의 배수: " +fum);
//            } else if (fum % 5 == 0) {
//                System.out.println("5의 배수: " + fum
//                );
//            }
//        }

        //사용자로부터 숫자를 입력받아, 해당 숫자까지의 합을 계산하는 프로그램을 작성하세요.
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("숫자를 입력하세요: ");
//        int number = scanner.nextInt();
//
//        int sum = calculateSum(number);
//
//        System.out.println("숫자 " + number + "까지의 합: " + sum);
//    }
//
//    public static int calculateSum(int n) {
//        if (n == 1) {
//            return 1;
//        } else {
//            return n + calculateSum(n - 1);
//        }
        Scanner scanner = new Scanner(System.in);

        System.out.print("숫자를 입력하세요: ");
        int number = scanner.nextInt();

        int sum = 0;
        int i = 1;
        while (i <= number) {
            sum += i;
            i++;
        }

        System.out.println("숫자 " + number + "까지의 합: " + sum);
        
        //0부터 10까지의 숫자를 거꾸로 출력하는 프로그램을 작성하세요.
        //구구단 중 7단을 거꾸로 출력하는 프로그램을 작성하세요.
        //별 찍기 문제: 다음과 같이 별을 출력하는 프로그램을 작성하세요.
    }
}
