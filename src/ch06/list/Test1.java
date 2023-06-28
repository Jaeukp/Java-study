package ch06.list;

import java.net.CookieHandler;
import java.util.*;

public class Test1 {
    public static void main(String[] args) {
        // 빈 List(ArrayList)를 생성하세요.
        List<String> list = new ArrayList<String>();
        // List에 "사과", "바나나", "체리"를 순서대로 추가하세요.
        list.add(new String("사과"));
        list.add(new String("바나나"));
        list.add(new String("체리"));
        // List에 있는 요소의 개수를 출력하세요.
        System.out.println(list.size());
        System.out.println("--------------");
        // List의 두 번째 요소를 출력하세요.
        System.out.println(list.get(1));
        System.out.println("--------------");
        // List에서 "바나나"를 제거하세요.
        list.remove("바나나");
        System.out.println(list);
        System.out.println("--------------");
        // List에 "딸기"를 추가하고, "사과"와 "딸기" 사이에 "오렌지"를 삽입하세요.
        list.add(1,"딸기");
        list.add(1,"오렌지");
        System.out.println(list);
        System.out.println("--------------");
        // List에 있는 모든 요소를 출력하세요.
        for (String fruit : list){
            System.out.println(fruit);
        }
        System.out.println("--------------");
        // List가 비어 있는지 확인하세요.
        if (list.isEmpty()){
            System.out.println("null");
        } else {
            System.out.println(list);
        }
        System.out.println("--------------");
        // List에 있는 요소들을 알파벳순으로 정렬하세요.
        List<String> fruit = new ArrayList<String>();
        fruit.add("Orange");
        fruit.add("Apple");
        fruit.add("Strawberry");
        fruit.add("cherry");
        fruit.sort(String.CASE_INSENSITIVE_ORDER);
        System.out.println(fruit);
        System.out.println("--------------");
        // List에 있는 요소들 중에서 가장 긴 문자열을 찾아 출력하세요.
        // List에 있는 요소들 중에서 가장 짧은 문자열을 찾아 출력하세요.
        int max = Integer.MAX_VALUE;
        System.out.println(max);
        int min = Integer.MIN_VALUE;
        String minlength = "";
        String maxlength = "";
        for (String result : fruit){
            int len = result.length();
            if (len > min){
                min = len;
                minlength = result;
            }
            if (len < max) {
                max = len;
                maxlength = result;
            }
        }
        System.out.println("가장 긴 문자열은 :" + minlength);
        System.out.println("가장 짧은 문자열은 :" + maxlength);
        System.out.println("--------------");

        // List의 모든 요소를 대문자로 변환하세요.
        for(String result : fruit){
            String result1 = result.toUpperCase();
            System.out.println(result1);
        }
        System.out.println("--------------");
        for(String result : fruit){
            String result1 = result.toLowerCase();
            System.out.println(result1);
        }
        System.out.println("--------------");

        // List에 있는 요소들을 거꾸로 배치하세요.
        Collections.reverse(fruit);
        System.out.println(fruit);

        for(String result : fruit){
            if(result.equals("cherry")){
                System.out.println("존재");
            } else {
            }
        }
        System.out.println("--------------");

        // List의 마지막 요소를 제거하세요.
        fruit.remove(fruit.size()-1);
        System.out.println(fruit);
    }
}