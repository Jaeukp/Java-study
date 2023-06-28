package Solving;

import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("문자열 입력: ");
        String str = scanner.nextLine();

        String convertedStr = convertCase(str);
        System.out.println("변환된 문자열: " + convertedStr);
    }

    public static String convertCase(String str) {
        char[] chars = str.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];

            if (Character.isUpperCase(c)) {
                chars[i] = Character.toLowerCase(c);
            } else if (Character.isLowerCase(c)) {
                chars[i] = Character.toUpperCase(c);
            }
        }

        return new String(chars);
    }
}