package account;

import java.util.Base64;
import java.util.Scanner;

public class AccountManagement {
    private Account[] accountList;  // 계좌 목록 배열
    private int numAccounts;        // 계좌의 개수
    private Scanner scanner;        // 사용자 키보드 입력 객체

    // 최대 입력 가능한 계좌개수를 매개변수르 입력받는 생성자
    public AccountManagement(int maxSize) {
        accountList = new Account[maxSize]; // 계좌 목록 배열을 생성
        numAccounts = 0;                    // 현재 생선된 계좌의 개수
        scanner = new Scanner(System.in);   // 사용자 입력 객체 생성
    }

    public void addAccount(String accountNumber, double balance) {
//        Account a = new Account(accountNumber, balance);
//        accountList[numAccounts] = a;
//
//        System.out.println(accountList[numAccounts].getAccountNumber());
//        numAccounts++;

        Account acc = new Account(accountNumber, balance);
        accountList[numAccounts] = acc;
        System.out.println(accountList[numAccounts].getAccountNumber());
        numAccounts++;

        }

        // **코드 작성
        // 계좌번호와 초기 입금액을 입력 받고
        // 계좌객체를 생성한 후 배열의 앞에서부터 가장 빈 공간 추가한다.
        // 단, 배열에 추가한 후 numAccounts를 증가시킨다.

    public void showAccountList() {
//        String accountNumbers;
//        String balances = "";
//        System.out.println("계좌번호: " + numAccounts);
//        System.ut.println("잔액: " + balances + "원");
//        for (int i = 0; i < numAccounts; i++) {
//            System.out.println("계좌번호: " + "[" + (i+1) + ":" + accountList[i].getAccountNumber() + "]");
//            System.out.println("잔액: " + "[" + (i+1) + ":" + accountList[i].getBalance() + "]");
//
//        }
//        for (int i = 0; i < numAccounts; i++) {
//            System.out.println("계좌번호: " + accountList[i].getAccountNumber() + "," + "잔액; "
//                    +accountList[i].getBalance());
//
//        }

        for(Account acc : accountList) {
            if(acc != null) {
                System.out.println("계좌번호:" + acc.getAccountNumber() + "," + "잔액: " + acc.getBalance());
            }else {
                System.out.println("계좌가 더 이상 없습니다.");
                break;
            }
        }


    }
        // **코드 작성
        // 계좌 목록을 출력
        // 예시 출력 형태
        // ------------------------------------
        // 계좌번호: [계좌번호1], 잔액: [잔액1]
        // 계좌번호: [계좌번호2], 잔액: [잔액2]
        // ...
        // ------------------------------------

    public void deposit(String accountNumber, double amount) {
//        for (Account account : accountList) {
//            if (account != null && account.getAccountNumber().equals(accountList)) {
//                account.withdraw((amount));
//                break;
//            }
//        }
        Account acc = findAccount(accountNumber);
        if (acc != null) {


        }

        findAccount(accountNumber).deposit(amount);

        // **코드 작성
        // 계좌번호로 계좌객체를 찾고 출금 금액 만큼 잔액을 차감한다.
        // 단, Account 클래스의 deposit 메서드를 사용하여야 한다.
    }

    public void withdraw(String accountNumber, double amount) {
        Account account = findAccount(accountNumber);
        if ( account != null) {
            account.withdraw(amount);
        }
        // **코드 작성
        // 계좌번호로 계좌객체를 찾고 출금 금액 만큼 잔액을 차감한다.
        //단, findAccount, 메서드를 이용하여 찾는다.
        // 단, Account 클래스의 withdraw 메서드를 사용하여야 한다.
    }

    private Account findAccount(String accountNumber) {
//        Account[] accounts = new Account[0];
//        for (Account account : accounts) {
//            if (account != null && account.getAccountNumber().equals(accountNumber))
//                return account;
//        }

        for (int i = 0; i < numAccounts; i++) {
            if(accountList[i].getAccountNumber().equals(accountNumber)) {
                return  accountList[i];
            }
        }
        // **코드 작성
        // 계좌번호로 계좌객체를 찾아서 리턴하는 메서드 작성
        //
        return null;
    }

    public void run() {
        while (true) {
            // UX, 기능목록 출력
            System.out.println("\n=== 계좌 관리 프로그램 ===");
            System.out.println("1. 계좌 추가");
            System.out.println("2. 계좌 목록 조회");
            System.out.println("3. 입금");
            System.out.println("4. 출금");
            System.out.println("0. 종료");
            System.out.print("원하는 기능을 선택하세요: ");

            // 메뉴번호 받기
            int choice = scanner.nextInt();
            scanner.nextLine(); // 개행 문자 제거

            if (choice == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            switch (choice) {
                case 1:
                    System.out.print("계좌번호: ");
                    String accountNumber = scanner.nextLine();
                    System.out.print("잔액: ");
                    double balance = scanner.nextDouble();
                    scanner.nextLine(); // 개행 문자 제거
                    addAccount(accountNumber, balance);
                    break;
                case 2:
                    showAccountList();
                    break;
                case 3:
                    System.out.print("계좌번호: ");
                    accountNumber = scanner.nextLine();
                    System.out.print("입금액: ");
                    double depositAmount = scanner.nextDouble();
                    scanner.nextLine(); // 개행 문자 제거
                    deposit(accountNumber, depositAmount);
                    break;
                case 4:
                    System.out.print("계좌번호: ");
                    accountNumber = scanner.nextLine();
                    System.out.print("출금액: ");
                    double withdrawAmount = scanner.nextDouble();
                    scanner.nextLine(); // 개행 문자 제거
                    withdraw(accountNumber, withdrawAmount);
                    break;
                default:
                    System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
                    break;
            }
        }
    }
}
