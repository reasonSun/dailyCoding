package com.example.programmers.level1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class HallOfFrame1 {
    public static void main(String[] args) {
        HallOfFrame1 hall = new HallOfFrame1();
        int k = 4;
        int[] score = {0, 300, 40, 300, 20, 70, 150, 50, 500, 1000};
        for (int n : hall.solution(k, score)) System.out.print(n+ " ");
    }
/* 처음 풀이는 ArrayList로 풀이 했었는데 PriorityQueue로 더 간단하게 구현 가능 */
    public int[] solution(int k, int[] score) {
        int[] minScore = new int[score.length];
        /*int currMin = 0;
        List<Integer> kList = new ArrayList<>();

        for (int i = 0; i < score.length; i++) {
            if (kList.size() < k) {
                kList.add(score[i]);
            }else{
                if (currMin < score[i]) {
                    kList.remove((Integer) currMin);
                    kList.add(score[i]);
                }

            }
            currMin = Collections.min(kList);
            minScore[i] = currMin;
        }*/

        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int i = 0; i < score.length; i++) {
            queue.offer(score[i]);
            if (queue.size() > k) {
                queue.poll();
            }
            minScore[i] = queue.peek();
        }

        return minScore;
    }
}
