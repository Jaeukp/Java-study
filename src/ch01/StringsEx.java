package ch01;

public class StringsEx {
    public static void main(String[] args) {
        String name = "박재욱";
        String address = "은평구 가좌로";
        String age = new String("28꼰대");
        String career = "양식 레스토랑 2년, 멕시코 레스토랑 1년, fnb 비즈니스경력 1년 총 4년입니다.";

        String info = name + " " + age + "\t주소는 " + address + " 입니다."
                + "\n" + "\"" + career + "\""
                + "\n 이상 저의 정보입니다";
        System.out.println(info);
    }
}
