package ch07;

public class Lecturer extends Person {
    private int careerTems;

    public Lecturer(String name, int age, int careerTems){
        super(name, age);
        this.careerTems = careerTems;
    }


    public void introduce() {
        System.out.println("저의 경력은" + this.careerTems + "입니다");
    }
    public void teach() {
        System.out.println(name + "이(가) 강의를 시작합니다.");
    }
}
