package basics;


import java.io.*;
        import java.util.*;
        import java.text.*;
        import java.math.*;
        import java.util.regex.*;

public class StackHackerrank {

    static void superStack(String[] operations) {
       Integer[] stack = new Integer[200000];

        for (int i = 0; i < operations.length; i++) {
            // cada operations tem 2 comandos e preciso fazer split aqui(inicialmente pensei que era um array )
            String[]  command = operations[i].split(" ");
            if ("push".equals(command[0]) ) {
                stack.add(Integer.valueOf(command[1]));
            } else if ("pop".equals(command[0]) ) {
                stack.remove(stack.size()-1);
            } else if ("inc".equals(command[0]) ) {
                int index = Integer.valueOf(command[1]);
                int valueToInc = Integer.valueOf(command[2]);

                for (int j = 0; j < index; j++) {
                    stack.set(j, stack.get(j) + valueToInc);
                }
            }

            if (stack.isEmpty()) {
                System.out.println("EMPTY");
            } else {
                System.out.println(stack.get(stack.size()-1));

            }
        }
    }


    /*
     * Complete the function below.
     */
    static void superStack_1(String[] operations) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < operations.length; i++) {
            // cada operations tem 2 comandos e preciso fazer split aqui(inicialmente pensei que era um array)
            String[]  command = operations[i].split(" ");
            if ("push".equals(command[0]) ) {
                stack.push(Integer.valueOf(command[1]));

            } else if ("pop".equals(command[0]) ) {
                stack.pop();

            } else if ("inc".equals(command[0]) ) {
                Stack<Integer> tempStack = new Stack<>();

                while (!stack.isEmpty()) {
                    tempStack.push(stack.pop());
                }

                int index = Integer.valueOf(command[1]);
                int valueToInc = Integer.valueOf(command[2]);

                int position = 0;
                while (!tempStack.isEmpty()) {
                    int newNumber = tempStack.pop() ;
                    if (position < index) {
                        newNumber +=  valueToInc;
                    }
                    stack.push(newNumber);
                    position++;
                };
            }

            if (stack.isEmpty()) {
                System.out.println("EMPTY");
            } else {
                System.out.println(stack.peek());
            }
        }


    }

    public static void main(String[] args)  {
        Scanner in = new Scanner(System.in);
        int operations_size = 0;
        operations_size = Integer.parseInt(in.nextLine().trim());

        String[] operations = new String[operations_size];
        for(int i = 0; i < operations_size; i++) {
            String operations_item;
            try {
                operations_item = in.nextLine();
            } catch (Exception e) {
                operations_item = null;
            }
            operations[i] = operations_item;
        }

        superStack(operations);

    }
}