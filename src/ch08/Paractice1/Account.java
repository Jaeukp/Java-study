package ch08.Paractice1;

public class Account implements Taxable{
    private double balance;
    @Override
    public double calculateTax() {
        return balance * 0.1;
//        int i = 10000;
//        for (i = 0; i > 0; i++){
//            if(i * 0.1) == 0) {
//            } else {
//                System.out.println("잔금의 세금(10%) 입니다");
//            }
//        }
//        return 0;
    }
}
