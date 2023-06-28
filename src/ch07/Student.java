package ch07;

// extends 부모클래스
// 부모클래스의 필드 및 메서드를 상속 받는다.
// inheritance(상속): 프로그래밍언어에서 상속은 자식이 부모를 선택해서 물려 받음
// SE(SW공학) -> generalization(일반화) -> inheritance(상속)
/*
   여러개의 클래스를 구현하는데, 일반적인 속성(attribute) 과 기능(operation)이 있다.
   그것을 부모 클래스로 만들고, 나머지 클래스들은 상속받고 필요한 것만 추가하자
 */
public class Student extends Person {
    // Student 는 name, age 필드, introduce 메서드를 그냥 사용할 수 있습니다.
    // 부모의 필드 외에 다른 필드를 추가했다.
    private String studentId; // 학번을 추가

    // 빈 생성자는 자동으로 상속받음
    // 하지만 매개변수가 있는 생성자는 상속할 때 별도로 선언해줘야함
    public Student(String name, int age, String studentId) {
        // 부모의 생성자를 호출
        // super(...)
        // 부모 객체도 실제로 생성이 됨
        super(name, age);
        this.studentId = studentId;
    }

    // 학생 연구(공부)
    // 부모의 메서드 외에 다른 메서드를 추가했다.
    public void study() {
        System.out.println(name + "이(가) 공부를 시작합니다.");
    }

    // overloading :  메서드 시그니처(메서드명, 메서드매개변수 타입) 메서드명은 동잃하고, 메서드매개변수개수 또는 타입만 바꿔서 정의

    // override: 부모클래스의 메서드를 재정의 메서드 시그니처는 동일하고 구현부만 변경함
    public void introduce() {
        // 기존에 Person의 introduce는 그대로 쓰고
        // 먼가 추가를 하겠다
        // super(부모)
        super.introduce();
        System.out.println("제 학번은 " + studentId + "입니다.");

    }
}
