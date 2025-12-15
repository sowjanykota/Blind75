package string.programs;

import java.util.Arrays;

public class CommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        Arrays.sort(strs);

        System.out.println(Arrays.toString(strs));

        // Compare only the first and last strings
        String first = strs[0], last = strs[strs.length - 1];
        StringBuilder builder = new StringBuilder();
        int minLength = Math.min(first.length(), last.length());
        for (int i = 0 ; i < minLength ; i++) {
            if(first.charAt(i) == last.charAt(i)) {
                builder.append(first.charAt(i));
            }
            else
                break;
        }
        System.out.println(builder);
    }
}
