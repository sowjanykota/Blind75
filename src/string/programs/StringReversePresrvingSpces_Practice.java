package string.programs;

import java.util.Arrays;

public class StringReversePresrvingSpces_Practice {
    public static void main(String[] args) {
        // Skip non-letter/digit characters from left
        //Non-letter/digit character: anything else, like ! @ # $ % ^ & * ( ) - + , . ? " ' or a space.
        String str = "a b c d";
        int left = 0, right = str.length() - 1;
        char[] ch = str.toCharArray();
        while (left < right) {
            if(!Character.isLetterOrDigit(ch[left])) {
                left++;
                continue;
            }

            if(!Character.isLetterOrDigit(ch[right])) {
                right--;
                continue;
            }
            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;
            left++;
            right--;

        }
        System.out.println(new String(ch));
        StringRevresePreservingSpace("Sd");
    }

    public static void StringRevresePreservingSpace(String string) {
        String st1 = "1 2 3 4";
        char[] ch = st1.toCharArray();
        int left = 0, right =  st1.length() - 1;
        while (left < right) {
            if(st1.charAt(left) == ' ') {
                left++;
                continue;
            }
            if(st1.charAt(right) == ' ') {
                left++;
                continue;
            }
            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;
            left++;
            right--;

        }
        System.out.println(Arrays.toString(ch));
    }
}
