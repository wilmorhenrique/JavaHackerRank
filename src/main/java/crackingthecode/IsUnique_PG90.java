package crackingthecode;

import java.util.HashSet;

public class IsUnique_PG90 {
    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "abcdfghjklpoiuytrew";
        String s3 = "abcdaa";
        String s4 = "abcdfghjklpowuytrew";
        System.out.println(s1 + " - "  + isAllLettesUnique(s1));
        System.out.println(s2 + " - "  + isAllLettesUnique(s2));
        System.out.println(s3 + " - "  + isAllLettesUnique(s3));
        System.out.println(s4 + " - "  + isAllLettesUnique(s4));


    }

    private static boolean isAllLettesUnique(String arg) {
        boolean response = true;
        HashSet set = new HashSet();
        for (int i = 0; i < arg.length() ; i++) {
            if (set.contains(arg.substring(i,i+1))) return false;
            set.add(arg.substring(i,i+1));
        }
        return response;
    }
}
