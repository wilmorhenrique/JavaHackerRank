package hackerrank;

import java.util.Scanner;

public class _30RunningTimeComplexity {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            int number = scan.nextInt();
            isPrime(number);
        }
        scan.close();
    }

    private static void isPrime(int number) {
        if (number == 1 ) {
            System.out.println("Not prime");
            return;
        }
        for (int i = 2; i * i <= number / 2; i++) {
            if (number % i == 0) {
                System.out.println("Not prime");
                return;
            }
        }
        System.out.println("Prime");
    }

}
