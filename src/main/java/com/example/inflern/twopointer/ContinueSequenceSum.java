package com.example.inflern.twopointer;

import java.util.ArrayList;
import java.util.List;

public class ContinueSequenceSum {

    public static void main(String[] args) {
        ContinueSequenceSum sequenceSum = new ContinueSequenceSum();
        System.out.println(sequenceSum.solution(15));
    }

    private int solution(int num) {
        /*int answer = 0, sum = 0, lt = 0;
        List<Integer> array = new ArrayList<>();

        int n = (num / 2) + 1;
        for (int i = 0; i < n; i++) {
            array.add(i+1);
        }

        for (int rt = 0; rt < n; rt++) {
            sum += array.get(rt);
            if (sum == num) {
                answer++;
            }
            while (sum >= num) {
                sum -= array.get(lt++);
                if (sum == num) {
                    answer ++;
                }
            }
        }*/

        //수학으로 풀기
        int answer = 0, cnt = 1;
        num--;
        while (num > 0) {
            cnt++;
            num = num - cnt;
            if (num % cnt == 0) {
                answer++;
            }
        }


        return answer;
    }
}
