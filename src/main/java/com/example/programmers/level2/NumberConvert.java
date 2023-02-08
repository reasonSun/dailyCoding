package com.example.programmers.level2;

import java.util.HashSet;
import java.util.Set;

public class NumberConvert {
    public static void main(String[] args) {
        NumberConvert numberConvert = new NumberConvert();
        int x = 2, y = 5, n = 4;
        System.out.println(numberConvert.solution(x,y,n));
    }

    private int solution(int x, int y, int n) {
        int answer = 0;
        Set<Integer> numSet = new HashSet<>();
        Set<Integer> temp;
        numSet.add(x);
        while (!numSet.isEmpty()) {
            if(numSet.contains(y)) return answer;
            temp = new HashSet<>();
            for (int val : numSet) {
                int num1 = val + n;
                int num2 = val * 2;
                int num3 = val * 3;
                if(num1 <= y) temp.add(num1);
                if(num2 <= y) temp.add(num2);
                if(num3 <= y) temp.add(num3);
            }
            numSet = temp;
            answer++;

        }

        return -1;

    }
}
