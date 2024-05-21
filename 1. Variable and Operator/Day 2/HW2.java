// 정수형 변수 1개(화씨온도)와 실수형 변수 1개(섭씨온도)를 활용해 다음과 같은 결과 출력하기
// (화씨 온도가 0~100일 때 모두 올바른 결과값이 도출되어야 함.)
// C = 5/9 * (F - 32)

// 화씨 온도를 선언하고 수식을 적용하여 섭씨 온도에 저장, 정수형으로 나오는 것을 막기 위해 형변환
public class HW2 {
    public static void main(String[] args) {
        int fahrenheit = 212;
        double celcius = (double) 5/9*(fahrenheit-32);

        System.out.println("화씨 " + fahrenheit + "도는 섭씨 " + celcius + "도 입니다");
    }
}
