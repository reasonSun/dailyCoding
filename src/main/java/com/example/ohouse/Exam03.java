package com.example.ohouse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

class Time implements Comparable<Time>{
    public int s, e;
    Time(int s, int e) {
        this.s = s;
        this.e = e;
    }
    @Override
    public int compareTo(Time o){
        if(this.e==o.e) return this.s-o.s;
        else return this.e-o.e;
    }
}
public class Exam03 {

    public void solution(int n, int[][] meetings) {
        ArrayList<Time> arr = new ArrayList<>();
        for (int i = 0; i < meetings.length; i++) {
            int x = meetings[i][0];
            int y = meetings[i][1];
            arr.add(new Time(x, y));
        }

        System.out.println("arr = " + arr);

        Map<Integer, ArrayList<Time>> room = new HashMap<>();

        for (int i = 0; i < n; i++) {
            room.put(i,new ArrayList<>());
        }
        System.out.println("room = " + room);
        int cnt=0;
//        Collections.sort(arr);
        int et=0;

        for(Time ob : arr){
            System.out.println("ob.s = " + ob.s+ ", ob.e = "+ob.e);

        }
        System.out.println("cnt = " + cnt);
    }

    public static void main(String[] args) {
        Exam03 exam03 = new Exam03();
        int n = 2;
        int[][] meetings = {
                {0,10},
                {1,5},
                {2,7},
                {3,4}
        };
        exam03.solution(n,meetings);
    }
}
