package ch06.map;

//import com.myuniversity.students.Student;
import ch06.map.Student;

import java.util.*;



public class Main2 {
    public static void main(String[] args) {
        Map<String, Student> students = new HashMap<>();
        students.put("0001", new Student("Kang", 26));
        students.put("0002", new Student("Kim", 27));
        students.put("0003", new Student("Jin", 29));
        students.put("0004", new Student("Choi", 30));
        students.put("0005", new Student("Park", 24));

        //생성한 맵에서 특정 학번의 학생을 검색하는 코드를 작성하세요.
//        int studentIdTosearch = 1;
//        Student student = students.get(studentIdTosearch);
        Student findNum = students.get("0005");
        System.out.println("이름은 : " + findNum.getName() + ", 나이는 : " + findNum.getAge());


//        Scanner sc = new Scanner(System.in);
//        System.out.print("검색 할 학번 검색 : ");
//        Student findNum = students.get(sc.nextLine());
//        for (Map.Entry<String, Student> entry : students.entrySet()) {

//        }
//        for (String key : students.keySet()) {
//            System.out.println("학번" + key + ", 학생명: " + students.get(key).getName() + " 나이: " + students.get(key).getAge());
//        }
//        boolean containsKey = students.containsKey("Kim");
//        boolean containsValue = students.containsValue(27);
//        System.out.println("특정학생 " + containsKey);
        //


        //생성한 맵의 모든 학생을출력하는 코드를 작성하세요
//            for (String allstudents : students.keySet()) {
//                System.out.println(allstudents);
//            }
//        for (Map.Entry<String, Student> entry : students.entrySet()){
//            String grade = entry.getKey();
//            String name = entry.getValue().getName();
//            System.out.println("학번: " + entry.getKey() + ", 이름: " + name);
//
//        }
        //생성한 맵에 있는 학생들의 나이 평균을 계산하는 코드를 작성
        int totalAge = 0;
//        int numStudents = students.size();

//        for (Student student : students.values()) {
//            totalAge += student.age;
//        }

        double averageAge = (double) totalAge / students.size();
        System.out.println("평균 나이는 :" + averageAge);

        // 생성한 맵에 있는 학생들 중 가장 나이가 많은 학생을 찾는 코드를 작성하세요

//             int top = 0;
//                for (Student topAge : students.values()){
//                    if (top < topAge.getAge()){
//                        top = topAge.getAge();
//                    }
//                }
//                for (Student topAge : students.values()){
//                    if (top == topAge.getAge()){
//                        System.out.println("이름은 : " + topAge.getName() + ",나이는 : "
//                                + topAge.getAge());
//                    }
//                }
//            int max = 0; // 나이가 가장 많은 학생
//        for (String key : students.keySet()) {
//            if (students.get(key).getAge() > max){
//                max = students.get(key).getAge();
//            }
//        }
//        for (Student student : Student.students.values()){
//            if (student.getAge() == max){
//                System.out.println(student.getName());
//                break;
//            }
//        }
        // 생성한 맵에 있는 학생들의 이름을 알파벳 순서로 정렬하여 출력하는 코드
//        Map<String, Integer> sortedStudents = new TreeMap<>();

//        for (String student : sortedStudents.keySet()) {
//            System.out.println(sortedStudents);

//        List<Student> sortedst = new ArrayList<>(students.values());
//        sortedst.sort(Comparator.comparing(student -> student.name));
//        for (Student student : sortedst) {
//            System.out.println(student.getName() + " " + student.getAge());
//            System.out.println(student.getName());
//        }
//        List<Student> sortedst = new ArrayList<>(students.values());
//        sortedst.sort(C);
//        sortedst.sort(Comparator.comparing(student -> student.name));
//        for (Student student : sortedst) {
//            System.out.println(student.getName());
//        }


//        sortedStudents.sort(Comparator.comparing(student -> student.name));
//        for (Student student : sortedStudents) {
//            System.out.println(student.name);
//        }

//        List<Student> sortedNames = new ArrayList<>(students.values());
//
//        Collections.sort(students.get());
//
//        for (String name : sortedNames) {
//            System.out.println(name);

//        ArrayList<Student> studentList = new ArrayList<>(students.values());
//        Collections.sort(studentList, Comparator.comparing(Student :: getName));
//        for (Student key : studentList) {
//            System.out.println(key.getName());


        // 생성한 맵에서 학생들의 이름에 특정 문자열이 포함되어 있는 경우만 출력하는 코드
//    Map<String, Integer> studentsMap = new HashMap<>();
        String substring = "P";
        for (Student scc : students.values()) {
            if (scc.name.contains(substring)) {
                System.out.println(scc.name);
            }
        }
//    for (String name : studentsMap()) {
//        if (name.contains(substring)) {
//            System.out.println(name);

//    String substring = "a";
//for (Student student : studentsMap.values()) {
//        if (student.name.contains(substring)) {
//            System.out.println(student.name);
//        }
//    }
//    studentsMap.keySet()
//            .stream()
//            .filter(Student student :: stude)
//            .forEach(System.out::println);

        // 맵에 측정 이름의 학생이 있는지 확인하는 코드를 작성
        String str = "Choi";
        for (Student acs : students.values()) {
            if (acs.name.equals(str)) {
                System.out.println(acs.name);
            }
        }


    }
}