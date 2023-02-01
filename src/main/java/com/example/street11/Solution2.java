package com.example.street11;

public class Solution2 {
    public static void main(String[] args) {
        Solution2 solution2 = new Solution2();
        int[] arr = {1, 3, 5};

        System.out.println(solution2.solution(arr, 5));
    }

    public boolean solution(int[] A, int K) {
        int n = A.length;
        for (int i = 0; i < n - 1; i++) {
            if (A[i] + 1 < A[i + 1])
                return false;
        }

        if (A[0] != 1 || A[n - 1] != K)
            return false;
        else
            return true;
    }


}
