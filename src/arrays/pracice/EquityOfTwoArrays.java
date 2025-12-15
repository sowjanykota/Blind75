package arrays.pracice;

import java.util.Arrays;

public class EquityOfTwoArrays {
    public static void main(String[] args) {
        int[] arrayOne = {2, 5, 1, 7, 4};

        int[] arrayTwo = {2, 5, 1, 7, 4};
        System.out.println(Arrays.equals(arrayTwo, arrayOne));
        Arrays.sort(arrayOne);
        Arrays.sort(arrayTwo);
        if(arrayOne.length != arrayTwo.length) {
            System.out.println("False");
            return;
        }

        for (int i = 0 ; i < arrayOne.length ; i++) {
            if(arrayOne[i] != arrayTwo[i]) {
                System.out.println("False");
                return;
            }

        }
        System.out.println("True");
    }
}
