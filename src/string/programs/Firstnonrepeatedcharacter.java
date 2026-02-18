package string.programs;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Firstnonrepeatedcharacter {
    public static void main(String[] args) {
        String str = "Software Services";
        char[] ch = str.toLowerCase().toCharArray();
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (Character c :  ch) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        System.out.println(map);
        for (Map.Entry<Character, Integer> m : map.entrySet()) {
            if(m.getValue() == 1 ) {
                System.out.println(m.getKey() + "  " + m.getValue());
                break;
            }

        }
        for (Map.Entry<Character, Integer> m : map.entrySet()) {
            if(m.getValue() > 1 ) {
                System.out.println(m.getKey() + "  " + m.getValue());
                break;
            }

        }
        for (int i = str.length() - 1 ; i >= 0 ; i--) {
            if(map.get(str.charAt(i)) == 1) {
                System.out.println(str.charAt(i) + "    " + map.get(str.charAt(i)));
                break;
            }
        }
    }
}
