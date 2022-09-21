package com.example.inflern.recursive;

public class Recursive1 {
    public static void main(String[] args) {
        Recursive1 recursive1 = new Recursive1();
        recursive1.DFS(3);
    }

    private void DFS(int i) {
        if(i == 0) return;
        else{
//            System.out.println(i+ " ");
            DFS(i - 1);
            System.out.println(i+" "); //stack frame
        }
    }
}
