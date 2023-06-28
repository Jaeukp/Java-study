package ch01;

public class Strings {
    public static void main(String[] args) {
        // string(문자역)
        // 문자를 여러개로 연결(문자의 배열)
        String greeting = "Hello.. world!";

        // 자바에서 문자열(String)은 기본 자료형이 아니다.
        // char(문자타입) 이 타입들을 여러개 연결해서 작용되도록 구현
        // ctrl + / = 선택 영역만큼 주석이 생성
        // /* ... */ 여러줄을 주석으로 표시
        // String str = "abc";
         /*
        String str = "abc";
        // is equivalent to:
        // char data[] = {'a', 'b', 'c'};
         */

        // 문자열 초기화 방법
        // 문자열 값을 코드에 직접 입력한 것을 리터럴(literal)
        String firstName = new String("park");
        String lastName = "park";


        // 문자역 결합(concat)
        // 연수를 참조해서 사용할 때는 이름은 대소문자를 가립니다(case-sensitve)
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);

        // 제어문자(escape characters, escape sequence)
        // 문자역 처리에 특수문자, 줄바꿈, 탭
        // String message ""이렇게 하고 싶은데"";
        // "메세지입니다."
        // 메세지입니다.
        String message = "Hello\nWorld";
        System.out.println(message);
        // \n = 엔터

        String tabmessage = "Hello\tWorld";
        System.out.println(tabmessage);
        // \t = 4칸 띄어쓰기

        String doubleQuote = "\"Hello, World\"";
        System.out.println(doubleQuote);
        // \"  \" = 쌍다음표 넣기

        String back = "Hello\\World";
        System.out.println(back);
        // \\= \ 하나 기입




    }
}