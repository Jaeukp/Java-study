package com.myuniversity.courses;

import ch05.accessModifier.Animal;

// 학과 과목과 관련된 기능을 제공해주는 클래스
public class CourseService {

//    private Subject[] subjectslist; //과목 목록
//    private int NumSubjects; // 과목 개수
//    private Scanner scanner; // 사용자 입력 개체
//    private  Student addStudent;
//
//    public CourseService(int maxSubject, int maxStudent) {
//        subjectslist = new Subject[maxSubject];
//        NumSubjects = 0;
//        scanner = new Scanner(System.in);
//    }
//
//    public void addSubject(String subjectName) {
//        Subject acc = new Subject();
//        subjectslist[NumSubjects] = acc;
//        System.out.println(subjectslist[NumSubjects]);
//        NumSubjects++;
//
//    }
//    public void AddStudent(String add);
//
//
//    public void  printStudentByCourseName() {
//        for(Subject acc : subjectslist) {
//            if(acc != null) {
//                System.out.println("과목: " + "을 수강중인 학생" );
//                break;
//            }
//        }
//    }
//
//    public  void run() {
//        while (true) {
//            System.out.println("학과 관리 프로그램");
//            System.out.println("1. 교과목록");
//            System.out.println("2. 교과선택");
//            System.out.println("3. 과목별 참여한 학생");
//
//            int choice = scanner.nextInt();
//            scanner.nextLine();
//
//            if (choice == 0) {
//                System.out.println("수강신청하세요");
//                break;
//            }
//
//            switch (choice) {
//                case 1:
//                    System.out.println("과목: ");
//                    String subjectName = scanner.nextLine();
//                    addSubject(subjectName);
//                    break;
//                case 2:
//                    printStudentByCourseName();
//                    break;
//                case 3:
//            }
//        }
//    }




    // 서비스를 실행할 수 있는 run 메서드
    // run메서드를 Main.main 메서드에서 실행하면 됨.
    // 코스 생성 기능
    // 키보드 입력 객체
    // 과목 목록 저장하는 배열
    // 과목 생성 기능(createCourse)
    // 과목에 참여 학생 추가 기능(assignCourse)
    // 과목에 참여한 학생 출력 기능(printStudentByCourseName)
    // 프로그램 종료(무한반복 break)
    Animal animal = new Animal();

    public void test() {
        // protected 메서드는 다른 패키지에서 사용을 못해
        // animal.eat();
    }

}
