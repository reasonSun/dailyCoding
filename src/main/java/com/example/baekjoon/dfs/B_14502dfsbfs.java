package com.example.baekjoon.dfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Point {
    int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
public class B_14502dfsbfs {
    static int N, M;
    static int maxCnt = Integer.MIN_VALUE;
    static int[][] board, virusBoard;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        board = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                board[i][j] = sc.nextInt();
            }
        }
        dfs(0);
        System.out.println(maxCnt);
    }

    static void dfs(int wall) {
        if (wall == 3) {
            bfs();
            int cnt = 0;
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    if (virusBoard[i][j] == 0) {
                        cnt++;
                    }
                }
            }
            maxCnt = Math.max(maxCnt, cnt);
            return;
        } else {
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    if (board[i][j] == 0) {
                        board[i][j] = 1;
                        dfs(wall + 1);
                        board[i][j] = 0;
                    }
                }
            }
        }
    }

    static void bfs() {
        Queue<Point> queue = new LinkedList<>();
        virusBoard = new int[N][M];
        for (int i = 0; i < N; i++) {
            virusBoard[i] = board[i].clone();
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (virusBoard[i][j] == 2) {
                    queue.offer(new Point(i,j));
                }
            }
        }

        while (!queue.isEmpty()) {
            Point temp = queue.poll();
            for (int i = 0; i < 4; i++) {
                int nx = temp.x + dx[i];
                int ny = temp.y + dy[i];
                if (nx >= 0 && nx < N && ny >= 0 && ny < M) {
                    if (virusBoard[nx][ny] == 0) {
                        virusBoard[nx][ny] = 2;
                        queue.offer(new Point(nx, ny));
                    }
                }
            }
        }
    }
}
