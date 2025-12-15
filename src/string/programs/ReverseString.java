package string.programs;

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Sowjanya";
        char[] charArray = str.toCharArray();
        int start = 0, end = str.length() - 1;
        while (start < end) {
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;
            //str = str.replace(str.charAt(start), str.charAt(end));
            start++;
            end--;
        }
        System.out.println(Arrays.toString(charArray));
    }
    public static void reverseStringBuilder(String str) {
        StringBuilder sb =  new StringBuilder(str).reverse();
    }
}
