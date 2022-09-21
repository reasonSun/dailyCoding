package com.example.inflern.stackqueue;

import java.util.LinkedList;
import java.util.Queue;

public class QueuePatient {

    public static void main(String[] args) {
        QueuePatient patient = new QueuePatient();

        System.out.println(patient.solution(5,2,new int[] {60, 50, 70, 80, 90}));
    }

    private int solution(int n, int m, int[] arr) {
        int answer = 0;
        Queue<Person> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            queue.offer(new Person(i, arr[i]));
        }
        while (!queue.isEmpty()) {
            Person tmp = queue.poll();
            for (Person p : queue) {
                if (p.priority > tmp.priority) {
                    queue.offer(tmp);
                    tmp = null;
                    break;
                }
            }
            if (tmp != null) {
                answer++;
                if(tmp.id == m) return answer;
            }
        }

        System.out.println("queue = " + queue);

        return answer;
    }
}

class Person{
    protected int id;
    protected int priority;

    public Person(int id, int priority) {
        this.id = id;
        this.priority = priority;
    }
}
