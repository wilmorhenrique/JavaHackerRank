package hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import static java.util.stream.Collectors.toList;

public class Java2dArray {
     public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            List<List<Integer>> arr = new ArrayList<>();


         arr.add(Arrays.asList(-1, -1, 0, -9, -2, -2));
         arr.add(Arrays.asList(-2, -1, -6, -8, -2, -5));
         arr.add(Arrays.asList(-1, -1, -1, -2, -3, -4));
         arr.add(Arrays.asList(-1, -9, -2, -4, -4, -5));
         arr.add(Arrays.asList(-7, -3, -3, -2, -9, -9));
         arr.add(Arrays.asList(-1, -3, -1, -2, -4, -5));

        int sum = 0;
        int max_sum = -1000;
        for (int i= 0; i < arr.size()-2 ; i++) {
            for (int j= 0; j < arr.get(i).size()-2 ; j++) {
                sum = arr.get(i).get(j) + arr.get(i).get(j+1) + arr.get(i).get(j+2) +
                        arr.get(i+1).get(j+1) +
                        arr.get(i+2).get(j) + arr.get(i+2).get(j+1) + arr.get(i+2).get(j+2) ;
                System.out.println(sum);
                if (sum > max_sum ) {
                    max_sum = sum;
                }

            }
        }
        System.out.println(max_sum);
     }


}
