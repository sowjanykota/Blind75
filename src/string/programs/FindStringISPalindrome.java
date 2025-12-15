package string.programs;

public class FindStringISPalindrome {
    public static void main(String[] args) {
        String str = "madamas";
        char[] ch = str.toCharArray();
        int start = 0, end = ch.length - 1;
        while (start < end) {
            if(str.charAt(start) != str.charAt(end)) {
                System.out.println("Not Palindrome");
                return;
            }
            start++;
            end--;
        }
        System.out.println("Palindrome");
    }
}
