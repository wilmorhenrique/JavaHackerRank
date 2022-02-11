package algoritimos;

public class IsPrime {

    public static void main(String[] args) {
        for (int n = 0; n < 38; n++) {
            System.out.println("================================");
            System.out.println("Square root of" +n+":" + Math.sqrt(n));
            System.out.println("is " +n+" Prime:" + isPrime(n));
        }

    }

    private static Boolean isPrime(int n) {
        for (int i = 2; i * i <= n  ; i++) {
            System.out.println("i ="+i);
            if (n % i == 0) return  false;
        }
        return true;
    }
}
