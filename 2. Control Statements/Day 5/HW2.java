// 반복문(for)을 이용해 * 삼각형 완성하기(단, 변수는 3개 이상 선언하지 않음)
// *
// **
// ***
// ****
// *****

// 별의 개수를 i로 지정, 5줄이므로 1이상 6미만 순회 (1 ~ 5)
// 별의 개수만큼 출력하기 위한 이중 for문
// i만큼 반복 (0이상 i미만)하며 * 출력, 줄바꿈 없는 print() 이용
// 각 행 순회 후 줄바꿈 (println())
public class HW2 {
    public static void main(String[] args) {
        for (int i = 1; i < 6; i++) {
            for (int j = 0; j < i; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}
