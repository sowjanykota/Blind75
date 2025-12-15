package arrays.pracice;

import java.util.Arrays;

public class SortArrayWithOutBuitIn {
    public static void main(String[] args) {
        int[] array = {5, 2, 9, 1, 6};
        for (int i = 0 ; i < array.length - 1 ; i++) {
            for (int j = i + 1 ; j < array.length ; j++) {
                if(array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
