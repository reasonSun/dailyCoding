package com.example.programmers.level1;

import java.util.Arrays;
import java.util.Collections;

public class Lotto {
    public static void main(String[] args) {
        Lotto lotto = new Lotto();

        int[] lottos = {1, 2, 3, 4, 5, 6};
        int[] win_nums = {7, 8, 9, 10, 11, 12};

        for (int i : lotto.solution(lottos, win_nums)) {
            System.out.println(i);
        }
    }

    public int[] solution(int[] lottos, int[] win_nums) {
        int cnt1 = 7, cnt2 = 7;
        Integer[] lottoArr = Arrays.stream(lottos).boxed().toArray(Integer[]::new);
        int[] visited = new int[lottos.length];
        Arrays.sort(lottoArr, Collections.reverseOrder());
        for (int i = 0; i < lottoArr.length; i++) {
            for (int j = 0; j < lottoArr.length; j++) {
                if (win_nums[i] == lottoArr[j] && visited[j] == 0) {
                    cnt1--;
                    cnt2--;
                    visited[j] = 1;
                    break;
                } else if (lottoArr[j] == 0 && visited[j] == 0) {
                    cnt1--;
                    visited[j] = 1;
                    break;
                }
            }
        }

        if(cnt1 == 7) cnt1--;
        if(cnt2 == 7) cnt2--;

        if(cnt1 == 0) cnt1++;
        if(cnt2 == 0) cnt2++;

        int[] answer = {cnt1, cnt2};

        return answer;
    }

    public int[] solution2(int[] lottos, int[] win_nums) {
        int[] rank = {6, 6, 5, 4, 3, 2, 1};
        int answer = 0;
        int hidden = 0;

        Arrays.sort(win_nums);
        for (int i = 0; i < lottos.length; i++)
            if (Arrays.binarySearch(win_nums, lottos[i]) > -1)
                answer++;
            else if (lottos[i] == 0)
                hidden++;

        return new int[] {rank[answer + hidden], rank[answer]};
    }
}
