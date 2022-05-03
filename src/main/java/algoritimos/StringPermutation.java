package algoritimos;

public class StringPermutation {

    public static void main(String[] args) {
        String s = "abc";
        printPermtut(s, "");
    }

    private static void printPermtut(String s, String result) {
        if (s.isEmpty()) {
            System.out.println(result);
        }
        for (int i = 0; i < s.length(); i++) {
            char leter = s.charAt(i);

            String resto = s.substring(0,i) + s.substring(i+1);

            printPermtut(resto, result + leter);

        }
    }
}
