package com.example.baekjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

class Node2583 {
    int x, y;

    Node2583(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
public class B_2583 {
    static int[][] board;
    static boolean[][] visited;
    static List<Integer> areaList;
    int[] dx = {-1, 0, 1, 0};
    int[] dy = {0, 1, 0, -1};
    static int n, m, k;

    public static void main(String[] args) {
        B_2583 b2583 = new B_2583();
        Scanner scanner = new Scanner(System.in);
        m  = scanner.nextInt();
        n = scanner.nextInt();
        k = scanner.nextInt();
        board = new int[m][n];
        visited = new boolean[m][n];
        /*
        * 1. k만큼 for문을 돌려서 왼쪽 위, 오른쪽 아래 지표를 받아 board에 1로 채워준다.
        * 2. board에 0 탐색(bfs)
        * 3. bfs 탐색이 끝나면 list에 cnt add
        * */

        for (int i = 0; i < k; i++) {
            int x1 = scanner.nextInt();
            int y1 = scanner.nextInt();
            int x2 = scanner.nextInt();
            int y2 = scanner.nextInt();
            for (int a = x1; a < x2; a++) {
                for (int b = y1; b < y2; b++) {
                    board[b][a] = 1;
                }
            }
        }
        areaList = new ArrayList<>();
        int cnt=0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 0 && !visited[i][j]) {
                    cnt++;
                    b2583.bfs(i, j);
                }
            }
        }
        System.out.println(cnt);
        Collections.sort(areaList);

        for (int n : areaList) {
            System.out.print(n + " ");
        }

    }

    private void bfs(int i, int j) {
        Queue<Node2583> queue = new LinkedList<>();
        queue.offer(new Node2583(i, j));
        visited[i][j] = true;
        int cnt = 0;
        while (!queue.isEmpty()) {
            cnt++;
            Node2583 temp = queue.poll();
            for (int a = 0; a < 4; a++) {
                int nx = temp.x + dx[a];
                int ny = temp.y + dy[a];
                if (nx < m && nx >= 0 && ny < n && ny >= 0 && board[nx][ny] == 0 && !visited[nx][ny]) {
                    queue.offer(new Node2583(nx, ny));
                    visited[nx][ny] = true;
                }
            }
        }
        areaList.add(cnt);
    }
}
