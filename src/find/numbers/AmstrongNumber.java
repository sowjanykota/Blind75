package find.numbers;

public class AmstrongNumber {
    public static void main(String[] args) {
        int number = 153;
        int other = number;
        int sum = 0;
        while (number != 0) {
            int rem = number % 10;
            sum = sum + (int)Math.pow(rem, 3);
            number = number / 10;
        }
        if(sum == other)
            System.out.println("Amstrong");
        else
            System.out.println("Not Amstrong");
    }
}
