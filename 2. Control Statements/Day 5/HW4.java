// 사용자에게 반복해서 정수를 입력받아서 누적합을 화면에 출력하는 프로그램(do-while문)

// while의 조건 : 입력 != 0
// 입력을 받을 변수 input - do-while 밖에서 선언 (유효범위 고려)
// 누적합을 저장할 변수 total 0으로 초기화
// 조건(input != 0)을 만족하는 동안 계속 정수를 입력하고 total에 더함
// input == 0인 경우 break, 누적합 출력
import java.util.Scanner;

public class HW4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total = 0;
        int input;

        do {
            System.out.print("정수를 입력하세요(0입력시 반복 종료): ");
            input = sc.nextInt();

            total += input;
        } while (input != 0);

        System.out.println(total);
    }
}
