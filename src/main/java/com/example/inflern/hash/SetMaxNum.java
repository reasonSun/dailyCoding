package com.example.inflern.hash;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class SetMaxNum {

    public static void main(String[] args) {
        SetMaxNum max = new SetMaxNum();

        int n = 10, k=3;
        int[] arr = {13, 15, 34, 23, 45, 65, 33, 11, 26, 42};

        System.out.println(max.solution(n,k,arr));
    }

    private int solution(int n, int k, int[] arr) {
        int answer = 0;
        TreeSet<Integer> sumSet = new TreeSet<>(Comparator.reverseOrder());

        //N개의 숫자중 3개의 숫자 뽑는 모든 경우의 수
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int l = j + 1; l < n; l++) {
                    sumSet.add(arr[i] + arr[j] + arr[l]);
                }
            }
        }

        int cnt = 0;
        //treeSet 알아두면 좋은 메소드
        //sumSet.remove(143);
//        System.out.println(sumSet.size());
        System.out.println("last : "+sumSet.last());
        for (int num : sumSet) {
            cnt++;
            if (cnt == k) {
                answer = num;
                break;
            }
        }
        return answer;

    }
}
