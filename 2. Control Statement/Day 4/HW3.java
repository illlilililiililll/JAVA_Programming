// while을 사용하여 2부터 n까지의 소수(prime number) 출력

// 2 이상 n 미만의 정수를 순회(i)
// i가 2 이상 i-1의 값(j)로 나누어 떨어지는 경우 소수가 아님
// 만약 j가 i까지 도달(break 없음)한 경우 소수 -> 출력(줄 바꿈 X -> print)
public class HW3 {
    public static void main(String[] args) {
        int n = 30;

        int i = 2;
        int j;

        while (i < n) {
            j = 2;
            while (j <= i) {
                if (i % j == 0)
                    break;
                j++;
            }

            if (j == i)
                System.out.print(i+" ");

            i++;
        }
    }
}