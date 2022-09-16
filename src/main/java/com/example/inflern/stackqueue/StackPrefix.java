package com.example.inflern.stackqueue;

import java.util.Stack;

public class StackPrefix {

    public static void main(String[] args) {
        StackPrefix prefix = new StackPrefix();
        System.out.println(prefix.solution("352+*9-"));
    }

    private int solution(String prefix) {

        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        for (char c : prefix.toCharArray()) {
            if (Character.isDigit(c)) {
                stack.push(c - 48);
            } else {
                int rt = stack.pop();
                int lt = stack.pop();
                if(c == '+') stack.push(lt + rt);
                else if(c == '-') stack.push(lt - rt);
                else if(c == '/') stack.push(lt / rt);
                else if(c == '*') stack.push(lt * rt);
            }
        }
        answer = stack.get(0);

        return answer;
    }
}
