package com.example.inflern.sortingsearch;

import java.util.Arrays;

public class DuplicationCheck {

    public static void main(String[] args) {
        DuplicationCheck check = new DuplicationCheck();
        System.out.println(check.solution(8, new int[] {20, 25, 52, 30, 39, 33, 43, 33}));
    }

    private String solution(int num, int[] arr) {
        String answer = "U";
        Arrays.sort(arr);

        for (int i = 0; i < num - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                answer = "D";
            }
        }
        return answer;
    }
}
