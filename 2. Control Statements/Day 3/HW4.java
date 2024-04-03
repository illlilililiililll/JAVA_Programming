// 정수형 변수 year, month, day(-1초기값)을 선언한 후 조건문(switch)를 활용하여 달의 날 수 출력하는 코드 완성
//      1. 연도를 4로 나누었을 때 나누어떨어지면 윤년
//      2. 1을 만족하고 연도가 100으로 나누어떨어지면 윤년이 아님
//      3. 2를 만족하고 연도가 400으로 나누어떨어지면 윤년

// 논리연산자와 조건문(if)를 적절히 사용하여 윤년 계산하기
// 달이 잘못 입력되었을 경우 달의 날 수 문장은 미출력

// 가장 먼저 현재 달의 범위를 점검 -> 이상하면 실행 X, 잘못되었다고 출력
// switch 문으로 2월을 가장 먼저 처리 -> 윤년이면 29일까지
// 나머지 31일까지 있는 달은 의도적으로 break를 생략하여 처리, 그 이외의 달은 모두 default로 30일 지정
public class HW4 {
    public static void main(String[] args) {
        int year = 400;
        int month = 13;
        int day = -1;

        System.out.println(year + "년의 " + month + "월");

        if ((1 <= month) && (month <= 12)){
            switch (month) {
                case 2:
                    if ((((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))) {
                        day = 29;
                    }
                    else {
                        day = 28;
                    }
                    break;
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    day = 31;
                    break;
                default:
                    day = 30;
                    break;
            }
            System.out.println("달의 날 수는 "+day);
        }

        else {
            System.out.println("달을 잘못 입력하였습니다. ");
        }
    }
}