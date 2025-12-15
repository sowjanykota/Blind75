package find.numbers;

public class ReverseNumber {
    public static void main(String[] args) {
        int number = 432;
        int reverse = 0;
        while (number != 0) {
            int rem = number % 10;
            reverse =  reverse * 10 + rem;
            number = number / 10;
        }
        System.out.println(reverse);
    }
}
