package arrays.pracice;

public class SumOnlyIntegers {
    public static void main(String[] args) {
        String[] array = {"5", "2", "9", "a", "1", "6", "#", "3"};
        int sum = 0;
        for (int i = 0 ; i < array.length ; i++) {
            try {
                int n = Integer.parseInt(array[i]);
                sum = sum + n;
            } catch (NumberFormatException e) {

            }
        }
        System.out.println(sum);
    }
}
