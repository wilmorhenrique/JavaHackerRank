package crackingthecode;

public class IsPermutatition {
    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "fcab";

        System.out.println(s1 + " e " + s2 + " Ispermutation =" + isPermutatition(s1,s2));
    }

    private static Boolean isPermutatition(String s1, String s2) {
        if(s1.length() != s1.length()) return false;

        int[] letters = new int[128];

        for (int i = 0; i < s1.length(); i++) {
            letters[s1.charAt(i)]++;
        }

        for (int i = 0; i < s2.length(); i++) {
            letters[s2.charAt(i)]--;
            if (letters[s2.charAt(i)] < 0 ) return false;
        }
        return true;
    }
}
