package arrays.pracice;

public class FindAllPairs {
    public static void main(String[] args) {
        int[] array = {2, 4, 3, 5, 7};
        int target = 7;
        for (int i = 0 ; i < array.length ; i++) {
            for (int j = 0 ; j < array.length ; j++) {
                if(array[i] +  array[j] == target) {
                    System.out.println(array[i] + "  " + array[j]);
                }
            }
        }
    }
}
