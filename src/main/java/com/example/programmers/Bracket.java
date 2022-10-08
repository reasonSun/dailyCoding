package com.example.programmers;

import java.util.Stack;

public class Bracket {

    public boolean solution(String bracket) {
        boolean answer = true;
        Stack<Character> stack = new Stack<>();
        for (Character c : bracket.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            } else{
                if (stack.isEmpty()) {
                    answer = false;
                }else{
                    stack.pop();
                }

            }
        }

        if (!stack.isEmpty()) {
            answer = false;
        }

        return answer;
    }

    public static void main(String[] args) {
        Bracket bracket = new Bracket();
        System.out.println(bracket.solution("(()("));
    }
}
