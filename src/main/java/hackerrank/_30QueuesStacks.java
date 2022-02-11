package hackerrank;

import java.io.*;
import java.util.*;

public class _30QueuesStacks {
    Stack<Character> st = new Stack<Character>();
    Queue<Character> qu = new LinkedList<>();

    void pushCharacter(char c) {
        st.push(c);
    }
    void enqueueCharacter(char c) {
        qu.add(c);
    }

    private char dequeueCharacter() {
        return qu.poll();
    }

    private char popCharacter() {
        return st.pop();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        _30QueuesStacks p = new _30QueuesStacks();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        System.out.println(p.qu);
        System.out.println(p.st);

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {

            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is "
                + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }


}

