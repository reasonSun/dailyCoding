package com.example.programmers.level2;

public class FibonacciNum {
    public static void main(String[] args) {
        FibonacciNum num = new FibonacciNum();
        int n = 5; // 5
        System.out.println(num.solution(n));
    }

    private int solution(int n) {
        int[] answer = new int[n+1];
        answer[0] = 0;
        answer[1] = 1;
        for (int i = 2; i < n+1; i++) {
            answer[i] = (answer[i - 2] + answer[i - 1]) % 1234567;
        }

        return answer[n];
    }
}
