package ch03;

// 도트그래픽(x,y 축)
// 행(가로, y) 이게 더 상위개념, 열 (세로, x) 이게 하위 개념
// 반복문을 돌리려면, 가장 바깥 반복문이 행을 제어하는 반복문
// 1번째행 -> 1번째열, 2번째열......, 밑으로 내려감
// 2번째행 -> 1번째열, 2번째열......, 밑으로 내려감
public class Excercise6 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++){
            for (int a = 0; a < 5-i; a++){
                System.out.print(" ");
            }
            for (int j = 0; j < i*2+1; j++){
                System.out.print("*");
            }

            System.out.println();
        }

    }
}
