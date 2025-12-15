package find.numbers;

public class PalindromeNumber {
    public static void main(String[] args) {
        int num = 121;
        int afterReverse = 0;
        int beforeReverse = num;
        if (num < 0) {
            System.out.println(num + " is Not a Palindrome number.");
            return;
        }
        while (num != 0) {
            int rem = num % 10;
            afterReverse = afterReverse * 10 + rem;
            num = num / 10;
        }
        if(beforeReverse == afterReverse) {
            System.out.println("Palindrome");
        }
        else
            System.out.println("Not Palindrome");
    }
}
