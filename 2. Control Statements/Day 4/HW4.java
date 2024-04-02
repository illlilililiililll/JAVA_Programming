public class HW4 {
    public static void main(String[] args) {
        int i = 1;
        int j;

        while (i <= 6){
            j = 1;
            while (j <= 6){
                if (i == j)
                    System.out.print(i*2);
                else
                    System.out.print('-');
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
