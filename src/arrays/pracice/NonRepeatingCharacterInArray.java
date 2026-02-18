package arrays.pracice;

import java.util.HashMap;
import java.util.Map;

public class NonRepeatingCharacterInArray {
    public static void main(String[] args) {
        int[] arary = {1, 1, 2, 2, 3, 4, 5, 5, 6, 6};
        Map<Integer, Integer> map = new HashMap<>();
        for (int a : arary) {
            map.put(a, map.getOrDefault(a, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> m : map.entrySet()) {
            if(m.getValue() == 1) {
                System.out.println(m.getKey());
            }
        }
        for (int a : arary) {
            map.put(a, map.getOrDefault(a, 0) + 1);
            for (Map.Entry<Integer, Integer> m : map.entrySet()) {

            }
        }
    }
}
