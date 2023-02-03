package com.example.programmers.level1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KaKaoBlind2023Terms {
    public static void main(String[] args) {
        KaKaoBlind2023Terms kakaoTerms = new KaKaoBlind2023Terms();
        String today = "2022.05.19";
        String[] terms = {"A 6", "B 12", "C 3"};
        String[] privacies = {"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"};
        for (int n : kakaoTerms.solution(today, terms, privacies)) {
            System.out.println(n);
        }
    }

    Map<String, Integer> termsMap = new HashMap<>();

    public int[] solution(String today, String[] terms, String[] privacies) {
        List<Integer> answer = new ArrayList<>();
        today = today.replace(".", "");

        for (String s : terms) {
            String[] temp = s.split(" ");
            termsMap.put(temp[0], Integer.parseInt(temp[1]));
        }

        for (int i = 0; i < privacies.length; i++) {
            String[] privacyInfo = privacies[i].split(" ");
            String privacyDate = privacyInfo[0];
            String privacyType = privacyInfo[1];

            if (dateCalculate(privacyDate, termsMap.get(privacyType), today)) {
                answer.add(i + 1);
            }
        }
        return answer.stream().mapToInt(i->i).toArray();
    }

    public boolean dateCalculate(String privacyDate, int period, String today){
        boolean flag = false;
        SimpleDateFormat transFormat = new SimpleDateFormat("yyyy.MM.dd");
        try {
            Date date = transFormat.parse(privacyDate);
            Calendar cal1 = Calendar.getInstance();
            cal1.setTime(date);
            cal1.add(Calendar.MONTH, period);
            cal1.add(Calendar.DATE, -1);

            SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
            String endDate = sdf.format(new Date(cal1.getTimeInMillis()));

            if (Integer.parseInt(endDate.substring(6)) > 28){
                endDate = endDate.substring(0,6)+"28";
            }

            if (Integer.parseInt(today) > Integer.parseInt(endDate)) {
                flag = true;
            }

        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

        return flag;
    }
}
