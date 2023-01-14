package com.example.baekjoon;

import java.util.Scanner;

public class PalindromeRecursive {
    static int recursiveCnt;
    public static void main(String[] args) {
        PalindromeRecursive recursive = new PalindromeRecursive();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] strArr = new String[n];
        for (int i = 0; i < n; i++) {
            strArr[i] = scanner.next();
        }
        for (String str : strArr) {
            recursiveCnt = 0;
            System.out.println(recursive.isPalindrome(str)+" "+recursiveCnt);
        }
    }

    private int isPalindrome(String str) {
        return recursion(str, 0, str.length() - 1);
    }

    private int recursion(String str, int lt, int rt) {
        recursiveCnt++;
        if (lt >= rt) {
            return 1;
        } else if (str.charAt(lt) != str.charAt(rt)) {
            return 0;
        } else {
            return recursion(str, lt + 1, rt - 1);
        }
    }

}
