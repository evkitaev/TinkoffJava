package com.first;
//Приведение типов (явное и неявное преобразование)
public class e3 {
    static double a = 3.14;
    static String strNumber = "10";
    static int c = 4;

    public static void main (String[] args){
        int b = (int) a;
        int c1 = c;
        int number = Integer.valueOf(strNumber);
        String oneMoreString = String.valueOf(number);
        System.out.println(a);
        System.out.println(b);
        System.out.println(number);
        System.out.println(oneMoreString);


    }

}
