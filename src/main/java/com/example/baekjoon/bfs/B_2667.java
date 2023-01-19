package com.example.baekjoon.bfs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

class Node2667 {
    int x, y;

    public Node2667(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
public class B_2667 {
    static int[][] board, chk;
    static int n;
    static List<Integer> houseList = new ArrayList<>();
    int[] dx = {-1, 0, 1, 0};
    int[] dy = {0, 1, 0, -1};
    public static void main(String[] args) {
        B_2667 b2667 = new B_2667();
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        board = new int[n][n];
        chk = new int[n][n];
        for (int i = 0; i < n; i++) {
            String str = scanner.next();
            for (int j = 0; j < n; j++) {
                board[i][j] = Integer.parseInt(String.valueOf(str.charAt(j)));
            }
        }

        int regionCnt = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 1 && chk[i][j] == 0) {
                    regionCnt++;
                    b2667.bfs(i,j);
                }
            }
        }

        System.out.println(regionCnt);

        Collections.sort(houseList);

        for (int n : houseList) {
            System.out.println(n);
        }
    }

    private void bfs(int a, int b) {
        Queue<Node2667> queue = new LinkedList<>();
        queue.offer(new Node2667(a, b));
        chk[a][b] = 1;
        int houseCnt = 0;
        while (!queue.isEmpty()) {
            houseCnt++;
            Node2667 temp = queue.poll();
            for (int i = 0; i < 4; i++) {
                int nx = temp.x + dx[i];
                int ny = temp.y + dy[i];
                if (nx >= 0 && nx < n && ny >= 0 && ny < n && board[nx][ny] == 1 && chk[nx][ny] == 0) {
                    queue.offer(new Node2667(nx, ny));
                    chk[nx][ny] = 1;
                }
            }
        }
        houseList.add(houseCnt);
    }
}

//7
//0 1 1 0 1 0 0
//0 1 1 0 1 0 1
//1 1 1 0 1 0 1
//0 0 0 0 1 1 1
//0 1 0 0 0 0 0
//0 1 1 1 1 1 0
//0 1 1 1 0 0 0