package find.numbers;

public class PerfectSquareCheck {
    public static void main(String[] args) {
        int n = 49;
        int i = 1;
        while (i * i <= n) {
            if(i * i == n) {
                System.out.println(i);
            }
            i++;
        }
        //System.out.println(i);
    }
}
