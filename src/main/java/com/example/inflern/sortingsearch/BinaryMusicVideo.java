package com.example.inflern.sortingsearch;

import java.util.Arrays;

public class BinaryMusicVideo {

    public static void main(String[] args) {
        BinaryMusicVideo video = new BinaryMusicVideo();
        int n = 8, m = 6;
        int[] arr = {1, 2, 1, 3, 1, 1, 1, 2};

        System.out.println(video.solution(n,m,arr));
    }

    private int solution(int n, int m, int[] arr) {
        int answer = 0;
        int lt = Arrays.stream(arr).max().getAsInt(); //배열의 최대값 구하기
        int rt = Arrays.stream(arr).sum(); // 배열의 합
        while (lt <= rt) {
            int mid = (lt+rt)/2;
            if (count(arr, mid) <= m) {
                answer = mid;
                rt = mid - 1;
            } else {
                lt = mid + 1;
            }
        }

        return answer;

    }

    public int count(int[] arr, int capacity) {
        int cnt = 1; //dvd 장수
        int sum = 0;
        for (int x : arr) {
            if (sum + x > capacity) {
                cnt++;
                sum = x;
            } else {
                sum+=x;
            }
        }
        return cnt;
    }
}
