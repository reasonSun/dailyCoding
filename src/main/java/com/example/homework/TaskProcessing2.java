package com.example.homework;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TaskProcessing2 {
    public static void main(String[] args) {
        TaskProcessing2 processing = new TaskProcessing2();
        int[] tasks = {1,1,2,3,3,2,2};
        System.out.println(processing.solution(tasks));
    }

    private int solution(int[] tasks) {
        int answer = 0;
        int cnt = 1;
        Arrays.sort(tasks);
        for (int i = 0; i < tasks.length - 1; i++) {
            if (tasks[i] == tasks[i + 1]) {
                cnt++;
            }else {
                if (cnt == 1) {
                    return -1;
                }
                if(cnt%3 == 0) answer += cnt / 3;
                else answer += cnt /3 +1;
                cnt = 1;
            }
        }
        if (cnt != 1) {
            if(cnt%3 == 0) answer += cnt / 3;
            else answer += cnt /3 +1;
        }

        return answer;
    }
}
