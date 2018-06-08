package com.first.lesson7;

public class exer1 {
    static int[] nums1 = {12, 18, 81, 221}; //[6];

    public static void main (String[] args){
        /*nums1[0] = 2;
        nums1[1] = 3;
        nums1[2] = 21;
        nums1[3] = 12;
        nums1[4] = 34;
        nums1[5] = 17;*/
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < nums1.length; i++) {
            min = Math.min (min,nums1[i]);
            System.out.print(nums1[i]);
        }
        System.out.println("\n" + "Длина массива: " + nums1.length);
        System.out.println("Минимальное число в массиве: " + min);


        for (int i = 0; i < nums1.length; i++) {
            max = Math.max (max,nums1[i]);
        }
        System.out.println("Максимальное число в массиве: " + max);
    }
}
