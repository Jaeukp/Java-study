import java.util.Scanner;

public class Main {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        for(int i=0; i<s; i++) {
            answer += my_string.charAt(i);
        }
        int j = 0;
        while (j<overwrite_string.length()){
            answer += overwrite_string.charAt(j);
            j++;
        }
        int k = j+s;
        while (k<my_string.length()) {
            answer += my_string.charAt(k);
            k++;
        }
        return answer;
    }
}
//        int str01 = overwrite_string.length();
//        int str02 = my_string.length();
//        String sub01 = my_string.substring(0, s);
//        String sub02 = my_string.substring((s+str01), str02);
//
//        answer += str01 + overwrite_string + str02;
//
//        return answer;
//
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        if (n % 2 == 0) {
//            System.out.println("is even");
//        } else if (n % 3 == 0) {
//            System.out.println("is odd");
//        }
//    }
//}
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String a = sc.next();
//
//        int str = a.length();
//        for(int i = 0; i < str; i++) {
//            System.out.println(a.charAt(i));
//        }
//    }
//}

//    public static void main(String[] args) {
        // 여기서부터 코드 실행된다.
//        System.out.println("hello Java");
//        System.out.println("단축키는Sout");
//        System.out.println("hello Itellij");

