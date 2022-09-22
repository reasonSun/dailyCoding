package com.example.inflern.recursive;

import java.util.LinkedList;
import java.util.Queue;

public class BfsCalf {
    int answer = 0;
    int[] dis = {1, -1, 5};
    int[] ch;

    Queue<Integer> queue = new LinkedList<>();
    private int bfs(int pPos, int cPos) {
        ch = new int[10001];
        ch[pPos] = 1;
        queue.offer(pPos);
        int L = 0;
        while (!queue.isEmpty()) {
            int len = queue.size();
            for (int i = 0; i < len; i++) {
                int x = queue.poll();
                if (x == cPos) {
                    return L;
                }
                for (int j = 0; j < dis.length; j++) {
                    int nx = x + dis[j];
                    if (nx >= 1 && nx <= 10000 && ch[nx] == 0) {
                        ch[nx] = 1;
                        queue.offer(nx);
                    }
                }
            }
            L++;
        }
        return L;
    }

    public static void main(String[] args) {
        BfsCalf calf = new BfsCalf();
        System.out.println(calf.bfs(5,14));
    }


}
