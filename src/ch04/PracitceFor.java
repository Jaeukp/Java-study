package ch04;

public class PracitceFor {
    public static void main(String[] args) {
// 문제 1 : 배열의 모든 요소의 합 구하기 정수로 이루어진 배열이 주어졌을 때, 향상된 for문을 사용하여 배열의 모든 요소의 합을 계산하는 프로그램을 작성해보세요.
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int number : numbers ){
            sum += number;
        }
        System.out.println("배열의 합: " + sum);

// 문제 2 :  배열에서 최댓값 찾기 정수로 이루어진 배열이 주어졌을 때, 향상된 for문을 사용하여 배열에서 최댓값을 찾는 프로그램을 작성해보세요.
        int[] newNumbers = {7, 14, 3, 8, 21, 5};
        int max = newNumbers[0];
        for (int newNumber : newNumbers){
            if (newNumber > max){
                max=newNumber;
            }
        }
        System.out.println("최댓값: " + max);
    }
}
