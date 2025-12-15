package string.programs;

import java.util.Arrays;
import java.util.StringJoiner;

public class RevereseEachWordOfString_Practice {
    public static void main(String[] args) {
        String str = "Hello world";
        String[] splitArray = str.split("[^a-zA-Z0-9]+");
        String[] split = str.split("[^a-z0-9A-Z]+");
        System.out.println(Arrays.toString(splitArray));
        StringJoiner sj = new StringJoiner(", ");
        for (String reve : splitArray) {
            //System.out.print( +" ");
             sj.add(new StringBuilder(reve).reverse().toString());
        }
        System.out.println(sj.toString());
        reverseString(str);


    }
    public static void reverseString(String str) {
        char[] ch = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        int start = 0, end = str.length()-1;
        while (start < end) {
            if(!Character.isLetterOrDigit(ch[start])) {
                start++;
                continue;
            }
            if(!Character.isLetterOrDigit(ch[end])) {
                end--;
                continue;
            }
            char temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(ch));
    }
}
