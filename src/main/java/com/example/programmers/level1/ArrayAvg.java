package com.example.programmers.level1;

import java.util.Arrays;

public class ArrayAvg {
    public static void main(String[] args) {
        ArrayAvg avg = new ArrayAvg();
        System.out.println(avg.solution(new int[] {1,2,3,4}));
    }

    private double solution(int[] arr) {
        double avg = Arrays.stream(arr).average().orElse(0);

        return avg;
    }

}
