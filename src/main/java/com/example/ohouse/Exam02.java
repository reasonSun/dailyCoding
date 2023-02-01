package com.example.ohouse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Exam02 {

    public int solution(int[] nums, int k) {
        int answer = 0;
        List<Integer> list =  Arrays.stream(nums).boxed().collect(Collectors.toList());
        List<Integer> sumArr = new ArrayList<>();

        System.out.println("list = " + list);

        for (int i = 0; i < list.size(); i++) {
            for (int j = i; j < list.size(); j++) {
                System.out.println(list.subList(i, j+1).stream().mapToInt(Integer::intValue).sum());
                sumArr.add(list.subList(i, j+1).stream().mapToInt(Integer::intValue).sum());
            }
        }

        Collections.sort(sumArr);
        System.out.println("sumArr = " + sumArr);

        answer = sumArr.get(k-1);
        return answer;
    }

    public static void main(String[] args) {
        Exam02 exam02 = new Exam02();
        int[] nums = {2, 1, 3};
        int k = 4;
        exam02.solution(nums, k);
    }
}
