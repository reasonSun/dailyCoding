package com.example.inflern.recursive;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BfsDistance {
    static int n, m;
    static int[] ch, dis;
    static ArrayList<ArrayList<Integer>> graph;

    public static void main(String[] args) {
        BfsDistance distance = new BfsDistance();
        Scanner kb = new Scanner(System.in);
        n=kb.nextInt();
        m=kb.nextInt();
        graph = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }
        ch = new int[n + 1];
        dis = new int[n + 1];
        for(int i=0; i<m; i++){
            int a=kb.nextInt();
            int b=kb.nextInt();
            graph.get(a).add(b);
        }
        distance.bfs(1);
        for (int i = 2; i <= n; i++) {
            System.out.println(i+":" + dis[i]);
        }
    }

    private void bfs(int v) {
        Queue<Integer> queue = new LinkedList<>();
        ch[v] = 1;
        dis[v] = 0;
        queue.offer(v);
        while (!queue.isEmpty()) {
            int curV = queue.poll();
            for (int nextV : graph.get(curV)) {
                if (ch[nextV] == 0) {
                    ch[nextV] = 1;
                    queue.offer(nextV);
                    dis[nextV] = dis[curV] + 1;
                }
            }
        }
    }
}
/*
6 9
1 3
1 4
2 1
2 5
3 4
4 5
4 6
6 2
6 5
*/
