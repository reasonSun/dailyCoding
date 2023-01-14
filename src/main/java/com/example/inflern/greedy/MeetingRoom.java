package com.example.inflern.greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Time implements Comparable<Time> {
    public int s, e;
    Time(int s, int e) {
        this.s = s;
        this.e = e;
    }
    @Override
    public int compareTo(Time o){
        if(this.e==o.e) return this.s-o.s; //시작시간 오름차순
        else return this.e-o.e; //끝나는시간 오름차순
    }
}
public class MeetingRoom {
    public static void main(String[] args) {
        MeetingRoom meetingRoom = new MeetingRoom();

        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        ArrayList<Time> arr = new ArrayList<>();
        for(int i=0; i<n; i++){
            int x=kb.nextInt();
            int y=kb.nextInt();
            arr.add(new Time(x, y));
        }
        System.out.println(meetingRoom.solution(arr, n));
    }

    private int solution(ArrayList<Time> arr, int n) {
        int cnt = 0;
        Collections.sort(arr);
        int et = 0;
        for (Time ob : arr) {
            if (ob.s >= et) {
                cnt++;
                et = ob.e;
            }
        }
        return cnt;
    }
}
/*
input
5
1 4
2 3
3 5
4 6
5 7
*/