// 사용자가 입력한 구구단 출력

// ex. 
// 몇 단을 출력할까요? 19
// 19 * 1 = 19
// 19 * 2 = 38
// ...

// Scanner nextInt로 단 입력
// for문으로 1이상 10미만까지 반복시키며 구구단 출력
import java.util.Scanner;

public class HW1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("몇 단을 출력할까요? ");
        int n = sc.nextInt();

        for (int i = 1; i < 10; i++)
            System.out.printf("%d * %d = %d\n", n, i, n*i);
            // System.out.println(n + " * " + i + " = " + n*i);
        }
}