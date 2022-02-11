package hackerrank;

public class Palindrome {


    public static Boolean isPalindrome(String s) {
        String newWord = "";
        for (int x = 0; x<s.length(); x++) {
            newWord = s.substring(x,x+1) + newWord;
        }
        return newWord.equals(s);
    }


    public static void main(String[] args) {

        System.out.println(isPalindrome("madam"));
        System.out.println(isPalindrome("subinonibus"));
        System.out.println(isPalindrome("subiunounibus"));
    }

}
