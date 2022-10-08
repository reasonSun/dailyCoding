package com.example.inflern.twopointer;

public class ContinueSequenceMax {

    public static void main(String[] args) {
        ContinueSequenceMax sequenceMax = new ContinueSequenceMax();
        int[] arr = {1,1,0,0,1,1,0,1,1,0,1,1,0,1};
        System.out.println(sequenceMax.solution(14, 2, arr));

        int[] arr2 = {1,2,3,4,5};
        System.out.println(sequenceMax.solution2(arr, 3));
    }

    private int solution(int num, int k, int[] arr) {
        int answer = 0, cnt = 0, lt = 0;
        for (int rt = 0; rt < num; rt++) {
            if(arr[rt] == 0) cnt++;
            while (cnt > k) {
                if(arr[lt]==0) cnt--;
                lt++;
            }
            answer = Math.max(answer, rt - lt + 1);
        }

        return answer;
    }

    public boolean solution2(int[] A, int K) {
        int n = A.length;
        for (int i = 0; i < n - 1; i++) {
            if (A[i] + 1 < A[i + 1])
                return false;
        }
        if (A[0] != 1 && A[n - 1] != K)
            return false;
        else
            return true;
    }
}
