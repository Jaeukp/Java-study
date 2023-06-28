package ch05.singleton;

public class Test1 {
    public void  test() {
        Operator s1 = Operator.getInstance();
        System.out.println(s1);

        int[] arr = {1, 2, 3, 4, 5};
        s1.multiply(arr);
        System.out.println(arr);
    }
}
