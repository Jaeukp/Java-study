package ch04;

public class Matrix {
    public static void main(String[] args) {
        // 다차원 배열
        // 10, 5, 10, 7

        // 2차원 배열
        /*  5 x 4 형태 배열
            0 9 10 15
            5 7 15 22
            8 3 14 40
         */
        // 2차원 배열 초기화
        // [행][열]
        int [][] matrix = new int[5][3];

        matrix[0][0] = 1;
        matrix[2][3] = 4;

        // 행단위 반복문
        for (int i = 0; i < 3; i++) {
            // 0행,1행,2행

            //열단위 반복문
            for (int j = 0; j < 4; j++) {
                // 0행-1열.... 3행-4열
                matrix[i][j] = i + j;
            }
        }
    }
}
