package hackerrank;

import java.io.*;

class ResultadoFatorial {

    /*
     * Complete the 'factorial' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER n as parameter.
     */

    public static int factorial(int n) {
        if (n==1) return 1;
        return n*factorial(n-1);
    }

}

public class Fatorial {
    public static void main(String[] args) throws IOException {

        int result = ResultadoFatorial.factorial(6);
        System.out.println(result);

    }
}