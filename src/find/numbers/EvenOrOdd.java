package find.numbers;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        if(number % 2 == 0) {
            System.out.println("Even number");
        }
        else
            System.out.println("Odd number");
        scan.close();
    }

}
