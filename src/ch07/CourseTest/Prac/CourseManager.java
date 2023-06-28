package ch07.CourseTest.Prac;

import ch07.CourseTest.Course;

class CourseManager<OnlineCourse> {

    private Course[] courses; // Course 객체 배열
    private int count; // 현재 추가된 Course 개수
    public CourseManager(int capacity) {
        courses = new Course[capacity]; // capacity 크기의 Course 배열 생성
        count = 0; // 초기 개수는 0으로 설정
    }
    public void addCourse(Course course) {
        if (count < courses.length) { // 배열이 가득 차지 않았을 경우
            courses[count] = course; // 배열에 course 추가
            count++; // 추가된 개수 증가
        } else {
            System.out.println("CourseManager capacity is full."); // 배열이 가득 찬 경우 메시지 출력
        }
    }
    public void printCourses() {
        for (int i = 0; i < count; i++) { // 추가된 Course 개수만큼 반복
            Course course = courses[i]; // i번째 Course 객체 가져오기
//
//            System.out.println("과목 이름: " + course.getCourseName());
//            System.out.println("과목 코드: " + course.getCourseCode());
//            System.out.println("강사: " + course.getInstructor());
//            if (course instanceof OnlineCourse) { // OnlineCourse인 경우
//                OnlineCourse onlineCourse = (OnlineCourse) course; // OnlineCourse로 형변환
//                System.out.println("Platform: " + onlineCourse.getPlatform());
//            } else if (course instanceof LectureCourse) { // LectureCourse인 경우
//                LectureCourse lectureCourse = (LectureCourse) course; // LectureCourse로 형변환
//                System.out.println("강의실: " + lectureCourse.getRoom());
//                System.out.println("강의시간: " + lectureCourse.getTime());
//            }
//            System.out.println();
        }
    }
}
