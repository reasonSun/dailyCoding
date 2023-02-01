package com.example.programmers.level1;

import java.util.Stack;

public class Hamburger {
    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger();
        int[] ingredient = {2, 1, 1, 2, 3, 1, 2, 3, 1};
        System.out.println(hamburger.solution(ingredient));
    }

    public int solution(int[] ingredient) {
        Stack<Integer> stack = new Stack<>();
        int answer = 0;
        for (int n : ingredient) {
            stack.push(n);
            if (stack.size() >= 4) {
                if (stack.get(stack.size() - 1) == 1 &&
                        stack.get(stack.size() - 2) == 3 &&
                        stack.get(stack.size() - 3) == 2 &&
                        stack.get(stack.size() - 4) == 1) {
                    answer++;
                    stack.pop();
                    stack.pop();
                    stack.pop();
                    stack.pop();
                }
            }
        }
        return answer;
    }
}
