package ch05.singleton;

public class Operator {
    // private static 클래스 객체
    private static Operator instance;

    // 외부에서 객체 생성 안 됨.
    // private 생성자
    public Operator() {
        // private 생성자

    }

    // 오버로딩
    public Operator(Operator instance) {
        this.instance = instance;

    }


    // getInstance 메서드로 처음에 생성한 객체만 접근하게 하는 방법
    // 객체 생성은 메서드 호출시에 한 번만
    public static Operator getInstance() {
        if(instance == null) {
            instance = new Operator();
            System.out.println("객체가 생성되었습니다.");
        }
        return  instance;
    }

    // 곱하는 메서드

    public int multiply(int x, int y) {
        System.out.println("(int,int)");
        return x * y;
    }

    // 실수값 2개 받고 곱하기
    public double multiply(double x, double y) {
        System.out.println("(double,double)");
        return  (x * y);
    }

    // 실수값 2개 받고 곱하기
    public int multiply(double x, double y, int z) {
        System.out.println("(double,double)");
        return (int) (x * y) * z;
    }
    public int multiply(int[] nums) {
        if(nums == null || nums.length == 0) {
            System.out.println();
        }

        int mulResult = 1;
        for(int num : nums) {
            mulResult *= num;
        }

        return mulResult;
    }
}
