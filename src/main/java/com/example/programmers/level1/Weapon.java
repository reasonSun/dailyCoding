package com.example.programmers.level1;

import java.util.Arrays;

public class Weapon {
    public static void main(String[] args) {
        Weapon weapon = new Weapon();
        int number = 10;
        int limit = 3;
        int power = 2;
        System.out.println(weapon.solution(number, limit, power));
    }

    public int solution(int number, int limit, int power) {
        int[] arr = new int[number];
        for (int i = 1; i <= number; i++) {
            int cnt = 0;
            for (int j = 1; j * j <= i; j++) {
                if (j * j == i) cnt++;
                else if(i % j == 0) cnt +=2;
            }
            arr[i-1] = cnt;
        }

        for (int i = 0; i < number; i++) {
            if (arr[i] > limit) {
                arr[i] = power;
            }
        }
        int sum = Arrays.stream(arr).sum();

        return sum;
    }
}
