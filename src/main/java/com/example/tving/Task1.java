package com.example.tving;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Point2 {
    int x,y;

    Point2(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
public class Task1 {
    static int[][] board;
    static int[] dx = {-1, -1, 0, 1, 1, 1, 0, -1};
    static int[] dy = {0, 1, 1, 1, 0, -1, -1, -1};
    static int n;
    public static void main(String[] args) {
        Task1 task1 = new Task1();
        Scanner scanner = new Scanner(System.in);
        n = 3;
//        board = new int[n][n];
        board = new int[][]{
                {1, 0, 0},
                {0, 0, 1},
                {1, 0, 0}
        };
        int answer = 0;
        int k = 2;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 1) {
                    board[i][j] = 0;
                    answer++;
                    task1.bfs(i, j, board, k);
                }
            }
        }

        System.out.println("answer = " + answer);
    }


    private void bfs(int x, int y, int[][] board, int k) {
        Queue<Point2> queue = new LinkedList<>();
        queue.offer(new Point2(x, y));
        while (!queue.isEmpty()) {
            Point2 pos = queue.poll();
            for (int i = 0; i < board.length; i++) {
                int nx = pos.x + dx[i]+1;
                int ny = pos.y + dy[i]+1;
                if (nx >= 0 && nx < n && ny >= 0 && ny < n && board[nx][ny] == 1) {
                    board[nx][ny] = 0;
                    queue.offer(new Point2(nx, ny));
                }
            }
        }
    }

}
