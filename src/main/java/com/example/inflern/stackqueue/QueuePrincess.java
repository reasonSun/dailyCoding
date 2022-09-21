package com.example.inflern.stackqueue;

import java.util.LinkedList;
import java.util.Queue;

public class QueuePrincess {

    public static void main(String[] args) {
        QueuePrincess queuePrincess = new QueuePrincess();
        System.out.println(queuePrincess.solution(8,3));
    }

    private int solution(int num, int k) {

        int answer = 0;

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= num; i++) {
            queue.offer(i);
        }
        while (!queue.isEmpty()) {
            for (int i = 1; i < k; i++) queue.offer(queue.poll());
            queue.poll();
            if (queue.size() == 1) {
                answer = queue.poll();
            }
        }

        return answer;

    }
}
