package com.example.nsus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution4 {

    /*
=====
h3
=====
bb
h2
bb
=====
bb
hr
=====
=====
=====
h1
bb
bb
bb
=====
h2
h2
=====
=====
hr
=====
h2
bb
bb
hr
=====
    */
    public static void main(String[] args) throws IOException {
        Solution4 solution4 = new Solution4();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = "";
        List<String> list = new ArrayList<>();
        while (!(str = String.valueOf(br.read())).equals("")) {
            list.add(str);
        }
        System.out.println(solution4.solution(list));
    }

    private String solution(List<String> list) {
        int pScore=0, cScore=0, pSum=0, cSum=0, lineCnt=0;
        int[] pArr = new int[4];
        int[] CArr = new int[4];
        for (int i = 0; i< list.size(); i++) {
            if ("=====".equals(list.get(i))) {
                lineCnt++;
                pScore = 0;
                cScore = 0;
                continue;
            }
            if (lineCnt % 2 != 0) { //P
                if ("bb".equals(list.get(i))) {
                    pScore+=1;
                } else if ("h1".equals(list.get(i))) {
                    pScore+=1;
                } else if ("h2".equals(list.get(i))) {
                    pScore+=2;
                } else if ("h3".equals(list.get(i))) {
                    pScore+=3;
                } else if ("hr".equals(list.get(i))) {
                    pSum++;
                }
                if (pScore >= 4) {
                    pSum++;
                }
            } else { //C
                if ("bb".equals(list.get(i))) {
                    cScore+=1;
                } else if ("h1".equals(list.get(i))) {
                    cScore+=1;
                } else if ("h2".equals(list.get(i))) {
                    cScore+=2;
                } else if ("h3".equals(list.get(i))) {
                    cScore+=3;
                } else if ("hr".equals(list.get(i))) {
                    cSum++;
                }
                if (cScore >= 4) {
                    cSum++;
                }
            }
        }

        return pSum+":"+cSum;
    }
}
