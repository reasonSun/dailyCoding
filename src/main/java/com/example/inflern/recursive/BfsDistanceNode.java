package com.example.inflern.recursive;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BfsDistanceNode {
    static int n, m;
    static int[] chk, dis;
    static int[][] graph;
    
    public static void main(String[] args) {
        BfsDistanceNode bfsDistanceNode = new BfsDistanceNode();
        Scanner kb = new Scanner(System.in);
        n=kb.nextInt();
        m=kb.nextInt();
        graph = new int[m+1][m+1];
        chk = new int[n + 1];
        dis = new int[n+1];
        for(int i=0; i<m; i++){
            int a=kb.nextInt();
            int b=kb.nextInt();
            graph[a][b] = 1;
        }
        bfsDistanceNode.bfs(1);
        for (int i = 2; i <= n; i++) {
            System.out.println(i+":" + dis[i]);
        }
    }

    private void bfs(int vertex) {
        int level = 1;
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(vertex);
        while (!queue.isEmpty()) {

            int len = queue.size();
            for (int i = 0; i < len; i++) {
                int curVertex = queue.poll();
                for (int j = 0; j < m; j++) {
                    if (graph[curVertex][j] == 1 && chk[j] == 0) {
                        queue.offer(j);
                        dis[j] = level;
                    }
                }
            }
            level++;
        }

    }
}
/*
5 9
1 2
1 3
1 4
2 1
2 3
2 5
3 4
4 2
4 5

* */