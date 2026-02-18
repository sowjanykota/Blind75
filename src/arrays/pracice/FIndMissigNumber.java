package arrays.pracice;

import java.util.Arrays;

public class FIndMissigNumber {
    public static void main(String[] args) {
        int[] array = {1, 2, 4, 5, 6};
        missingNumber(array);
//        int sum  = Arrays.stream(array).reduce(0, (a, b) -> a +b);
//        System.out.println(sum);
//        int size = array.length +  1;
//        int numberSum = (size * (size + 1))/2;
//        System.out.println(numberSum - sum);
    }
    public static void missingNumber(int[] array) {
        int sum = Arrays.stream(array).sum();
        int n = array.length + 1;
        int sumOfnumbers = (n * (n +1))/2;
        System.out.println(sumOfnumbers - sum);
    }
 }
