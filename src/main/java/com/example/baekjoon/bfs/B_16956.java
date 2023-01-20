package com.example.baekjoon.bfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Node16956 {
    int x, y;

    public Node16956(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
public class B_16956 {
    static int R, C;
    static char[][] board;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static boolean flag = true;
    static Queue<Node16956> queue = new LinkedList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        R = sc.nextInt();
        C = sc.nextInt();
        board = new char[R][C];

        for (int i = 0; i < R; i++) {
            String str = sc.next();
            for (int j = 0; j < C; j++) {
                board[i][j] = str.charAt(j);
                if (board[i][j] == 'W') {
                    queue.offer(new Node16956(i, j));
                }
            }
        }

        bfs();

        if (flag) {
            System.out.println("1");
            for (int i = 0; i < R; i++) {
                for (int j = 0; j < C; j++) {
                    System.out.print(board[i][j]);
                }
                System.out.println();
            }
        } else {
            System.out.println("0");
        }
    }

    public static void bfs() {
        while (!queue.isEmpty()) {
            Node16956 temp = queue.poll();
            for (int i = 0; i < 4; i++) {
                int nx = temp.x + dx[i];
                int ny = temp.y + dy[i];
                if (nx >= 0 && nx < R && ny >= 0 && ny < C) {
                    if (board[nx][ny] == '.') {
                        board[nx][ny] = 'D';
                    } else if (board[nx][ny] == 'S') {
                        flag = false;
                        return;
                    }
                }
            }
        }
    }
}
