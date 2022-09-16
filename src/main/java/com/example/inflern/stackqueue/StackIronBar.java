package com.example.inflern.stackqueue;

import java.util.Stack;

public class StackIronBar {
    public static void main(String[] args) {
        StackIronBar ironBar = new StackIronBar();
        System.out.println(ironBar.solution("()(((()())(())()))(())"));
    }

    private int solution(String str) {
        int answer = 0;
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                stack.push(str.charAt(i));
            } else {
                stack.pop();
                if(str.charAt(i-1) == '(') answer += stack.size();
                else answer++;
            }
        }

        return answer;
    }
}
