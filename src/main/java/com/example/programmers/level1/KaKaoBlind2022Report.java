package com.example.programmers.level1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class KaKaoBlind2022Report {
    public static void main(String[] args) {
        KaKaoBlind2022Report blind2022Report = new KaKaoBlind2022Report();
        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"};
        int k = 2;
        for (int n : blind2022Report.solution(id_list, report, k)) {
            System.out.println(n);
        }
    }

    private int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        Map<String, Set<String>> reportedMap = new HashMap<>();
        Map<String, Integer> answerMap = new HashMap<>();

        for (String s : id_list) {
            Set<String> reportingID = new HashSet<>();
            reportedMap.put(s, reportingID);
            answerMap.put(s, 0);
        }

        for (String r : report) {
            String[] reportInfo = r.split(" ");
            String report1 = reportInfo[0];
            String report2 = reportInfo[1];
            reportedMap.get(report2).add(report1);
        }

        for (String key : reportedMap.keySet()) {
            Set<String> userForSend = reportedMap.get(key);
            if (userForSend.size() >= k) {
                for (String user : userForSend) {
                    answerMap.put(user, answerMap.get(user) + 1);
                }
            }

        }

        for (int i = 0; i < id_list.length; i++) {
            answer[i] = answerMap.get(id_list[i]);
        }
        return answer;
    }
}
