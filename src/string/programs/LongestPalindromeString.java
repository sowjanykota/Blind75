package string.programs;

public class LongestPalindromeString {
    public static void main(String[] args) {
        String str = "babad";
        char[] ch = str.toCharArray();
        String maxLenght = "";
        for (int i = 1; i < str.length(); i++) {
            //odd length
            int left = i, right = i;
            while (str.charAt(left) == str.charAt(right)) {

                left--;
                right++;

                if (left == -1 || right == str.length())
                    break;
            }

            String palindrome = str.substring(left + 1, right);
            if (palindrome.length() > maxLenght.length()) {
                maxLenght = palindrome;
            }

            left = i - 1;
            right = i;
            while (str.charAt(left) == str.charAt(right)) {
                left--;
                right++;

                if (left == -1 || right == str.length())
                    break;

            }
            palindrome = str.substring(left + 1, right);
            if (palindrome.length() > maxLenght.length()) {
                maxLenght = palindrome;
            }
        }
        System.out.println(maxLenght);
    }

}



