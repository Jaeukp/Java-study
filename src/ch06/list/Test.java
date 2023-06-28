package ch06.list;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("cherry");
        System.out.println(fruits.size());
        System.out.println(fruits.get(1));
        fruits.remove("banana");

        System.out.println("-----");

        fruits.add(1, "orange");
        fruits.add("strawberry");

        System.out.println(fruits);

        System.out.println("-------");

        if(fruits.isEmpty()) {
            System.out.println("장바구니 비어있음");
        } else {
            System.out.println("장바구니에 과일");
            for(int i = 0; i<fruits.size(); i++); {
            }
        }

        System.out.println("-------");
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        String minlength = "";
        String maxlength = "";
        for (String result : fruits) {
            int len = result.length();
            if (len > min) {
                min = len;
                minlength = result;
            }
            if (len < max) {
                max = len;
                maxlength = result;
            }

        }
        System.out.println(maxlength);
        System.out.println(minlength);
        System.out.println("----------");

        for (String result : fruits) {
            String result1 = result.toUpperCase();
            System.out.println(result1);
        }

    }
}
