// 문자형 변수 s를 선언한 후 조건문을 활용해 모음/자음을 판별하는 코드 완성(단, s는 알파벳으로만 초기화됨)

// 의도적으로 break를 생략하여 모든 모음을 한번에 처리, 이외에는 모두 자음으로 처리
public class HW3 {
    public static void main(String[] args) {
        char s = 'a';

        switch (s) {
            case 'A':
            case 'a':
            case 'E':
            case 'e':
            case 'I':
            case 'i':
            case 'O':
            case 'o':
            case 'U':
            case 'u':
                System.out.println(s + "는 모음입니다. ");
                break;
            default:
                System.out.println(s + "는 자음입니다. ");
        }
    }
}
