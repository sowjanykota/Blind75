package find.numbers;

public class PrimeNumber {
    public static void main(String[] args) {
        int numbwr = 17;
        if(numbwr <= 1) {
            System.out.println("Not prime Number");
            return;
        }
        for (int i = 2 ; i <= Math.sqrt(numbwr) ; i++) {
            // or for (int j = 2; j <= i / 2; j++) {
            if(numbwr % i == 0) {
                System.out.println("Not Prime");
                return;
            }
        }


        System.out.println("Prime");
        System.out.println("=============");
        printPrimeNumbers(numbwr);

    }
    public static void printPrimeNumbers(int number) {
        for (int i = 2 ; i <= number ; i++) {
            boolean isPrime = true;
            for (int j = 2 ; j <= Math.sqrt(i) ; j++) {
                if(i % j == 0) {
                   isPrime = false;
                   break;
                }
            }
            if(isPrime) {
                System.out.println(i);
            }

        }
    }
}
