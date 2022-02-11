package algoritimos;

import java.util.Arrays;

public class InvertendoLista {
    public static void main(String[] args) {
        int maxElements = 10000;
        int elements = 5;
        int[] vals = RandomIntArray.getRandomIntArray(elements, maxElements);
        System.out.println("Original");
        Arrays.stream(vals).forEach(it -> System.out.print(it + " "));
        System.out.println("");

       int metade = (vals.length / 2) - 1 ;
        System.out.println(metade);

        for (int i = 0; i <= metade ; i++) {
            int aux = vals[i];
            vals[i] = vals[vals.length - i - 1];
             vals[vals.length - i - 1] = aux;
        }


        System.out.println("Invertida");
        Arrays.stream(vals).forEach(it -> System.out.print(it + " "));
        System.out.println("");

    }
}
