package ch05;

public class Utils {
    public static void main(String[] args) {
    }
    // 메서드 5개를 작성
// 1. 두 개의 정수를 매개변수로 받아서, 그 합을 반환하는 sum이라는 이름의 메서드를 작성하세요.
    public int sum(int num1, int num2) {
        // value(값, 가치)
        int value = num1 + num2;
        System.out.println("결과는 " + value + "입니다.");
        return value;
    }

    // 2. 두 개의 정수를 매개변수로 받아서 그 중 더 큰 수를 반환하는 findMax라는 메서드를 작성하세요.
    public int findMax(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
// 3. 정수 배열을 매개변수로 받아서 배열의 모든 요소를 더한 값을 반환하는 메서드를 작성하세요.
    public int sumArr(int[] arr) {
        int sum = 0;

        for(int val : arr) {
            // 누산(accumulation)
            // sum += val;
            sum = sum + val;
        }

        return sum;
    }

//    public int sumArray(int[] Arr){
//        int sum = 0;
//        for (int numArr : Arr){
//            sum += numArr;
//        }
//        return sum;
//    }
// 4. 문자열 배열을 매개변수로 받아서 가장 긴 문자열을 반환하는 메서드를 작성하세요.
    public String newString(String[] Arr){
        String longSt="";
        for (String newSt : Arr) {
            if (newSt.length() > longSt.length()){
                longSt = newSt;
            }
        }
        return longSt;
    }
// 5. 정수 배열을 매개변수로 받아서 배열의 요소들 중에서 짝수의 개수를 반환하는 메서드를 작성하세요.
    public int countNum(int[] numBer){
        int count = 0;
        for (int numCount : numBer){
            if (numCount % 2 ==0){
                count ++;
            }
        }
        return count;
    }
}

