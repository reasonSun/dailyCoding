package com.example.programmers.level2;

import java.util.Stack;

public class BackMaxNum {
    public static void main(String[] args) {
        BackMaxNum num = new BackMaxNum();
        int[] numbers = {9, 1, 5, 3, 6, 2};
        for (int n : num.solution(numbers)) System.out.print(n+ " ");
    }
/*투포인터 방식으로 시도 했지만 stack 문제로 더 깔끔하게 풀이 가능*/
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < numbers.length; i++) {
            if (stack.isEmpty() || numbers[i] < numbers[i - 1]) {
                stack.push(i);
            } else {
                while (!stack.isEmpty() && numbers[stack.peek()] < numbers[i]) {
                    answer[stack.pop()] = numbers[i];
                }
                stack.push(i);
            }
        }

        while (!stack.isEmpty()) {
            answer[stack.pop()] = -1;
        }

        return answer;
    }

}
