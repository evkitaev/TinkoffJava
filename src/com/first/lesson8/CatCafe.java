package com.first.lesson8;

import java.text.MessageFormat;
import java.util.Arrays;
/*Создать класс CatCafe, добавить поля адрес, массив котов в котокафе и время работы и счетчик котов.
Добавить конструктор класса. Создать объект кафе и добавить в него котов. Всем котам проставить флаг.*/

public class CatCafe {
    String address;
    Cat[] cafeCats;
    String time ;
    int catCount;
    Cat cat;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Cat[] getCafeCats() {
        return cafeCats;
    }

    public void setCafeCats(Cat[] cafeCats) {
        this.cafeCats = cafeCats;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getCatCount() {
        return catCount;
    }

    public void setCatCount(int catCount) {
        this.catCount = catCount;
    }

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public CatCafe(String address, Cat[] cafeCats, String time) {
        this.address = "улица Мурзика";
        this.time = "09.00 - 22.00";
        this.catCount = cafeCats.length;
        this.cafeCats = cafeCats;

    }
    public void getCatHome (Cat cat){
        this.cat = cat;
        cat.takeHome(); //
           catCount -= 1;
    }


    @Override
    public String toString() {
        String catsCafeString = "";
        for (int i = 0; i < cafeCats.length; i++) {
            cafeCats[i].toString();
        }
        return MessageFormat.format(
                "Адрес кафе: {0}\n" +
                        "Коты в кафе: {1}\n" +
                        "Часы работы кафе: {2}\n" +
                        "Количество котиков в кафе: {3}", address,"\n" + Arrays.toString(cafeCats), time, catCount);

    }

}





