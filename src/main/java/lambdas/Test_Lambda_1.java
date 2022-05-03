package lambdas;

public class Test_Lambda_1 {

    static  String text = "Fix this";
    public static void main(String[] args) {
        Printable thing = (s) -> System.out.println("Teste " + s);
        printThing(thing);
    }

    private static void printThing(Printable print) {
        print.print(text);
    }


}
