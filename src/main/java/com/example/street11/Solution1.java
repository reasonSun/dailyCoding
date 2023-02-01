package com.example.street11;

public class Solution1 {
    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();
        int solution = solution1.solution(1000);// 37
        System.out.println(solution);
    }

    public int solution(int N) {
        int sum = getSum(Integer.toString(N));
        int answer = N + 1;

        while (sum != getSum(Integer.toString(answer))) {
            answer ++;
        }

        return answer;
    }

    private static int getSum(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            sum += Integer.parseInt(String.valueOf(s.charAt(i)));
        }

        return sum;
    }

}
