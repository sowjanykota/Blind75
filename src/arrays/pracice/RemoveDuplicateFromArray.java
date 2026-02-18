package arrays.pracice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemoveDuplicateFromArray {
    public static void main(String[] args) {
        int[] array = {5, 2, 9, 1, 6, 2, 5};
        removeDuplicatesInArray(array);
        System.out.println();
        removeDuplic(array);
        HashSet<Integer> set =  new LinkedHashSet<>();
        for (int i = 0 ; i < array.length ; i++) {
            set.add(array[i]);
        }
        //System.out.println(set);
        removeDuplicatesInArray(array);

    }
    public static void removeDuplicatesInArray(int[] array) {
        int n =  array.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (array[i] == array[j]) {
                    array[j] = array[n - 1];
                    n--;
                    j--;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        //System.out.println(Arrays.toString(array));
    }

    public static void removeDuplic(int[] array) {
        int lastIndex = array.length - 1;
        for (int i = 0 ; i < array.length ; i++) {
            for (int j = i + 1 ; j < array.length; j++) {
                if(array[i] == array[j]) {
                    array[j] = array[lastIndex];
                    lastIndex--;
                    // after swapping a new value comes into pictire so we need check that new value
                    j--;
                }
            }
        }
        for (int i = 0; i < lastIndex; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
