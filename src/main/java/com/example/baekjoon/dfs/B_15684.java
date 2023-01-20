package com.example.baekjoon.dfs;

import java.util.Scanner;

public class B_15684 {
    static int N, M, H, answer;
    static int[][] board;
    static boolean finish = false;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt(); // 세로선 개수
        M = sc.nextInt(); // 연결된 가로선의 개수
        H = sc.nextInt(); // 가로선을 놓을 수 있는 개수
        board = new int[H+1][N+1];

        for (int i = 0; i < M; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            board[a][b] = 1;
            board[a][b+1] = 2;
        }

        for (int i = 0; i <= 3; i++) {
            answer = i;
            dfs(1, 0);
            if(finish) break;
        }

        System.out.println((finish) ? answer : -1);

    }

    public static void dfs(int x, int count) {
        if (finish) return;
        if (answer == count) {
            //모든 세로선 조건을 만족하는지 체크
            if (valid()) finish = true;
            return;
        }
        for (int i = x; i < H + 1; i++) {
            for (int j = 1; j < N; j++) {
                if (board[i][j] == 0 && board[i][j + 1] == 0) {
                    board[i][j] = 1;
                    board[i][j+1] = 2;
                    dfs(i, count+1);
                    board[i][j]=0;
                    board[i][j+1] = 0;
                }
            }
        }
    }

    public static boolean valid() {
        for (int i = 1; i <= N; i++) {
            int x=1, y=i;
            for (int j = 0; j < H; j++) {
                if(board[x][y] == 1) y++;
                else if (board[x][y] == 2) y--;
                x++;
            }
            if (y != i) {
                return false;
            }
        }
        return true;
    }
}
