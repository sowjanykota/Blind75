package patterns.practice;

public class NumbersPattern {
    public static void main(String[] args) {
        int n = 7;
        for (int i = 1 ; i <= n ; i++) {
            for (int j = 1 ; j <= i ; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println("===================");
        reverseNumberPrint(n);
        System.out.println("===================");
        otherReverese(n);
        System.out.println("===================");
        otherReverese2(n);
        System.out.println("===================");
        otherReverese3(n);
        System.out.println("===================");
        otherReverese4(n);
    }

    private static void otherReverese4(int n) {
        for (int i = 1 ; i <= n ; i++) {
            for (int j = n ; j >= i ; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    private static void otherReverese3(int n) {
        for (int i = n ; i >= 1 ; i--) {
            for (int j = n ; j >= i ; j--) {
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }

    private static void otherReverese2(int n) {
        for (int i = n ; i >= 1 ; i--) {
            for (int j = 1 ; j <= i ; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void reverseNumberPrint(int n) {
        for (int  i = n ; i >= 1 ; i--){
            for (int j = 1 ; j <= i ; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    public static void otherReverese(int n) {
        for (int i = 1 ; i <= n ; i++) {
            for (int j = 1 ; j <= i ; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
