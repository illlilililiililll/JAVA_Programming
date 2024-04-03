// 다음 코드의 실행 결과의 이유를 주석으로 작성하고 프로그램 의도에 맞게 수정하기
// 8000원 이상일 때 택시 / 1300원 이상일 때 -어른/학생요금 구분해서 출력

public class HW2 {
    public static void main(String[] args) {
        boolean school = true;
        int money = 1300;

        if (money >= 1300) {
            if (money >= 8000) {
                System.out.println("Taxi");
            }
            else {
                if (school)
                    System.out.println("Bus fare, teen");
                else
                    System.out.println("Bus fare, adult");
            }
        }
    }
}

// 8000보다 큰 값이 있더라도 if문에서 1300보다 큰 값을 가지고 있어 else if 문으로 전달되지 않음
// 따라서, taxi가 출력되지 않음