package com.example.baekjoon.bruteforce;

import java.util.Scanner;

public class B_2798 {
    static int cardNum, goal;
    static int maxSum = Integer.MIN_VALUE;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        cardNum = sc.nextInt();
        goal = sc.nextInt();
        int[] cardArr = new int[cardNum];
        for (int i = 0; i < cardNum; i++) {
            cardArr[i] = sc.nextInt();
        }

        for (int i = 0; i < cardNum; i++) {
            for (int j = i+1; j < cardNum; j++) {
                for (int k = j + 1; k < cardNum; k++) {
                    int sum = cardArr[i] + cardArr[j] + cardArr[k];
                    if (sum <= goal) {
                        maxSum = Math.max(maxSum, sum);
                    }
                }
            }
        }
        System.out.println(maxSum);
    }

}
