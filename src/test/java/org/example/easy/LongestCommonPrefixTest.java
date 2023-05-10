package org.example.easy;

import org.example.easy.LongestCommonPrefix;
import org.junit.Test;

public class LongestCommonPrefixTest {
    @Test
    public void getPrefix() {
        String [] strs1 = new String [] {"flower", "flow", "flight"};
        String [] strs2 = new String[] {"dog", "racecar", "car"};

        LongestCommonPrefix lcp = new LongestCommonPrefix();
        System.out.println(lcp.getCommonPrefix(strs1));
        System.out.println(lcp.getCommonPrefix(strs2));
    }
}
