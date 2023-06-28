package ch05.accessModifier;

public class Animal {
    // go(long)
    // var name string; // private
    // var Name string; // public
    private String name;
    protected void eat() {
        System.out.println("The animal is eating.");
    }
}
