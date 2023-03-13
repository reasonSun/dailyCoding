package com.example.woongjin;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution1 {
    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();
        /*StringBuilder sb = new StringBuilder("bbb");
        Pattern pattern = Pattern.compile(String.valueOf(sb));
        Matcher matcher = pattern.matcher("abbbcbbb");
        int from = 0;
        int count = 0;
        while(matcher.find(from)) {
            count++;
            from = matcher.start() + 1;
        }
        System.out.println(count);*/
        System.out.println(solution1.solution("abbbcbbb", "bbb")); //4
    }

    public int solution(String line1, String line2) {
        StringBuilder sb = new StringBuilder(line2);
        StringBuilder blankStr = new StringBuilder(".");
        int answer = 0;

        while (sb.length() <= line1.length()) {
            Pattern pattern = Pattern.compile(String.valueOf(sb));
            Matcher matcher = pattern.matcher(line1);
            int from = 0, count = 0;
            while(matcher.find(from)) {
                count++;
                from = matcher.start() + 1;
            }
            answer += count;
            sb = new StringBuilder();
            for (int i = 0; i < line2.length(); i++) {
                sb.append(line2.charAt(i));
                if (i != line2.length() - 1) {
                    sb.append(blankStr);
                }
            }
            blankStr.append(".");
        }
        return answer;
    }
}
