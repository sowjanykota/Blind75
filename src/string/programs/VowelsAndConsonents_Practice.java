package string.programs;

public class VowelsAndConsonents_Practice {
    public static void main(String[] args) {
        String str = "Hello World";
        char[] ch = str.toCharArray();
        int vowelCount = 0, consCount = 0;
        for (char c : ch) {
            if(c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z')
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                    c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                vowelCount++;
            }
            else
                consCount++;
        }
        System.out.println(vowelCount + "  vowelCount");
        System.out.println(consCount + "   COnscount");

    }
}
