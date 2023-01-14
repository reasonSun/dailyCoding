package com.example.baekjoon;

import java.util.Scanner;

public class SugarDelivery {
    public static void main(String[] args) {
        SugarDelivery sugarDelivery = new SugarDelivery();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(sugarDelivery.solution(n));
    }

    private int solution(int n) {
        int cnt = 0;
        while (true) {
            if (n % 5 == 0) {
                cnt += n / 5;
                break;
            }else{
                n -= 3;
                cnt++;
            }

            if (n < 0) {
                cnt = -1;
                break;
            }
        }
        return cnt;
    }
}
