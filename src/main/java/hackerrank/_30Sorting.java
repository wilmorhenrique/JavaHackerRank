package hackerrank;


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class _30Sorting {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int trocas = 0;
        for (int i = 1; i < a.size(); i++) {
            int analise = i;
            while (analise > 0 && a.get(analise) < a.get(analise-1) ) {
                int atual = a.get(analise);
                a.set(analise, a.get(analise-1));
                a.set(analise-1, atual);
                analise--;
                trocas++;
            }
        }
        System.out.println("Array is sorted in " +trocas+ " swaps.");
        System.out.println("First Element: "+a.get(0));
        System.out.println("Last Element: "+a.get(a.size()-1));
        bufferedReader.close();
    }
}

