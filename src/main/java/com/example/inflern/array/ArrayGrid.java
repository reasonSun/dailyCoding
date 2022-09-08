package com.example.inflern.array;

public class ArrayGrid {

    private int solution(int cnt, int[][] gridArr) {
        int answer = 0;

        //각 행,열의 합과 대각선의 합을 넣을 변수
        int sum1, sum2;

        //각 행,열의 합
        for (int i = 0; i < cnt; i++) {
            sum1 = sum2 = 0;
            for (int j = 0; j < cnt; j++) {
                sum1 += gridArr[i][j];
                sum2 += gridArr[j][i];
            }

            answer = Math.max(answer, sum1);
            answer = Math.max(answer, sum2);
        }

        //대각선의 합
        sum1 = sum2 = 0;
        for (int i = 0; i < cnt; i++) {
            sum1 += gridArr[i][i];
            sum2 += gridArr[i][cnt - i - 1];
        }

        answer = Math.max(answer, sum1);
        answer = Math.max(answer, sum2);

        return answer;
    }

    public static void main(String[] args) {
        ArrayGrid grid = new ArrayGrid();
        int cnt = 5;
        int[][] gridArr = {
                {10, 13, 10, 12, 15},
                {12, 39, 30, 23, 11},
                {11, 25, 50, 53, 15},
                {19, 27, 29, 37, 27},
                {19, 13, 30, 13, 19}
        };

        System.out.println(grid.solution(cnt, gridArr));
    }
}
