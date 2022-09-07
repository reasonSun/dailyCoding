package com.example.inflern.array;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayReversePrimeNumber {
    private boolean isPrime(int n) {
        if(n < 2 ) return false;
        else if(n == 2) return true;

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                //소수가 아님
                return false;
            }
        }
        //소수
        return true;
    }

    private ArrayList<Integer> solution(int num, int[] numArr) {
        ArrayList<Integer> answerList = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            int tmp = numArr[i];
            int res = 0;
            while (tmp > 0) {
                int t = tmp%10;
                res= res*10+t;
                tmp = tmp/10;
            }
            if(isPrime(res)) answerList.add(res);
        }

        return answerList;
    }

    public static void main(String[] args) {
        ArrayReversePrimeNumber number = new ArrayReversePrimeNumber();

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] numArr = new int[num];
        for (int i = 0; i < num; i++) {
            numArr[i] = scanner.nextInt();
        }

        System.out.println(number.solution(num, numArr));
    }
}
