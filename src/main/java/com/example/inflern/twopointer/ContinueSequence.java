package com.example.inflern.twopointer;

public class ContinueSequence {

    private int solution(int n, int m, int[] arr) {
        int answer= 0;
        int sum = 0;
        int lt =0;
        for (int rt = 0; rt < n; rt++) {
            sum += arr[rt];
            if (sum == m) {
                answer++;
            }
            while (sum >= m) {
                sum -= arr[lt++];
                if (sum == m) {
                    answer++;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        ContinueSequence sequence = new ContinueSequence();
        int n = 8, m = 6;
        int[] arr = {1, 2, 1, 3, 1, 1, 1, 2};

        System.out.println(sequence.solution(n,m,arr));
    }
}
