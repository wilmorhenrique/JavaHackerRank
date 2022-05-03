package algoritimos;

import java.util.Arrays;
import java.util.Random;

public class QuickSortTest {
    int passagem = 0;
    public void quickSort(int[] a) {
        quickSort(a, 0, a.length-1);
    }

    private void quickSort(int[] a, int menorIndiceDoArray, int maiorIndiceDoArray) {
        passagem++;
        System.out.print("passagem="+passagem);
        if (menorIndiceDoArray < maiorIndiceDoArray+1) {
            int p = partition(a, menorIndiceDoArray, maiorIndiceDoArray);

     //       quickSort(a, menorIndiceDoArray, p-1);
     //       quickSort(a, p+1, maiorIndiceDoArray);
        }

    }

    private void swap(int[] a, int index1, int index2) {
        int temp = a[index1];
        a[index1] = a[index2];
        a[index2] = temp;
    }

    // pega um indice randomico para ser pivot
    private  int getPivot(int low, int high){
        Random rand = new Random();
        //return rand.nextInt((high-low)+1) + low;
        return high;
    }

    private int partition(int[] a, int menorIndiceDoArray, int maiorIndiceDoArray) {
        // se optar por usar o MAIOR indice como  pivot  este swap abaixo deve ficar COMENTADO
  //      swap(a, menorIndiceDoArray, getPivot(menorIndiceDoArray, maiorIndiceDoArray) );
        int border = menorIndiceDoArray +1 ;
        for (int i = border; i <= maiorIndiceDoArray ; i++) {
            if (a[i] < a[menorIndiceDoArray]) {
                    swap(a, i, border++);
            }
        }
        swap(a, menorIndiceDoArray, border-1);
        return border-1;
    }

    public static void main(String[] args) {
        int maxElements = 100;
        int elements = 9;
        int[] vals =  {34 ,32 ,28, 92, 77, 48, 72, 89, 38} ; //RandomIntArray.getRandomIntArray(elements, maxElements);
        Arrays.stream(vals).forEach(it -> System.out.print(it+" "));
        System.out.println("");
        QuickSortTest qs = new QuickSortTest();
        qs.quickSort(vals);
        System.out.println("");
        Arrays.stream(vals).forEach(it -> System.out.print(it+" "));


    }
}
