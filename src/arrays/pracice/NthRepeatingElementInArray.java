package arrays.pracice;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class NthRepeatingElementInArray {
    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};
        int k = 2;
        Map<Integer, Integer> map = new LinkedHashMap<>();
        for (int i = 0 ; i < nums.length ; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        Map<Integer, Integer> newHashMap1 = map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).collect(
                Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2, LinkedHashMap::new));
        Map<Integer, Integer> newHashMap =map.entrySet().stream().sorted(Map.Entry.comparingByValue()).
                limit(k).
                collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2, LinkedHashMap::new))
        ;
        Map<Integer, Integer> newHashMaprerv =map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).
                limit(k).
                collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2, LinkedHashMap::new))
                ;
        System.out.println(newHashMap1);
        System.out.println(newHashMap);
        System.out.println(newHashMaprerv);
        int count = 0;

        for (Map.Entry<Integer, Integer> m :  map.entrySet()) {
            if(m.getValue() > 1 ) {
                count++;
                if(count == k) {
                    System.out.println(m.getKey() + "  "+ m.getValue());
                }
            }
        }
    }
}
