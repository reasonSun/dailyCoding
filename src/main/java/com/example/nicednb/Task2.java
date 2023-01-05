package com.example.nicednb;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        Task2 task = new Task2();
        int[] foods = {1,2,3,0,3};
        task.solution(foods);
    }

    private void solution(int[] foods) {
        int answer = 0;
        if(foods.length < 3){
            System.out.println(" = ");
        }
        int avg = Arrays.stream(foods).sum()/3;
        System.out.println("avg = " + avg);
        int lt = 0;
        int sum = 0;

        for (int rt = 0; rt < foods.length; rt++) {
            sum += foods[rt];
            if (sum == avg) {
                answer++;
            }
            while (sum >= avg) {
                sum -= foods[lt++];
                if (sum == avg) {
                    answer++;
                }
            }

        }

        System.out.println("answer = " + answer);
    }

    
}
