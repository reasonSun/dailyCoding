package com.example.baekjoon.dfs;

import java.util.Scanner;

public class B_1987 {
    static int R, C;
    static String[][] board;
    static boolean[][] visited;
    static int moveMax = 0;
    int[] dx = {-1, 0, 1, 0};
    int[] dy = {0, 1, 0, -1};
    public static void main(String[] args) {
        B_1987 b1987 = new B_1987();
        Scanner scanner = new Scanner(System.in);
        R = scanner.nextInt();
        C = scanner.nextInt();
        board = new String[R][C];
        visited = new boolean[R][C];
        scanner.nextLine();
        for (int i = 0; i < R; i++) {
            String str = scanner.nextLine();
            for (int j = 0; j < C; j++) {
                board[i][j] = str.charAt(j)+"";
            }
        }
        visited[0][0] = true;
        b1987.dfs(0, 0, board[0][0],1);

        System.out.println(moveMax);

    }

    private void dfs(int x, int y, String str, int moveCnt) {
        if (moveCnt > moveMax) {
            moveMax = moveCnt;
        }
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(nx < 0 || ny < 0 || nx >= R || ny >= C || visited[nx][ny])
                continue;
            if(!str.contains(String.valueOf(board[nx][ny]))){
                visited[nx][ny] = true;
                dfs(nx, ny, str + board[nx][ny],moveCnt+1);
                visited[nx][ny] = false;
            }

        }

    }
}
