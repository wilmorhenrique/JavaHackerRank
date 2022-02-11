package hackerrank;

public class StringFmt {

    public static void main(String[] args) {
        String text = "Palavra";
        int num = 10;

        // -14 mete espacos a esquerda (15 espaços pois começa a contar em ZERO :(
        System.out.printf("%-14s %03d\n", text, num);

    }
}
