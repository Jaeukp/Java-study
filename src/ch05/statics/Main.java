package ch05.statics;

public class Main {
    public static void main(String[] args) {
        Counter c = new Counter(); // ++
        // c.count == 1
        System.out.println(c.getCount()); // ++
        // c.count == 2

        Counter c2 = new Counter(); // ++
        // c2. count == 1 (x), c2. count == 3
        System.out.println(c.getCount()); // ++
        // c2. count == 2(x), c2.count == 4
    }
}
