package algoritimos;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LessInteger {

    public static void main(String[] args) {
        int[] A = new int[]{1001, 7, 3, 4, 6};
        System.out.println(solution(A));
    }

    @NotNull
    private static int solution(int[] A) {
        Arrays.sort(A);
        int min = 1;

        // Starting from 1 (min), compare all elements, if it does not match
        // that would the missing number.
        for (int i : A) {
            if (i == min) {
                min++;
            }
        }

        return min;
    }


}