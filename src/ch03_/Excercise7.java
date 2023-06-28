package ch03;

public class Excercise7 {
    public static void main(String[] args) {
        int number = 0;
        int count = 0;
        while (true){
            number = (int) (Math.random() * 6) + 1;
            count++;
            System.out.println("("+number+")");
            if (number == 6){
                System.out.println("총 주사위 굴린 횟수는 :" + count + "회");

                break;
            } else {
                continue;
            }

        }
    }

}
