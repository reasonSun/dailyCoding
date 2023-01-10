package com.example.inflern.dp;

import java.util.Scanner;

public class Stair {

    static int[] dy;
    public static void main(String[] args) {
        Stair stair = new Stair();
        Scanner bf = new Scanner(System.in);
        int n = bf.nextInt();
        dy = new int[n + 1];

        System.out.println(stair.solution(n));
    }

    private int solution(int n) {
        dy[1] = 1;
        dy[2] = 2;
        for (int i = 3; i <= n; i++) {
            dy[i] = dy[i-2] + dy[i-1];
        }
        return dy[n];
    }
}
