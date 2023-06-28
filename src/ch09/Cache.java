package ch09;

import java.util.ArrayList;
import java.util.List;

public class Cache<T> {
    private T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    private int countOccurrences(List<T> list, T target) {
        int count = 0;
        for (T a : list) {
            if (a.equals(target)){
                count++;
            }
        } return count;
    }

    public static void main(String[] args) {
        List<String> strList = new ArrayList<>();
//        numbers.add(1);
//        numbers.add(2);
//        numbers.add(3);
//        numbers.add(1);
//        numbers.add(4);
//        numbers.add(1);
//
//        int target = 4;   // 몇개가 있는지 찾을 특정 요소

        strList.add("apple");
        strList.add("banana");
        strList.add("apple");
        strList.add("cherry");
        strList.add("durian");
        strList.add("melon");

        String target = "apple";

        Cache<String> util = new Cache<>();
        int occurrenceCount = util.countOccurrences(strList, target);

        System.out.println("Number of occurrences of " + target + ": " + occurrenceCount);
    }
}
