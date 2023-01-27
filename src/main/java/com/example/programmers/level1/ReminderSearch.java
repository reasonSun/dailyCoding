package com.example.programmers.level1;

public class ReminderSearch {
    public static void main(String[] args) {
        ReminderSearch search = new ReminderSearch();
        System.out.println(search.solution(10));
    }

    public int solution(int n) {
        for (int i = 1; i < n; i++) {
            if (n % i == 1) {
                return i;
            }
        }
        return 0;
    }
}
