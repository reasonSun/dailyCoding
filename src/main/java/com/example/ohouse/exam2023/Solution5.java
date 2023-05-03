package com.example.ohouse.exam2023;

import java.util.Arrays;

public class Solution5 {
    public static void main(String[] args) {
        Solution5 solution5 = new Solution5();

        System.out.println(solution5.solution(new int[]{150,170,180,180}, new int[]{150,160,170,190})); // 1
        System.out.println(solution5.solution(new int[]{150,170}, new int[]{150,170})); // 0
    }

    private int solution(int[] height1, int[] height2) {

        for (int i = 0; i < height1.length; i++) {
            if (height1[i] != height2[i]) {
                if (i == height1.length - 1) {
                    System.out.println("두 배열을 교환하여 같은 숫자가 없는 오름차순 배열: " + Arrays.toString(height1));
                } else {
                }
            }
        }
        System.out.println("두 배열을 교환하여 같은 숫자가 없는 오름차순 배열: " + Arrays.toString(height1));

        return 0;
    }

}
