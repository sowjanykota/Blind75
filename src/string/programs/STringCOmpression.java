package string.programs;

import java.util.HashMap;
import java.util.Map;

public class STringCOmpression {
    public static void main(String[] args) {
        String str = "aabbcccdd";
        char[] ch = str.toCharArray();
        int left = 0;int count = 1;
        String result = "";
        for (int right = 1 ; right < ch.length ; right++) {
            if(ch[left] == ch[right]) {
                count++;
            }
            else {
                result = result + ch[left] + count;
                left = right;
                count = 1;
            }
        }
        result = result + ch[left] + count;
        System.out.println(result);
        stringCompressionUsingLoops(str);
        System.out.println("==========");
        stringCompression(str);
        usingMap(str);
    }
    public static void stringCompressionUsingLoops(String str) {
        String result = "";
        for (int i = 0 ; i < str.length() ; i++) {
            int count = 1;
            for (int j = i + 1 ; j < str.length() ; j++) {
                if(str.charAt(i) == str.charAt(j)) {
                    count++;
                }
                else {
                    break;
                }
            }
            result = result + str.charAt(i) + String.valueOf(count);
            i = i + count - 1;
           //
        }
        System.out.println(result);
    }
    public static void usingMap(String str) {
        char[] ch = str.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0 ; i < ch.length ; i++) {
            map.put(ch[i], map.getOrDefault(ch[i], 0) + 1);
        }
        map.forEach((k, y) -> {
            System.out.print(k + String.valueOf(y));
        });
    }

    public static void stringCompression(String str) {
        char[] ch = str.toCharArray();
        for (int i = 0 ; i < ch.length ; i++) {
            int count = 0;
            for (int j = i ; j < ch.length ; j++) {
                if(ch[i] == ch[j]) {
                    count++;
                }
                else
                    break;;
            }
            System.out.print(str.charAt(i) +""+ count);
            i = i + count -1;
        }
        System.out.println();


    }
}
