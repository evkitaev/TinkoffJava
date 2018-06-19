package com.first.lesson8;

import java.util.Arrays;
/*Создать класс CatCafe, добавить поля адрес, массив котов в котокафе и время работы и счетчик котов.
Добавить конструктор класса. Создать объект кафе и добавить в него котов. Всем котам проставить флаг.*/

public class CatCafe {
    static String address = "улица Мурзика";
    static Cat[] cafeCats;
    static String time = "09.00 - 18.00";
    static int catCount;

    public CatCafe(String address, Cat[] cafeCats, String time, int catCount) {
        this.address = address;
        this.time = time;
        this.catCount = catCount;
        this.cafeCats = cafeCats;

    }
    @Override
    public String toString() {
        return address + " " + cafeCats + " " + " " + time + " " + catCount;

    }

}





