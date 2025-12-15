package arrays.pracice;

public class TrappinRainWater {
    public static void main(String[] args) {
        int[] array = {0,1,0,2,1,0,1,3,2,1,2,1};
        int[] prefixSum = new int[array.length];
        int[] suffixSum = new int[array.length];
        int  waterLevel = 0, sum = 0;
        prefixSum[0] = array[0];
        suffixSum[array.length-1] = array[array.length -1];
        for (int i = 1 ; i < array.length ; i++) {
            prefixSum[i] = Math.max(prefixSum[i - 1] , array[i]);
        }
        for (int i = array.length - 2 ; i >= 0 ; i--) {
            suffixSum[i] = Math.max(suffixSum[i + 1], array[i]);
        }
        for (int i = 0 ; i < array.length ; i++) {
            int findTheMin  = Math.min(prefixSum[i], suffixSum[i]);
            waterLevel += Math.min(prefixSum[i], suffixSum[i]) - array[i];

        }
        System.out.println(waterLevel);
    }
}
