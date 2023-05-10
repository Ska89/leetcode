package org.example;

import org.junit.Test;

public class ValidParenthesesTest {
    @Test
    public void isValid(){
        String input1 = "()";
        String input2 = "()[]{}";
        String input3 = "(]";

        String input4 = "(])";

        ValidParentheses validParentheses = new ValidParentheses();
        validParentheses.isValid(input1);
        validParentheses.isValid(input2);
        validParentheses.isValid(input3);

        System.out.println("=======");
        validParentheses.isValid(input4);
    }
}
