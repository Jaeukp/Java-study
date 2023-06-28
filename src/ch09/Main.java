package ch09;

//import ch06mapaccount.Account;
import ch08.Paractice1.Account;
import com.myuniversity.courses.Course;
import com.myuniversity.students.Student;
import jdk.jshell.execution.Util;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        // List: 인터페이스, ArrayList: 구현클래스
        // <String>: 매개변수를 타입(클래스)으로 넣었습니다.
        // 매개변수를 타입으로 넣을 수 있게 하는 것이 제네릭(제너릭, 쥐네릭), generic
        List<String> list = new ArrayList<>();
        // 1. 타입을 컴파일 타임(코드짜는중)에 체크할 수 있다.
//        list.add(1);   // 에러발생, generic으로 String을 넣었기 때문에, Integer는 안됨
        list.add("aaaa");
        list.add("bbbb");

        for(String s : list) {
            s.toUpperCase();
        }

        // List는 String, Integer, Double....
        // 기능을 타입(클래스)별로 만들지 않았어도 됨.
        // 2. 코드를 타입 매개변수가지고 쉽게 재사용 가능함.
        List<Integer> lstNum = new ArrayList<>();
        lstNum.add(1);
        lstNum.add(2);

        // 오버로딩을 이용한 방법
//        Util util = new Util();
        // 오버로딩: add(Integer a, Integer b)
        // add(String a, String b)

        // 제네릭
//        Util<타입> util = new Util();
//        public T add(T a, T b);

//        Util<Integer> util = new Util(); // 정수에 처리를 해주는 기능을 제공
//        public Integer add(Integer a, Integer b)
//        util.add(3, 4)

//        Util<String> // 문자열에 처리를 해주는 기능을 제공
//        public String add(String a, String b)
//        util.add("dsbjhb", "ddd")

        // 제네릭을 쓸 수 있는 상황: 연산이나 로직이 똑같을때
        // 메서드명을 같은 걸 쓰고, 매개변수개수도 같은 걸 써
        // 타입만 다르다.

        // 모든 클래스 타입 가능한 스택 자료구조 사용
        GenericStack<String> stack = new GenericStack<>();
        GenericStack<Student> stackStudents = new GenericStack<>();
        GenericStack<Course> stackCourses = new GenericStack<>();
        GenericStack<Account> stackAccounts = new GenericStack<>();

        GenericQueue<Integer> queue = new GenericQueue<>();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
    }
}
