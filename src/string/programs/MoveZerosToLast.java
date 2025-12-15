package string.programs;

import java.util.Arrays;

public class MoveZerosToLast {
    public static void main(String[] args) {
        String str = "32400121200";
        String resString = "";
        char[] ch = str.toCharArray();
        char[] resuCharArray = new char[str.length()];
        int index = 0;
        for (char c : ch) {
            if(c != '0') {
                ch[index] = c;
                index++;
            }

        }

        for (int i = index ; i < str.length() ; i++ ) {
            ch[i] = '0';
        }
        System.out.println(Arrays.toString(ch));
        //rearrange(str);
    }
    public static void rearrange(String str) {
        char[] ch = str.toCharArray();
        StringBuilder digits = new StringBuilder();
        StringBuilder nonDigits = new StringBuilder();

        for (char c :  ch) {
            if(Character.isDigit(c)) {
                digits.append(c);
            }
            else
                nonDigits.append(c);
        }
        System.out.println(digits.toString() + nonDigits.toString() +"");
    }
}
