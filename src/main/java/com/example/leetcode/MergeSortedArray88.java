package com.example.leetcode;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MergeSortedArray88 {
    public static void main(String[] args) {
        MergeSortedArray88 mergeSortedArray88 = new MergeSortedArray88();
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        int m = 3, n = 3;
        mergeSortedArray88.solution(nums1, m, nums2, n);
    }

    private void solution(int[] nums1, int m, int[] nums2, int n) {
        for(int i = m; i< m+n; i++){
            nums1[i] = nums2[i-m];
        }
        Arrays.sort(nums1);

        for (int num :
                nums1) {
            System.out.println("num = " + num);
        }
    }
}
