package basics;
import java.io.*;
import java.util.*;

public class StackBasics {


        public static void main(String args[])
        {
            // Creating an empty Stack
            Stack<Integer> stack   = new Stack<>();

            // Use add() method to add elements in the stack
            stack.push(100);
            stack.push(200);
            stack.push(300);
            stack.push(400);

            // Displaying the linkedstack
            System.out.println("Stack:"
                    + stack);

            // Using set() method to replace Geeks with GFG
            System.out.println("The Object that is replaced is: "
                    + stack.set(2, 1000));

             // Displaying the modified linkedstack
            System.out.println("The new Stack is:"
                    + stack);
        }
    }

