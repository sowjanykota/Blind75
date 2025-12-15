package find.numbers;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FIndDigitFrequencyInANUmber {
    public static void main(String[] args) {
        int num = 112345211;
        Map<Integer, Integer> map = new LinkedHashMap<>();
        while (num != 0) {
            int rem = num % 10;
            map.put(rem, map.getOrDefault(rem, 0) + 1);
            num = num / 10;
        }
        System.out.println(map);
    }
}
