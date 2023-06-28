package ch05;

public class Student {
    // 찍어내는 틀인데, 멀찍어낼거냐 정보 저장하고 기능을 쓸 수 있는 객체(object)를 생성할 때
    // 문제 1:  학생의 이름(name)과 학년(grade)을 필드로 가지는 Student 클래스를 작성하십시오.
    private  String name;
    private int grade;

    // 매서드: 기능(function)
    // 학생 이름(name)을 입력 저장하는 기능
    // CRUD(create read update delete)
    // 매개변수(parameter)
    // 반환값이 없기 때문에 void 를 씀
    // 매서드 선언 할 때
    // 1. public 쓴다(99.99%)
    // 2. 요구사항의 맞게 매서드(기능) 이름을 써(camel-case)
    // 3. 입력값을 받는지 않 받는지
    //      -> 입력을 받는다 (매개변수 선언)
    //          -> 매게변수선언 -> 매개변수의 이름부터
    //                        -> 매개변수의 자료형
    // 4. 구현(implementation)할 코드를 작성
    // 5. 변환값이 있나? : 매서드를 실행(호출) 하고 나서 튀어나오는 값이 있냐 없냐
    //      -> 없음 -> 반환 타입을 매서드명 앞에 적어줌(void)
    public void setName(String name) {
        // 학생이름을 입력받아서 저장
        // 객체 필드
        this.name = name;
    }

    // 학생 정보의 이름을 가져오는 메서드
    // 학생이름 필드에 넣었네, 필드값을 반환하면 된다
    // 반환값의 자료형이 String

    // .sort 메서드를 실행하면
    // 객체별로 compareTo 메서드를 실행하여 정렬해줌
    // 자바 객체를 특정 필드로 정렬하는 방법(chatgpt)
    // java sort by specific field
//    @Override
    public  int Student (Student o) {
        return this.name.compareTo(o.name);

    }


    public String getName() {
        return this.name;
    }


    private String named;
    private int grades;
    private int age;

    public void promoteGrade(){
        grade++;
    }

    public Student(){

    }

    public Student(String name, int grade, int age) {
        this.name = name;
        this.grade = grade;
        this.age = age;
    }



    public void SetName(String newName){
        this.name = newName;
    }
    public void SetGrade(int newGrade){
        this.grade = newGrade;
    }

    public void displayStudentDetails(){
        System.out.println("학생 이름 : " + name);
        System.out.println("학년 : " + grade);
        System.out.println("나이 : " + age);
    }

    public void SetAge(int newAge){
        this.age = newAge;
    }
    public int GetAge(){
        return this.age;
    }
}
