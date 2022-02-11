package hackerrank;


import java.lang.reflect.Method;
import java.util.*;

class Printer <T> {
        public static<T> void printArray(T[] array) {
            // Se usar este LAMBDA O if DA LINHA 41 VAI MOSTRAR QUE TEM DOIS METODOS
            Arrays.stream(array).forEach(it -> System.out.println(it));

            for (T it : array) {
                System.out.println(it);
            }
        }
    }


public class _30Generics {
    public static void main(String args[]){
        Method[] nome = Printer.class.getDeclaredMethods();
        Arrays.asList(nome).forEach(it -> System.out.println(it.getName()));
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Integer[] intArray = new Integer[n];
        for (int i = 0; i < n; i++) {
            intArray[i] = scanner.nextInt();
        }

        n = scanner.nextInt();
        String[] stringArray = new String[n];
        for (int i = 0; i < n; i++) {
            stringArray[i] = scanner.next();
        }

        Printer<Integer> intPrinter = new Printer<Integer>();
        Printer<String> stringPrinter = new Printer<String>();
        intPrinter.printArray( intArray  );
        stringPrinter.printArray( stringArray );

        if(Printer.class.getDeclaredMethods().length > 1){
            System.out.println("The Printer class should only have 1 method named printArray.");
        }
    }
}