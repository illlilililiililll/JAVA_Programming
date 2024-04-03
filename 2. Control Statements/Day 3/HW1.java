// 실수형 변수 2개(x, y)를 선언하여 다음 결과와 동일한 코드 작성

// f(x) =  x^3 − 9x + 2 (x ≤ 0)
//      =  7x + 2       (x > 0)

// 예시
/*
x = 10.0
f(x) = 72.0
 */

// x의 범위를 판단하고 적절한 계산식을 적용하여 y에 저장
public class HW1 {
    public static void main(String[] args) {
        double x = -100.0;
        double y;
        if (x <= 0){
            y = x*x*x - 9*x + 2;
        }
        else {
            y = 7*x + 2;
        }

        System.out.println("x = "+ x);
        System.out.println("f(x) = "+y);
    }
}