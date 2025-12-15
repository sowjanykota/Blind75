package patterns.practice;

public class CharacterPattern {
    public static void main(String[] args) {
        int n = 7;

        for (int i = 1 ; i <= n ; i++) {
            char ch = 'A';
            for (int j = 0 ; j < i ; j++) {
                //System.out.print((char) (ch + j) + " ");
                System.out.print(ch++ + " ");
            }
            System.out.println();
        }
        System.out.println("====================");
        //revereseStarPattern(n);
    }
}
