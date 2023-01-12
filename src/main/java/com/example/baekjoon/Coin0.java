package com.example.baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Coin0 {
    static int[] dy;
    public static void main(String[] args) {
        Coin0 coin0 = new Coin0();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] coinArr = new int[n];
        dy = new int[k+1];
        for (int i = 0; i < n; i++) {
            coinArr[i] = scanner.nextInt();
        }
        System.out.println(coin0.solution(coinArr, k));
    }

    private int solution(int[] coinArr, int k) {
        Arrays.fill(dy,Integer.MAX_VALUE);
        dy[0] = 0;
        for (int i = 0; i < coinArr.length; i++) {
            for (int j = coinArr[i]; j <= k; j++) {
                dy[j] = Math.min(dy[j], dy[j - coinArr[i]]+1);
            }
        }
        return dy[k];
    }
}
