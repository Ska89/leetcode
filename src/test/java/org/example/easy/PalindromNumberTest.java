package org.example.easy;

import org.example.easy.PalindromNumber;
import org.junit.Test;

public class PalindromNumberTest {
    @Test
    public void palindromNumberTest() {
        int input1 = 121;
        int input2 = -121;
        int input3 = 10;
        int input4 = 123421;

        PalindromNumber palindromNumber = new PalindromNumber();
        System.out.println(palindromNumber.isPalindrome(input1));
        System.out.println(palindromNumber.isPalindrome(input2));
        System.out.println(palindromNumber.isPalindrome(input3));

        System.out.println();
        System.out.println(palindromNumber.isPalindromWithoutString(input1));
        System.out.println(palindromNumber.isPalindromWithoutString(input2));
        System.out.println(palindromNumber.isPalindromWithoutString(input3));
        System.out.println(palindromNumber.isPalindromWithoutString(input4));
    }
}
