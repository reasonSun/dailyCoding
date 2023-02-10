package com.example.programmers.level2;

import java.util.Collections;
import java.util.PriorityQueue;

public class MinPriorityQueue {
    public static void main(String[] args) {
        MinPriorityQueue priorityQueue = new MinPriorityQueue();
        int[] arr1 = {1, 4, 2};
        int[] arr2 = {5, 4, 4};
        System.out.println(priorityQueue.solution(arr1, arr2));
    }

    private int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        PriorityQueue<Integer> queue1 = new PriorityQueue<>();
        PriorityQueue<Integer> queue2 = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < arr1.length; i++) {
            queue1.add(arr1[i]);
            queue2.add(arr2[i]);
        }

        while (!queue1.isEmpty()) {
            answer+= queue1.poll() * queue2.poll();
        }

        return answer;

    }


}
