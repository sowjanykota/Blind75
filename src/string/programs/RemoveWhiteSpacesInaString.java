package string.programs;

public class RemoveWhiteSpacesInaString {
    public static void main(String[] args) {
        String str = "OneSpace TwoSpaces  ThreeSpaces   FourSpaces    Tab        End";
        String outputString = str.replaceAll("\\s+", "");
        String without = "";
        System.out.println(outputString);

        for (int i = 0 ; i < str.length() ; i++) {
            if ( (str.charAt(i) != ' ') && (str.charAt(i) != '\t') )
            without = without + str.charAt(i);
        }
        System.out.println(without);
    }
}
