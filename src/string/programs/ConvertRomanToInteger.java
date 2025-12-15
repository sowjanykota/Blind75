package string.programs;

import java.util.HashMap;
import java.util.Map;

public class ConvertRomanToInteger {
    public static void main(String[] args) {
        String str = "IXIX";
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        char[] chars = str.toCharArray();
        int sum = 0;
       for (int i = 0 ; i < str.length() ; i++) {
           if(i > 0 && map.get(chars[i]) > map.get(chars[i-1])) {
               sum = sum + map.get(chars[i]) - 2 * map.get(chars[i-1]);
           }
           else
               sum = sum +  map.get(chars[i]) ;
       }
        System.out.println(sum);
    }
}
