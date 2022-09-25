package com.example.inflern.array;

public class ArrayLeader {

    private int solution(int num, int[][] leaderArr) {
        int answer = 0;
        int max = 0;
        System.out.println(leaderArr[1][1]);

        for (int i = 1; i <= num; i++) {
            int cnt=0;
            for (int j = 1; j <= num; j++) {
                for (int k = 1; k <=5; k++) {
                    if (leaderArr[i][k] == leaderArr[j][k]) {
                        cnt++;
                        break;
                    }
                }
            }
            if (cnt > max) {
                max = cnt;
                answer = i;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        ArrayLeader leader = new ArrayLeader();
        int num = 5;
        int[][] leaderArr = {
                {0,0,0,0,0,0},
                {0,2,3,1,7,3},
                {0,4,1,9,6,8},
                {0,5,5,2,4,4},
                {0,6,5,2,6,7},
                {0,8,4,2,2,2}
        };

        System.out.println(leader.solution(num, leaderArr));

    }
}
