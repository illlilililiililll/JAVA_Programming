// 다음 출력결과를 나타내는 코드를 완성하기 (중첩 반복문을 사용할 것)

// 예시
/*
2-----
-4----
--6---
---8--
----10-
-----12
 */

// 6 * 6이므로 i(행)를 1부터 6까지 순회
// 각 i에 대해 j(열)도 1부터 6까지 순회
// 만약 i와 j가 같다면 (대각선상에 있다면) i에 2를 곱한 값을 출력
// 그렇지 않다면 -를 출력
// 각 출력은 줄바꿈 없이 print로 출력, 각 행의 열을 모두 순회했을 때 개행문자 출력
public class HW4 {
    public static void main(String[] args) {
        int i = 1;
        int j;

        while (i <= 6){
            j = 1;
            while (j <= 6){
                if (i == j)
                    System.out.print(i*2);
                else
                    System.out.print('-');
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
