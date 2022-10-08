package com.example.programmers;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class FunctionalDevelop {

    public int[] solution(int[] progress, int[] speeds) {
        ArrayList<Integer> answer = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();


        for (int i = 0; i < progress.length; i++) {
            int pro = progress[i];
            int sp = speeds[i];
            int period = 0;

            while (pro < 100) {
                pro += sp;
                period++;
            }
            queue.offer(period);
            System.out.println("period = " + period);
        }

        System.out.println("queue = " + queue);

        int front = queue.poll();
        int cnt = 1;
        while (!queue.isEmpty()) {

            if (front < queue.peek()) {
                answer.add(cnt);
                cnt =1;
                front=queue.poll();
            }else{
                cnt++;
                queue.poll();
            }
        }
        answer.add(cnt);

        System.out.println("answer = " + answer);

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        FunctionalDevelop develop = new FunctionalDevelop();
        int[] progress = {93, 30, 55};
        int[] speeds = {1, 30, 5};

        for (int n : develop.solution(progress, speeds)) {
            System.out.print(n + " ");
        }
    }
}
