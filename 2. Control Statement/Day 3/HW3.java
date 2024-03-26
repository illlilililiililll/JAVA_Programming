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
