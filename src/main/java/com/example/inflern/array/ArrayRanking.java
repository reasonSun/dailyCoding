package com.example.inflern.array;

public class ArrayRanking {

    private int[] solution(int num, int[] scoreArr) {
        int[] answerArr = new int[num];

        for (int i = 0; i < num; i++) {
            int rank = 1;
            for (int j = 0; j < num; j++) {
                if(scoreArr[i] > scoreArr[j]) rank++;
            }
            answerArr[i] = rank;
        }
        return answerArr;
    }

    public static void main(String[] args) {
        ArrayRanking ranking = new ArrayRanking();
        int num = 5;
        int[] scoreArr = {87, 89, 92, 100, 76};
        for (int x : ranking.solution(num, scoreArr)) {
            System.out.print(x + " ");
        }
    }
}
