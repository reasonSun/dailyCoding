package com.example.inflern.array;

import java.util.Scanner;

public class ArrayMentoring {

    private int solution(int studentNum, int testNum, int[][] arr) {
        int answer =0;

        for (int i = 1; i <= studentNum; i++) {
            for (int j = 1; j <= studentNum; j++) {
                int cnt =0;
                for (int k = 0; k < testNum; k++) {
                    int pi=0, pj=0;
                    for (int s = 0; s < studentNum; s++) {
                        if(arr[k][s] == i) pi = s;
                        if(arr[k][s] == j) pj = s;
                    }
                    if(pi < pj) cnt++;
                }

                if(cnt == testNum) answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        ArrayMentoring mentoring = new ArrayMentoring();

        Scanner scanner = new Scanner(System.in);
        int studentNum = scanner.nextInt();
        int testNum = scanner.nextInt();

        int[][] arr = new int[testNum][studentNum];
        for (int i = 0; i < testNum; i++) {
            for (int j = 0; j < studentNum; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        System.out.println(mentoring.solution(studentNum, testNum, arr));
    }
}
