package com.myuniversity.courses;

//다른 패키지에있는 클래스를 가져다 쓰는 방법
// import 패키지명....클래스명;
// import 패키지명...*; // 해당패키지 모든 클래스
// import co,.myuniversity.students.*;
// omport com.myuniversity.students.GraduateStudent;
import com.myuniversity.students.GraduateStudent;
import  com.myuniversity.students.Student;
import com.myuniversity.students.undergardudateStudent;
import com.myuniversity.students.Student;

import java.util.Random;
import java.util.RandomAccess;


public class Course {
    private  String name;
    private Student[] students;

    // final 변수
    // 상수(constant): 초기화만 가능하고, 변경 불가능한 값
//    private int maxSutdent = 20; // 과목에 몇명의 학생이 참여 가능한지
    // 상수는 대문자 snake-case 많이 사용한다.(관례, convention)
    private  final int MAX_STUDENT = 20; // 과목에 몇명의 학생이 참여 가능한지
    private int numOfStudents = 0; // 현재 과목에 몇명의 학생이 있는지
    private GraduateStudent[] graduateStudents;
    private  undergardudateStudent[] undergardudateStudents;

    public Course(String s, int i) {
    }

//    public Course (String name, int maxStudent) {
//        this.name = name;
//        this.maxStudent = maxStudent;
//        this.students = new Student[maxStudent];
//
//    }

    public String getName() {
        return this.name;
    }

    // 해당 코스에 학생 참가(추가)
    public void  joinStudent(Student student) {
        this.students[numOfStudents] = student;
        this.numOfStudents++;
        System.out.println("--" + student.getName() + "학생이 추가되었습니다.--");
    }

    public  Student[] getStudents() {
        return  students;
    }

    public int getNumOfStudents() {
        return numOfStudents;
    }

}
