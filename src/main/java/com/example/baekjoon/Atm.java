package com.example.baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        Atm atm = new Atm();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] pTime = new int[n];
        for (int i = 0; i < pTime.length; i++) {
            pTime[i] = kb.nextInt();
        }
        System.out.println(atm.solution(n,pTime));
    }

    private int solution(int n, int[] pTime) {
        Arrays.sort(pTime);
        int indexSum = pTime[0];
        int answer = indexSum;

        for (int i = 1; i < pTime.length; i++) {
            indexSum += pTime[i];
            answer += indexSum;
        }
        return answer;
    }
}
