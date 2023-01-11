package com.example.programmers;

import java.util.Arrays;

public class KthSort {
    public static void main(String[] args) {
        KthSort kthSort = new KthSort();
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {
                {2,5,3},
                {4,4,1},
                {1,7,3}
        };
        kthSort.solution(array, commands);
    }

    private int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for (int i = 0; i < commands.length; i++ ) {
            int start = commands[i][0];
            int end = commands[i][1];
            int k = commands[i][2];

            int[] tempArr = Arrays.copyOfRange(array, start -1, end);
            Arrays.sort(tempArr);
            answer[i] = tempArr[k-1];
        }

        for (int n : answer) {
            System.out.println("n = " + n);
        }
        return answer;
    }
}
