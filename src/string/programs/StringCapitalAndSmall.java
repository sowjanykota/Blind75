package string.programs;

import java.util.Arrays;
import java.util.Collections;

public class StringCapitalAndSmall {
    public static void main(String[] args) {
        String str = "aBACbcEDed";
       String loweCase = "", upperCase = "";
        int lowercaseCount = 0, uppercaseCount = 0;
        char[] ch = str.toCharArray();
        Arrays.sort(ch);
        for (char c : ch) {
            if(Character.isLowerCase(c)) {
                loweCase = loweCase + c;
            }
            if(Character.isUpperCase(c)) {
                upperCase = upperCase + c;
            }
        }
        System.out.println(loweCase);
        System.out.println(upperCase);

    }
}
