package ch03;

import java.util.Scanner;

public class Practicegoogle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int min = sc.nextInt();
        int add = sc.nextInt();
        int sum = add+min;

        while (sum >= 60) {
            sum -= 60;
            hour ++;
            if (hour >= 24){
                hour -= 24;
            }
        }
        System.out.println(hour + " " + sum);
    }
}
