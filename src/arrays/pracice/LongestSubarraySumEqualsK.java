package arrays.pracice;

import java.util.*;

public class LongestSubarraySumEqualsK {
    public static void main(String[] args) {
        int[] array = {1, -1, 5, -2, 3};
        int k = 3;
        usingPrefixSum3(array, k);
       // longestSubArraySumPractice(array, k);
        int sum = 0;
        int start = 0, end = 0, max = 0;
        //continousSubArray2(array, k);
        //usingPrefixSum(array, k); // this is correct
//        Map<Integer, Integer> map = new LinkedHashMap<>();
//        for (int i = 0 ; i < array.length ; i++) {
//            sum = sum +  array[i];
//            //map.put(sum, i);
//            if (map.containsKey(sum - k)) {
//                if(max <  i - map.get(sum - k)
//               ){
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

    public static void longestSubArraySumPractice(int[] array, int k) {
        int sum = 0, start = 0, sp = 0, ep = 0, maxLen = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];

            while (sum > k && start <= i -  1) {
                sum -= array[start];
                start++;
            }

            if (sum == k) {
                int len = i - start + 1;
                if (len > maxLen) {
                    maxLen = len;
                    sp = start;
                    ep = i;
                }
            }
        }

        System.out.println(sp);
        System.out.println(ep);

    }
    public static void usingPrefixSum3(int[] array, int k) {
        int prefixsum = 0, start =0, end = 0, maxLenght = 0;
        Map<Integer, Integer> map = new LinkedHashMap<>();
        map.put(0, -1);
        for (int i = 0 ; i < array.length ; i++) {
            prefixsum = prefixsum + array[i];
            int diff = prefixsum - k;
            if (map.containsKey(diff)) {
                int index = i - map.get(diff);

                if(maxLenght < index) {
                    maxLenght = index;
                    start = map.get(diff) +  1;
                    end = i;
                   // int lenght = end - start + 1;
                }

            }
            if(!map.containsKey(prefixsum)) {
                map.put(prefixsum, i );
            }
        }
        System.out.println(start);
        System.out.println(end);
    }
}
