// 다음과 같은 결과를 보여주도록 코드를 완성하기

// 예시
/*
받은 돈 : 10000
상품의 총액 : 7500
부가세 : 750.0
잔돈 : 1750.0
 */

// 받은 돈, 상품의 총액을 설정하고 부가세는 상품 총액의 10%, 잔돈은 결제 후 남은 금액

public class HW2 {
    public static void main(String[] args) {
        int money = 10000;
        int price = 7500;
        System.out.printf("받은 돈 : %d\n", money);
        System.out.printf("상품의 총액 : %d\n", price);

        double vat = price*0.1;
        double balance = money - price - vat;
        System.out.printf("부가세 : %.1f\n", vat);
        System.out.printf("잔돈 : %.1f\n", balance);
    }
}