package com.example.leetcode;

public class ClimbingStairs70 {

    public static void main(String[] args) {
        ClimbingStairs70 climbingStairs70 = new ClimbingStairs70();
        int n = 3;
        System.out.println(climbingStairs70.solution(n));
    }

    private int solution(int n) {
        if(n == 1){ return 1; }
        int[] dp = new int[n+1];
        dp[1] = 1;
        dp[2] = 2;
        for(int i = 3; i<=n; i++){
            dp[i] = dp[i-2] + dp[i-1];
        }

        return dp[n];
    }
}
