package com.example.homework;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TaskProcessing {

    public static void main(String[] args) {
        TaskProcessing processing = new TaskProcessing();
        int[] tasks = {1,1,2,3,3,2,2};
        System.out.println(processing.solution(tasks));
    }

    private int solution(int[] tasks) {
        int answer = 0;
        Map<Integer, Integer> taskMap = new HashMap<>();

        for (int n : tasks) {
            taskMap.put(n, taskMap.getOrDefault(n, 0) + 1);
        }

        for (int key : taskMap.keySet()) {
            if (taskMap.get(key) == 1) {
                return -1;
            }
            if (key % 3 == 0) {
                answer += taskMap.get(key) / 3;
            } else {
                answer += taskMap.get(key) / 3 + 1;
            }
        }
        return answer;
    }
}
