package com.example.programmers.level2;

public class Carpet {
    public static void main(String[] args) {
        Carpet carpet = new Carpet();
        for (int n : carpet.solution(10, 2)) System.out.print(n+ " ");
    }

    /* 카펫의 가로(row),세로(col) 길이 출력
    * 가로(row) >= 세로(col)
    * */
    private int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int sum = brown + yellow;
        for (int i = 1; i <= sum; i++) {
        }
        return answer;

    }
}
