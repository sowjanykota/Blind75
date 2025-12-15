package arrays.pracice;

import java.util.*;
import java.util.stream.Collectors;

public class SortCharcaterByFrequency {
    public static void main(String[] args) {
        String str = "tree";
        char[] ch =  str.toCharArray();
        Map<Character, Integer> map = new TreeMap<>();
        for (char c : ch) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        Map<Character, Integer> sorted1= map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (a, b) -> a, LinkedHashMap::new));
        Map<Character, Integer> sorted = map.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toMap(
                Map.Entry::getKey, Map.Entry::getValue, (a, b) -> a,LinkedHashMap::new
        ));
        Map<Character, Integer> sorteReveseddMap = map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).collect(Collectors.toMap(
                Map.Entry::getKey, Map.Entry::getValue, (oldValue, newValue) ->oldValue, LinkedHashMap::new
        ));
        System.out.println(sorteReveseddMap);
        System.out.println(sorted1);

//        the part (oldValue, newValue) -> oldValue is called the merge function.
//
//                Why is a merge function needed?
//
//                Collectors.toMap() requires a merge function when two keys are the same while collecting from the stream.
//
//        If the map already contains a key and another entry with the same key comes along, the merge function tells Java which value to keep.
    }
}
