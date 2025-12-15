package string.programs;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LongestNonRepeatingSubsString {
    public static void main(String[] args) {
        String str = "pwwkew";
        HashSet<Character> set = new HashSet<>();
        char[] ch = str.toCharArray();
        int longest = 0;
        int left = 0;
        int start = 0, end = 0;
       for (int right = 0 ; right < ch.length ; right++) {
           while (set.contains(ch[right])) {
               set.remove(ch[left]);
               left++;
           }

           set.add(ch[right]);
           if(longest < right - left + 1) {
               longest = right - left + 1;
               start = left;
               end = right;
           }




        }
        System.out.println(str.substring(start, end + 1));
        longestSubStrinWihot(str);
    }
    public static void longestSubstringWithOut(String str) {
        char[] ch = str.toCharArray();
        Set<Character> set = new HashSet<>();
        int left = 0;
        int max = 0, start = 0, end = 0;
        for (int right = 0 ; right < ch.length ; right++) {
            while (set.contains(ch[right])) {
                set.remove(ch[left]);
                left++;
            }
            set.add(ch[right]);
            if(max < right - left + 1) {
                max = right - left + 1;
                start = left;
                end = right;
            }
        }
        System.out.println(max);
        System.out.println(str.substring(start, end + 1));
    }

    public static void longestSubStrinWihot(String str) {
        String str1 = "pwwkew";
        HashSet<Character> set = new HashSet<>();
        char[] ch = str.toCharArray();
        int start = 0;
        int max = 0, first =0, last = 0;
        for (int i = 0 ; i < ch.length ; i++) {
            while (set.contains(ch[i])) {
                set.remove(ch[start]);
                start++;

            }
            set.add(ch[i]);
            int length = i - start + 1;
            if(max < length) {
                max = length;
                first = start;
                last = i;
            }
        }
        System.out.println(max);
        System.out.println(first + "  " + last);
        System.out.println(str.substring(first, last + 1));
    }
}
