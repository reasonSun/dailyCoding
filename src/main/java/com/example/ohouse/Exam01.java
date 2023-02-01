package com.example.ohouse;

import java.util.Arrays;

public class Exam01 {
    public void solution(int[] nums, int k) {
        int start = nums[0];
        for (int n : nums) {
            if (start > n) {
                start = n;
            }
        }
        int end = Arrays.stream(nums).sum();


    }

    public static void main(String[] args) {
        Exam01 exam01 = new Exam01();
        int[] nums = {2, 1, 3};
        int k = 4;
        exam01.solution(nums, k);
    }
}
