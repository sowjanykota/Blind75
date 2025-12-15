package arrays.pracice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LongestSubarraySumEqualsK {
    public static void main(String[] args) {
        int[] array = {1, -1, 5, -2, 3};
        int k = 3;
        int sum = 0;
        int start = 0, end = 0, max = 0;
        //continousSubArray2(array, k);
        usingPrefixSum(array, k); // this is correct
//        Map<Integer, Integer> map = new LinkedHashMap<>();
//        for (int i = 0 ; i < array.length ; i++) {
//            sum = sum +  array[i];
//            //map.put(sum, i);
//            if (map.containsKey(sum - k)) {
//                if(max <  i - map.get(sum - k)){
//                    max = i - map.get(sum - k);
//                    start = map.get(sum - k) + 1;
//                    end = i;
//                }
//
//            }
//
//            // Store only first occurrence index of prefSum
//            if (!map.containsKey(sum))
//                // we will add prefixsum and index
//                map.put(sum, i);
//        }
//        System.out.println(map);
//        System.out.println(max);
//        System.out.println(start + "  " + end);
    }


    public static void continousSubArray2(int[] arry, int k) {
        int left = 0;
        int sum = 0;
        int maxLen = 0, start = -1, end = -1;

        for (int right = 0; right < arry.length; right++) {
            sum += arry[right];

            // Shrink window if sum > k
            while (sum > k && left <= right -  1) {
                sum -= arry[left];
                left++;
            }

            // Check if current window sum == k
            if (sum == k) {
                int len = right - left + 1;
                if (len > maxLen) {
                    maxLen = len;
                    start = left;
                    end = right;
                }
            }
        }

        if (start != -1) {
            System.out.println("Longest subarray with sum " + k + " is from index: " + start + " to " + end);
        } else {
            System.out.println("No subarray with sum " + k + " found");
        }

    }
    public static void usingPrefixSum(int[] arry, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int prefixSum = 0, max= 0, start = 0, end = 0;
        for (int i = 0 ; i < arry.length ; i++) {
            prefixSum = prefixSum + arry[i];
            if(map.containsKey(prefixSum - k)) {
                int index = i - map.get(prefixSum - k);
                if(max < index) {
                    max = index;
                    start =  map.get(prefixSum - k) + 1;
                    end = i;
                }
            }

            if(!map.containsKey(prefixSum)) {
                map.put(prefixSum, i);
            }
        }
        System.out.println(max);
        System.out.println(start + " " + end);
    }
}
