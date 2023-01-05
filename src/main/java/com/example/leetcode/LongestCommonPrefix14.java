package com.example.leetcode;

public class LongestCommonPrefix14 {
    public static void main(String[] args) {
        LongestCommonPrefix14 longestCommonPrefix14 = new LongestCommonPrefix14();
        String[] strs = {"flower","flow","flight"};
        longestCommonPrefix14.solution(strs);
    }

    private void solution(String[] strs) {
        String prefix = strs[0];

        //indexOf -> 일치하는문자열이 있으면 해당 인덱스, 없으면 -1
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }

        System.out.println("prefix = " + prefix);
    }
}
