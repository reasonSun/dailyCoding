package com.example.inflern.recursive;

public class Recursive2 {
    public static void main(String[] args) {
        Recursive2 recursive1 = new Recursive2();
        recursive1.DFS(11);
    }

    private void DFS(int i) {
        if(i == 0) return;
        else{
//            System.out.println(i+ " ");
            DFS(i/2);
            System.out.println(i%2+" "); //stack frame
        }
    }
}
