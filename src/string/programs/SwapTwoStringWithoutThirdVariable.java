package string.programs;

public class SwapTwoStringWithoutThirdVariable {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        str2 = str1 + str2;
        str1 = str2.substring(str1.length());
        str2 = str2.substring(0, str1.length());
        System.out.println("str1 value is " + str1);
        System.out.println("str2 value is " + str2);


    }
}
