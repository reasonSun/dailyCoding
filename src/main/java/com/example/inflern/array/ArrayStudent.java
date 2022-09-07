package com.example.inflern.array;

public class ArrayStudent {

    private int solution(int studentCnt, int[] studentArr) {
        /*int answer = 1;

        for (int i=1; i< studentCnt; i++) {
            if(studentArr[i-1] < studentArr[i]) answer++;
        }*/

        int answer = 1, max = studentArr[0];

        for (int i = 1; i < studentCnt; i++) {
            if (studentArr[i] > max) {
                answer++;
                max = studentArr[i];
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        ArrayStudent student = new ArrayStudent();
        int studentCnt = 8;
        int[] studentArr = {130,135, 148, 140, 145, 150, 150, 153};
        System.out.println(student.solution(studentCnt, studentArr));
    }
}
