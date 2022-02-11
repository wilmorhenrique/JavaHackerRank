package hackerrank;

import java.util.*;


class Difference {
    private int[] elements;
    public int maximumDifference;

    public Difference(int[] a) {
        elements = a;
    }

    public void computeDifference() {
        maximumDifference = 0;
        for (int i = 0; i < elements.length-1 ; i++) {
            for (int j = i; j < elements.length-1 ; j++) {
                int dif = Math.abs(elements[i] - elements[j+1]);
                if (dif > maximumDifference) maximumDifference = dif;
            }
        }
    }

    public int  computeDifference1() {
        Arrays.sort(elements);
        Arrays.stream(elements).forEach(it -> System.out.println(it+" "));
        return elements[elements.length - 1] - elements[0];
    }


} // End of hackerrank.Difference class

public class Java30Scope {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.println(difference.maximumDifference);
        System.out.println(difference.computeDifference1());
    }
}