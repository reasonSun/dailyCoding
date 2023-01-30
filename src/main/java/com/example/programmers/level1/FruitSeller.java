package com.example.programmers.level1;

import java.util.Arrays;

public class FruitSeller {

    public static void main(String[] args) {
        FruitSeller seller = new FruitSeller();
        int k = 3;
        int m = 4;
        int[] score = {1, 2, 3, 1, 2, 3, 1};
        System.out.println(seller.solution(k, m , score));
    }

    public int solution(int k, int m, int[] score) {
        Arrays.sort(score);
        int answer = 0;

        for (int i = score.length - 1; i >= 0; i--) {
            if((score.length-i)%m == 0) answer += score[i]*m;
        }
        return answer;
    }

}
