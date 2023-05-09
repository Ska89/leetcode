package org.example;

import org.junit.Test;

public class RomanToIntegerTest {
    @Test
    public void checkRomanToInteger() {
        String input1 = "III";
        String input2 = "LVIII";
        String input3 = "MCMXCIV";

        RomanToInteger romanToInteger = new RomanToInteger();
        System.out.println(romanToInteger.convert(input1));
        System.out.println(romanToInteger.convert(input2));
        System.out.println(romanToInteger.convert(input3));
    }
}
