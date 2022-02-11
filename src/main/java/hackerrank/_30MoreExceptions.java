package hackerrank;

import java.util.*;
import java.io.*;

//Write your code here

public class _30MoreExceptions {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {

            int n = in.nextInt();
            int p = in.nextInt();
            Calculator_ myCalculator = new Calculator_();
            try {
                int ans = myCalculator.power(n, p);
                System.out.println(ans);
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        in.close();
    }

}


class Calculator_ {

    public int power(int n, int p) throws  Exception{
        if (n < 0 || p < 0) throw new Exception("n and p should be non-negative");
        Double  val = Math.pow(n, p);
        return val.intValue();
    }
}