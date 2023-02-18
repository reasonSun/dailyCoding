package com.example.programmers.level2;

import java.util.Stack;

public class RemovingPairs {
    public static void main(String[] args) {
        RemovingPairs removingPairs = new RemovingPairs();

        String str = "baabaa";
        System.out.println(removingPairs.solution(str));
    }

    private int solution(String str) {
        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == c) {
                stack.pop();
            }else{
                stack.push(c);
            }
        }
        return stack.isEmpty()? 1 : 0;

    }

}
