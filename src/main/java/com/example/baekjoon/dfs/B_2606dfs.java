package com.example.baekjoon.dfs;

import java.util.Scanner;

public class B_2606dfs {
    static int computerCnt, linkedCnt, cnt = 0;
    static int[][] board;
    static int[] visited;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        computerCnt = sc.nextInt();
        linkedCnt = sc.nextInt();
        board = new int[computerCnt + 1][computerCnt + 1];
        visited = new int[computerCnt + 1];

        for (int i = 0; i < linkedCnt; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            board[a][b] = 1;
            board[b][a] = 1;
        }
        dfs(1);
        System.out.println(cnt);
    }

    static void dfs(int x) {
        visited[x] = 1;
        for (int i = 1; i < computerCnt+1; i++) {
            if (board[x][i] == 1 && visited[i] != 1) {
                cnt++;
                dfs(i);
            }
        }
    }
}
