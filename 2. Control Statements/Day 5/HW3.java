// 중첩 for문을 이용하여 방정식 4x + 5y = 60의 모든 해를 구해서 (x, y) 형태로 출력하는 코드 완성 
// (단, x와 y는 10이하의 자연수)

// x와 y의 범위가 10 이하의 자연수
// -> 모든 x를 순회, 이때 각 x에 대해 y도 1~10을 순회하며 조건을 만족하는지 확인
// 만약 4x + 5y 값이 60이라면 형식 맞춰서 출력
public class HW3 {
    public static void main(String[] args) {
        for (int x = 1; x < 11; x++)
            for (int y = 1; y < 11; y++)
                if (4*x + 5*y == 60)
                    System.out.printf("(%d, %d)\n", x, y);
    }
}
