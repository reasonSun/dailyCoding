package com.example.inflern.dp;

import java.util.Scanner;

public class StoneJump {
    static int[] dy;

    public static void main(String[] args) {
        StoneJump stoneJump = new StoneJump();
        Scanner bf = new Scanner(System.in);
        int n = bf.nextInt();
        dy = new int[n + 2];

        System.out.println(stoneJump.solution(n));

    }

    private int solution(int n) {
        dy[1] = 1;
        dy[2] = 2;
        for (int i = 3; i <= n + 1; i++) {
            dy[i] = dy[i - 2] + dy[i - 1];
        }
        return dy[n + 1];
    }
}
