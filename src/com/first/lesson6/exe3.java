package com.first.lesson6;
/*Дано число n при помощи цикла посчитать факториал числа n.
Реализовать два варианта для for и для while. */ //c while не смог придумать как
public class exe3 {
    static int factorial(int n){
        int a = 1;
        for (int b = 1; b <= n; b++){
            a = a*b;
        }
        return a;
    }

    public static void main(String[] args){
        System.out.println(factorial(6));
    }
}
