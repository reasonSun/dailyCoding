package com.example.inflern.stackqueue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueCurriculum {


    public static void main(String[] args) {
        QueueCurriculum curriculum = new QueueCurriculum();
        System.out.println(curriculum.solution("CBA", "CBDAGE"));
    }

    private String solution(String requiredSubject, String subject) {
        String answer = "YES";

        Queue<Character> queue = new LinkedList<>();
        for (char c : requiredSubject.toCharArray()) {
            queue.offer(c);
        }
        for (char c : subject.toCharArray()) {
            if (queue.contains(c)) {
                if(c != queue.poll()) return "NO";
            }
        }
        if(!queue.isEmpty()) return "NO";

        return answer;
    }
}
