package ch07;

// 인간 정보
public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age= age;
    }

    public void introduce() {
        System.out.println("안녕하세요. 제 이름은" + name + "이고, 나이는 " + age + "세 입니다.");
    }

    // 다형성을 이용해서
    // 현재 객체가 Student 알 수도 있고, Lecturer 일 수도 있음
    public void work() {
        if(this instanceof Student) {
            ((Student) this).study();
        } else if (this instanceof  Lecturer) {
            ((Lecturer)this).teach();
        }
    }
}
