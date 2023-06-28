package ch06.list;

import java.util.*;


public class Practice {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
//        ArrayList List = new ArrayList();
        list.add(new String("banana"));
        list.add(new String("cherry"));

        for (String name : list) {
            System.out.println(name);
        }

        list.set(0, new String("banana"));
        list.set(1, new String("cherry"));
        for (String name : list) {
            System.out.println(name);
        }
        System.out.println(list.size());
        list.remove("banana");

        list.add(new String("apple"));
        list.add(new String("orange"));
        list.add(new String("strawberry"));

        for (String name : list) {
            System.out.println(name);
        }

        List<String> lstStr = new ArrayList<String>(List.of("banana", "apple", "cherry"));
        lstStr.add("orange");

        for (String str : lstStr) {
            System.out.println(str);
        }

        boolean isNotEmpty = list != null && !list.isEmpty();
        if (isNotEmpty) {
            System.out.println("장바구니에 물건이 있습니다");
        } else {
            System.out.println("장바구니가 비었습니다");
        }

        System.out.println("--------");

        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("A", "B", "C", "D", "E", "F"));
        System.out.println("과일: " + list);

        list.sort(Comparator.naturalOrder());
        System.out.println("오름차순:" + list);

        list.sort(Comparator.reverseOrder());
        System.out.println("내림차순:" + list);

        list.sort(String.CASE_INSENSITIVE_ORDER);
        System.out.println("대소문자 구분없이 오름차순 : " + list);

        list.sort(Collections.reverseOrder(String.CASE_INSENSITIVE_ORDER));
        System.out.println("대소문자 구분없이 내림차순 : " + list);

//        Collections.sort(list);
//        for (String name : list) {
//            System.out.println(name);
//        }

//        System.out.println("--------");
//
//        Scanner in=new Scanner(System.in);
//        String input = in.next();
//        String[] arr = input.split(" ");
//
//        int length = 0;
//        int index = 0;
//
//        for(int i=0; i<arr.length; i++) {
//            if(length < arr[i].length()) {
//                length = arr[i].length();
//                index = i;
//            }
//        }
//
//        System.out.println(arr[index]);
        System.out.println("-------------------");
        int min = Integer.MIN_VALUE; // 정수의 최대 값 : 21억
        int max = Integer.MAX_VALUE; // 정수의 최소 값 : -21억
        String answer = ""; // null
        // String[] s = str.split(" ");
        for (String x : list) {
            System.out.println(x + " " + x.length());
            if (min < x.length()) { // -21 < 10
                min = x.length(); // 길이를 출력
                // 10 = Strawberry;
                // Strawberry;
                // 변수 = 길이가 10인 값은 이거다
                answer = x; // 필터 값
            }

            if (min < x.length()) { // -21 < 10
                min = x.length(); // 길이를 출력
                // 10 = Strawberry;
                // Strawberry;
                // 변수 = 길이가 10인 값은 이거다
                answer = x; // 필터 값
            }
        }
        System.out.println(answer);
    }
}