package com.example.inflern.array;

import java.util.ArrayList;
import java.util.List;

public class ArrayBigNumber {

    private List<Integer> solution(int[] numList, int n) {
        List<Integer> answerList = new ArrayList<>();

        answerList.add(numList[0]);
        for (int i = 1; i < n; i++) {
            if(numList[i] > numList[i-1]) answerList.add(numList[i]);
        }

        return answerList;
    }

    public static void main(String[] args) {
        ArrayBigNumber bigNumber = new ArrayBigNumber();
        int[] numList = {7, 3, 9, 5, 6, 12};
        int n = 6;
        System.out.println(bigNumber.solution(numList, n));
    }
}
