package com.first.lesson5;


public class ex2 {
    static int num = 10, num1 = 10;
    public static void main (String [] args) {

        num = ++num;
        System.out.println("Inkrement num: " + num);
        num = --num1;
        System.out.println("Dekrement num: " + num);
        System.out.println("Prefix: " + ++num);
        System.out.println("Postfix: " + num++); //значения не отличаются, тк постфиксная форма инкрементирует после вычисления

        int a = 10, b = 10;
        int y = 13 - a++;
        System.out.println("13 - 10 = 3 + 1 = " + y); //?
        int z = 13 - ++b;
        System.out.println("13 - (10 + 1) = " + z);





    }
}
