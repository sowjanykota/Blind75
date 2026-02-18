package arrays.pracice;

public class LargestAndSmallestInArray {
    public static void main(String[] args) {
        int[] array = {5, 2, 9, 1, 6, 3};
        findLargestAndSmallest(array);
        int smallest = Integer.MAX_VALUE;
        int larget = Integer.MIN_VALUE;
        for (int i = 0 ; i < array.length ; i++) {
            smallest = Math.min(smallest, array[i]);
            larget = Math.max(larget, array[i]);
        }
        System.out.println(smallest);
        System.out.println(larget);
    }
    public static void findLargestAndSmallest(int[] array) {
        int larest = array[0], smallest = array[0];
        for (int i = 1 ; i < array.length ; i++) {
            if(larest < array[i]) {
                larest = array[i];
            }
            if(smallest > array[i]) {
                smallest = array[i];
            }
        }
        System.out.println(smallest);
        System.out.println(larest);
    }
}
