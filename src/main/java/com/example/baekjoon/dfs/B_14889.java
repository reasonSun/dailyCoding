package com.example.baekjoon.dfs;

import java.util.Scanner;

public class B_14889 {
    static int N;
    static int[][] board;
    static boolean[] visited;
    static int min = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        board = new int[N][N];
        visited = new boolean[N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                board[i][j] = sc.nextInt();
            }
        }
        dfs(0, 0);
        System.out.println(min);

    }

    public static void dfs(int idx, int depth) {
        if (N / 2 == depth) {
            teamDiff();
            return;
        }else{
            for (int i = idx; i < N; i++) {
                visited[i] = true;
                dfs(i + 1, depth + 1);
                visited[i] = false;
            }
        }
    }

    public static void teamDiff() {
        int start = 0;
        int link = 0;
        for (int i = 0; i < N - 1; i++) {
            for (int j = i; j < N; j++) {
                if (visited[i] && visited[j]) {
                    start += board[i][j];
                    start += board[j][i];
                } else if (!visited[i] && !visited[j]) {
                    link += board[i][j];
                    link += board[j][i];
                }
            }
        }
        int diff = Math.abs(start - link);

        if (diff == 0) {
            System.out.println(diff);
            System.exit(0);
        }
        min = Math.min(min, diff);
    }
}
