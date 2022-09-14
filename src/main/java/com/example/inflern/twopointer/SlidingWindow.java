package com.example.inflern.twopointer;

public class SlidingWindow {

    private int solution(int n, int k, int[] sales) {
        int answer = 0;
        int sum = 0;

        for (int i = 0; i < k; i++) {
            sum += sales[i];
            answer = sum;
        }

        for (int i = k; i < n; i++) {
            sum += (sales[i] - sales[i - k]);
            answer = Math.max(sum, answer);
        }

        return answer;
    }

    public static void main(String[] args) {
        SlidingWindow window = new SlidingWindow();
        int n = 10;
        int k = 3;
        int[] sales = {12, 15, 11, 20, 25, 10, 20, 19, 13, 15};

        System.out.println(window.solution(n,k,sales));
    }
}
