package com.example.baekjoon;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Treasure {
    public static void main(String[] args) {
        Treasure treasure = new Treasure();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] aArr = new int[n];
        int[] bArr = new int[n];
        for (int i = 0; i < n; i++) {
            aArr[i] = kb.nextInt();
        }
        for (int i = 0; i < n; i++) {
            bArr[i] = kb.nextInt();
        }
        System.out.println(treasure.solution(n, aArr, bArr));
    }

    private int solution(int n, int[] aArr, int[] bArr) {
        int answer = 0;
        List<Integer> aList = Arrays.stream(aArr).boxed().sorted().collect(Collectors.toList());
        List<Integer> bList = Arrays.stream(bArr).boxed().sorted(Collections.reverseOrder()).collect(Collectors.toList());
        for (int i = 0; i < aList.size(); i++) {
            answer += aList.get(i) * bList.get(i);
        }
        return answer;
    }
}
