package patterns.practice;

public class StarPattern {
    public static void main(String[] args) {
        int n = 7;
        for (int i = 1 ; i <= n ; i++) {
            for (int j = 1 ; j <= i ; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        System.out.println("====================");
        revereseStarPattern(n);
        System.out.println("====================");
        star2(n);
        System.out.println("====================");
        star3(n);
        System.out.println("====================");
        star4(n);
        
    }

    private static void star4(int n) {
        for (int i = 1 ; i <= n ; i++) {
            for (int j = 2 * n -i ; j > i ; j--) {
                System.out.print(" ");
            }
            for (int k = 1 ; k <= i ; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void star3(int n) {
        for (int i = 1 ; i <= n ; i++) {
            for (int j = n ; j >= i ; j--) {
                System.out.print(" ");
            }
            for (int k = 1 ; k <= i ; k++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    private static void star2(int n) {
        for (int i = 1 ; i <= n ; i++) {
            for (int k = 1 ; k <= i ; k++){
                System.out.print(" ");
            }
            for (int j = n ; j >= i ; j--) {
                System.out.print("* " );
            }
            System.out.println();
        }
    }

    public static void revereseStarPattern(int n) {
        for (int i = n ; i >= 1 ; i--) {
            for (int j = 1 ; j <= i ; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
