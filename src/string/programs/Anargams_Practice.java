package string.programs;

import java.util.Arrays;

public class Anargams_Practice {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        int[] array1 = new int[256];
        //int[] array2 = new int[str2.length()];
//        if(str1.length() != str2.length()) {
//            System.out.println("Not Anargams");
//            return;
//        }

//        for (int i = 0 ; i < str1.length() ; i++) {
//            array1[str1.charAt(i) - 'a']++;
//        }
//        System.out.println(array1);
//        for (int i = 0 ; i < str2.length() ; i++) {
//            array1[str2.charAt(i) - 'a']--;
//        }
//        System.out.println(array1);
//       for (int i = 0 ; i < array1.length ; i++) {
//           if(array1[1] != 0) {
//               System.out.println("Not Anaragsms");
//               return;
//           }
//       }
//        System.out.println("Anargsm");
       char[] ch1 = str1.toCharArray();
       char[] ch2 =  str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);
        if(Arrays.equals(ch1, ch2)) {
            System.out.println("AnargsmAnargsm");
        }
        else
            System.out.println("Not Anaragsms Not Anaragsms");

        checkAnagrams(str1, str2);
        checkAnagrams1(str1, str2);

    }
    public static void checkAnagrams1(String st1, String str2) {
        int[] array = new int[26];
        if(st1.length() != str2.length()) {
            System.out.println("False");
            return;
        }
        for (int i = 0 ; i < st1.length() ; i++) {
            array[st1.charAt(i) - 'a']++;
        }
        for (int i = 0 ; i < str2.length() ; i++) {
            array[str2.charAt(i) - 'a']--;
        }
        for (int i = 0 ; i < st1.length() ; i++) {
            if(array[i] != 0) {
                System.out.println("Not");
                return;
            }
        }
        System.out.println("Anagrams");
    }

    public static void checkAnagrams(String str1, String str2) {
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        int[] array = new int[26];
        int index = 0;
        for (int i = 0 ; i < ch1.length ; i++) {
            array[ch1[i] - 'a']++;
           // index++;
        }
        System.out.println(Arrays.toString(array));
        index = 0;
        for (int i = 0 ; i < ch2.length ; i++) {
            array[ch2[i] - 'a']--;
        }
        for (int i = 0 ; i < array.length ; i++) {
            if(array[i] != 0) {
                System.out.println("Not Anargams");
                return;
            }
        }
        System.out.println("Anargams");
    }
}
