package arrays.pracice;

import java.util.Arrays;

public class Merge2SortedINtoOne {
    public static void main(String[] args) {
        int[] a = {1, 3, 5};
        int[] b = {2, 4, 6};
        int[] array = new int[a.length + b.length];
        int index = 0;
        int first = 0, second = 0;
        while (first < a.length && second < b.length) {
            if(a[first] < b[second] && first < a.length) {
                array[index] = a[first];
                first++;
                index++;
            }
            else  {
                array[index] = b[second];
                second++;
                index++;
            }
        }
        while (first < a.length) {
            array[index++] = a[first++];
        }
        while (second < b.length) {
            array[index++] = b[second++];
        }
        System.out.println(Arrays.toString(array));

    }
}
