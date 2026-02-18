package string.programs;

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Sowjanya";
        reverseStringBuilder(str);
//        char[] charArray = str.toCharArray();
//        int start = 0, end = str.length() - 1;
//        while (start < end) {
//            char temp = charArray[start];
//            charArray[start] = charArray[end];
//            charArray[end] = temp;
//            //str = str.replace(str.charAt(start), str.charAt(end));
//            start++;
//            end--;
//        }
        //System.out.println(Arrays.toString(charArray));
    }

    public static void reverseStringBuilder(String str) {
       String sb = new StringBuilder(str).reverse().toString();
        int start = 0, end = str.length() - 1;
        char[] ch = str.toCharArray();
        while (start < end) {
            char temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp;
            start++;
            end--;

        }
        System.out.println(sb);
    }
    //Strings are immutable in Java we can not change the original string
}
