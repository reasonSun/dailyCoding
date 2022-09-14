package com.example.inflern.twopointer;

public class ContinueSequenceMax {

    public static void main(String[] args) {
        ContinueSequenceMax sequenceMax = new ContinueSequenceMax();
        int[] arr = {1,1,0,0,1,1,0,1,1,0,1,1,0,1};
        System.out.println(sequenceMax.solution(14, 2, arr));
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
}
