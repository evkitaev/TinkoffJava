package com.first;

public class e1 {
    static byte b = -128;
    static byte b1 = 127;
    static short sh = -32768;
    static short sh1 = 32767;
    static int it = -2147483648;
    static int it1 = 2147483647;
    static long l = -9223372036854775808l;
    static long l1 = 9223372036854775807l;

    static float fl = 3.14f;
    static double db = 3.14;

    static boolean bool1 = true;
    static boolean bool0 = false;

    static String st = "Tinkoff";
    static char c = 't';

    public static void main (String[] args){
        System.out.println("byte:" + b);
        System.out.println("byte:" + b1);
        System.out.println("short:" + sh);
        System.out.println("short:" + sh1);
        System.out.println("int:" + it);
        System.out.println("int:" + it1);
        System.out.println("long:" + l);
        System.out.println("long:" + l1);

        System.out.println("float:" + fl);
        System.out.println("double:" + db);

        System.out.println(bool1);
        System.out.println(bool0);

        System.out.println(st);
        System.out.println(c);
    }
}
