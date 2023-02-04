package com.example.programmers.level1;

public class ModulusSum {
    public static void main(String[] args) {
        ModulusSum modulusSum = new ModulusSum();
        int[] absolutes = {4, 7, 12};
        boolean[] signs = {true, false, true};
        System.out.println(modulusSum.solution(absolutes, signs));
    }

    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for (int i = 0; i < absolutes.length; i++) {
            if(signs[i]) answer += absolutes[i];
            else answer -= absolutes[i];
        }
        return answer;
    }


}
