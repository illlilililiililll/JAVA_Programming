public class HW2 {
    public static void main(String[] args) {
        Date d = new Date();

        d.setYear(2007);
        d.setMonth(10);
        d.setDay(16);

        System.out.println("생일은 " + d.toString() + "입니다. ");

        d.setYear(d.getYear() + 20);

        System.out.println("성년일은 " + d.toString() + "입니다. ");
    }
}

class Date {
    private int year;
    private int month;
    private int day;

    public Date() {
        this.year = 1900;
        this.month = 1;
        this.day = 1;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String toString() {
        String rslt = "";
        rslt += getYear() + "년 ";
        rslt += getMonth() + "월 ";
        rslt += getDay() + "일";

        return rslt;
    }
}