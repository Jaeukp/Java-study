package ch07.Override.Play.co;

public class Piano extends Instrument{
    public void play() {
        super.play();
        System.out.println("도♬레♬솔♬솔♬");
    }
}
