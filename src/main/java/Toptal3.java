import java.util.Arrays;


public class Toptal3 {

    public static void main(String[] args) {
        int[] P = new int[]{1, 19, 1, 1};
        System.out.println(solution(P));
    }

    private static  int solution2(int[] A) {
        int total = Arrays.stream(A).sum();
        double goal = total / 2.0;



        return 1;
    }

        private static  int solution(int[] A) {
        int  total = Arrays.stream(A).sum();
        double goal = total / 2.0;
        Arrays.sort(A);
        int filters = 1;
        for (int i = A.length-1; i > 0 ; i--) {
            int newValue = A[i] / 2;
            A[i] = newValue;
            System.out.println(isDone(A, goal));
            if (isDone(A, goal)) break;
            if (A[i] > A[i-1]) { //ajustado depois de enviar (estava i + 1)
                i++;  // ajustado depois de enviar (estava ++)
            }
            filters++;
        }
        return filters;
    }

    private static boolean isDone(int[] A, double  goal) {
        int  total = Arrays.stream(A).sum() ; // ajustado estava dividindo por 2 (erro copy&paste)
        return goal >= total;
    }


}
