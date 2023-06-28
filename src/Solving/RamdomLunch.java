package Solving;

public class RamdomLunch {
    public static void main(String[] args) {
        String[] lunch = {"인간사료", "중식"};
        double random=Math.random();
        int num = (int)Math.round(random * (lunch.length-1));

        System.out.println(lunch[num]);
    }
}
