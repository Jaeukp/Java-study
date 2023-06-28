package ch08.Paractice1;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
//        Account account = new Account();
//        account.calculateTax();
//    }
//        Map<String, Integer> students = new HashMap<>();
//        students.put("kim", 80);
        Gradable student = new Student("Kim", 85);
        String grade = student.calculateGrade();
        System.out.println("Grade: " + grade);

    }
}
