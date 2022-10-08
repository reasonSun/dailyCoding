package com.example.programmers;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class DuplicationNumber {
    private int[] solution(int[] arr) {
        int[] answer = {};
        Stack<Integer> stack = new Stack<>();

        int chkNum = -1;

        for (int i = 0; i < arr.length; i++) {
            if (chkNum != arr[i]) {
                chkNum = arr[i];
                stack.push(arr[i]);
            }
        }

        answer = new int[stack.size()];
        for (int i = 0; i < stack.size(); i++) {
            answer[i] = stack.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        DuplicationNumber duplicationNumber = new DuplicationNumber();
        for(int n : duplicationNumber.solution(new int[]{4, 4, 4, 4, 3, 3})) System.out.print(n + " ");
    }


}
