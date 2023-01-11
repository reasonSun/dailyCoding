package com.example.programmers;

public class MinRectangle {
    public static void main(String[] args) {
        MinRectangle rectangle = new MinRectangle();
        int[][] sizes = {
                {60, 50},
                {30, 70},
                {60, 30},
                {80, 40}
        };
        System.out.println(rectangle.solution(sizes));
    }
    public int solution(int[][] sizes) {
        //가로, 세로 max 값 구하기
        int vMax = 0, hMax = 0;

        for (int i = 0; i < sizes.length; i++) {
            int v = Math.max(sizes[i][0],sizes[i][1]);
            int h = Math.min(sizes[i][0], sizes[i][1]);
            vMax = Math.max(vMax, v);
            hMax = Math.max(hMax, h);
        }
        return vMax * hMax;
    }
}
