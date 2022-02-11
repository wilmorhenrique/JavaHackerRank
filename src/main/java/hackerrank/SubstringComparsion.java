package hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubstringComparsion {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        for (int x = 0; x<s.length()-2; x++) {
            String word = (s.substring(x,x+k));
            if (smallest.compareTo(word) > 0  || smallest.isBlank() ) {
                smallest = word;
            }
            if (largest.compareTo(word) < 0  || largest.isBlank() ) {
                largest = word;
            }
        }
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {

        System.out.println(getSmallestAndLargest("welcometoaaajava", 2));
    }
}


