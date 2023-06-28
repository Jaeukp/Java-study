package ch04;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        // 배열(array)은 동일한 자료형(타입)의 여러 개의 값을 저장하는 자료구조(data structure)

        // 배열 초기화 방법
        // 타입[] 배열이름 = new 타입[크기];
        int[] numbers = new int [5]; // 크기가 5인 배열 생성

        // 배열 요소(element)에 값을 할당(초기화) 및 참조(사용)
        // 배열이름[번호] = 값;
        numbers[0] = 10;
        numbers[1] = 5;
        //System.out.println(numbers[0]);

        // 배열의 크기
        // 배열이름.length
        // int arrayLength = numbers.length;
        //System.out.println(arrayLength);


        // 배열을 반복문 접근
        // 0에서 시작해서 배열의 길이보다 작을 때까지
        // 배열의 크기가 5인배열
        /*for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);

        }
        */
        // 배열 요소에 초기값을 넣어서 초기화
        int[] numbers2 = { 5,10,15 };
        for (int i = 0; i < numbers2.length; i++) {
            System.out.println(numbers2[i]);
        }
        // 배열의 크기를 나중에 정하기
        int[] numbers3;
        //........code
        // 배열 크기가 초기화 되기전에 참조하면 에러
        // 배열 크기 초기화, 숫자는 0 기반으로 초기화 된다
        numbers3 = new int[3];
        System.out.println(numbers3[0]);

        // 사용자로부터 콘솔창(터미널)에서 키보드로 입력을 받을때
        // Scanner를 초기화
        Scanner scanner = new Scanner(System.in);

        // 정수 값 1개를 입력 받을 수 있음
        System.out.print("정수 값을 입력 하세요 : ");
        int inputNum = scanner.nextInt();
        System.out.println("입력 받은 숫자는 : " + inputNum) ;
    }
}
