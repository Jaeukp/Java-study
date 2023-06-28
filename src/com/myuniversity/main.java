package com.myuniversity;

import com.myuniversity.courses.Course;
import com.myuniversity.courses.CourseService;
import com.myuniversity.students.Student;

public class main {
    private static Object CourseService;

    public static void main(String[] args) {
        Course c = new Course("자바, 고급프로그래밍", 13);
        c.joinStudent(new Student("박재욱"));
        c.joinStudent(new Student("고대근"));

        System.out.println("--참가한 학생");
        // 참가한 학생 목록 꺼내오기
        Student[] students = c.getStudents();
        for (int i = 0; i < c.getNumOfStudents(); i++) {
            System.out.println(students[i].getName());
        }

    }
}
