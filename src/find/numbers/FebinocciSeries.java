package find.numbers;

public class FebinocciSeries {
    public static void main(String[] args) {
        int n = 4;
        int a = 0, b = 1;
        System.out.println(a);
        System.out.println(b);
        for (int i = 2 ; i <= n ; i++) {
            int c = a + b;
            System.out.println(c);
            a = b;
            b = c;
        }
        //usingRecursion(n);
    }

}
