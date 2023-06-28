package ch07.Override;

public class Instrument {
    String guitar;
    String piano;

    public Instrument(String guitar, String piano) {
        this.guitar = guitar;
        this.piano = piano;
    }

    public void playing() {
        System.out.println("악기를 연주 합니다!");
        System.out.println("기타는 " + guitar);
        System.out.println("피아노는 " + piano);

        //Guiter -> play()
        //"악기를 연주합니다."
        //Piano -> play()
        //"악기를 연주합니다."
        //"도미솔시도래도"

}
    public static void main(String[] args) {
        Instrument p = new Instrument("지♬기♬장♬", "도♬레♬솔♬솔♬");
        p.playing();
    }
}
