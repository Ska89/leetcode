package org.example;

import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char st : s.toCharArray()) {
            if (st == '(' || st == '{' || st == '[') {
                stack.push(st);
            } else {
                if (stack.isEmpty()) {
                    System.out.println(s + " contains invalid parentheses");
                    return false;
                }
                char top = stack.peek();
                if (st == ')' && top == '('
                || st == ']' && top == '['
                || st == '}' && top == '{') {
                    stack.pop();
                } else {
                    System.out.println(s + " contains invalid parentheses");
                    return false;
                }
            }
        }
        if (stack.isEmpty()) {
            System.out.println(s + " contains valid parentheses");
            return true;
        }
        return false;
    }
}
