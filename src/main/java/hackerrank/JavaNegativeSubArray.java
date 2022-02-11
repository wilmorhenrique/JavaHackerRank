package hackerrank;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class JavaNegativeSubArray {

    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int []s=new int[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.nextInt();
        }
        sc.close();


        int totalNeg  = 0;
         for(int i=0;i<n;i++){
             int sum = 0;
             for(int j=i;j<n;j++){
                 sum += s[j];
                 if(sum  < 0 ) {
                     totalNeg++;
                 }
             }
        }
        System.out.println(totalNeg);
    }

}
