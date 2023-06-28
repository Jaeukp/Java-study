package ch05.singleton;

public class Test2 {
    public void  test() {
        Operator s2 = Operator.getInstance();
        System.out.println(s2);
        s2.multiply(1,2);
    }
}
