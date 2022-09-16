package com.example.inflern.stackqueue;

import java.util.Stack;

public class StackBracketStr {

    public static void main(String[] args) {
        StackBracketStr bracketStr = new StackBracketStr();
        System.out.println(bracketStr.solution("(A(BC)D)EF(G(H)(IJ)K)LM(N)"));
    }

    private String solution(String str) {

        String answer = "";

        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()) {
            if (c == ')') {
                while (stack.pop() != '(');
            }else {
                stack.push(c);
            }
        }
        for (int i = 0; i < stack.size(); i++) {
            answer += stack.get(i);
        }
        return answer;
    }
}
