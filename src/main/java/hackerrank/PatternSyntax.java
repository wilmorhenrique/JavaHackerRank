package hackerrank;

import java.util.regex.Pattern;

public class PatternSyntax {
    public static void main(String[] args) {
        String pattern1= "([A-Z])(.+)";
        String pattern2 = "[AZ[a-z](a-z)";
        String pattern3 = "batcatpat(nat";

        try {
            Pattern.compile(pattern1);
            System.out.println("Valid");
        } catch (Exception e) {
            System.out.println("Invalid");
        }

        try {
            Pattern.compile(pattern2);
            System.out.println("Valid");
        } catch (Exception e) {
            System.out.println("Invalid");
        }

        try {
            Pattern.compile(pattern3);
            System.out.println("Valid");
        } catch (Exception e) {
            System.out.println("Invalid");
        }

    }
}
