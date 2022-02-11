package hackerrank;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DuplicateWords {

    public static void main(String[] args){

        Pattern pattern = Pattern.compile("<([^>]+)>([^<]+)</\\1>");

        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0){
            String line = in.nextLine();
            Matcher m = pattern.matcher(line);
            int matches = 0;
            while(m.find()) {
                matches++;
                System.out.println(m.group(2));
            }
            if(matches == 0) {
                System.out.println("None");
            }

            testCases--;
        }
    }

}