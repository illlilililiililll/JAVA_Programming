// 숫자 맞추기 게임(업다운)

// 입력한 숫자가 정답과 같은지 아닌지 판별하는 함수 만들기!
// == 연산자를 이용해 간단하게 처리

// 나머지는 조건문을 이용하여 처리함
import java.util.Scanner;

public class HW4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 35;

        while (true) {
            System.out.print("1-50 숫자를 입력하세요 : ");
            int x = sc.nextInt();

            if (checkNum(num, x)) {
                System.out.println("맞았습니다. ");
                break;
            }

            else
                if (x < num)
                    System.out.println("틀렸습니다. UP!");
                else
                    System.out.println("틀렸습니다. DOWN!");
        }
    }

    public static boolean checkNum(int num, int x) {
        return num == x;
    }
}