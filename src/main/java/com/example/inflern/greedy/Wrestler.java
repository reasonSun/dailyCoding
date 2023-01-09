package com.example.inflern.greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Body implements Comparable<Body> {
    public int height, weight;
    Body(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }
    @Override
    public int compareTo(Body o){
        return o.height-this.height; //키를 기준으로 내림차순
    }
}
public class Wrestler {
    public static void main(String[] args) {
        Wrestler wrestler = new Wrestler();
       
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        ArrayList<Body> arr = new ArrayList<>();
        for(int i=0; i<n; i++){
            int height=kb.nextInt();
            int weight=kb.nextInt();
            arr.add(new Body(height, weight));
        }
        System.out.println(wrestler.solution(arr, n));

    }

    private int solution(ArrayList<Body> arr, int n) {
        int cnt=0;
        Collections.sort(arr);
        int max=Integer.MIN_VALUE;
        for(Body ob : arr){
            if(ob.weight>max){
                max=ob.weight;
                cnt++;
            }
        }
        return cnt;
    }
}

/*
input
5
172 67
183 65
180 70
170 72
181 60
* */