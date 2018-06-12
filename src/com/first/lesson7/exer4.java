package com.first.lesson7;

import java.lang.reflect.Array;
import java.util.Arrays;

/*Создать массив строк.
вывести в консоль конкатенацию всех строк массива.
вывести конкатенацию строк, в которых
есть символ "S", заменив символ "S" на произвольный.*/

public class exer4 {

    static String[] w = new String [3]; //{"Tinkoff"," ","Java"};

    public static void main (String[] args){
        w[0] = "Tinkoff";
        w[1] = " ";
        w[2] = "Java";


        for(int i = 0; i <w.length; i++){
            int f = w[i].indexOf("f");
            String w1 = w[i]; //не смог понять, как применить concat к массиву
            if(f > 0){   //чувствую, что дикий костыль)))
                System.out.println(w1.replace('f','ф'));
            }

            System.out.print(w1);

        }

    }
}
