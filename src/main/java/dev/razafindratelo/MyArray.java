package mg.training;

import java.util.ArrayList;
import java.util.List;

public class MyArray {
    public static String solveTIme(String time) {
         final String[] units = {
                "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
                "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
         final String[] tens = {"", "", "twenty", "thirty", "forty", "fifty"};

        int hour = Integer.parseInt(time.substring(0, 1)) % 13;
        int min = Integer.parseInt(time.substring(3, 4));

        if (min == 0)
            return  " o' clock";
        if (min == 15)
            return "quarter past " + hour;
        if (min == 30)
            return "half past " + hour;
        if (min == 45)
            return "quarter to" + hour + 1;
        if (min > 40)
            return 60 - min + " to " + hour + 1;
        else
            return (min == 1 )? min + " minute past " + hour : min + " minutes past " +hour;
    }

    public static void main(String[] args) {
        int a = 13;
        System.out.println(a);
    }
}
