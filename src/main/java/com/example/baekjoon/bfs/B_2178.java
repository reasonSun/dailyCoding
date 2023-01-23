package com.example.baekjoon.bfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Node2178 {
    int x, y;

    public Node2178(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
public class B_2178 {
    static int N, M;
    static int[][] board,dis;

    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        board = new int[N+1][M+1];
        dis = new int[N+1][M+1];

        for (int i = 1; i <= N; i++) {
            String str = sc.next();
            for (int j = 1; j <= M; j++) {
                board[i][j] = Integer.parseInt(String.valueOf(str.charAt(j-1)));
            }
        }
        board[1][1] = 1;
        dis[1][1] = 1;
        bfs(1, 1);

        System.out.println(dis[N][M]);
    }

    static void bfs(int x, int y) {
        Queue<Node2178> queue = new LinkedList<>();
        queue.offer(new Node2178(x, y));
        board[x][y] = 0;
        while (!queue.isEmpty()) {
            Node2178 temp = queue.poll();
            for (int i = 0; i < 4; i++) {
                int nx = temp.x + dx[i];
                int ny = temp.y + dy[i];
                if (nx >= 1 && nx < N+1 && ny >= 1 && ny < M+1 && board[nx][ny] == 1) {
                    board[nx][ny] = 0;
                    queue.offer(new Node2178(nx, ny));
                    dis[nx][ny] = dis[temp.x][temp.y] +1;
                }
            }
        }
    }
}
