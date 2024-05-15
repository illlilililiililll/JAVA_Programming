// 절댓값 함수 정의하기
// abs함수
//      매개변수 n
//      인수 x
//      조건문을 사용하여 절댓값 반환

// if문을 활용하여 부호에 따른 절댓값 판단 -> n이 음수이면 -n, 양수이면 n
import java.util.Scanner;

public class HW1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요: ");
        int x = sc.nextInt();

        System.out.println("입력된 정수 " + x + " 의 절대값은 " + abs(x));
    }

    public static int abs(int n) {
        if (n >= 0)
            return n;
        else
            return -n;
    }
}