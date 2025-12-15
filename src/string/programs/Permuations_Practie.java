package string.programs;

import java.util.Arrays;

public class Permuations_Practie {
    public static void main(String[] args) {
        String str = "abc";

        int number = 123;
        String strInteger = String.valueOf(number);
        findPerPractice(str.toCharArray(), 0);


//        findPermuattaions(str.toCharArray(), 0);
//        findPermuationsIntegre(strInteger.toCharArray(), 0);
    }

    private static void findPermuattaions(char[] ch, int fi) {
        if(fi == ch.length - 1) {
            System.out.println(Arrays.toString(ch));
            return;
        }
        for (int i = fi ; i < ch.length ; i++) {
            swap(ch, i, fi);
            findPermuattaions(ch, fi + 1);
            swap(ch, i, fi);
        }

    }
    public static void swap(char[] ch , int i, int fi) {
        char temp = ch[i];
        ch[i] = ch[fi];
        ch[fi] = temp;
    }
    private static void findPermuationsIntegre(char[] ch, int fi) {
        if(fi == ch.length-1) {
            System.out.println(Arrays.toString(ch));
            return;
        }
        for (int i = fi ; i < ch.length ; i++) {
            swap(ch, i, fi);
            findPermuattaions(ch, fi + 1);
            swap(ch, i, fi);
        }
    }

    public static void findPer(char[] ch, int fi) {
        if(fi == ch.length-1)
        {
            System.out.println(Arrays.toString(ch));
            return;

        }
        for (int i = fi ; i < ch.length ; i++) {
            swap(ch, i, fi);
            findPer(ch, fi+1);
            swap(ch, i, fi);
        }

    }
    public static void findPerPractice(char[] ch, int fi) {
        if(fi == ch.length-1) {
            System.out.println(Arrays.toString(ch));
            return;
        }
        for (int i = fi ; i < ch.length ; i++) {
            swap(ch, i, fi);
            findPerPractice(ch, fi + 1);
            swap(ch, i, fi);
        }
    }

}
