package com.tms.lesson10.task2;

import static com.tms.lesson10.task2.Realization.realization;

public class Convert {
    public static String convert(int number) {

        String romanOnes = realization(number % 10, "I", "V", "X");
        number /= 10;
        String romanTens = realization(number % 10, "X", "L", "C");
        number /= 10;
        String romanHundreds = realization(number % 10, "C", "D", "M");
        number /= 10;
        String romanThousands = realization(number % 10, "M", "", "");

        String result = romanThousands + romanHundreds + romanTens + romanOnes;
        return result;

    }
}
