package com.example.programmers.level1;


import java.util.Arrays;

public class NoneNumberSum {
    public static void main(String[] args) {
        NoneNumberSum sum = new NoneNumberSum();
        int[] number = {1, 2, 3, 4, 6, 7, 8, 0};
        System.out.println(sum.solution(number));
    }

    public int solution(int[] number) {
        int answer = 0;

        for (int i = 0; i < 10; i++) {
            int finalI = i;
            if (!Arrays.stream(number).anyMatch(x->x== finalI)) {
                answer += i;
            }
        }
        return answer;
    }
}
