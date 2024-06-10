// 변수 dan과 반복문(while)을 이용하여 구구단 출력하기

// while로 i를 1부터 9까지 반복시키며 dan의 값에 맞는 값을 출력
public class HW1 {
    public static void main(String[] args) {
        int dan = 9;
        int i = 1;

        while (i <= 9) {
            System.out.println(dan + " * " + i + " = " + dan*i);
            i++;
        }
    }
}
