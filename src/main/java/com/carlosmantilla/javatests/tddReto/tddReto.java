package com.carlosmantilla.javatests.tddReto;

public class tddReto {

    public static String fizzBuzz (int n) {
        if ((n % 3 == 0) && (n % 5 == 0)) return "FIZZBUZZ";
        if (n % 3 == 0) return "FIZZ";
        if (n % 5 == 0) return "BUZZ";
        else return String.valueOf(n);

    }

}
