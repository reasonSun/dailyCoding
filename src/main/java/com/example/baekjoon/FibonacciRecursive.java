package com.example.baekjoon;

import java.util.Scanner;

public class FibonacciRecursive {
    static int[] arr;
    public static void main(String[] args) {
        FibonacciRecursive recursive = new FibonacciRecursive();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        arr = new int[n + 2];
        System.out.println(recursive.dfs(n));
    }

    private int dfs(int n) {
        if(arr[n] > 0) return arr[n];
        if(n == 1 || n == 2) return arr[n] = 1;
        else if(n == 0) return arr[n] = 0;
        else return arr[n] = dfs(n - 2) + dfs(n - 1);

    }
}
