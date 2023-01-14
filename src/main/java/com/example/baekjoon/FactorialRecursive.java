package com.example.baekjoon;

import java.util.Scanner;

public class FactorialRecursive {
    public static void main(String[] args) {
        FactorialRecursive recursive = new FactorialRecursive();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(recursive.dfs(n));
    }

    private int dfs(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * dfs(n - 1);
        }
    }
}
