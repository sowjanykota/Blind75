package find.numbers;

public class SwapNumbers {
    public static void main(String[] args) {
        int a = 5, b = 9;
        a = a + b; // 14
        b = a - b; //
        a = a - b;
        System.out.println(a);
        System.out.println(b);

        int d = 8, e = 17;
        int temp = d;
        d = e;
        e = temp;
        System.out.println(d);
        System.out.println(e);
    }
}
