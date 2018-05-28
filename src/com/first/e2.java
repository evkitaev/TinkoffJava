package com.first;
/*Создать несколько переменных с ссылочным типом данных.
Вывести на печать в консоль имя класса и значение для каждой переменной.*/

public class e2 {
    static Integer in = 127;
    static Short s = 3;
    static Double d = 3.14;
    static char s1 = 'T';
    static String s2 = "i";
    static String s3 = "n";
    static char s4 = 'k';
    static String s5 = "o";
    static String s6 = "ff ";
    static int yr = 2018;
    static String t = s1+s2+s3+s4+s5+s6+yr;


    public static void main (String[] args){
        System.out.println("Class name:" + System.class.getName() + "; Integer: " + in);
        System.out.println("Class name:" + System.class.getName() + "; Short: " + s);
        System.out.println("Class name:" + System.class.getName() + "; Double: " + d);
        System.out.println("Class name:" + System.class.getName() + "; String: " + t);

    }
}