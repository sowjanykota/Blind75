package arrays.pracice;

public class ConvertIntegerToRoman {
    public static void main(String[] args) {
        int num = 1994;
        int[] vales = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder  sb = new StringBuilder();
        for (int i = 0 ; i < vales.length ; i++) {
            while (num >= vales[i]) {
                num = num - vales[i];
                sb.append(symbols[i]);
            }
        }
        System.out.println(sb);

    }

//    Start with 1994:
//
//            1000 → subtract 1000 → 994 → append "M"
//
//            900 → subtract 900 → 94 → append "CM"
//
//            90 → subtract 90 → 4 → append "XC"
//
//            4 → subtract 4 → 0 → append "IV"
}
