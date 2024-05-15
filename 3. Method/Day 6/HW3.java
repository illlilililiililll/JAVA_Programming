// HW2의 정수 입력을 함수로 받기
// x가 10 이상이면 x^2까지 출력

// HW2 복사 붙여넣기 -> 매개변수 없음, 반환값 정수
// end 변수를 선언하여 몇 단까지 출력할지 판단
//      n이 10 미만이면 9까지, 10 이상이면 n까지 (삼항연산자 이용)
import java.util.Scanner;

public class HW3 {
    public static void main(String[] args) {
        int x = getInput();
        printTimes(x);
    }

    public static int getInput() {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수를 입력하세요: ");
        int n = sc.nextInt();

        while (n <= 0) {
            System.out.println("잘못된 입력입니다. 다시 입력하세요. ");
            System.out.print("정수를 입력하세요: ");
            n = sc.nextInt();
        }

        return n;
    }

    public static void printTimes(int n) {
        int end = (n >= 10) ? n : 9;

        for (int i = 1; i <= end; i++) {
            System.out.printf("%d * %d = %d\n", n, i, n*i);
        }
    }
}
