package ch07.Override.Play.co;

public class Guitar extends Instrument{
    public void play() {
        super.play();
        System.out.println("지♬기♬장♬");
    }
}
