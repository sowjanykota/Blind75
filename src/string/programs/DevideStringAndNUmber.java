package string.programs;

public class DevideStringAndNUmber {
    public static void main(String[] args) {
        String str = "Subbu123raj";
        char[] ch = str.toCharArray();
        String letter = "", digit = "";

        for (char c :  ch) {
            if(Character.isLetter(c))
                letter = letter + c;
            else if(Character.isDigit(c))
                digit = digit + c;

        }
        System.out.println(letter);
        System.out.println(digit);
    }
}
