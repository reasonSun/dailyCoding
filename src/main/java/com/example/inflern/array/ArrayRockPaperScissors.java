package com.example.inflern.array;

import java.util.ArrayList;
import java.util.List;

public class ArrayRockPaperScissors {
    private List<String> solution(int count, int[] infoA, int[] infoB) {
        List<String> answerList = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            if (infoA[i] == infoB[i]) {
                answerList.add("D");
            } else if ((infoA[i] == 1 && infoB[i] == 3)
                    || (infoA[i] == 2 && infoB[i] == 1)
                    || (infoA[i] == 3 && infoB[i] == 2)) {
                answerList.add("A");
            } else {
                answerList.add("B");
            }
        }

        return answerList;
    }

    public static void main(String[] args) {
        ArrayRockPaperScissors rockPaperScissors = new ArrayRockPaperScissors();
        int count = 5;
        int[] infoA = {2, 3, 3, 1, 3};
        int[] infoB = {1, 1, 2, 2, 3};
        List<String> result = rockPaperScissors.solution(count, infoA, infoB);
        for (String s : result) {
            System.out.println("s = " + s);
        }
    }
}
