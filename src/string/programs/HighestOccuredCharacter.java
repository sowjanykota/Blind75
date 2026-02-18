package string.programs;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class HighestOccuredCharacter {
    public static void main(String[] args) {
        String str = "aaaaabbcddddd";
        char[] ch = str.toCharArray();
        int larget = 0;
        char largets= ' ';
        //char largestChar = 'scsc';
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (char c : ch) {
            map.put(c, map.getOrDefault(c, 0 ) + 1);
        }
        System.out.println(map);
        for (Map.Entry<Character, Integer> m : map.entrySet()) {
            if(larget < m.getValue()) {
                larget = m.getValue();
                largets = m.getKey();
            }

        }
        System.out.println(largets);
    }
}
