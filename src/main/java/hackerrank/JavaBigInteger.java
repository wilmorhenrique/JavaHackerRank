package hackerrank;

import java.math.BigInteger;
import java.util.Scanner;

public class JavaBigInteger {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String n1 = scan.nextLine();
        String n2 = scan.nextLine();

        BigInteger b1  = new BigInteger(String.valueOf(n1));
        BigInteger b2  = new BigInteger(String.valueOf(n2));

        BigInteger result   = b1.multiply(b2);

        System.out.println(b1.add(b2).toString());
        System.out.println(result.toString());
    }


}
