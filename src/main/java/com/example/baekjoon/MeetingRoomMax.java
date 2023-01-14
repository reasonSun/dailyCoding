package com.example.baekjoon;

import com.example.inflern.greedy.MeetingRoom;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class MeetingTime implements Comparable<MeetingTime>{
    int start, end;

    public MeetingTime(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public int compareTo(MeetingTime o) {
        if (this.end == o.end) {
            return this.start - o.start;
        }else{
            return this.end - o.end;
        }
    }
}
public class MeetingRoomMax {
    public static void main(String[] args) {
        MeetingRoomMax meeting = new MeetingRoomMax();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<MeetingTime> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int start = scanner.nextInt();
            int end = scanner.nextInt();
            list.add(new MeetingTime(start, end));
        }
        System.out.println(meeting.solution(list));
    }

    private int solution(List<MeetingTime> list) {
        Collections.sort(list);
        int cnt = 0, endTime = 0;
        for (MeetingTime a : list) {
            if (a.start >= endTime) {
                cnt++;
                endTime = a.end;
            }
        }
        return cnt;
    }

}
