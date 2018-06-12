package com.first.lesson7;

import java.util.Arrays;
import java.util.Random;

public class exer3 {
    public static void main(String args[]) {
        int arrayLenght = 20;
        int bound = 100;
        int[] array = randomArray(arrayLenght, bound);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(sortArray(array)));

    }

    private static int[] randomArray(int arrayLenght, int bound) {
        int[] array = new int[arrayLenght];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {

            array[i] = random.nextInt(bound);
        }
        return array;
    }

    private static int[] sortArray (int[] array){
       for(int i = array.length - 1; i> 0; i--){
           for(int j = 0; j < i; j++){

               if (array[j] > array[i]){
                   /*нашел решение в интернетах), не очень получается
                   логику понять, понимаю что необходимо сравнивать парарами числа
                   в массиве, но что то не ложатся условия, которые указаны ниже*/
                   int a = array[j];
                   array[j] = array[j+1];
                   array[j+1] = a;
               }
           }

       }
        return array;

    }
}
