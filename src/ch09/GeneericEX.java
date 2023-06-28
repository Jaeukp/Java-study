package ch09;

import java.util.ArrayList;
import java.util.List;

public class GeneericEX<T> {
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
            if (a.equals(target)) {
                count++;
            }
        }return count;
    }

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(1);
        numbers.add(4);
        numbers.add(1);

        int target = 1;

        GeneericEX<Integer> util = new GeneericEX<>();
        int occurrenceCount = util.countOccurrences(numbers, target);

        System.out.println("Number of occurrences of " + target + ": " + occurrenceCount);
    }


}
