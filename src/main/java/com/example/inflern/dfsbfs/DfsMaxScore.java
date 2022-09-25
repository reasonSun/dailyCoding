package com.example.inflern.dfsbfs;

public class DfsMaxScore {
    static int scoreCnt, limitTime, answer = Integer.MIN_VALUE;

    private void dfs(int level, int sum, int time, int[] scoreArr, int[] timeArr) {
        if(time > limitTime) return;
        if (level == scoreCnt) {
            answer = Math.max(answer, sum);
        } else {
            dfs(level + 1, sum + scoreArr[level], time + timeArr[level], scoreArr, timeArr);
            dfs(level + 1, sum, time, scoreArr, timeArr);
        }
    }

    public static void main(String[] args) {
        DfsMaxScore score = new DfsMaxScore();
        scoreCnt = 5;
        limitTime = 20;
        int[] scoreArr = {10, 25, 15, 6, 7};
        int[] timeArr = {5, 12, 8, 3, 4};

        score.dfs(0, 0, 0, scoreArr, timeArr);
        System.out.println("answer = " + answer);
    }
}
