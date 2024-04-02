public class HW3 {
    public static void main(String[] args) {
        int n = 30;

        int i = 2;
        int j;

        while (i < n) {
            j = 2;
            while (j <= i) {
                if (i % j == 0)
                    break;
                j++;
            }

            if (j == i)
                System.out.print(i+" ");

            i++;
        }
    }
}