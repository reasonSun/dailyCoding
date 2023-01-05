package com.example.tving;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Task3 {

    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int x = 1, y = 1;
        for (int i = 2; i <= N; i++) {
            int temp = x;
            x = x + y;
            y = temp;
        }
        bw.write(String.valueOf(x));
        bw.flush();
    }

    private void solution(int n) {



        int[][] dp = new int[n][2];
        dp[0][0] = 1;
        for (int i = 1; i < n; i++) {
            dp[i][1] = dp[i-1][0];
            dp[i][0] = dp[i-1][0] + dp[i-1][1];
            dp[i][1] %= 10;
            dp[i][0] %= 10;
        }
        System.out.println((dp[n-1][0] + dp[n-1][1]));
    }
}
