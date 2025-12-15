package arrays.pracice;

public class BInarySearch {
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 6, 7, 9};
        int n = 5;
        int left = 0, right =  array.length - 1;

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
}
