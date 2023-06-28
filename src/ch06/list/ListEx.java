package ch06.list;

import com.myuniversity.students.Student;

import java.util.*;
import java.util.ArrayList;

//

public class ListEx {
    public static void main(String[] args) {
        List<String> lst = new ArrayList<String>();
        lst.add("apple");
        lst.add("banana");
        lst.add("cherry");
        lst.sort(null);
        // 내부적으로 구버전 자바이면 merge-sort, 현재자바버전이면 tin-sort

        Collections.sort(lst);
        for (String eln : lst) {
            System.out.println(eln);
        }

        System.out.println("--");

        Collections.reverse(lst);
        for (String eln : lst) {
            System.out.println(eln);
        }

        System.out.println("--------");

        List<Student> lstStudent = new ArrayList<Student>();
        lstStudent.add(new Student("조정빈"));
        lstStudent.add(new Student("김성우"));
        lstStudent.add(new Student("양수열"));

        // comp
//        List<Student> tmpLstStudent = new ArrayList<Student>();
//        System.out.println("-------");
//        Collections.sort(lstStudent);
//        for (Student s : lstStudent) {
//            System.out.println();
//        }

        // @ : at mark
        // pqrks@naver.com
        // 클래스명::필드명
        // 해당 클래스의 필드로 먼가를 하겠다.
        // 컬렉션 s.sort(lstStudent, Comparator.comparing(클래스명::필드(getter);;
        Collections.sort(lstStudent, Comparator.comparing(Student::getName));
        for (Student s : lstStudent) {
            System.out.println(s.getName());
        }
    }
}
