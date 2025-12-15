package find.numbers;

public class Factorail {
    public static void main(String[] args) {
        int n = 6;
        int fact = 1;
        if(n == 1 || n == 0) {
            System.out.println(1);
            return;
        }
        for (int i = n ; i >= 1 ; i--) {
            fact = fact * i;
        }
        System.out.println(fact);
        System.out.println(recusrionFact(n));


    }
    public static int recusrionFact(int n) {
        if(n == 1 || n == 0)
            return 1;
        return n * recusrionFact(n - 1);
    }
}
