package com.example.exam;

public class KakaoTest1 {
    public static void main(String[] args) {
        KakaoTest1 test1 = new KakaoTest1();
        int[][] v = {
                {1,4},
                {3,4},
                {3,10}
        };
        for(int n : test1.solution(v)) System.out.println(n);
    }

    private int[] solution(int[][] v) {
        int[] answer;
        int x, y;

        if (v[2][0] == v[0][0]) {
            x = v[1][0];
        } else if (v[1][0] == v[2][0]) {
            x = v[0][0];
        }else {
            x = v[2][0];
        }

        if (v[1][1] == v[0][1]) {
            y = v[2][1];
        } else if (v[2][1] == v[1][1]) {
            y = v[0][1];
        }else {
            y = v[1][1];
        }
        answer = new int[]{x, y};
        return answer;
    }
}
