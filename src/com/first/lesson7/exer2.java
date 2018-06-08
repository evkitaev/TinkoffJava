package com.first.lesson7;

public class exer2 {
    static int[][] array = new int[2][3];

    public static void main(String[] args) {
        array[0][0] = 1;
        array[0][1] = 13;
        array[0][2] = 2;
        array[1][0] = 6;
        array[1][1] = 4;
        array[1][2] = 9;
        int sum = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                sum += array[i][j];
                System.out.println(sum);


            }
        }
    }
}
