package ch06.map;

import java.util.Scanner;

public class Student {
    String name;
    int age;
    int number;
//    private Scanner scanner;


    //    int grade;
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
//        this.grade = grade;

        Scanner sc = new Scanner(System.in);
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}

