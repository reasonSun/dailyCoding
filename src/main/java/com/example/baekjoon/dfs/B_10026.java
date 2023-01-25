package com.example.baekjoon.dfs;

import java.util.Scanner;

public class B_10026 {
    static int N, rgb, rgbNon;
    static char[][] board;
    static int[][] visited;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        board = new char[N][N];
        visited = new int[N][N];
        for (int i = 0; i < N; i++) {
            String str = sc.next();
            for (int j = 0; j < N; j++) {
                board[i][j] = str.charAt(j);
            }
        }
        rgb = rgbNon = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (visited[i][j] == 0) {
                    dfs(i, j);
                    rgb++;
                }

            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (board[i][j] == 'G') {
                    board[i][j] = 'R';
                }
            }
        }

        visited = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (visited[i][j] == 0) {
                    dfs(i, j);
                    rgbNon++;
                }

            }
        }

        System.out.println(rgb + " " + rgbNon);

    }

    static void dfs(int i, int j) {
        visited[i][j] = 1;
        char color = board[i][j];
        for (int x = 0; x < 4; x++) {
            int nx = i + dx[x];
            int ny = j + dy[x];
            if (nx >= 0 && nx < N && ny >= 0 && ny < N) {
                if (color == board[nx][ny] && visited[nx][ny] == 0) {
                    dfs(nx, ny);
                }
            }
        }
    }
}
