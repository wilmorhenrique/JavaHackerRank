package hackerrank;
import java.util.*;

public class JavaStack {
    public static void main(String []argh)
    {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String input=sc.next();
            System.out.println(isValid(input));
        }
    }

    private static boolean isValid(String input) {
        Stack<Character> st = new Stack<>();
        HashMap<Character,Character> map= new HashMap<>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');

        if (input.length()%2 != 0) return false;


        //( { [ ] } )

        for(int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (map.containsKey(c)) {
                st.push(c);
            } else if (st.isEmpty() || c != map.get(st.pop())) {
                return false;
            }
        }
        return true;
    }
}
