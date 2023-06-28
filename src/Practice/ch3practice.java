package Practice;

public class ch3practice {
    public static void main(String[] args) {
//        int x = 4;
//        if (x > 10) {
//            System.out.println("큰수");
//        } else
//            System.out.println("작은수");
//
//        // 문제 2: 변수 score가 80보다 크거나 같으면 "통과", 그렇지 않으면 "불통과"를 출력하는 조건문을 작성하세요.
//        int score = 60;
//        if (score >= 60) {
//            System.out.println("통과");
//        } else {
//            System.out.println("불통과");
//        }
//        // 문제 3: 변수 num이 0보다 크면 "양수", 0보다 작으면 "음수", 0이면 "0"을 출력하는 조건문을 작성하세요.
//        int num = -1;
//        if (num > 0) {
//            System.out.println("양수");
//        } else if (num < 0) {
//            System.out.println("음수");
//        } else {
//            System.out.println("0");
//        }
//        // 문제 4: 변수 age가 20 이상이면 "성인", 20 미만이면 "미성년자"를 출력하는 조건문을 작성하세요.
//        int age = 29;
//        if (age > 20) {
//            System.out.println("성인");
//        } else {
//        System.out.println("미성년자");
//        }
//        // 문제 5: 변수 month가 1부터 12까지의 값을 가지고 있을 때, 해당하는 월의 영어 이름을 출력하는 조건문을 작성하세요.
////        int month = 11;
////        String[] monthNames = {"January", "February", "March", "April", "May", "June", "July", "August", "September",
////        "October", "November", "December"};
////
////        if (month >= 1 && month <= 12) {
////            String monthName = monthNames[month - 1];
////            System.out.println("월 이름: " + monthName);
////        } else {
////            System.out.println("없는 달");
////        }
////        int month = 5;
////        String monthName;
////        if (month == 1) {
////            System.out.println("Jenuay");
////        } else if (month == 2) {
////            System.out.println("February");
////        } else if (month == 3) {
////            System.out.println("March");
////        } else if (month == 4) {
////            System.out.println("April");
////        } else if (month == 5) {
////            System.out.println("May");
////        } else if (month == 6) {
////            System.out.println("June");
////        } else if (month == 7) {
////            System.out.println("July");
////        } else if (month == 8) {
////            System.out.println("August");
////        } else if (month == 9) {
////            System.out.println("September");
////        } else if (month == 10) {
////            System.out.println("October");
////        } else if (month == 11) {
////            System.out.println("November");
////        } else if (month == 12) {
////            System.out.println("December");
////        } else {
////            System.out.println("없음");
////        }
////        int month = 9;
////        String monthName;
////
////        switch (month) {
////            case 1: monthName = "January";
////            break;
////            case 2: monthName = "Februry";
////            break;
////            case 3: monthName = "March";
////            break;
////            case 4: monthName = "April";
////            break;
////            case 5: monthName = "May";
////            break;
////            case 6: monthName = "June";
////            break;
////            case 7: monthName = "July";
////            break;
////            case 8: monthName = "August";
////            break;
////            case 9: monthName = "September";
////            break;
////            case 10: monthName = "October";
////            break;
////            case 11: monthName = "November";
////            break;
////            case 12: monthName = "December";
////            break;
////            default: monthName = "Invalid month";
////            break;
////        }
////        System.out.println("월 이름: " + monthName);
//        // 문제 6: 변수 year가 400으로 나누어 떨어지거나 (year % 400 == 0), 4로 나누어 떨어지고 100으로 나누어 떨어지지 않
//        // 으면 (year % 4 == 0 && year % 100 != 0) "윤년", 그렇지 않으면 "평년"을 출력하는 조건문을 작성하세요.
//        int year = 2400;
//        if (year % 400 == 0 && year % 4 == 0 || year % 100 !=0) {
//            System.out.println("윤년");
//        } else {
//            System.out.println("평년");
//        }
//        // 문제 7: 변수 num1과 num2가 같으면 "같음", 다르면 "다름"을 출력하는 조건문을 작성하세요.
//        int num1 = 5;
//        int num2 = 7;
//
//        if (num1 == num2) {
//            System.out.println("같음");
//        } else {
//            System.out.println("다름");
//        }
//        // 문제 8: 변수 a, b, c가 모두 0보다 크면 "양수", 하나라도 0보다 작으면 "음수", 그 외에는 "0"을 출력하는 조건문을 작성하세요.
//        int a = -1;
//        int b = 5;
//        int c = 9;
//
//        if(a > 0 || b > 0 || c > 0) {
//            System.out.println("양수");
//        } else if (a < 0 && b < 0 || c < 0) {
//            System.out.println("음수");
//        } else {
//            System.out.println("0");
//        }
        // 문제 9: 변수 score가 90 이상이면 "A", 80 이상이면 "B", 70 이상이면 "C", 60 이상이면 "D", 그 외에는 "F"를 출력하는 조건문을 작성하세요.
        int score = 95;
        String grade;

        if (score >= 90){
            grade = "A";
        } else if (score >= 80) {
            grade = "B";
        } else if (score >= 70) {
            grade = "C";
        } else if (score >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }
        System.out.println("등급: "+ grade);
        // 문제 10: 변수 num이 3의 배수이면서 5의 배수이면 "3과 5의 배수", 3의 배수이면 "3의 배수", 5의 배수이면 "5의 배수", 모두 해당되지
        // 않으면 "해당사항 없음"을 출력하는 조건문을 작성하세요.
        int num = 15;
        String numNumber;

        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println("3과 5의 배수");
        } else if (num % 3 == 0) {
            System.out.println("3의 배수");
        } else if (num % 5 == 0) {
            System.out.println("5의 배수");
        } else {
            System.out.println("해당사항 없음");
        }
    }
}