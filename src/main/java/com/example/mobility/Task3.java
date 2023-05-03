package com.example.mobility;

public class Task3 {

    public static void main(String[] args) {
        Task3 task3 = new Task3();
        int[] arr = {7,-5,-5,-5,7,-1,7};
        System.out.println("task3 = " + task3.solution(arr));
    }

    private int solution(int[] arr) {
        if(arr.length == 1) return 1;
        int even = arr[0],odd = arr[1];
        int start = 0,max_len = 0;
        for(int i=2;i<arr.length;++i){
            if(i%2 == 0 && arr[i] != even || i%2 == 1 && arr[i] != odd){
                max_len = Math.max(max_len,i - start);
                start = i-1;
                if(i%2 == 0){
                    even = arr[i];
                    odd = arr[i-1];
                }else{
                    even = arr[i-1];
                    odd = arr[i];
                }
            }
        }


        return Math.max(max_len,arr.length - start);
    }
}
