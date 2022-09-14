package com.example.inflern.twopointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class TwoPointers2 {

    private List<Integer> solution(int num1, int[] arr1, int num2, int[] arr2) {
        List<Integer> answer = new ArrayList<>();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int p1 = 0, p2 = 0;

        while (p1 < num1 && p2 < num2) {
            if (arr1[p1] == arr2[p2]) {
                answer.add(arr1[p1++]);
                p2++;
            } else if (arr1[p1] < arr2[p2]) {
                p1++;
            } else {
                p2++;
            }
        }


        return answer;
    }

    public static void main(String[] args) {
        TwoPointers2 pointers2 = new TwoPointers2();
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int[] arr1 = new int[num1];
        for (int i = 0; i < num1; i++) {
            arr1[i] = scanner.nextInt();
        }
        int num2 = scanner.nextInt();
        int[] arr2 = new int[num2];
        for (int i = 0; i < num2; i++) {
            arr2[i] = scanner.nextInt();
        }

        for(int x : pointers2.solution(num1, arr1, num2, arr2)) System.out.print(x+" ");

    }
}
