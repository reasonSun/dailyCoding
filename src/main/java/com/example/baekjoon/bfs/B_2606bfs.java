package com.example.baekjoon.bfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class B_2606bfs {
    static int computerCnt, linkedCnt;
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

        bfs(1);

    }

    static void bfs(int computer) {
        Queue<Integer> queue = new LinkedList<>();
        int virusCnt = 0;
        queue.offer(computer);
        visited[computer] = 1;
        while (!queue.isEmpty()) {
            int currComputer = queue.poll();
            for (int i = 1; i < board.length; i++) {
                if (board[currComputer][i] == 1 && visited[i] != 1) {
                    queue.offer(i);
                    visited[i] = 1;
                    virusCnt++;
                }
            }
        }
        System.out.println(virusCnt);
    }
}
