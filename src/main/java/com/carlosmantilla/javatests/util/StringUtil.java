package com.carlosmantilla.javatests.util;

public class StringUtil {

    public static String repeat(String string, int times) {

        String result = "";

        if (times < 0) {
            throw new IllegalArgumentException("Negative Times Not Allowed");
        }

        for (int i = 0; i < times; i++) {
            result += string;
        }

        return result;
    }

}
