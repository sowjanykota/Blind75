package find.numbers;

import java.util.Arrays;

public class SumOfDigits {
    public static void main(String[] args) {
        int n = 12314;
        int newNum = n;
        int sum = 0;
        while (n != 0) {
            int rem = n % 10;
            sum =  sum + rem;
            n = n / 10;
        }
        System.out.println(sum);
        System.out.println(String.valueOf(newNum).chars() .map(c -> c - '0') .sum());
        sumOfDightis(new int[]{1, 2, 3, 4});
    }
    public static void sumOfDightis(int[] array) {
        int sum = Arrays.stream(array).reduce(0, (a, b) -> a +b);
        System.out.println(sum);
    }
}
