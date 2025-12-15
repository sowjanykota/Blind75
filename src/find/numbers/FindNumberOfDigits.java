package find.numbers;

public class FindNumberOfDigits {
    public static void main(String[] args) {
        int n = 189783434;
        int count = 0;
        if(n < 0)
            System.out.println();
        else if(n == 0)
            System.out.println(1);
        else  {
            while (n != 0) {
                int rem = n % 10;
                count++;
                n = n / 10;

            }
        }

        System.out.println(count);
    }
}
