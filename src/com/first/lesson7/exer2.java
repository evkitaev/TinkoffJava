package com.first.lesson7;

public class exer2 {
    public static int[][] array = new int[2][3];

    public static int calc(int[][] array1) {
        array[0][0] = 1;
        array[0][1] = 13;
        array[0][2] = 2;
        array[1][0] = 6;
        array[1][1] = 4;
        array[1][2] = 9;
        int sum = 0;

        for (int line = 0; line < array1.length; line++) {
            //System.out.println(line + "line");
            for (int column = 0; column < array1[line].length; column++) {
                System.out.println(column + "column");
                sum += array1[line][column];
            }
        }
        return sum;
    }

     public static void  main(String args[]){
        int a = calc(array);
        System.out.println("Сумма всех элементов двумерного массива = " + a);



        }

}
