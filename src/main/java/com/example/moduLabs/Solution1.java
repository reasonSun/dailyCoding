package com.example.moduLabs;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution1 {
    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();
        String s = "pizza";
        String[] ss = s.split(s);

        for (String a : solution1.solution(s)) {
            System.out.print(a);
        }
    }

    public String[] solution(String s) {
        Stack<String> stack = new Stack<>();
        char chk = ' ';
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (chk != s.charAt(i)) {
                chk = s.charAt(i);
                sb.append(s.charAt(i));
            }else {
                if (sb.length() != 0) {
                    sb.deleteCharAt(sb.length()-1);
                    stack.push(String.valueOf(sb));
                    sb.setLength(0);
                }else{
                    if(i == 0 || i == s.length()-1) stack.push("");
                }

            }
        }
        if(sb.length() != 0) stack.push(String.valueOf(sb));

        String[] answer = new String[stack.size()];
        for (int i = 0; i < stack.size(); i++) {
            answer[i] = stack.get(i);
        }
        return answer;

    }
}
