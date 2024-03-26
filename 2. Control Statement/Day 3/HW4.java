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
