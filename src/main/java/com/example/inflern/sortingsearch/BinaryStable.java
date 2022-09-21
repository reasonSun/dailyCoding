package com.example.inflern.sortingsearch;

import java.util.Arrays;

public class BinaryStable {

    public int count(int[] arr, int dist){
        int cnt=1;
        int ep=arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i]-ep>=dist){
                cnt++;
                ep=arr[i];
            }
        }
        return cnt;
    }

    public int solution(int n, int c, int[] arr){
        int answer=0;
        Arrays.sort(arr);
        int lt=1;
        int rt=arr[n-1];
        while(lt<=rt){
            int mid=(lt+rt)/2;
            if(count(arr, mid)>=c){
                answer=mid;
                lt=mid+1;
            }
            else rt=mid-1;
        }
        return answer;
    }

    public static void main(String[] args) {
        BinaryStable stable = new BinaryStable();
        int n = 5;
        int m = 3;
        int[] arr = {1,2,8,4,9};
        System.out.println(stable.solution(n,m,arr));
    }
}
