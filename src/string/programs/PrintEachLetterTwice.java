package string.programs;

public class PrintEachLetterTwice {
    public static void main(String[] args) {
        String str = "hello";
        StringBuilder sb = new StringBuilder();
        for (int i = 0 ; i < str.length(); i++) {
            sb.append(str.charAt(i)).append(str.charAt(i));
        }
        System.out.println(sb.toString());
    }
}
