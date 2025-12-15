package string.programs;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FindDuplicateCharacters {
    public static void main(String[] args) {
        String str = "JavaJ2EE";
        char[] ch = str.toCharArray();
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (char c : ch) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        System.out.println(map);
        for (Map.Entry<Character, Integer> m : map.entrySet()) {
            if(m.getValue() > 1) {
                System.out.println(m.getKey() + " " + m.getValue());
            }
        }
    }
}
