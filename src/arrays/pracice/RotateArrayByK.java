package arrays.pracice;

import java.util.Arrays;

public class RotateArrayByK {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int k = 2;
//        for (int i = 0 ; i < k ; i++) {
//            int temp = arr[0];
//            for (int j = 0 ; j < arr.length -1 ; j++) {
//                arr[j] = arr[j + 1];
//            }
//            arr[arr.length - 1] = temp;
//        }
        System.out.println(Arrays.toString(arr));
        //OptimisedWay(arr, k);
        reverseArray(arr, k);
    }
    public static void OptimisedWay(int[] arr, int k) {
        //int mid = arr.length/2;
        int lenght = arr.length - 1;
        reverse(arr, 0, k - 1);
        reverse(arr, k , lenght);
        reverse(arr, 0, lenght);
        System.out.println(Arrays.toString(arr));

    }
    public static void reverse(int[] array, int start, int end) {
       while (start < end) {
           int temp = array[start];
           array[start] = array[end];
           array[end] = temp;
           start++;
           end--;
       }
    }
    public static void reverseArray(int[] arr, int k) {
        for (int i = 0 ; i < k ; i++) {
            int temp = arr[0];
            for (int j = 0 ; j < arr.length  - 1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[arr.length - 1] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
