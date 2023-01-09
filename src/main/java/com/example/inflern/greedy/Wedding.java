package com.example.inflern.greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class WeddingTime implements Comparable<WeddingTime>{
    public int time;
    public char state;
    WeddingTime(int time, char state) {
        this.time = time;
        this.state = state;
    }
    @Override
    public int compareTo(WeddingTime ob){
        if(this.time==ob.time) return this.state-ob.state;
        else return this.time-ob.time;
    }
}

public class Wedding {
    public static void main(String[] args) {
        Wedding wedding = new Wedding();

        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        ArrayList<WeddingTime> arr = new ArrayList<>();
        for(int i=0; i<n; i++){
            int sT=kb.nextInt();
            int eT=kb.nextInt();
            arr.add(new WeddingTime(sT, 's'));
            arr.add(new WeddingTime(eT, 'e'));
        }
        System.out.println(wedding.solution(arr));
    }

    public int solution(ArrayList<WeddingTime> arr){
        int answer=Integer.MIN_VALUE;
        Collections.sort(arr);
        int cnt=0;
        for(WeddingTime ob : arr){
            if(ob.state=='s') cnt++;
            else cnt--;
            answer=Math.max(answer, cnt);
        }
        return answer;
    }
}
/*
5
14 18
12 15
15 20
20 30
5 14
*/