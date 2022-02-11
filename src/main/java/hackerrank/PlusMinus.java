package hackerrank;

import java.io.*;
import java.text.*;
import java.util.*;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        System.out.println(arr);
        DecimalFormat df = new DecimalFormat("0.00000");
        List<Integer> positivos = new ArrayList<>();
        List<Integer> negativos = new ArrayList<>();
        List<Integer> zeros = new ArrayList<>();

        arr.forEach(item -> {
            if (item < 1 ) {
                negativos.add(item);
            } else if (item > 1 ) {
                positivos.add(item);
            } else {
                zeros.add(item);
            }

        });

        System.out.println(df.format((float)positivos.size() / (float)arr.size()));
        System.out.println(df.format((float)negativos.size() / (float)arr.size()));
        System.out.println(df.format((float)zeros.size() / (float)arr.size()));

    }

}

public class PlusMinus {
    public static void main(String[] args) throws IOException {

        List<Integer> arr = Arrays.asList(-4, 3, -9, 0, 4, 1);

        Result.plusMinus(arr);
    }
}
