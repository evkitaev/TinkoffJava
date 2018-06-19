package com.first.lesson8;

import java.util.Arrays;
/*Создать класс CatCafe, добавить поля адрес, массив котов в котокафе и время работы и счетчик котов.
Добавить конструктор класса. Создать объект кафе и добавить в него котов. Всем котам проставить флаг.*/

public class CatCafe {
    String address = "улица Мурзика";
    Cat[] cafeCats;
    String time = "09.00 - 22.00";
    int catCount;

    public CatCafe(String address, Cat[] cafeCats, String time) {
        this.address = address;
        this.time = time;
        this.catCount = cafeCats.lenght;
        this.cafeCats = cafeCats;


    }
    public void getCatHome (Cat cat){
           cat.takeHome();
           catCount -= 1;
    }


    @Override
    public String toString() {
        String catsCafeString = "";
        for (int i = 0; i < cafeCats.length; i++) {
            catsCafeString.concat(cafeCats[i].toString())
        }
        return address + " " + cafeCats + " " + " " + time + " " + catCount;

    }

}





