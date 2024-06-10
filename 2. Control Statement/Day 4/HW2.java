// 반복문 while을 활용해서 1부터 n까지의 짝수를 출력하는 프로그램 완성하기

// 1부터 n 미만의 정수를 순회(i)하며, 만약 2로 나눈 나머지가 0이면 출력
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
