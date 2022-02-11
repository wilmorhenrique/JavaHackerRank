package algoritimos;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class RandomIntArray {

    public static void main(String[] args) {
        int[] vals = getRandomIntArray(10, 1000);
        Arrays.stream(vals).forEach(it -> System.out.print(it+" "));

        System.out.println("");
        System.out.println(new Random().nextInt(10-5)+5 );
   }

    public static int[] getRandomIntArray(int elements, int max) {
        return IntStream.generate(() -> new Random().nextInt(max)).limit(elements).toArray();
    }

}
