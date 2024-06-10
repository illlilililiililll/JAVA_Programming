// 정수값을 입력받아 해당 구구단을 출력하는 프로그램 작성하기

// printTimes 함수
//      매개변수 n
//      인수 x
//      매개변수의 단을 9단까지 출력

// 잘못된 입력(0 이하)을 받은 경우를 wbile문을 활용하여 처리
// 입력이 제대로 들어오면 printTimes에 x를 전달하여 출력
import java.util.Scanner;

public class HW2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수를 입력하세요: ");
        int x = sc.nextInt();

        while (x <= 0) {
            System.out.println("잘못된 입력입니다. 다시 입력하세요. ");
            System.out.print("정수를 입력하세요: ");
            x = sc.nextInt();
        }

        printTimes(x);
    }

    public static void printTimes(int n) {
        for (int i = 1; i < 10; i++) {
            System.out.printf("%d * %d = %d\n", n, i, n*i);
        }
    }
}