package ch07;

public class Main {
    public static void main(String[] args) {
        Person p = new Person("고대근", 39);
        p.introduce();


        System.out.println();
        Student s = new Student("고대근", 39, "000001");
        s.introduce();

        System.out.println();
        // 업캐스팅
        // Student 객체를 Person 타입으로 변환(부모타입으로변환)
        // 자식 객체를 부모 객체에 대입
        Person p2 = s;
        // 부모 객체의 자식 객체에서 재정의된 메서드 호출
        // 자식 객체의 매서드가 호출
        p2.work(); // Student에 study()
        p2.introduce(); // Student 의 introduce가 호출되었음.
        // 자식 객체의 추가된 메서드/필드는 접근불가
//        p2.study()  // 호출 불가
        Person p3 = new Lecturer("고대근", 39,11);
        p3.work(); // Lecturer에 teach()

        // 부모 객체를 자식 객체에 대입
        // 명시적 형변환
        // 그냥 형변환 하면 에러발생 가능성이 존재함.
        // 부모객체변수 p2.instanceof 자식클래스타입
        // Student -> Person, Person, Lerturer -> Person

        // 다향성(polymorphisn
//        pubilc void work(Person p) {
//            if(p instanceof Student) {
//                p.study();
//            } else if (p instanceof  Lecturer) {
//                p.teach();
//            }
//        }
        if (p2 instanceof Student) {
        Student s2 = (Student) p2;
        s2.study();
        }

        if (p3 instanceof Student) {
            Student s3 = (Student) p3;
        s3.study();
        }
    }

}
