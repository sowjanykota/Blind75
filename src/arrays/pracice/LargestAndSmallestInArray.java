package arrays.pracice;

public class LargestAndSmallestInArray {
    public static void main(String[] args) {
        int[] array = {5, 2, 9, 1, 6, 3};
        int smallest = Integer.MAX_VALUE;
        int larget = Integer.MIN_VALUE;
        for (int i = 0 ; i < array.length ; i++) {
            smallest = Math.min(smallest, array[i]);
            larget = Math.max(larget, array[i]);
        }
        System.out.println(smallest);
        System.out.println(larget);
    }
}
