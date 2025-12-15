package arrays.pracice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemoveDuplicateFromArray {
    public static void main(String[] args) {
        int[] array = {5, 2, 9, 1, 6, 2, 5};
        HashSet<Integer> set =  new LinkedHashSet<>();
        for (int i = 0 ; i < array.length ; i++) {
            set.add(array[i]);
        }
        System.out.println(set);
        removeDuplicatesInArray(array);

    }
    public static void removeDuplicatesInArray(int[] array) {
        int n =  array.length;
        for (int i = 0 ; i < n ; i++) {
            for (int j = i + 1 ; j < n ; j++) {
                if (array[i] == array[j]) {
                    for (int k = j; k < n - 1; k++) {
                        array[k] = array[k + 1];
                    }
                    n--; // reduce length after removing duplicate
                    j--;
                }
               //
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
