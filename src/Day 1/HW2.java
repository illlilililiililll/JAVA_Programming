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