package com.example.imweb;

public class Solution1 {
    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();

        int n = 22;
        int k = 4;

        System.out.println(solution1.solution(n,k));
    }

    public int solution(int n, int k) {
        StringBuilder numStr = new StringBuilder(String.valueOf(n));
        int answer = 1;
        boolean flag = true;
        try {
            while (Long.parseLong(numStr.toString()) % k != 0) {
                numStr.append(String.valueOf(n));
                answer++;
            }
        } catch (Exception e) {
            flag = false;
        }finally {
            if(!flag) answer = -1;
        }

        return answer;

    }
}
