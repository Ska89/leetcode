package org.example;

import org.junit.Test;

public class TwoSumTest {
    @Test
    public void twoSumTest() {
        int target1 = 9;
        int target2 = 6;
        int target3 = 6;
        TwoSum twoSum = new TwoSum();
        printResult(twoSum.twoSum(getExample1(), target1));
        printResult(twoSum.twoSum(getExample2(), target2));
        printResult(twoSum.twoSum(getExample3(), target3));
    }

    private void printResult(int [] result) {
        System.out.println("Output:[" + result[0] + "," + result[1] + "]");
    }

    private int[] getExample1() {
        return new int[] {2, 7, 11, 15};
    }

    private int[] getExample2() {
        return new int[] {3,2,4};
    }
    private int[] getExample3() {
        return new int[] {3,3};
    }

}
