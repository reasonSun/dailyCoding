package com.example.ohouse.exam2023;

import java.util.Arrays;

public class Solution1 {
    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();
        int[] numbers = {4, 3, 5, 1};
        int goal = 4; //1,3 / 설명: numbers[1] + numbers[3] = 4
        for(int i : solution1.solution(numbers,goal)) System.out.print(i + " , ");
    }

    public int[] solution(int[] numbers, int goal) {
        int[] answer = new int[2];
        for(int i=1; i < numbers.length; i++){
            for(int j=i; j<numbers.length; j++){
                if(numbers[j]+numbers[j-i] == goal){
                    answer[0] = j;
                    answer[1] = j-i;
                }
            }
        }
        Arrays.sort(answer);
        return answer;
    }
}
