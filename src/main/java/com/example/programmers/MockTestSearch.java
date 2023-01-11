package com.example.programmers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MockTestSearch {
    public static void main(String[] args) {
        MockTestSearch search = new MockTestSearch();
        int[] answers = {1,2,3,4,5};
        for (int n : search.solution(answers)) {
            System.out.print(n + " ");
        }
    }
    public int[] solution(int[] answers) {
        int[] student1 = {1, 2, 3, 4, 5};
        int[] student2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] student3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] score = {0, 0, 0};
        List<Integer> resultList = new ArrayList();
        for (int i = 0; i < answers.length; i++) {
            if(student1[i%5] == answers[i]) score[0] += 1;
            if(student2[i%8] == answers[i]) score[1] += 1;
            if(student3[i%10] == answers[i]) score[2] += 1;
        }
        int max = Math.max(score[0], Math.max(score[1],score[2]));
        for (int i = 0; i< score.length; i++) {
            if (max == score[i]) {
                resultList.add(i + 1);
            }
        }
        Collections.sort(resultList);

        return resultList.stream().mapToInt(i->i).toArray();
    }
}
