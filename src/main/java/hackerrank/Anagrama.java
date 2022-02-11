package hackerrank;

import java.util.Locale;

public class Anagrama {

    static boolean isAnagram(String a, String b) {

        if (a.length() != b.length()) return false;
        a = a.toLowerCase();
        b = b.toLowerCase();

        int[] a_char_freq = new int[26];
        int[] b_char_freq = new int[26];
        for (int i = 0; i < a.length(); i++) {
            a_char_freq[((int) a.charAt(i))- 'a']++;
            b_char_freq[((int) b.charAt(i))- 'a']++;
        }

        for (int i = 0; i < a_char_freq.length; i++) {
            if(a_char_freq[i] != b_char_freq[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {

        boolean ret = isAnagram("subiu", "ibusy");
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}