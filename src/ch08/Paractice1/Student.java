
package ch08.Paractice1;
public class Student implements Gradable{
    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }
    // 학생의 이름을 반환하는 getter 매서드
//    public String getName() {
//        return name;
//    }
//    // 학생의 이름을 설정하는 setter 메서드
//    public void setName(String name) {
//        this.name = name;
//    }
    // 학생의 성적을 반환하는 setter 메서드
//    public int getScore() {
//        return score;
//    }
//    // 학생의 성적을 설정하는 setter 메서드
//    public void setScore(int score) {
//        this.score = score;
//    }

    @Override
    public String calculateGrade() {
        if (score >= 90) {
            return "A";
        } else if (score >= 80) {
            return  "B";
        } else if (score >= 70) {
            return "C";
        } else if (score >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
    //    'Gradable' 인터페이스를 'Student' 클래스에 구현하세요. 'calculateGrade' 메서드는
//    학생의 성적에 따라 학점을 계산하도록 구현하세요.

    //    int score;
//    String name;
//
//
//    public Student(int score, String name) {
//        this.name = name;
//        this.score = score;
//    }
//
//    public void students(){
//        System.out.println("Kim 의 학점은" + score +"입니다.");
//    }
//    public
}
