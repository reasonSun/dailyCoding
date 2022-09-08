package com.example.inflern.array;

public class ArrayPeak {
    int[] dx = {-1, 0, 1, 0};
    int[] dy = {0, 1, 0, -1};

    private int solution(int num, int[][] peakArr) {
        int answer = 0;

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                boolean peakChk = true;
                for (int k = 0; k < 4; k++) {
                    int nx = i + dx[k];
                    int ny = j + dy[k];
                    if (nx >= 0 && nx < num && ny >= 0 && ny < num && peakArr[nx][ny] >= peakArr[i][j]) {
                        peakChk = false;
                    }
                }
                if (peakChk) {
                    answer++;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        ArrayPeak peak = new ArrayPeak();
        int num = 5;
        int[][] peakArr = {
                {5, 3, 7, 2, 3},
                {3, 7, 1, 6, 1},
                {7, 2, 5, 3, 4},
                {4, 3, 6, 4, 1},
                {8, 7, 3, 5, 2}
        };

        System.out.println(peak.solution(num, peakArr));
    }
}
