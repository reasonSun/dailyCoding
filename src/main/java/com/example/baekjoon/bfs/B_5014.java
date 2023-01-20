package com.example.baekjoon.bfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class B_5014 {
    static int floor, start, goal, up, down;
    static int[] cntArr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        floor = sc.nextInt();
        start = sc.nextInt();
        goal = sc.nextInt();
        up = sc.nextInt();
        down = sc.nextInt();
        cntArr = new int[floor+1];

        bfs();
    }

    public static void bfs() {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);
        cntArr[start] = 1;

        while (!queue.isEmpty()) {
            int curr = queue.poll();

            if (curr == goal) {
                System.out.println(cntArr[curr]-1);
            }
            if (curr + up <= floor && cntArr[curr + up] == 0) {
                cntArr[curr+up] = cntArr[curr] + 1;
                queue.offer(curr + up);
                System.out.println("UP");
            }
            if (curr - down > 0 && cntArr[curr - down] == 0) {
                cntArr[curr - down] = cntArr[curr] + 1;
                queue.offer(curr - down);
                System.out.println("DOWN");
            }
        }

        if (cntArr[goal] == 0) {
            System.out.println("use the stairs");
        }

    }
}
