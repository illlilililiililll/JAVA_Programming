public class HW2 {
    public static void main(String[] args) {
        int n = 30;
        System.out.println("정수 1부터 " + n + "까지의 짝수를 출력합니다. ");

        int i = 1;
        while (i < n) {
            if (i%2 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}
