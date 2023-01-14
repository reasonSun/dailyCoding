package com.example.baekjoon;

import java.util.Scanner;

public class GasStation {
    public static void main(String[] args) {
        GasStation station = new GasStation();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] lengthArr = new int[n - 1];
        int[] priceArr = new int[n];
        for (int i = 0; i < n - 1; i++) {
            lengthArr[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            priceArr[i] = scanner.nextInt();
        }
        System.out.println(station.solution(n, lengthArr, priceArr));
    }

    private int solution(int n, int[] lengthArr, int[] priceArr) {
        int min = priceArr[0];
        int sum = 0;
        for (int i = 0; i < n - 1; i++) {
            if (min > priceArr[i]) {
                min = priceArr[i];
            }
            sum += (min * lengthArr[i]);
        }

        return sum;
    }
}
