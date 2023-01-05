package com.example.nicednb;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        Task1 task = new Task1();

        int[][] score = new int[][]{
                {550,550,550,550,550},
                {300,201,199,190,190},
                {899,901,670,990,990}
        };
        for(int n : task.solution(score)){
            System.out.println("n = " + n);
        }
    }

    private int[] solution(int[][] score) {
        int[] answer = new int[score.length];

        for (int i = 0; i < score.length; i++) {
            int min = Arrays.stream(score[i]).min().getAsInt();
            int max = Arrays.stream(score[i]).max().getAsInt();
            double avg = (Arrays.stream(score[i]).sum() -min -max) / (score[i].length-2);
            int sum = Arrays.stream(score[i]).sum();
            System.out.println("length = " + score[i].length);
            System.out.println("내가계산 = " + (sum - min - max)/3);
            System.out.println("avg = " + avg);
            if(avg > 900){ answer[i] = 1; }
            else if(avg > 800 && avg <= 900){ answer[i] = 2; }
            else if(avg > 700 && avg <= 800){ answer[i] = 3; }
            else if(avg > 600 && avg <= 700){ answer[i] = 4; }
            else if(avg > 500 && avg <= 600){ answer[i] = 5; }
            else if(avg > 400 && avg <= 500){ answer[i] = 6; }
            else if(avg > 300 && avg <= 400){ answer[i] = 7; }
            else if(avg > 200 && avg <= 300){ answer[i] = 8; }
            else{ answer[i] = 9; }
        }

        return answer;
    }
}
