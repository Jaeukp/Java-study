package ch08.Paractice;

public class Human implements Walkable,Runnable{
    @Override
    public void run() {
        System.out.println("The fish is swimming");
    }

    @Override
    public void walk() {
        System.out.println("The human is walking");

    }
}
