package arrays.pracice;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BInarySearch {
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 6, 7, 9};
        int n = 50;
        int left = 0, right =  array.length - 1;
        binarySearch(array, n);

        while (left <= right) {
            int mid = left + (right - left)/2;
            if(n == array[mid]) {
                System.out.println(mid);
                return;
            }
            else if(array[mid] < n ) {
                //left = 0;
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        System.out.println("Not found");


    }

    public static void binarySearch(int[] array, int number) {
        Arrays.sort(array);
        int start = 0, end = array.length - 1;

        while (start <= end) {
            int mid = start + end / 2;
            if(number == array[mid]) {
                System.out.println(mid);
                return;
            }
            else if(number > array[mid]) {
                start = mid + 1;
            }
            else
                end = mid - 1;
            }
        System.out.println("Not found");
        }



}
