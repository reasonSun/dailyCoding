package com.example.nicednb;

import java.util.Stack;

public class Task4 {
    static Stack<Integer> stack = new Stack<>();

    public static void main(String[] args) {
        Task4 task = new Task4();
        stack.push(8);
        task.solution();

    }

    private void solution() {
        int max = 0;
        while(true){
            int multipleNum = 1;
            int temp = stack.pop();
            if(temp != 1){
                multipleNum *= (temp-1);
                stack.push(temp - 1);
                stack.push(1);
            }else {
                int sum = 2;
                /*for(; !stack.isEmpty() && stack.peek() == 1; stack.pop()){
                    sum++;
                }*/
                while(!stack.isEmpty() && stack.peek() == 1){
                    sum++;
                    stack.pop();
                }
                if (stack.isEmpty()) {
                    break;
                }
                int pivot = stack.pop() -1;
                multipleNum *= pivot;
                stack.push(pivot);
                while(sum > pivot){
                    multipleNum *= pivot;
                    stack.push(pivot);
                    sum -= pivot;
                }
                multipleNum *= sum;
                stack.push(sum);
            }
            if(max < multipleNum) max = multipleNum;
        }
        System.out.println("max = " + max);
    }
}
