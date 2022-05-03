package hackerrank;

import algoritimos.RandomIntArray;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BirthdayCandle {
    public static void main(String[] args) {
        int [] vals =  RandomIntArray.getRandomIntArray(1000000, 1000000);

        List<Integer> list = Arrays.stream(vals).boxed().collect(Collectors.toList());
      //  System.out.println(birthdayCakeCandles(list));
        System.out.println(birthdayCakeCandles2(list));
    }


    public static int birthdayCakeCandles(List<Integer> candles) {
        List<Integer> sorted = candles.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        Integer max = sorted.get(0);
        int count = 0;
        for (int i = 0; i < sorted.size() ; i++) {
            if (sorted.get(i) != max) {
                break;
            }
            count++;
        }
        return count;
    }

    public static int birthdayCakeCandles2(List<Integer> candles) {
        int max = -10000000;
        int sum = 0;
        int num = 0;
        for (int i = 0; i < candles.size() ; i++) {
            num = candles.get(i);
            if(num > max){
                sum = 1;
                max = num;
            }else if(num == max){
                sum++;
            }        }
        return sum;
    }

}
