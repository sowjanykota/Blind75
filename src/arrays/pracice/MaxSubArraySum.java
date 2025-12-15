package arrays.pracice;

public class MaxSubArraySum {
    public static void main(String[] args) {
        int[] array = {-2,1,-3,4,-1,2,1,-5,4};
        int max = array[0];
        int sum = 0;
        int left = 0, si = 0, end = 0, start = 0;
        for (int right = 0 ; right < array.length ; right++) {
            sum = sum + array[right];
            if(sum < 0) {
                sum = 0;
                si = right + 1;

            }
            if(max < sum) {
                max = sum;
                end = right;
                start = si;

            }
        }
        System.out.println(max);
        System.out.println(start + "  " + end);
    }
}
