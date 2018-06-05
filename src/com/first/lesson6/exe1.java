package com.first.lesson6;

public class exe1 {
    static int a = 2;
    static int b = 3;
    static int c = 4;
    static int d = 5;
    public static void main (String[] args){
        if (a < b && b < c && c < d) {
            System.out.println(a);
            System.out.println(d);
        }
    }
}
