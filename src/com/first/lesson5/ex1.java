package com.first.lesson5;

import static java.lang.Math.PI;

public class ex1 {

    public static void main (String[] args){
        int a = 7;
        float b = 3.14f;
        int c = 2;

        int count1 = 3;
        int count2 = 5;
        int count3 = 8;
        int count4 = 11;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println("Остаток от деления: "+ a % c);
        System.out.println(Math.cos(PI));
        System.out.println(count1);
        count1 = count1 + 2;
        System.out.println(count1);
        double count = (double) count2;
        count2 +=2.5; // не могу понять как вывести count2 + 2.5 = 7.5
        System.out.println("count: " + count);
        count3 /=4;
        System.out.println(count3);
        count4 = count4 * 2;
        System.out.println (count4);





    }
}
