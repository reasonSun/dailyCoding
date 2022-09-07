package com.example.inflern.array;

public class ArrayFibonacci {

    public int[] solution(int cnt) {
        int[] answer = new int[cnt];

        answer[0] = 1;
        answer[1] = 1;

        for (int i = 2; i < cnt; i++) {
            answer[i] = answer[i - 2] + answer[i - 1];
        }
        return answer;
    }

    public static void main(String[] args) {
        ArrayFibonacci fibonacci = new ArrayFibonacci();
        for (int x : fibonacci.solution(6)) {
            System.out.println("x = " + x);
        }
    }
}
