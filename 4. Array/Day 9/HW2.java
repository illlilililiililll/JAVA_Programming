public class HW2 {
    public static void main(String[] args) {
        int[] years = {2022, 2023, 2024};
        int[] month = {9, 10, 11};
        int[] date = {30, 31, 30};
        Date[] dates = new Date[3];

        for (int i = 0; i < dates.length; i++)
            dates[i] = new Date(years[i], month[i], date[i]);

        for (Date d : dates)
            System.out.println(d.printDate());
    }
}

class Date {
    private int year;
    private int month;
    private int day;

    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public String printDate() {
        return "Date{" +
                "year=" + year +
                ", month=" + month +
                ", date=" + day +
                '}';
    }
}