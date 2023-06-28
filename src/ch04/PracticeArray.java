package ch04;

import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;

public class PracticeArray {
    public static void main(String[] args) {
// 문제 1: 정수형으로 구성된 길이 5의 배열을 선언하고, 인덱스 2의 요소에 7을 할당하고 출력하세요.
        /*int numbers[] = new int[5];
        numbers[2] = 7;
        System.out.println(numbers[2]);*/
// 문제 2: 문자열로 구성된 길이 3의 배열을 선언하고, 각 요소에 "Java", "Python", "C++"을 할당하고 출력하세요.
        /*String[] lanagues = new String[3];
        lanagues[0] = "Java";
        lanagues[1] = "Python";
        lanagues[2] = "C++";
        for (int i = 0; i < lanagues.length; i++) {
            System.out.println(lanagues[i]);
        }*/
// 문제 3: 실수형으로 구성된 길이 4의 배열을 선언하고, 사용자로부터 값을 입력받아 각 요소에 할당하고 출력하세요.
        /*Scanner sc = new Scanner(System.in);
        double[] stNum = new double[4];

        for (int i = 0; i < stNum.length; i++) {
            System.out.print("값을 입력하세요 : ");
            stNum[i] = sc.nextDouble();
        }
        for (int i = 0; i < stNum.length; i++) {
            System.out.println(stNum[i]);
        }*/
// 문제 4: 정수형으로 구성된 길이 7의 배열을 선언하고, 1부터 7까지의 숫자를 할당하고 출력하세요.
        /*int Numbers[] = new int[7];
        for (int i = 0; i < Numbers.length; i++) {
            Numbers[i] = i + 1;
            System.out.println(Numbers[i]);

        }*/
// 문제 5 : 정수형으로 구성된 길이 6의 배열을 선언하고, 1부터 6까지의 숫자 중 짝수만 할당하고 출력하세요.
        /*int Numbers[] = new int[6];
        for (int i = 0; i < Numbers.length; i++) {



        }*/
// 문제 6 : 정수형으로 구성된 길이 5의 배열을 선언하고, 모든 요소를 0으로 초기화하고 출력하세요.
        /*int Numbers[] = new int[5];
        for (int i = 0; i < Numbers.length; i++) {
            Numbers[i] = 0;
            System.out.println(Numbers[i]);

        }*/

// 문제 7 : 정수형으로 구성된 길이 4의 배열을 선언하고, 사용자로부터 4개의 정수를 입력받아 배열에 할당하고, 배열의 모든 요소의 합을 출력하세요.
        /*int Numbers[] = new int[4];
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < Numbers.length; i++) {
            System.out.print("정수를 입력하세요 : ");
            Numbers[i] = sc.nextInt();
            sum += Numbers[i];
        }

        System.out.println("합계는 : " + sum);*/

// 문제 8 : 정수형으로 구성된 길이 5의 배열을 선언하고, 사용자로부터 5개의 정수를 입력받아 배열에 할당하고, 배열에서 가장 큰 값과 가장 작은 값을 출력하세요.
        /*int Numbers[] = new int[5];
        Scanner sc = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < Numbers.length; i++) {
            System.out.print("정수를 입력하세요 : ");
            Numbers[i] = sc.nextInt();
            if (Numbers[i] > max) {
                max = Numbers[i];
            }
            if (Numbers[i] < min) {
                min = Numbers[i];
            }
        }
        System.out.println(max);
        System.out.println(min);*/
// 문제 9 : 문자열로 구성된 길이 5의 배열을 선언하고, 사용자로부터 5개의 이름을 입력받아 배열에 할당하고, 배열을 알파벳순으로 정렬하여 출력하세요.
        /* String apla[] = new String[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < apla.length; i++) {
            System.out.print("알파벳을 입력하세요 : " );
            apla[i] = sc.nextLine();
        }
        Arrays.sort(apla);
        for (int i = 0; i < apla.length; i++) {
            System.out.println(apla[i]);*/
// 문제 10 : 정수형으로 구성된 길이 6의 배열을 선언하고, 사용자로부터 6개의 정수를 입력받아 배열에 할당하고, 배열의 요소 중 홀수의 개수를 출력하세요
        int Numbers[] = new int[6];
        Scanner sc = new Scanner(System.in);
        int count = 0;
        for (int i = 0; i < Numbers.length; i++) {
            System.out.print("정수를 입력 하세요 : ");
            Numbers[i] = sc.nextInt();
            if (Numbers[i] % 2 != 0){
                count++;
            }
            }
        System.out.println("총 합은 : " + count);

        }
    }
