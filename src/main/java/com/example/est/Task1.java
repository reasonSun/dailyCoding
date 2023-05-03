package com.example.est;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Task1 {

    private int[] solution(int n, int[] arr) {

        return Arrays.stream(arr).map(e -> e*2).toArray();

    }

    public static void main(String[] args) {
        Task1 task1 = new Task1();
        int[] arr = {1, 1, 2, 3, 4, 5};
        System.out.println(task1.solution(1, arr));
    }
}
