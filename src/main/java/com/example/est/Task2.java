package com.example.est;

import java.util.LinkedList;
import java.util.Queue;

public class Task2 {
    static int[] answer={0,0,0};
    private int[] solution(Queue<Integer> queue, int[] elCount) {

        // 원소의 개수가 같으면 리턴
        if (elCount[0] == elCount[1] && elCount[1] == elCount[2]) {
            System.out.println(elCount);
            return answer;
        }else {
            int min = elCount[0];
            int minIndex = 0;
            // 가장 적은 원소의 숫자 구하기
            for (int i = 0; i<elCount.length; i++) {
                if (min > elCount[i]) {
                    min = elCount[i];
                    minIndex = i;
                }
            }

            queue.offer(minIndex+1);
            elCount[queue.peek()-1] -= 1;
            queue.poll();
            elCount[minIndex] += 1;
            answer[minIndex] += 1;

            solution(queue,elCount);

        }

        return answer;
    }


    public static void main(String[] args) {
        Task2 task2 = new Task2();
        int[] queue = {1,1,2,3};
        int[] elCount = {0,0,0};

        for (int num : queue) {
            if(num==1){elCount[0] += 1;}
            else if(num==2){elCount[1] += 1;}
            else if(num ==3){elCount[2] += 1;}
        }

        Queue<Integer> queueList = new LinkedList<>();

        for (int num : queue) {
            queueList.offer(num);
        }
        for(int i :task2.solution(queueList, elCount)){
            System.out.println("i = " + i);
        }
    }
}
