//package Solving;
//
//public class Course {
//    class Course {
//        private String title; // 강좌 제목
//        private String instructor; // 강사 이름
//
//        public Course(String title, String instructor) {
//            this.title = title;
//            this.instructor = instructor;
//        }
//
//        public String getTitle() {
//            return title;
//        }
//
//        public String getInstructor() {
//            return instructor;
//        }
//    }
//
//    class ProgrammingCourse extends Course {
//        private String programmingLanguage; // 프로그래밍 언어
//
//        public ProgrammingCourse(String title, String instructor, String programmingLanguage) {
//            super(title, instructor);
//            this.programmingLanguage = programmingLanguage;
//        }
//
//        public String getProgrammingLanguage() {
//            return programmingLanguage;
//        }
//    }
//
//    class MathCourse extends Course {
//        private int credit; // 학점
//
//        public MathCourse(String title, String instructor, int credit) {
//            super(title, instructor);
//            this.credit = credit;
//        }
//
//        public int getCredit() {
//            return credit;
//        }
//    }
//
//    class CourseManager {
//        private Course[] courses; // 강좌 배열
//        private int count; // 현재 배열에 추가된 강좌 개수
//
//        public CourseManager() {
//            courses = new Course[10]; // 최대 10개의 강좌를 관리할 수 있는 배열
//            count = 0;
//        }
//
//        public void addCourse(Course course) {
//            if (count < courses.length) { // 배열이 가득 차지 않았을 경우
//                courses[count] = course; // 강좌를 배열에 추가
//                count++;
//                System.out.println("Course added successfully.");
//            } else {
//                System.out.println("Course array is full. Cannot add more courses.");
//            }
//        }
//
//        public void printCourses() {
//            System.out.println("Course List:");
//            for (int i = 0; i < count; i++) {
//                Course course = courses[i]; // 배열에서 강좌 객체 가져오기
//                System.out.println("Title: " + course.getTitle()); // 강좌 제목 출력
//                System.out.println("Instructor: " + course.getInstructor()); // 강사 이름 출력
//
//                // 프로그래밍 강좌인 경우 프로그래밍 언어 출력
//                if (course instanceof ProgrammingCourse) {
//                    ProgrammingCourse programmingCourse = (ProgrammingCourse) course;
//                    System.out.println("Programming Language: " + programmingCourse.getProgrammingLanguage());
//                }
//                // 수학 강좌인 경우 학점 출력
//                else if (course instanceof MathCourse) {
//                    MathCourse mathCourse = (MathCourse) course;
//                    System.out.println("Credit: " + mathCourse.getCredit());
//                }
//
//                System.out.println("--------------------");
//            }
//        }
//    }
//
//    public class Main {
//        public static void main(String[] args) {
//            CourseManager courseManager = new CourseManager();
//
//            Course course1 = new Course("Introduction to Java", "John Doe");
//            ProgrammingCourse course2 = new ProgrammingCourse("Python Fundamentals", "Jane Smith", "Python");
//            MathCourse course3 = new MathCourse("Calculus 101", "Alice Johnson", 3);
//
//            courseManager.addCourse(course1); // 강좌 추가
//            courseManager.addCourse(course2);
//            courseManager.addCourse(course3);
//
//            courseManager.printCourses(); // 모든 강좌 정보 출력
//        }
//    }
//
//    class Course {
//        private String title; // 강좌 제목
//        private String instructor; // 강사 이름
//
//        public Course(String title, String instructor) {
//            this.title = title;
//            this.instructor = instructor;
//        }
//
//        public String getTitle() {
//            return title;
//        }
//
//        public String getInstructor() {
//            return instructor;
//        }
//    }
//
//    class ProgrammingCourse extends Course {
//        private String programmingLanguage; // 프로그래밍 언어
//
//        public ProgrammingCourse(String title, String instructor, String programmingLanguage) {
//            super(title, instructor);
//            this.programmingLanguage = programmingLanguage;
//        }
//
//        public String getProgrammingLanguage() {
//            return programmingLanguage;
//        }
//    }
//
//    class MathCourse extends Course {
//        private int credit; // 학점
//
//        public MathCourse(String title, String instructor, int credit) {
//            super(title, instructor);
//            this.credit = credit;
//        }
//
//        public int getCredit() {
//            return credit;
//        }
//    }
//
//    class CourseManager {
//        private Course[] courses; // 강좌 배열
//        private int count; // 현재 배열에 추가된 강좌 개수
//
//        public CourseManager() {
//            courses = new Course[10]; // 최대 10개의 강좌를 관리할 수 있는 배열
//            count = 0;
//        }
//
//        public void addCourse(Course course) {
//            if (count < courses.length) { // 배열이 가득 차지 않았을 경우
//                courses[count] = course; // 강좌를 배열에 추가
//                count++;
//                System.out.println("Course added successfully.");
//            } else {
//                System.out.println("Course array is full. Cannot add more courses.");
//            }
//        }
//
//        public void printCourses() {
//            System.out.println("Course List:");
//            for (int i = 0; i < count; i++) {
//                Course course = courses[i]; // 배열에서 강좌 객체 가져오기
//                System.out.println("Title: " + course.getTitle()); // 강좌 제목 출력
//                System.out.println("Instructor: " + course.getInstructor()); // 강사 이름 출력
//
//                // 프로그래밍 강좌인 경우 프로그래밍 언어 출력
//                if (course instanceof ProgrammingCourse) {
//                    ProgrammingCourse programmingCourse = (ProgrammingCourse) course;
//                    System.out.println("Programming Language: " + programmingCourse.getProgrammingLanguage());
//                }
//                // 수학 강좌인 경우 학점 출력
//                else if (course instanceof MathCourse) {
//                    MathCourse mathCourse = (MathCourse) course;
//                    System.out.println("Credit: " + mathCourse.getCredit());
//                }
//
//                System.out.println("--------------------");
//            }
//        }
//    }
//
//    public class Main {
//        public static void main(String[] args) {
//            CourseManager courseManager = new CourseManager();
//
//            Course course1 = new Course("Introduction to Java", "John Doe");
//            ProgrammingCourse course2 = new ProgrammingCourse("Python Fundamentals", "Jane Smith", "Python");
//            MathCourse course3 = new MathCourse("Calculus 101", "Alice Johnson", 3);
//
//            courseManager.addCourse(course1); // 강좌 추가
//            courseManager.addCourse(course2);
//            courseManager.addCourse(course3);
//
//            courseManager.printCourses(); // 모든 강좌 정보 출력
//        }
//    }
//import java.util.ArrayList;
//import java.util.List;
//
//    public class CourseManager {
//        private List<Course> courses;
//
//        public CourseManager() {
//            courses = new ArrayList<>();
//        }
//
//        public void addCourse(Course course) {
//            courses.add(course);
//        }
//
//        public void printCourses() {
//            for (Course course : courses) {
//                System.out.println("Title: " + course.getTitle());
//                System.out.println("Instructor: " + course.getInstructor());
//                System.out.println("--------------------");
//            }
//        }
//
//        public List<Course> getCourseByInstructor(String instructor) {
//            List<Course> coursesByInstructor = new ArrayList<>();
//            for (Course course : courses) {
//                if (course.getInstructor().equals(instructor)) {
//                    coursesByInstructor.add(course);
//                }
//            }
//            return coursesByInstructor;
//        }
//    }
//}


