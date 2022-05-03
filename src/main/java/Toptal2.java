import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;

public class Toptal2 {



    public static void main(String[] args) {
        LocalDateTime inicio;
        LocalDateTime fim;
        int[] P = new int[]{4, 4, 4};
        int[] S = new int[]{5, 5, 5,5};

        inicio = LocalDateTime.now();
        System.out.println("1 - RespostaEsperada= 3 ->" + solution(P,S));
        fim  = LocalDateTime.now();
        System.out.println("ordenado por ordertingOn2SelectionSort"  + " e demorou:" + (ChronoUnit.MICROS.between(inicio, fim)));

        P = new int[]{4, 4, 4};
        S = new int[]{5, 5, 5,5};

        inicio = LocalDateTime.now();
        System.out.println("1 - RespostaEsperada= 3 ->" + solution2(P,S));
        fim  = LocalDateTime.now();
        System.out.println("ordenado por ordertingOn2SelectionSort"  + " e demorou:" + (ChronoUnit.MICROS.between(inicio, fim)));


        P = new int[]{5, 1};
        S = new int[]{5, 5, 5,5};
        System.out.println("1 - RespostaEsperada= 2 ->" + solution(P.clone(),S.clone()));
        System.out.println("2 - RespostaEsperada= 2 ->" + solution2(P.clone(),S.clone()));

    }

    private static  int solution(int[] P, int[] S) {
        int cars = 0;
        int j = 0;
        int i = 0;
        while ( i< P.length && P[i] > 0) {
            while (j< S.length && S[j] > 0) {
                int people = P[i];
                int seats = S[j];
                if (seats > people){
                    S[j] = seats - people;
                    P[i] = 0;
                    if (i+1 == P.length) cars++; //( corrected after test)
                    break;
                } else {
                    P[i] = people - seats;
                    S[j] = 0;
                    cars++;
                }
            }
            if (S[j] == 0) {
                j++;
            }
            if (P[i] == 0) {
                i++;
            }
        }
        return cars;
    }


    private static  int solution2(int[] P, int[] S) {
        int cars = 0;
        int j = 0;
        int i = 0;
        int people = Arrays.stream(P).sum();
            while (j< S.length && S[j] > 0 && people > 0) {
                int seats = S[j];
                if (seats > people){
                    S[j] = seats - people;
                    people -= seats;
                    if (people <= 0) cars++; //( corrected after test)
                    break;
                } else {
                    people -= seats;
                    S[j] = 0;
                    cars++;
                    j++;
                }
            }
        return cars;
    }
}
