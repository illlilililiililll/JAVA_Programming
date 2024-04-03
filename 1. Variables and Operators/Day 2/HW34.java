// 1 다음 코드의 출력 결과와
// 2 그 이유를 주석으로 작성하기

public class HW34 {
    public static void main(String[] args) {
        int i;
        double f;

        f = 5 / 4;
        System.out.println(f);
        // 1.0 -> 정수 / 정수인 경우 정수형이 return, 따라서 1.25에서 소숫점 아래를 버림한 1.0 (f가 double이기 때문에 소숫점 존재)
        // 5 / 4의 정수 부분을 반환 = 1
        f = (double) 5 / 4;
        System.out.println(f);
        // 1.25 -> 실수 / 정수인 경우 실수형이 return, 따라서 결과값인 1.25가 그대로 반환
        // 5.0 / 4 = 1.25
        f = 5 / (double) 4;
        System.out.println(f);
        // 1.25 -> 정수 / 실수인 경우 위 경우와 마찬가지로 실수형이 반환, 따라서 1.25
        // 5 / 4.0 = 1.25
        f = (double) 5 / (double) 4;
        System.out.println(f);
        // 1.25 -> 실수 / 실수인 경우 실수가 return, 결과값 1.25 반환
        // 5.0 / 4.0 = 1.25
        f = (double) (5/4);
        System.out.println(f);
        // 1.0 -> 괄호로 인한 우선순위에 의해서 5/4를 먼저 계산, double 형으로 형변환
        // 이때 5/4가 정수 / 정수 이므로 결과값이 1이 되며, 이를 double로 변환하여도 1을 double로 변환하는 것이므로 1.0 반환

        i = (int) 1.3 + (int) 2.8;
        System.out.println(i);
        // 3 -> 실수형을 정수형으로 변환하는 과정에서 소숫점을 버림함
        // 1 + 2 = 3이 됨
    }
}
