package hackerrank;

import java.util.stream.Stream;

public class BinaryNumbers {

    public static void main(String[] args) {
        int n = 439;
        String str = Integer.toBinaryString(n) ;
        System.out.println(str);
        char[] arr = str.toCharArray();

        int count = 0;
        int max = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '1'){
                count++;
                if(max <= count) {
                    max = count;
                }
            } else {
                count = 0;
            }

        }
 //       if(max <= count) {
 //           max = count;
 //       }
        if(max < 0) {
            max = arr.length;
        }

        System.out.println(max);



        System.out.println("======== SOLUCAO 2 ======================");

        int r = n, counter = 0, maxOne = 0;
        String s = "";
        while (n > 0) {
            r = n % 2;
            if (r == 1) {
                counter++;
                if (counter > maxOne) {
                    maxOne = counter;
                }
            } else {
                counter = 0;
            }
            s = r + s;
            n = n / 2;
        }
        System.out.println(maxOne);

    }
}
