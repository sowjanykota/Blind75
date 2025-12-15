package string.programs;

public class ReverseStringPreserveSpecial {
    public static void main(String[] args) {
        String input = "Hello, world";

        String[] words = input.split("\\s+"); // split by spaces
        StringBuilder result = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            result.append(words[i]);
            if (i != 0) result.append(" ");
        }

        System.out.println(result);
    }
}

