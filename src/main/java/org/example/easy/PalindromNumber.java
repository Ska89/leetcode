package org.example;

import java.util.ArrayList;
import java.util.List;

public class PalindromNumber {
    public boolean isPalindrome(int x) {
        String input = Integer.toString(x);
        StringBuilder result = new StringBuilder();
        result.append(x);
        result.reverse();
        return  (result.toString().equals(input));
    }

    public boolean isPalindromWithoutString(int x) {
        if (x < 0) {
            return false;
        }

        if (x < 10) {
            return true;
        }
        List<Integer> list = new ArrayList<>();
        do {
            int tempRes = x%10;
            x = x/10;
            list.add(tempRes);
        } while (x != 0);

        for (int i = 0; i < list.size()/2; i ++) {
            if (list.get(i) != list.get(list.size() - (1 + i))) {
                return false;
            }
        }
        return true;
    }
}
