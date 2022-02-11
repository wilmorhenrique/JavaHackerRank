package hackerrank;

import java.math.BigInteger;
import java.util.Deque;

public class BigIntegerProbablyPrime {
    public static void main(String[] args) {

        for (int i = 7; i<10; i++) {
            BigInteger b = new BigInteger(String.valueOf(i));
            System.out.println("i="+ i + "->" + b.isProbablePrime(1));

        }
    }
}
