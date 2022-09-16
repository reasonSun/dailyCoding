package com.example.inflern.stackqueue;

import java.util.Stack;

public class StackBracket {

    public static void main(String[] args) {
        StackBracket bracket = new StackBracket();
        System.out.println(bracket.solution("(()(()))(()"));
    }

    private String solution(String bracket) {
        String answer = "YES";

        Stack<Character> stack = new Stack<>();

        for (char c : bracket.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return "NO";
                }
                stack.pop();
            }
        }

        if (!stack.isEmpty()) {
            return "NO";
        }

        return answer;

    }
}
