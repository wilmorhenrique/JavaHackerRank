package algoritimos;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;

public class Ordenacao {
    public static void main(String[] args) {
        int maxElements = Integer.MAX_VALUE;
        int elements = 300;
        int[] vals =  RandomIntArray.getRandomIntArray(elements, maxElements);
        System.out.println("Original");
        Arrays.stream(vals).forEach(it -> System.out.print(it+" "));
        System.out.println("");

        LocalDateTime inicio = LocalDateTime.now();
        int low = getLowerIndex(vals, 0);
        LocalDateTime fim  = LocalDateTime.now();

        vals =  RandomIntArray.getRandomIntArray(elements, maxElements);
        System.out.println("-------------------");
        System.out.println("Lower:" + vals[low]  + " e demorou:" + (ChronoUnit.MICROS.between(inicio, fim)));
        System.out.println("-------------------");

        vals =  RandomIntArray.getRandomIntArray(elements, maxElements);
        inicio = LocalDateTime.now();
        ordertingOn2SelectionSort(elements, vals);
        fim  = LocalDateTime.now();

        System.out.println("ordenado por ordertingOn2SelectionSort"  + " e demorou:" + (ChronoUnit.MICROS.between(inicio, fim)));
//        Arrays.stream(vals).forEach(it -> System.out.print(it+" "));
        System.out.println("");
        System.out.println("-------------------");

        vals =  RandomIntArray.getRandomIntArray(elements, maxElements);
        inicio = LocalDateTime.now();
        ordertingOn2InsertionSort(elements, vals);
        fim  = LocalDateTime.now();

        System.out.println("ordenado por ordertingOn2InsertionSort"  + " e demorou:" + (ChronoUnit.MICROS.between(inicio, fim)));
//        Arrays.stream(vals).forEach(it -> System.out.print(it+" "));
        System.out.println("");
        System.out.println("-------------------");





    }
    private static void ordertingOn2InsertionSort(int elements, int[] vals) {
        for (int i = 0; i < elements ; i++) {
            int analise = i;
            while (analise > 0 && vals[analise] < vals[analise-1]) {
                int valorAtual = vals[analise];
                vals[analise] = vals[analise-1];
                vals[analise-1] = valorAtual;
                analise--;
            }

        }


    }

    private static void ordertingOn2SelectionSort(int elements, int[] vals) {
        for (int i = 0; i < elements - 1; i++) {
            int actual = vals[i];
            int lowerIndex = getLowerIndex(vals, i);
            vals[i] = vals[lowerIndex];
            vals[lowerIndex] = actual;
       }
    }

    private static int getLowerIndex(int[] vals, int beginnig ) {
        int low = beginnig;
        for (int i = beginnig; i < vals.length; i++) {
            if (vals[i]  < vals[low]) {
                low = i;
            }
        }
        return low;
    }
}
