package string.programs;

public class RemoveSpacesFromString {
    public static void main(String[] args) {
        String str = "Welcomt to Java World";
        StringBuilder sb = new StringBuilder();
        for (int i = 0 ; i < str.length() ; i++) {
            if(str.charAt(i) != ' ') {
                sb.append(str.charAt(i));
            }
        }
        System.out.println(sb.toString());
    }
}
