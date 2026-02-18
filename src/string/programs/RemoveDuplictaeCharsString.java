package string.programs;

public class RemoveDuplictaeCharsString {
    public static void main(String[] args) {
        String  ste = "banaans";
        String result = "";
        for (int i = 0 ; i < ste.length() ; i++) {
            int count = 0;
            for (int j = i + 1 ; j < ste.length() ; j++) {
                if(ste.charAt(i) == ste.charAt(j) && i != j) {
                    count++;
                }
            }
            if(count == 0) {
                result = result + ste.charAt(i);
            }
        }
        System.out.println(result);
    }
}
