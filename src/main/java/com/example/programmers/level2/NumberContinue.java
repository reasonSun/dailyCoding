package com.example.programmers.level2;

import java.util.ArrayList;
import java.util.List;

public class NumberContinue {
    public static void main(String[] args) {
        NumberContinue numberContinue = new NumberContinue();
        int n = 15; // 4
        System.out.println(numberContinue.solution(n));
    }

    private int solution(int n) {
        int answer = 0, sum = 0, lt = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(i+1);
        }

        for (int rt = 0; rt < n; rt++) {
            sum += list.get(rt);
            if (sum == n) {
                answer++;
            }

            while (sum >= n) {
                sum -= list.get(lt++);
                if (sum == n) {
                    answer++;
                }
            }
        }

        return answer;

    }
}
