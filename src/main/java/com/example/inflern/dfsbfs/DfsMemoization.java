package com.example.inflern.dfsbfs;

public class DfsMemoization {
    int[][] dy = new int[35][35];

    private int dfs(int n, int r) {
        if (n == r || r == 0) {
            return 1;
        }else{
            return dy[n][r] = dfs(n - 1, r - 1) + dfs(n - 1, r);
        }
    }

    public static void main(String[] args) {
        DfsMemoization memoization = new DfsMemoization();
        int n = 5;
        int r = 3;
        System.out.println(memoization.dfs(n, r));
    }
}
