package ch04;

import java.util.Scanner;

public class practiceMatrix {
    // 문제 1 : 3x3 크기의 정수형 2차원 배열을 생성하고, 사용자로부터 값을 입력받아 배열에 저장한 후, 저장된 값을 출력하는 프로그램을 작성해보세요
    public static void main(String[] args) {
        int[][] matrix = new int[3][3];
        Scanner scanner = new Scanner(System.in);

        System.out.println("정수 값을 입력하세요:");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        System.out.println("입력된 배열 값:");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}






