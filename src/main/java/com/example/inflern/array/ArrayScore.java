package com.example.inflern.array;

import java.util.Scanner;

public class ArrayScore {
    private int solution(int num, int[] scoreArr) {
        int answer = 0;
        int cnt = 0;
        for (int i = 0; i < num; i++) {
            if (scoreArr[i] == 1) {
                cnt++;
            }else {
                cnt = 0;
            }
            answer += cnt;
        }
        return answer;
    }
    public static void main(String[] args) {
        ArrayScore score = new ArrayScore();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] scoreArr = new int[num];
        for (int i = 0; i < num; i++) {
            scoreArr[i] = sc.nextInt();
        }

        System.out.println(score.solution(num,scoreArr));
    }
}
