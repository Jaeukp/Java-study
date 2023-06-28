package ch05;

public class MethodEx {
    public static void main(String[] args) {
        // Util 클래스 객체를 생성하고
        Utils util = new Utils();
        // 메서드 호풀 (call)
        int a = 10;
        int b = 5;

        //결과값 변수명(result)
        int result = util.sum(a, b);
        int result2 = util.sum(3, 5);
//        System.out.println(result);
        int[] arr = {1,2,3,4,5,6,7,8,9,10};


        util.sumArr(arr);

















//        Utils sum1 = new Utils();
//        int product = sum1.sum(1,4);
//        System.out.println(product);
//
//        System.out.println();
//
//        Utils Max = new Utils();
//        int find = Max.findMax(4,7);
//        System.out.println(find);
//
//        System.out.println();
//
//        Utils neSt = new Utils();
        

    }
}
