package hackerrank;
import java.io.*;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class _30NestedLogic {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int d1 = scan.nextInt();
        int m1 = scan.nextInt();
        int y1 = scan.nextInt();
        int d2 = scan.nextInt();
        int m2 = scan.nextInt();
        int y2 = scan.nextInt();

        LocalDate dataRetorno =  LocalDate.of(y1, m1, d1);
        LocalDate dataEsperada =  LocalDate.of(y2, m2, d2);
        System.out.println(calcFine(dataRetorno, dataEsperada));
        scan.close();

    }

    private static int  calcFine(LocalDate dataRetorno, LocalDate dataEsperada) {
        if (dataRetorno.isBefore(dataEsperada) || dataEsperada.isEqual(dataRetorno) ) return 0;

        int hackos = 0;
        int multiplier = 0;
        if (dataEsperada.getYear() == dataRetorno.getYear() && dataRetorno.getMonthValue() == dataEsperada.getMonthValue()) {
            hackos = 15;
            Long days = ChronoUnit.DAYS.between(dataEsperada, dataRetorno);
            multiplier = days.intValue();
        } else if (dataEsperada.getYear() == dataRetorno.getYear() && dataEsperada.getMonthValue() < dataRetorno.getMonthValue()) {
            hackos = 500;
            Long months = ChronoUnit.MONTHS.between(dataEsperada, dataRetorno);
            multiplier = months.intValue();
        } else if (dataEsperada.getYear() < dataRetorno.getYear() ) {
            hackos  = 1;
            multiplier = 10000;
        }

        return hackos * multiplier;
    }
}