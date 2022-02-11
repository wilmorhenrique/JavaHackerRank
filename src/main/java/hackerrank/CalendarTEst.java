package hackerrank;

import java.text.NumberFormat;
import java.util.Calendar;
import java.util.Locale;

public class CalendarTEst {
    public static void main(String[] args) {
        String[] days = new String[] { "SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY" };

        Calendar cal = Calendar.getInstance();
        cal.set(2022, 0,1);
        int  day = cal.get (Calendar.DAY_OF_WEEK);
        System.out.println(days[day-1]);
        System.out.println(day);


        double payment = 12324.13d;

        System.out.println(Math.round(payment));

        String A = "PALAVRA";
        System.out.println(A.substring(0,2));
    }

}
