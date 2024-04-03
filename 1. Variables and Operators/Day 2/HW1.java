// 정수형 변수 2개(반지름, 높이)와 실수형 변수 2개(3.141592, 부피)를 이용하여 코드 완성하기
// (단, r, h의 값을 변경하여도 올바른 결과값이 출력되어야 함)
// V = 1/3 * PI * r * r * h

// 변수를 선언하고 계산 값을 저장하는 V 변수를 선언하여 출력

public class HW1 {
    public static void main(String[] args) {
        int r = 10;
        int h = 10;

        double PI = 3.141592;
        double v =  PI * r * r * h / 3;

        System.out.println("원뿔의 부피는 " + v + "입니다");
    }
}
